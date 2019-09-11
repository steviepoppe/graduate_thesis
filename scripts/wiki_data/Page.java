class Page {
	
	private final String title;
	
	private final int ns;
	
	private int edits;
	
	private int totalEdits;
	
	private int reverts = 0;;
	
	private int totalReverts = 0;

	public String getTitle() {
		return title;
	}

	public int getNs() {
		return ns;
	}

	public int getEdits() {
		return edits;
	}

	public int getTotalEdits() {
		return totalEdits;
	}

	public int getReverts() {
		return reverts;
	}

	public int getTotalReverts() {
		return totalReverts;
	}
	
	public double getControversy() {
		return (double)reverts /(double)edits;
	}

	public double getTotalControversy() {
		return (double)totalReverts/(double)totalEdits;
	}

	public Page(String title, int ns) {
		this.title = title;
		this.ns = ns;
	}
	
	public void incrementEdits() {
		edits++;
	}
	
	public void incrementTotalEdits() {
		totalEdits++;
	}

	public void incrementReverts() {
		reverts++;
	}
	
	public void incrementTotalReverts() {
		totalReverts++;
	}

}