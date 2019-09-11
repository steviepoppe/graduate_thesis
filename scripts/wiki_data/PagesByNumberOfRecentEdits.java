import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// Compile this with the latest release and with UTF-8: eg. "javac PagesByNumberOfRecentEdits.java --release 8 -encoding UTF-8"

public class PagesByNumberOfRecentEdits {

	private static final String YEARMONTH_FORMAT_STRING = "yyyy-MM";
	private static final String DATE_FORMAT_STRING = YEARMONTH_FORMAT_STRING + "-dd";
	protected static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_STRING);
	private static final String TIME_FORMAT_STRING = "HH:mm:ss";
	
	private final Date dateStarted =  new Date();
	
	private static final String LIMIT_PROPERTY_KEY = "limit";
	private int limit = 0;
	
	private PrintWriter writer = null;
	
	protected String getWikiName() {
		return "jawiki";
	}

	public static void main(String[] args) {
		new PagesByNumberOfRecentEdits().execute(args);
	}
	
	protected void printHeader() {
		getWriter().print("Period: "
					+ DATE_FORMAT.format(getBeginTimestamp())
					+ " &mdash; "
					+ DATE_FORMAT.format(getEndTimestamp())
					+ " (UTC)");
		getWriter().println();
		getWriter().println();
	}
	
	protected String getTableHeader() {
		return "Page||Recent Revisions||Total Revisions||Recent Reverts||Total Reverts||Recent Contention||Total Contention";
	}

	protected PrintWriter getWriter() {
		return writer;
	}

	private Date beginTimestamp = null;
	private Date endTimestamp = null;
	
	protected Date getBeginTimestamp() {
		return beginTimestamp;
	}

	protected Date getEndTimestamp() {
		return endTimestamp;
	}

	protected void execute(String[] args) {
		
		try {
			final int VALID_ARGUMENT_LENGTH = 1;
			if (args.length < VALID_ARGUMENT_LENGTH) {
				printUsage();
				System.exit(1);
			}
			writer = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
			System.err.println("Started. " + dateStarted);
			String limitText = System.getProperty(LIMIT_PROPERTY_KEY, "5000");
			limit = Integer.parseInt(limitText);
			final File dumpFile = new File(args[0]);
			fileNameCheck(dumpFile);
			final DumpHandler dumpHandler = new DumpHandler();
			dumpHandler.setLimit(limit);
			SAXParserFactory.newInstance().newSAXParser().parse(new GZIPInputStream(new FileInputStream(dumpFile)), dumpHandler);
			final Page[] pages = dumpHandler.getPages();
			beginTimestamp = dumpHandler.getBeginTimestamp();
			endTimestamp = dumpHandler.getEndTimestamp();
			print(pages);
		} catch (NumberFormatException e) {
			System.err.println("The specified system property \"" + LIMIT_PROPERTY_KEY + "\" is not a valid integer.");
			System.err.println(e);
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println(e);
			System.exit(1);
		} catch (ParserConfigurationException e) {
			System.err.println(e);
			e.printStackTrace();
			System.exit(1);
		} catch (SAXException e) {
			System.err.println(e);
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
			System.exit(1);
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			System.exit(1);
		} finally {
			final Date dateEnded = new Date();
			System.err.println("Ended. " + dateEnded);
			final SimpleDateFormat dateFormat = new SimpleDateFormat(TIME_FORMAT_STRING);
			dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			System.err.println("Elapsed: " + dateFormat.format(new Date(dateEnded.getTime() - dateStarted.getTime())));
		}

	}
	
	private static final String BEGIN_DATE_PROPERTY_KEY = "begin.date";
	private static final String END_DATE_PROPERTY_KEY = "end.date";
	private static final String MINIMUM_EDITS_PROPERTY_KEY = "min.edits";
	
	private void printUsage() {
		System.err.print("Usage (example): java -D" + BEGIN_DATE_PROPERTY_KEY + "=2008-04-01"
											+ " -D" + END_DATE_PROPERTY_KEY + "=2008-04-30"
											+ " -D" + LIMIT_PROPERTY_KEY + "=5000"
											+ " -D" + MINIMUM_EDITS_PROPERTY_KEY + "=15");
		System.err.print(" " + getClass().getName());
		System.err.print(" " + getWikiName() + "-20080501-stub-meta-history.xml.gz");
		System.err.print(" > result.txt");
		System.err.println();
	}
	
	private void print(Page[] pages) {
		try {
			Arrays.sort(pages, new PagesComparator());

			writer.println();
			writer.print(getTableHeader());
			writer.println();
			int rank = 0;
			int prevCount = 0;
			int sameRank = 0;
			for (Page page : pages) {
				if(page.getNs() == 0) {
					final String rankText;
					if (rank == 0) {
						rank++;
						sameRank = 1;
					} else if (page.getEdits() < prevCount) {
						rank += sameRank;
						sameRank = 1;
					} else {
						sameRank++;
					}
					rankText = Integer.toString(rank);
					prevCount = page.getEdits();
					if (rank > limit) {
						break;
					}

					writer.print(page.getTitle());
					writer.print("||");
					writer.print(page.getEdits());
					writer.print("||");
					writer.print(page.getTotalEdits());
					writer.print("||");
					writer.print(page.getReverts());
					writer.print("||");
					writer.print(page.getTotalReverts());
					writer.print("||");
					writer.print(page.getControversy());
					writer.print("||");
					writer.print(page.getTotalControversy());
					writer.println();
				}
			}
			writer.println();
		} finally {
			writer.flush();
		}
	}
	
	private static class PagesComparator implements Comparator<Page> {
		public int compare(Page page1, Page page2) {
			if (page1 == null || page2 == null) {
				if (page1 == null && page2 == null) {
					return 0;
				}
				if (page1 == null) {
					return 1;
				}
				if (page2 == null) {
					return -1;
				}
			}
			if (page1.getEdits() != page2.getEdits()) {
				return page2.getEdits() - page1.getEdits();
			} else {
				return page2.getTotalEdits() - page1.getTotalEdits(); 
			}
		}
	}
	
	private void fileNameCheck(File file) {
		if (!file.getName().startsWith(getWikiName())) {
			System.err.println("WARNING: The specified file name '" + file.getName() + "' does not start with '" + getWikiName() + "'.");
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
			}
		}
	}
		
	protected final String SORTABLE = " sortable";
	
	protected String getSortable() {
		return SORTABLE;
	}

	private static class DumpHandler extends DefaultHandler {
		
		private final Namespaces namespaces = new Namespaces(); 
		
		private final Stack<String> elementStack = new Stack<String>();
		
		private Date beginTimestamp = null;
		private Date endTimestamp = null;
		
		public Date getBeginTimestamp() {
			return beginTimestamp;
		}

		public Date getEndTimestamp() {
			return endTimestamp;
		}

		private int minimumEdits = 0;
		
		private int limit = 0;
		
		private void setLimit(int limit) {
			this.limit = limit;
		}

		private static final DateFormat TIMESTAMP_DUMP_FORMAT
								= new SimpleDateFormat(DATE_FORMAT_STRING + "'T'" + TIME_FORMAT_STRING + "'Z'z");
		
		private int editsInLastMonth = 0;
		private Calendar lastMonth = Calendar.getInstance();
		
		public void startDocument() throws SAXException {
			beginTimestamp = getDateProperty(BEGIN_DATE_PROPERTY_KEY);
			final Calendar endTimestampCalendar = Calendar.getInstance();
			endTimestampCalendar.setTime(getDateProperty(END_DATE_PROPERTY_KEY));
			endTimestampCalendar.add(Calendar.HOUR, 23);
			endTimestampCalendar.add(Calendar.MINUTE, 59);
			endTimestampCalendar.add(Calendar.SECOND, 59);
			endTimestamp = endTimestampCalendar.getTime();
			lastMonth.setTime(endTimestamp);
			if (endTimestampCalendar.get(Calendar.DATE) != endTimestampCalendar.getActualMaximum(Calendar.DATE)) {
				lastMonth.roll(Calendar.MONTH, -1);
			}
			pages = new Page[(int)(limit * 1.5)];
			String minimuEditsText = System.getProperty(MINIMUM_EDITS_PROPERTY_KEY, "15");
			minimumEdits = Integer.parseInt(minimuEditsText);
		}
		
		public void endDocument() throws SAXException {
			System.err.println("Processed: " + revisionCounter);
			System.err.println("As of the last month"
					+ " (" + new SimpleDateFormat(YEARMONTH_FORMAT_STRING).format(beginTimestamp) + "),"
					+ " the Wikipedia received "
					+ (int)(editsInLastMonth / lastMonth.getActualMaximum(Calendar.DATE))
					+ " edits a day.");
			System.err.println("The " + totalEdits + " total edits made to the Wikipedia.");
		}
		
		private static Date getDateProperty(String key) throws SAXException {
			String property = System.getProperty(key);
			try {
				return DATE_FORMAT.parse(property);
			} catch (ParseException e) {
				throw new SAXException(e);
			}
		}
		
		public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
			String name = localName.equals("") ? qName : localName;
			elementStack.push(name);
			if (name.equals("namespace")) {
				String key = "";
				try {
					key = atts.getValue("key");
					ns = Integer.parseInt(key);
				} catch (NumberFormatException e) {
					throw new SAXException("ns: " + key, e);
				}
			}
		}
		
		private int revisionCounter = 0;
		
		private int totalEdits = 0;
		
		private int totalEditsInPeriod = 0;

		private int totalReverts = 0;
		
		private int totalRevertsInPeriod = 0;

		private int ns = 0;
		private String namespace = "";
		
		private String pageTitle = "";
		private Page page = null;
		
		private Page[] pages = null;
		
		public Page[] getPages() {
			return pages;
		}
		
		private Date timestamp = null;
		private String timestampString = "";
		private String commentString = "";
		
		private boolean ignoreRevision = false;
		
		private int timestampParseExceptionCount = 0;
		
		final static private PagesComparator PAGES_COMPARATOR = new PagesComparator();
		
		int pageCounter = 0;
		
		public void endElement(String uri, String localName, String qName) throws SAXException {
			final String name = elementStack.pop();
			if (name.equals("namespace")) {
				namespaces.add(namespace, ns);
				ns = 0;
				namespace = "";
			} else if (name.equals("page")) {
				if (page.getEdits() < minimumEdits) {
					return;
				}
				if (pageCounter <= (pages.length - 1)) {
					pageCounter ++;
					pages[pageCounter - 1] = page;
				} else if (pageCounter > (pages.length - 1)) {
					final Page lastPage = pages[pages.length - 1];
					if (page.getEdits() > lastPage.getEdits()) {
						pageCounter ++;
						pages[pages.length - 1] = page;
					}
				}
				if (pageCounter >= limit) {
					Arrays.sort(pages, PAGES_COMPARATOR);
				}
			} else if (name.equals("title")) {
				page = new Page(pageTitle, namespaces.ns(pageTitle));
				pageTitle = "";
			} else if (name.equals("timestamp")) {
				ignoreRevision = false;
				try {
					timestamp = TIMESTAMP_DUMP_FORMAT.parse(timestampString + "UTC");
					timestampString = "";
				} catch (ParseException e) {
					timestampParseExceptionCount++;
					ignoreRevision = true;
				}
			} else if (name.equals("revision")) {
				if (ignoreRevision) {
					return;
				}
   
				if (commentString.contains("rvv") || commentString.contains("取り消し") || 
					commentString.contains("巻き戻し") || commentString.contains("rv") || 
					commentString.contains("荒らし") || commentString.contains("差し戻し") 
					|| commentString.contains("Rv") ){
					if (timestampBeforeOrEquals(timestamp)) {
						page.incrementTotalReverts();					
						totalReverts ++;
						if (timestampIsInPeriod(timestamp)) {
							page.incrementReverts();
							totalRevertsInPeriod ++;
						}
					}		
				}

				commentString = "";

				if (timestampBeforeOrEquals(timestamp)) {
					page.incrementTotalEdits();
					totalEdits ++;
					if (timestampIsInPeriod(timestamp)) {
						page.incrementEdits();
						totalEditsInPeriod ++;
					}
				}
				final Calendar calendar = Calendar.getInstance();
				calendar.setTime(timestamp);
				if (calendar.get(Calendar.YEAR) == lastMonth.get(Calendar.YEAR)
						&& calendar.get(Calendar.MONTH) == lastMonth.get(Calendar.MONTH)) {
					editsInLastMonth ++;
				}

				timestamp = null;
				revisionCounter++;
				final int LOG_INTERVAL = 10000;
				if (revisionCounter % LOG_INTERVAL == 0) {
					System.err.println("Processed: " + revisionCounter);
				}
			}
		}
		
		private boolean timestampIsInPeriod(Date timestamp) {
			return ( timestamp.equals(beginTimestamp) || timestamp.after(beginTimestamp) )
					&& timestampBeforeOrEquals(timestamp);
		}
		
		private boolean timestampBeforeOrEquals(Date timestamp) {
			return ( timestamp.before(endTimestamp) || timestamp.equals(endTimestamp) );
		}
		
		public void characters (char[] ch, int start, int length) {
			try {
				final String elementName = elementStack.peek();
				final String string = new String(ch, start, length);
				if (elementName.equals("namespace")) {
					namespace += string;
				}
				if (elementName.equals("title")) {
					pageTitle += string;
				}
				if (elementName.equals("comment")) {
					commentString += string;
				}
				if (elementName.equals("timestamp")) {
					timestampString += string;
				}
			} catch (EmptyStackException e) {
				// NOP
			} catch (IndexOutOfBoundsException e) {
				// NOP
			}
		}

	}

}