---
documentclass: memoir
banner: "images/banner.png"
author: Stevie Poppe
title: The Logics of Japanese Cyber-nationalism
title2: The Logics of Cyber-nationalism
subtitle: Rethinking Expressions of Nationalism in the Age of the Internet
subtitle4: Rethinking Japanese Expressions of Nationalism in the Age of the Internet
subtitle3: Rethinking Expressions of Nationalism in the Age of the Internet
alttitle: Contextualizing Nationalism in the Age of the Internet
subtitle2: Contextualizing Ideology in the Age of the Internet — Uniquely Japanese, or Expressions of Global Resentment? 
year: 2018 - 2019
supervisor: Prof. Dr. Dimitri Vanoverbeke
characters: undetermined
abstractnl: "Abstract (Dutch)."
abstract: "Terms as 'alt-right', '*fachosphère*' and '*Netto-Uyoku*' have in their respective languages entered the mainstream discourse and refer to a phenomenon of online-based right-wing populist nationalism. This paper attempts to conceptualize that phenomenon as cyber-nationalism. First it did a literature study of existing literature on Netto-Uyoku. Next, it built a theoretical framework of cyber-nationalism. Finally, we adopted a quantitative and computer-assisted content analyses to online media associated with the Netto-Uyoku.
We find the critical theory of the Frankfurt School suitable for grounding our framework of cyber-nationalism on. A reading of right-wing populist rhetoric reveals a distinct flavor of Gramscian logic: established politics, left-wing educational institutions and mainstream media serve to manufacture consent to the hegemonic ideology of the 'elite', which does not adequately represent the 'people's will' and defers from self-perceived contradictions in society. The Internet as imagined Habermasian public sphere offers an ideal way for disseminating a counter-hegemonic ideology. Although not of the Frankfurt School tradition, we follow McLuhan's notion of the medium as the message in that neither the Internet nor the World Wide Web, shaped by libertarian counter-culture movements, are to be seen as free of ideology.
Yet despite the existence of this Japanese term Netto-Uyoku implying an electorate for anti-establishment right-wing populists in Japan, as well as the existence of various ultra-nationalist grassroots movements such as the Zaitokukai and the 'Japan First Party', the Liberal Democratic Party (LDP) retains its dominant grip on Japanese politics. My argument for that is twofold. While populist newcomers worldwide have capitalized on the distrust of established institutions experienced amongst these cyber-nationalists, the LDP has effectively done this earlier in the wake of the Democratic Party of Japan's waning popularity after the 2011 earthquake. On a macro-level, the LDP has spread its ideological hegemony through the state-sponsored soft-power of its culture industry (Cool Japan), while on a micro-level the LDP appeals to Japanese cyber-nationalists by manufacturing outrage and exploiting the same self-perceived contradictions in society that have lead to counter-hegemonic movements elsewhere."
bibliography: "bibtex/Master.bib"
csl: "bibtex/chicago-author-date-jp.csl"
geometry: "lmargin=3.25cm, rmargin=2.95cm, tmargin=3cm, bmargin=3cm"
fontsize: "10pt"
mainfont: "CMU Serif"
sansfont: "CMU Sans Serif"
CJKmainfont: "Kozuka Mincho Pro"
toc-depth: 3
papersize: A4
lang: en-GB
blfootnote: This paper was written in a mixture of the Markdown mark-up syntax and \LaTeX. Its source code, as well as that of any used scripts, are available at <https://github.com/steviepoppe/graduate_thesis/>.
keywords: Netto-uyoku, netouyo, social media, Internet, alt-right, neo-nationalism, nationalism, Japan, subcultures, discourse, ideology
link-citations: true
indent: true
header-includes:
  - \usepackage{setspace}
  - \linespread{1.50}
---


\pagestyle{plain}
\fancyhf{}
\chapterstyle{thatcher}
\setsecnumdepth{subsection}

\rhead{ポッペ・スティーヴィー}
\lhead{日本における「サイバーナショナリズム」　ー　「ネット右翼」は思想があるか？}

\begin{otherlanguage}{japanese}

\chapter*{目次}
\addcontentsline{toc}{chapter}{目次} 
\setcounter{tocdepth}{1}
\begin{enumerate}[leftmargin = 0pc]
\item[] 目次
\item[] 要旨
\item[] 各章抄訳
\item[] 序論
\item[] 章一 メディア、ポピュリズムと日本 - 理論的枠組み
\begin{enumerate}
 \item[] 1.
 \item[] 2.
 \item[] 結論
\end{enumerate}
\item[] 章二 日本におけるインターネット - デジタルラブストーリー
\begin{enumerate}
 \item[] 1.
 \item[] 2.
 \item[] 結論
\end{enumerate}
\item[] 章三 「ネット右翼」 - インターネット時代におけるナショナリズムの表現
\begin{enumerate}
 \item[] 1.
 \item[] 2.
 \item[] 結論
\end{enumerate}
\item[] 結論
\item[] 付録
\item[] 参考文献
\end{enumerate}

\newpage

\addcontentsline{toc}{chapter}{日本語要旨} 
\setcounter{tocdepth}{1}

\begin{abstract}

古いですよー

欧州における右翼ポピュリズムの高揚が、ポピュリズムに関し、より具体的にはポピュリズムとソーシャルメディア（SNS）のつながりに関する研究を前進させた。日本でも、インターネットとコンピュータ・メディア・コミュニケーション（CMC）はポピュリスト運動と右傾化に関連付けられている。更に、安田（2012）、山口（2013）およびMorris-Suzuki（2015）はインターネットが「在日特権を許さない市民の会」（在特会）のような極端な民族主義的市民団体による活動の組織のために使用されているだけでなく、そのグループの基礎自体もCMCによるものだと言及し、そのグループの基礎がインターネット上で右翼的な発言をする人物、いわゆるネット右翼に関連しているとする。そこで、本稿はCMCと日本におけるポピュリズムの関係を明らかにする。

そのため、本稿はまず（ディジタル）ポピュリズムの概念的枠組みを示す。それは、ポピュリズム、SNS、そして日本との関係に関する最近の研究を検討することにより行う。次に、本稿は影響力がある政治活動家の桜井誠と彼によって動員された有権者のネット右翼に焦点を当てた事例研究を行う。ここでは、社会的アイデンティティ ・ アプローチを通じて、ネット右翼の行動を明らかにする最初の試みを提供し、さらに既存のディジタルポピュリズムの概念を再定義することを目指す。最後に、桜井誠のイデオロギーを定量的にポピュリズムに関連付けるために本稿は桜井誠のツイッター活用の部分にテキストの定量分析を行う。

本稿の結論では、まず、SNSや「2ちゃんねる」のような匿名掲示板は、日本で広く普及され、政治的目的のため、更にポピュリスト的な排外主義のイデオロギーを普遍化するための優れた環境を提供するものであるとした。そして、ネット右翼によるポピュリスト的なイデオロギーは主に在日コリアン、近隣諸国、左翼系、マスメディアに見られるような反日運動に対しての拮抗作用と関連しており、その理論に従えば、これらの実体はポピュリスト的なイデオロギーの敵として理想主義的・単一民族主義的・愛国的な日本人によって批判される。最後に、文献は桜井誠をネット右翼に関する著名人と見なしており、更に、定量分析により、桜井誠のイデオロギーが欧州におけるポピュリズムのような排外主義や反動主義のイデオロギーと多くの関連があることを実証した。

\end{abstract}

\newpage

\chapter*{各章抄訳}
\addcontentsline{toc}{chapter}{各章抄訳} 
\setcounter{tocdepth}{1}

\subsection*{序論}
\setcounter{tocdepth}{3}

まだ

\subsection*{章一 メディア、ポピュリズムと日本 - 理論的枠組み}
\setcounter{tocdepth}{3}

まだ

\subsection*{章二 日本におけるインターネット - デジタルラブストーリー}
\setcounter{tocdepth}{3}

まだ

\subsection*{章三 「ネット右翼」 - インターネット時代におけるナショナリズムの表現}
\setcounter{tocdepth}{3}

まだ
\end{otherlanguage}
\newpage

\rhead{Stevie Poppe}
\lhead{The Logics of Japanese Cyber-nationalism}

\tableofcontents

\listoffigures

\listoftables

\begingroup
\clearpage
\let\clearpage\relax
\vspace*{4.5cm}
\chapter{The Alt-Right, Netto-Uyoku, Cyber-nationalism—A Global Phenomenon?}
\endgroup
\epigraphhead[50]{\epigraph{I sometimes suspect that we're seeing something in the Internet as significant as the birth of cities. It's something that profound and with that sort of infinite possibilities. It's really something new; it's a new kind of civilization.}{\fauxsc{William Gibson}\small\textup{, 1995}\\}}

\pagestyle{plain}

\pagenumbering{arabic}

On 2010-08-28 *The New York times* published an article titled "New Dissent in Japan Is Loudly Anti-Foreign", referring to a rise in politically motivated protest marches associated with a supposed Japanese 'Net-Right'. In his article, Martin Fackler describes this 'Net-Right' (hereinafter referred to by its Japanese term *Netto-Uyoku* ネット右翼)[^2] as "a new type of ultranationalist group ... a virtual community". He goes on to state that "while these groups remain a small if noisy fringe element here, they have won growing attention as an alarming side effect of Japan’s long economic and political decline" [@fackler_new_2010-1].[^1] A small fringe element that is nevertheless noisy enough to reach print press in the United States. In its most commonly applied form the term Netto-Uyoku applies to a loosely connected, decentralized group of Internet users disseminating a form of extreme right-wing discourse online and who are active primarily on social media platforms such as *Twitter*, the anonymous messaging board *2channel* (*2-channeru* 2ちゃんねる),[^12] and streaming services such as *Youtube* and *Niconico* (ニコニコ).[^58]

Far from benign expressions of free speech limited to shadowy corners of the Internet, consequences of such outings have however very much crossed digital boundaries and materialized in disquieting, at times even violent ways. As Fackler alluded to in his *New York Times* piece, the Netto-Uyoku are often name-called in the same breath as the neo-nationalist[^9] *Action Conservative Movement* (ACM), which includes such groups as *Zaitokukai*[^8] and *Shukenkai*[^7] [@higuchi_japans_2016;@gill_nativist_2018]. Furthermore, according to a 2016 investigation by the Japanese department of Justice, a total of 1152 protest marches, xenophobic in nature and associated with the ACM, were found to be held across Japan between the period April 2012 and September 2015 [@nikaido_eng:_2016]. Makoto Sakurai, founder of the Zaitokukai and one key figure in both the ACM and Netto-Uyoku movement, has been arrested for violence associated with such protest marches, stepping down as its leader in 2014. He did however remain a prolific political commentator online, going on to form the populist right-wing Japan First Party in 2016, holding their first convention in a hotel of the equally controversial Toshio Motoya owned APA Group.

Nevertheless, nearly a decade after Fackler's publication in *The New York Times*, coverage of the Netto-Uyoku and related topics such as the ACM and Zaitokukai remains relatively scarce, With some exceptions including the seminal work *Netto to Aikoku* (ネットと愛国, The Internet and Patriotism) by journalist Yasuda Koichi [-@yasuda_eng:_2012], and writings by @tsuji_eng:_2008, @murai_net_2012, @yamaguchi_xenophobia_2013, @higuchi_japans_2014 and @morris-suzuki_beyond_2015. Moreover, whenever the topic does reach mainstream outlets, there appears to be a tendency of framing the Netto-Uyoku as little more than a fringe movement and side-effect of economical malaise with little real-life influence [ @furuya_roots_2016].[^5] This is in spite of the fact that, as shown above, actions associated with this movement have had real-life consequences, not the least including the 2016 adoption of an anti-discrimination law in order to curb hate speech. Additionally, a 2017 paper on political bots in Japan even went as far as to suggest a hidden nationalist agenda of Prime Minister Abe Shinzō tied to that of the Netto-Uyoku, and viewing them as a potential "enormous online support army of Abe’s agenda" [@schafer_japans_2017], something that the author of this paper too has previously alluded to.[^14]

It goes without saying that expressions of neo-nationalist sentiment taking place largely within the confines of social media and shaped by a distinct Internet discourse are by no means limited to Japanese territory. The outcome of the United States' 2016 presidential elections, the 2016 British Brexit-referendum and the rise of neo-nationalist (that is to say, right-wing populist) ideology amongst various European political campaigns can be seen as trends of greater global political struggles. When more closely examined it will then too come to no big surprise, considering the extent it has penetrated our daily lives, that the role of the Internet and social media was of no small importance in those outcomes. Facebook came under strong public scrutiny in the wake of the Cambridge Analytica data scandal for example (In which it came to light that illicitly obtained personal data of up to 87 million *Facebook* users were used for political advertising and data-analysis in favor of Donald Trump 2016 presidential campaign and the British Leave.EU campaign).[^46] Moreover, backing the cult of amongst others personality of respective presidents Vladimir Putin, Recep Tayyip Erdoğan and Xi Jinping, as well as the in 2016 elected president of the Philippines Rodrigo Duterte, are supposed 'online troll armies'; deliberately and both on a voluntary or paid basis spreading disinformation on social media and attacking self-perceived enemies of their respective presidents. These online troll armies have on multiple instances been accredited with manipulation of political discourse online in order to influence elections, including in more recent memory the 2016 presidential elections in the United States. A practice Marko Kovic has, particularly in the case of state-sponsored Internet propaganda defined as 'digital astroturfing', calling it "a form of manufactured, deceptive and strategic top-down activity on the Internet initiated by political actors that mimics bottom-up activity by autonomous individuals" [-@kovic_digital_2018, p.71].

Moreover, the *Alt-Right* (arguably the western counterparts to the Netto-Uyoku and associated primarily with the United States) have drawn much ire after a white nationalist terror attack[^29] (i.e. ideologically driven violence) in Charlottesville, Virginia during its Unite the Right rally, and again after little public disavowal by the President of the United States.[^24] In similar fashion and overlapping ideologically with the Alt-Right, we then find associated foremost with (Western) Europe, Australia and New Zealand the so-called *Identitarian Movement*. It should be noted too that the perpetrator of the March 2019 terror attack in New Zealand sprinkled his manifesto with deeply ironic Internet-driven sub-culture rhetoric inherent to those movements. During the terror attack, the perpetrator referenced an online trend concerning Swedish Youtube influencer and Felix Khellberg (known for making video-game related videos through his online handler PewDiePie and as of writing subscribed to by over 95 million followers). In the perpetrator's manifesto, the perpetrator describes himself as "just an ordinary White man, 28 years old" and references a white supremacy conspiracy theory popularized by Alt-Right Youtube influencer and Canadian far-right Internet media-platform *The Rebel Media* contributor Lauren Southern.[^4] 

In Belgium, the mid-2019 elected politician Dries van Langenhove (aligned with populist far right party Vlaams Belang) too acquired attention through his mimicry of rhetoric used by online-based far-right nationalist movements including the Alt-Right on platforms as *Facebook* and gaming chat application *Discord* (which was brought to light in a 2018 documentary on the Belgian Identitarian youth movement *Schild & Vrienden*[^30]).[^10] Growing to become the second largest party in Belgium in the 2019 elections, Vlaams Belang (Flemish Interest)'s online campaign took inspiration from both the 2016 Brexit and Trump campaign, investing almost solely on social media advertisements and heavily targeting young voters aged 18 to 34 [@cerulus_inside_2019]. Furthermore, in another intersection with the Alt-Right, Vlaams Belang leader Tom Van Grieken hosted an event debating the UN migration compact with amongst others Steve Bannon [@gotev_vlaams_2018], and a youth subdivision of Vlaams Belang hosted Lauren Southern as guest-speaker during another congress supervised by Van Grieken [@rennenberg_vlaams_2018]. In France then, the term *fachosphère* came to denote similar trends on the French Internet after *Le Monde* published a series of articles linking Marine Le Pen's populist far-right Front National, Online video-game community *jeuxvideo.com* and 'Internet trolls' [@laurent_nordactu_2016;@audureau_les_2017].[^16] In South Korea, the populist far-right Liberty Korea Party (LKP) has been condemned for its usage of 'online Internet trolls'. Furthermore, its former chairman, previous presidential candidate and Youtuber Hong Joon-Pyo has seen comparisons to Donald Trump [@he-rim_firebrand_2018;@bo-gyung_youtube_2019]. Finally, the online platform *Ilbe Storage* is described as hosting the South Korean equivalent of the Japanese Netto-Uyoku [@shim_hardcore_2015]. 

If the actions of those online movements had any measurable effect on the outcome of the elections is wholly debatable, but in light of the above information, it is at the very least sensible to claim the Internet as a medium plays an undeniable role, not just in the organization of neo-nationalist movements, but in shaping elements of its discourse as well; a narrative that is by the way increasingly amplified by numerous mainstream news outlets. One Politico reporter states that "Just about everyone else, if they’re aware of these efforts at all, assumes they amounted to little more than entertainment for bored geeks and some unpleasant episodes for the targets of its often racist and sexist harassment campaigns. After all, the idea that a swarm of socially alienated trolls played a meaningful role in a multibillion-dollar presidential campaign by, among other gambits, relentlessly spreading images of a cartoon frog is at least as ridiculous as the idea that a billionaire TV entertainer could win that campaign" [@schreckinger_world_2017].[^26] Furthermore, Japan's international *soft power* has without a doubt left its mark on many of those communities abroad, seeping particularly into the Alt-Right and Identitarian Movement.[^32] To name some examples, former Donald Trump strategist and Breitbart News Network owner Steve Bannon participated as speaker at the 2017 *Japanese Conservative Political Action Conference* (J-CPAC) and praised Prime Minister Shinzo Abe as being "Trump before Trump". Alt-Right and Identitarian Movement associates including white supremacists Richard Spencer (who coined the term Alt-Right) and Jared Taylor (who himself was born in Japan and speaks fluent Japanese) often sing praise of Japan as an exemplary *ethno-state*. Finally, other such Alt-Right associates include Vice Magazine co-founder and Proud Boys founder Gavin McInnes. A far-right male-only organization driven by the white genocide conspiracy theory and notorious for inciting violence, its founder too has since gone on to write for the Canadian far-right Internet media-platform The Rebel Media, and in 2018 participated in a reenactment of the 1960 assassination of Japanese Socialist Party (JSP) chairman Inejiro Asanuma by ultra-nationalist Otoya Yamaguchi [@feuer_founder_2018].[^20] Journalist Audrea Lim, in her The New York times editorial, even goes so far to assert "yellow fever" (a sexual obsession with those of Asian descent) as a common trait amongst the Alt-Right, stating that many public figures in the movement have had documented relationships with Asian women [-@lim_opinion_2018].

This soft power influence is observable on a grass-roots level as well. @charity_why_2016 for example reports on the increasingly common phenomenon of encountering online imagery containing politically-tinted Japanese animation characters (wearing political symbols ranging from neo-Nazi symbols to Trump-related iconography such as MAGA hats). The English-language anonymous messaging board *4chan* in particular[^17] (since September 2015 publically owned by *2channel* founder Hiroyuki Nishimura) started in 2003 as a North-American copy of its Japanese equivalents text-board *2channel* and image-board *Futaba Channel* with an intended focus on discussing Japanese pop-culture [@orsini_how_2015], but came under heavy scrutiny in 2014 for its association with the *Gamergate* controversy and the Alt-Right. The former, a co-ordinated harassment campaign against women targeting sexism in video game culture and the multi-billion video game industry, can be interpreted both as protest against diversification of a supposed gamer identity (a cultural identity that has traditionally been associated with men) and as part of a larger reactionary online culture war).[^18] Moreover, preliminary research on such microcosmic English-language Internet communities (such as the political discussion section of *4chan*, the *4chan* spin-off *8chan*[^25] and the conservative political section of *Reddit*)[^56] observes strong neo-nationalist rhetoric exemplary of the Alt-Right. This research further argue those Internet communities to be hubs for influencing mainstream political discourse and setting "the narrative agenda for mainstream media outlets" [@hine_kek_2016; @pearson_scientists_2016; @zannettou_web_2017; @zannettou_origins_2018]. Alt-right appropriated *viral* imagery (in colloquial terms known as 'memes')[^19] such as that of a green anthropomorphic frog ('Pepe the Frog') find their roots in those communities as well, and have been shared in some form by members of the current White House, including Donald Trump and Donald Trump Jr. [@lee_understanding_2016; @ohlheiser_analysis_2016; @phillips_alt-right_2016]. 

Thus, to reiterate, an increase of mainstream news reports, as mentioned above, claim occidental online communities with an origin in discussing Japanese pop-culture are effectively 1. hotbeds for right-wing radicalization, and 2. important electoral spaces for both right-wing populist political parties and for politically motivated citizen movements in the United States and Europe. Members of those movements have praised Japan as the ideal of an 'ethno-state', and have themselves gained political traction outside the realm of the digital. Moreover, in this chapter I've discussed a global trend of neo-nationalist discourse on the Internet and shown that terms as *fachosphere*, Netto-Uyoku and Alt-Right are conceived of as expressions of such phenomena. Nevertheless the *fachosphere* for example refers uniquely to the French language cyberspace in which such a discourse finds place (with the added connotation of fascism), while the Alt-Right, now as a term unquestionably grown beyond its intended use, was originally conceived of as applying to a particular ideological movement in the United States. As I demonstrate in the next chapter, a common factor in literature on the Netto-Uyoku is the connection with ideologically driven ACM movements like the Zaitokukai (arguably the *real* counterpoint to the original Alt-Right). The term Netto-Uyoku however, leans in meaning most closely to this phenomenon of Internet-driven right-wing populist nationalism; a phenomenon I would like to further conceptualize as the ideological movement of *cyber-nationalism* (i.e. a form of neo-nationalism centered around the peculiarities of the Internet as a medium). Although overlapping with recent conceptualizations of neo-nationalism, I feel that the *neo* aspect does not yet permit enough agency to the Internet as a medium. After all, as McLuhan famously describes, "the medium is the message" (McLuhan 1964) and, with roots in libertarian counter-movements, so too is the Internet and World Wide Web (as I will delve into in the fourth chapter) undeniably political. Although rooted in technological determinism, McLuhan argued similarly to @azuma_ippan_2011, @tamura_niggling_2014 that the very nature of electronic media would shrink the world into a 'global village' and cause social change through increased social and political involvement and awareness. Precisely because of the general lack of gate-keepers and the dual role of the Internet-user as both consumer and producer does the the Internet as medium thus serve as perfect representation of McLuhan's 'global village'.[^21]

In this chapter, I've also argued that the space of the Internet is increasingly politicized and fertile soil for both grass-roots levels of Internet activism as large-scale political warfare. Within the context of Internet and politics, academics and journalists alike have to various degrees debated and hypothesized on the contribution of the Internet to political polarization, on the Internet's utilization by political actors applying populist strategies and antagonizing mainstream press, and on the media effects of the so-called 'new media' on its users regarding political awareness and opinion-forming (such as the effects of so-called echo chambers—reinforcement of one's ideas through repeated confrontation with opinions and news aligning with one's ideas). Although deliberate misinformation ('fake news') is by no means a new trend either,[^11] this too has thrived due to the Internet's widespread usage. The lack of moderation and the spontaneity of social network platforms facilitates the (conscious) spreading and sharing of false information (or information seen loose of its context), without reflection or without source control, and has potentially far-reaching political consequences. 

Thus, while this paper refrains from taking too hard a technological determined position towards the Internet (the implication being that the existence of the Internet as new medium would by itself be a lead cause for societal change),[^22] and treats the Netto-Uyoku in part as a symptom of deeper cultural malaise, it does suggest that by no means should the Internet be dismissed as merely a tool of communication that is itself shaped by societal changes; two takes that both have often been reported in respects to the Netto-Uyoku and other cyber-nationalist movements such as the Alt-Right (**sources here, news article claiming the Internet caused right-wing populism, and visa versa**). Nevertheless, as I will cover over the next chapters, in many ways populism and ironically nationalism too thrive on the Internet. Although the term Netto-Uyoku and its idiosyncrasies are in no doubt shaped by Japanese occurrences, as seen in the framing of @azuma_otaku:_2001 and @kitada__2008, I attempt to contribute to the literature on Netto-Uyoku by reading them not as a uniquely Japanese *Galapagos syndrome* phenomenon, but as a localized expression of what I define as the universally applicable notion of *cyber-nationalism*.

This paper consists of four chapters, including this introductory first chapter. The second chapter intents to built a narrative on the Netto-Uyoku through a literature review of both several seminal and newer writings and studies, both in the English and Japanese language. As a relatively young and volatile term, 'Netto-Uyoku' has gone through shifts in meaning. Earlier works viewed the Netto-Uyoku not as an actual group with group identity, but loosely as people utilizing the Internet and engaging in aggressive, politically-driven (ultra-nationalist) rhetoric online (**Sources**). With the widespread pejorative usage of the term (in particular the abbreviation *netouyo*), those at the receiving end of this critique have had ambiguous reactions. Some denounced the term (a common thread is the normative implication that they are merely 'normal Japanese citizens' voicing the concerns of the people), while others have mockingly appropriated it (as is the case, for example, with Zaitokukai-founder Makoto Sakurai). Through the social constructionist act of naming this phenomenon, so thus arises a group identity with the discursive implication of both in-group normalization and out-group polarization. Early scholarly work referring to the Netto-Uyoku does so in a greater context debating politicians with populist tendencies (Toru Hashimoto, Shintaro Ishihara, Abe Shinzo), the revisionist organization Nippon Kaigi, or the actions of ACM-affiliated protest movements as Zaitokukai. The social platform of 2channel is however a red line throughout these works, as well as occasional references to Channel Sakurai, Niconico, Youtube and Twitter. Those works have far often viewed the Netto-Uyoku in a greater debate of (trans)national identity, discrimination and of questions to what qualifies as freedom of speech [@tsuji_eng:_2008;@yasuda_eng:_2012;@yasuda_:_2013;@murai_net_2012;@morris-suzuki_beyond_2015]. Two exceptions are @azuma__2007 and @kitada__2008, who've both connected the Netto-Uyoku with a cynical nihilism amongst 2channel-users in the wake of the economic crisis known as the Lost Decade. State of the art literature in contrast discusses and hypothesize on the socio-cultural background of the Netto-Uyoku, as well as on its ideology, demography and *modus operandi* [@schafer_japans_2017;@kitada_owaranai_2018;@kurahashi_:_2018;@ota_saraba_2019;@yasuda_:_2019]. This paper then too intents to read the Netto-Uyoku not as a noisy fringe element of Japanese society, but as an ideologically driven movement with political agency, and keeping in the mind the context laid out in this chapter, the power to exert influence on public discourse. Based on this premise, several questions do come to mind. How then do the Netto-Uyoku and Japanese Internet sub-cultures fit in Japanese politics? Is there then a likelihood of radicalization amongst the Netto-Uyoku, with the offset chance of major political shifts or increases in politically-motivated violence, or is there just too great a difference between the socio-cultural context of the Netto-Uyoku and that of its equivalents worldwide to even imagine such events occurring? Are there similar trends of online culture wars on Japanese social media? I attempt to answer these in the next few chapters.

The third chapter serves to lay down a Frankfurt School inspired lens of theory through which I will read the Netto-Uyoku. In this chapter, I build a framework of cyber-nationalism based on my understanding of ideology, neo-nationalism and populism. I do this through the reasoning of thinkers associated with the Western Marxist or Frankfurt School of critical theory: György Lukács, Antonio Gramsci, Theodor W. Adorno, Walter Benjamin and Fredric Jameson—juxtaposing this with concrete historical applications leading up to the present state in which the Netto-Uyoku arises. In contextualizing populism, I follow @taggart_populism_2000, @laclau_populist_2005 and @mudde_oxford_2013 in their definitions of populism as a *thin-centered* ideology antagonizing a homogeneous elite in contrast to "the People's Will", a homogeneous group of "ordinary people", utilizing a "us versus them" dichotomy. It then further analyzes compatibility with a so-called "Japanese model of populism" (*nihongata popyurizumu* 日本型ポピュリズム) as described by Japanese scholars such as @otake__2003, @kimura__2006, Matsutani Mitsuru [-@matsutani__2009; -@matsutani_eng:_2010], @yoshida__2011, and @kobori_populism_2013. I also draw on the work of @anderson_imagined_2006 for his notion of *imagined communities* and Azuma Hiroki for his concepts of *General Will 2.0* in relation to Internet-based forms of populism, and *animalization* within the context of Lukács's *reification* [-@azuma_otaku:_2001;-@azuma_ippan_2011].

In the fourth and final chapter I attempt to lay bare underlying ideological structures by conducting a critical content analysis of what is to be understood as Netto-Uyoku rhetoric, building on @van_dijk_politics_2006 and @fairclough_media_2010. After giving a brief overview of the platforms most commonly associated with the Netto-Uyoku, I focus particularly on Wikipedia and Twitter as two major platforms of online communication both in Japan and globally; two platforms that due their open access give us an in-depth view on the formation and dispersion of Netto-Uyoku associated messages. Keeping in mind McLuhanian logic, I pay particular attention to the *modus operandi* of each platform as well as peculiarities of the Internet itself. Support for Japanese characters on Internet addresses (URLs) is for example relatively new, and thus are Japanese website URLs and many profile names on social made dominantly written in the Latin alphabet (in the process hinting at a technologically-determined hegemonic nature of the medium of the World Wide Web itself). I will also expand on one particular event in recent Netto-Uyoku history: The Netto-Uyoku Ban Matsuri (*netouyo ban matsuri *ネトウヨBAN祭り). Earlier I inquired on the existence of a Japanese equivalent of online culture wars. While setting up the outline of my paper, this question answered itself. The latter uses methods of mass-reporting on Youtube and Twitter for automatic removal of Netto-Uyoku related accounts.

Concretely, over the course of this paper I attempt to answer such questions as:

- How should we define Netto-Uyoku ideology?
- What processes do Netto-Uyoku employ to disseminate ideology?
- What are the dynamic processes of the media platforms that the Netto-Uyoku utilize?
- How do Netto-uyoku compare to other online-based neo-nationalist movements? Can we speak of a distinct Japanese character compared to contemporary movements, or should we view Netto-Uyoku primarily as part of a greater trend of Internet-fueled populist neo-nationalism?
- How does the movement organize and mobilize, both online and in real life?
- Is there possible space for furthering a Netto-Uyoku political "agenda" through influencing its international counterparts?

On a closing note, it should be mentioned that any research involving the Internet and social networks online is bound to have some risks and limitations. In this case risks and limitations involve liquidity of data, copyright laws pertaining acquiring data and lack of reliability due anonymity masking intent of the original author.[^57] As I referred to earlier, one issue that arose during my writing process was the effect of an on-going online *culture war* between Netto-Uyoku members and anti-hate speech movements. I concur that limiting public access to ideological extremist material reduces chances of radicalization,[^55] but for the purposes of research it drastically impacted my ability to assess network influence and trickle-down effects of extremist rhetoric on mainstream platforms. Other issues are the extraction of online data from an ethical viewpoint and the concept of informed consent, more so in light of the Cambridge Analytica scandal. The dataset contains data created independent of the researcher on platforms that are explicitly open (Twitter, 2channel, *matome* blogs, Twitter and *wiki*-style encyclopedias). In other words, data that is openly available to group-outsiders and explicitly intended to be so (including user-names) on online spaces that are not expected to be private spaces. With the ratification of the General Data Protection Regulation (GDPR)[^47] on 25 May 2018, 2channel has blocked all access from EU IP addresses. All data was however legally obtained during my presence in Japan, and according to the Terms of Service of platforms I have an account on. Finally, following Janet Salmons argument for a synthesis between different traditions on research ethics, it is therefore reasonable to argue that informed consent from the researcher is not applicable in this case.
 
Japanese and Korean names are written in the autonomous usage, with family name preceding the given name. Macrons have been used to identify long vowels in Japanese, with the exception of well-known place names such as Tokyo, Osaka and Kyoto. 

\newpage

#The Phenomenology of Netto-Uyoku — A Literature Review

To demonstrate the extent of reach the Netto-Uyoku have had, this paper's introduction briefly touched upon an English-language print article in The New York Times. It goes without saying the term has been in use since much earlier. The first English-language mention in mainstream media can be traced back to March. 14, 2006, when Journalist Eric Johnston wrote a piece for The Japan Times on right-wing nationalism and the Internet in Japan, "Net boards venue for faceless rightists". In his piece, Johnston associates these 'faceless rightists' (who he further refers to as *Net Uyoku*) with hate-speech towards Koreans, the anonymous Internet forum *2Channel*, online video platform *Channel Sakura* and the conservative political organization *Nippon Kaigi* [@johnston_net_2006]. These topics are presented to some extent in virtually all writings I will review. 
In Japan, the term first reached print press in a 2005 Mainichi Shimbun article by @sasaki_netto-uyoku_2005, a journalist with a lengthy publishing record on Japanese Internet discourse. Almost two decades have passed since its first usage in mainstream press and almost a decade since the journalist @yasuda_eng:_2012 brought the phenomenon in public connection to the The Action-Conservative Movement.

As illustrated on **Figure \ref{fig:nettouyoku}** 

\begin{figure}[!htb]
 \centering
   \caption{\label{fig:nettouyoku} The Google Trends of Netto-Uyoku \& Japan (15 Years).}
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/nettouyoku.eps}
\end{figure}

In one of the first English language academic writings on the topic, Tessa Morris-Suzuki[^60] [-@morris-suzuki_freedom_2013] warns against the dangers of social media as a tool for populist mobilization, and paradoxical usage of "freedom of speech". While not explicitly using the term Netto-Uyoku or *net-right*, she describes trends of "violently xenophobic or racist messages, recycling wartime language and imagery that had long disappeared from public discourse in Japan" on the anonymous Internet forum 2channel as a trend of *Internet nationalism*. Based on a 2012 social media white paper showcasing 2channel users to be predominantly young and male, she then frames Netto-Uyoku as "lonely, frustrated *otaku* (an isolated person with obsessive interests), probably unemployed or in a dead-end job, seeking some sense of identity by sharing anger and bitterness with nameless others". She further hints that as the social media-scape shifts, so too then finds this 2channel-inspired Netto-Uyoku discourse its way to other platforms. The image of the lonely Netto-Uyoku as an *otaku* seeking comfort in nationalism and group-bonding online is indeed a compelling narrative, although purely speculative and of course highly stereotypical.

Like Yasuda Koichi, she ties 2channel to the ACM (or rather, the "emergence of new forms of far right movement in Japan") such as the Shinshakai Undo and more specifically the Zaitokukai. Of note to her is the Zaitokukai's active use of social media for propagating ideology, hinting a radicalizing effect by claiming such media usage is how the Zaitokukai "recruit the young". Their usage of hate speech then, while through various interpretations of the Penal Code illegal, so argues Morris-Suzuki, goes unpunished "because such laws could limit freedom of speech". Finally she claims that, despite a lack of violence, these movements both on and offline should be taken seriously. Why? She recalls an incident in January 2001, when shortly before the planned public broadcast of an NHK documentary on wartime acts of violence against women by the Japan military, the national broadcast service NHK was forced to cut parts including testimony and preliminary findings. The reason for this, as turns out later, was an implied censorship and political interference by Abe Shinzo, unsupportive of the biased nature of the show. As the media-scape shifted, however, so too did Abe Shinzo and a number of Japanese politicians including Hashimoto Toru take "to social media with great enthusiasm".[^3] In particular, she recalls an incident in which Abe's secretary mobilized Abe's friends and followers on his Facebook page (at the time counting at respectively 4,800 and 230,000) for an online attack, again, on the NHK (including a *fake news* story of one panel member on the show). Rather than condemning this, and contradictory to his public statement of "Japan’s diplomacy must always be rooted in democracy" in 2012", Abe instead perpetuates this attack by responding to that public message on his Facebook with another *ad hominem* attack.[^61]


## The Action-Conservative Movement

@gill_nativist_2018

### Makoto Sakurai (桜井誠)

As both founder of the Zaitokukai and Japan First Party, and himself a quintessential Netto-Uyoku member, Makoto Sakurai is present in virtually every paper dealing with Netto-Uyoku. Yet relatively little personal information on him is publicly available (and even his actual birth-name was left unknown for several years).[^62] @yasuda_eng:_2012 spends considerable time uncovering elements of Sakurai Makoto's past, elements he himself has later repeated in an interview with the conservative right-wing newspaper @sankei_news__2016 (one of few mainstream outlets covering his political ambitions during the 2016 Tokyo gubernatorial elections).

Sakurai (reportedly born in Fukuoka on 15-02-1972 and raised by a single mother) recalls some potentially fictitious accounts leading up to his distrust of established left-wing institutions and ethnic Korean citizens, including acts of violence by students from a nearby North-Korean affiliated high school, corruption amongst local politicians and a dislike for the Japan Teachers' Union.

Yasuda traces the start of his activism (or particularly the anti-Korean element of it, kenkan katsudō 嫌韓活動) back to the 2002 FIFA world championship organized in Seoul, South-Korea. Despite immense support towards South-Korea, Sakurai claims an anti-Japanese presence on the Internet, with such slogans as "Lose, Japan!" (*nihon makero* 「日本負けろ」).



### Zaitokukai


##Counter-movements

###C.R.A.C.

###Norikoe-net

(Suzuki Kunio from Issuikai and Murayama)

##Politics

@schafer_japans_2017

###LDP

https://lite-ra.com/2019/07/post-4813.html

Japanese lawyer Tomomi Inada, who has served under Abe Shinzō as Minister of Defense and Minister in charge of the Cool Japan Strategy, is another member of the Nippon Kaigi. She has made controversial statements regarding stock elements of Japanese nationalism, such as denial in part of the Nanking Massacre and the Comfort Women system, stating there is no need to continuing expression of remorse towards other Asian countries.

(zaitokukai donations?) 

###Nippon Kaigi

Moritomo Gakuen: private school wih a nationalist curiculum

###Japan First Party

##Conclusion



#Cybernationalism and Japan — Connecting the Dots

In chapter one, I've suggested that the Netto-Uyoku adhere ideologically to a form of right-wing populist nationalism (which I'll further refer to as neo-nationalism). I've further suggested that media and this form of right-populism sweeping the world are intrinsically linked. Finally, we can from the very meaning of the Japanese term Netto-Uyoku (the 'Internet Right') draw an implied importance of the Internet and social media. These loaded statements lead to several inevitable challenges. Concepts such as ideology, populism and nationalism (along with such terms as freedom and democracy) are due their over-inflation in usage at an increasing risk of becoming neigh reduced to trending political abstractions; or to borrow from Laclau's [-@laclau_populist_2005, p.70] theorization of semiotics and political identity, empty signifiers. This chapter serves to built the theoretical framework through which I will interpret the Netto-Uyoku.

##Discourse, Power, Ideology

"1. A system of ideas and ideals, especially one which forms the basis of economic or political theory and policy. 2. The set of beliefs characteristic of a social group or individual", thus defines the online Oxford Dictionary the concept of ideology.[^36] Although Terry Eagleton in his *Ideology: An Introduction* [-@eagleton_ideology:_1991] agrees that such a pragmatic view on the notion of ideology is common in public discourse (albeit with the possibility of an underlying critique: that of the ideologue having an an oversimplified view of the world, and through indoctrination has a distorted understanding of reality), he does warn, in light of the historical context briefly sketched below, against one "Grand Global Theory" or one single comprehensive definition of ideology; especially one that would contrast ideology with "pragmatism".[^37]  After all, following Martin Heidegger's hermeneutic reasoning of interpreting reality, it would be impossible to identify and judge an occurrence without a set of preconceived values. Or following Mannheim's Paradox, analyzing a world-view as an ideology is achieved only from the vantage point of another ideology [-@eagleton_ideology:_1991: p.1, pp221-224]. Actions of the Netto-Uyoku are, intentional or not, ideologically motivated. By studying the discourse and rhetoric of the Netto-Uyoku, we can uncover the underlying ideological mechanisms of the Netto-Uyoku, and by unearthing these processes, we can then understand how its discourse is formed. Keeping in mind Mannheim's Paradox, that this paper too is ideologically predisposed,[^50] a critical reading of the Netto-Uyoku's discourse and ideological stances could help to unravel any contradictions in, and give more insight of, greater social trends facing our world today.

###Conceptualizing ideology

Conceptualization of ideology has known many approaches. Historically, the concept finds its roots in the French Revolution as a positivist attempt to develop a new scientific framework of Enlightenment ideas ('the discourse of patterns'), a form of skeptical scientific materialism [@eagleton_ideology:_1991: p.70]. Following Napoleon's attack of the French "ideologues" as, in @mudde_oxford_2013 (**Page number**)'s words, "unrealistic escapism and philosophical reverie", ideology has since gone through several shifts in meaning. From a classical Marxist view, as interpreted by @eagleton_ideology:_1991, ideology too represented a false or misleading awareness of the human situation. Ideology was however to be understood as an instrument of those in control of the means of production. That is to say, steering—whether intentional or not—the economically subservient class away from a scientific, objective reality (and hence from what is in the best interests of the dominated class) with a *false consciousness*, of one's ability to self-identify as an economic class and express a political will. Hence maintaining the equilibrium this mode of production.[^3] In other words, classical Marx' materialist theory places ideology as a superstructure in contrast to reality within an economic, dialectic basis-superstructure relationship. The dominant ideology is tied directly to the base, the mode of production, and visa-versa. On the precondition of being universally applicable, we might then for example view the *kokutai* (国体) notion or state-Shintoism to be ideological means for morally *justifying* exploitation (perhaps viewing the *zaibatsu* conglomerate as part of a Japanese *bourgeoisie*),[^54] while in contrast during the era of the 'Economic Miracle', the ideologies of economical growth and the *nihonjinron* (日本人論) breed of ethnocentric nationalism would then function to deprive of or obscure from the subservient class the objective reality; thus maintaining or legitimizing the *status quo* of society and its economic structures of exploitation. We see this line of reasoning in the Alt-Right and Netto-Uyoku-appropriated conspiracy theories of "red-pilling" and "waking up" (*kakusei* 覚醒 or *mesameru* 目覚める, a concept Furuya Tsunehiro has referred to as a matrix-historical viewpoint, *matorikksu-shikan* 「マトリックス史観」). This is a reference to the main character of 1999 science fiction film The Matrix who after consuming a red pill wakes up to a reality in which humanity is enslaved as a source of energy for a large machine. The idea of 'waking up' or being red-pilled  is becoming aware of a Marxist left-wing elite utilizing their cultural hegemony over media to brainwash and exploit the ordinary people into believing a fabricated world-view. This very notion is of course unapologetic Marxist in nature. 

This line of thinking is nevertheless too economically determinist. Furthermore, failure of Marx' proposed collapse of capitalist society betrays its rigid scientism. after all, despite hints of a Taisho-era democracy we cannot pinpoint an exact bourgeois revolution within the transition from feudalism to capitalism in Japan. Karl Mannheim then approached ideology as dynamic and being shaped both by the unconscious assumptions guiding our lives on a *psychological* level, and by our (social group's) position within social structures, on a *social* level. For him, this Marxist interpretation of history *itself* was an ideology; so too changed the pejorative notion of ideology and grew the idea of a 'positive' ideology to counter class oppression [@van_dijk_politics_2006;@mudde_oxford_2013: ch.1,ch.3]. Since the early writings on ideology, and with sociological developments such as the *liguistic turn*, ideology as a concept has seen a wide range of meanings, deeply entangled with the study of discourse, culture and politics [@mudde_oxford_2013: ch.1], with contributions made by amongst others Marxist scholars Louis Althusser, Georg Lukács (*theory of reification*) and Antonio Gramsci (*theory of hegemony*), as well as Michel Foucault and members of the Frankfurt School. Contributions that have helped develop the relation between the Marxist notion of ideology and the fields of culture and communication. In his approach to ideology critique, Eagleton recapitulates top down from its most general to its most specific usage, in six points the different epistemological perspectives on ideology [@eagleton_ideology:_1991, pp.28-30; @fuchs_racism_2018, pp.158-159]. let us then observe the following list:

1. Ideology as the "the general material processes of production of ideas, beliefs, and values in social life" and "the whole complex of signifying practices and symbolic processes in a particular society" [@eagleton_ideology:_1991, p28]. In other words, a neutral, descriptive definition of ideology as *culture*.
2. Ideology as the "ideas and beliefs" of a "specific, socially significant group or class" as "a kind of collective symbolic self-expression" [@eagleton_ideology:_1991, p29]. In other words, ideology as a neutral *world-view*.
3. Ideology as the "promotion and legitimation of particular interests [...] in the face of opposing interests" and as rhetorical discourse, a "discursive field in which self-promoting social powers conflict and collide over questions central to the reproduction of social power as a whole" [@eagleton_ideology:_1991, p29]. In this definition, ideology begins to be seen in relational, conflictive terms.
4. Like 3, the "promotion and legitimation of sectoral interests" but by "a dominant social power". This perhaps in order to "*unify* a social formation in ways convenient for its rulers [...] securing the complicity of subordinated classes and groups" [@eagleton_ideology:_1991, pp29-30]. This definition refines the third definition
5. Like 4, "ideas and beliefs which help to legitimate the interests of a ruling group or class" but specifically through "distortion and dissimulation" [@eagleton_ideology:_1991, p30].
6. False or deceptive beliefs[^39] "arising not from the interests of a dominant class but from the material structure of society as a whole" [@eagleton_ideology:_1991, p30], such as Marx's theory of commodity fetishism. The economic base determines the superstructure of ideology.

### Gramsci, Lukács & Althusser (Post-War Japan & The Economic Miracle)

The epistemologically neutral definitions we have seen courtesy of the Oxford Dictionary fit in the first two descriptions given above, while the last three are akin the Marxist tradition; the last one in particular relating to so-called *vulgar* or economically reductionist Marxism. In these, power is a zero-sum game. The dominant possession of power invariably reduces the power of the subservient class. With that in mind, and for importance to this thesis, are the next generation of Marxists: Gramsci, Lukács and Althusser—three crucial thinkers in expanding Marxist theory on ideology. Building on Marx' concept of false consciousness, Lukács theorized class consciousness as a class-bound ideology obtained through class-level self-awareness, the result of *reification*. *Reification* meaning the alienation of the self and a fragmented understanding of the totality, in wake of Marx's notion of commodity fetishism an commodification of labor [@eagleton_ideology:_1991, pp.94-99]. 

After a failed communist uprising in Italy and in order to explain the failure of Marx' conception of the inevitable proletarian revolution, Gramsci recognized culture (or cultural *soft* power) as an important factor not sufficiently taken in account for in traditional Marxist theory. Gramsci views the state as a superstructure consisting of a *political society* and a *civil society*—in other words, an *integral state* in which the latter is an essential component for maintaining consent and the former is a means to coerce and discipline those who don't consent.[^52] Furthermore, Gramsci coins the notion of *cultural hegemony*, arguing that consent to the rule of the governing class is a manufactured outcome of socialization and promulgation of ideology.[^48] More specifically, promulgation through social institutions within the public sphere of civil society: education, organized religion, the media industry, and the entertainment industry. While the civil society is in modern capitalist nations formally not under control of the political society (notwithstanding that Japan is ranked 67th in the 2019 World Press Freedom Index),[^44] they serve to impose the state's dominant set of values as "common sense": the values of the dominant class become accepted as that of society in general. Predominance of the ruling class by coercion is in contrast restricted to the level of political society, which includes institutions as the government, police, judicial system and army. In a modern capitalist state however, civil society and *soft* power have grown to such an extent that this "legitimized violence" has to certain degrees answer to public consent; which again can be achieved through the dominant ideology. Yet, if contradictions in the dominant ideology are too great, the manufacturing of consent becomes unsustainable. In other words, this leads to a *hegemonic crisis*. 

For Althusser, ideology was an *unconscious*, discursive and material process; assimilated and reproduced through cultural practices in the ideological state apparatus; with little space for human agency. Gramsci does however see room for this in civil society. For Gramsci, ideology does have value. He further coins the concept of *subaltern* (a term crucial in post-colonial studies)[^40] to refer not just to those lacking in economical and political power (such as peasants and the proletariat), but those whose very cultural or social identity is on the fringes of the dominant ideology. Those whose history is overshadowed by that of the ruling class and who are denied the rights to making one's own culture and historical narratives. Yet in these fringes is an opening to develop a subaltern consciousness, a *sub-culture*. For revolution to be successful, it is therefore first necessary for those groups to dismantle the cultural hegemony by developing one's own organic ideology (a dialectic process of an "ideological struggle" with the hegemonic ideologies) unifying a 'collective will' as class-consciousness and producing a counter-hegemony. Only after ascertaining a counter-hegemonic dominance on civil society could the subservient classes succeed in coercive action over the political society [@gramsci_selections_1985: p.47, pp.210-238].[^41] Gramsci calls this *passive revolution* [@gramsci_selections_1985, pp106-120]. In the case of a crisis of hegemony as mentioned above, the dominant class has no means but to either rely on coercion through the political society, or to consolidate oppositional movements in civil society (the passive revolution). Ideology for Gramsci is a specific historical phenomenon (a "historicist" approach in contrast to "scientific" Marxism) and observable both on a micro- and macro-scale. On an individual level, ideology is a "lived, habitual social practice ... the unconscious, inarticulate dimensions of social experience"; on a collective level it is that of social institutions [@eagleton_ideology:_1991, p115]. Perry Anderson[^43] builds on this. Whereas Gramsci locates cultural hegemony in civil society alone, Anderson finds hegemony in political society, "for the political form of the capitalist state is itself a vital organ of such power", and reasons that the institutions of civil society play a complementary role to hegemony [@eagleton_ideology:_1991, pp.112-113].[^42] 

Some concrete examples of this reasoning. If orthodox Marxism were to view the contradictory nature of increasing student debt in the United Stages and the ideological narratives of neo-liberal capitalism[^51] as a trigger for working class awareness and the inevitable overthrow of capitalism, then in Gramsci's interpretation, civil society would be the stage for counter-hegemonic processes in passive revolution. 2011 saw widespread resentment directed at Wall Street in the populist Occupy Wall Street, with ideological slogans as "We are the 99%" [@rehmann_bernie_2016]. In 2019, politicians Bernie Sanders, Elizabeth Warren and Alexandria Ocasio-Cortez are running on a counter-hegemonic platform to cancel student debt. Likewise, although the democratic impact of the 1994 electoral system reforms in Japan is questionable considering the near constant dominance of the Liberal Democrat Party on national politics since [@komatsu_first_2017], the 1993 Japanese general election and fall of the 1955 system[^53] could also be read through this lens. When Japan, as elsewhere, entered a late-capitalist phase of mass consumerism, different contradictions arose. Although not explicitly referring to Gramsci or Marxist traditions of ideology, the language of @dower_peace_1993 in his narrative assessment of the New Left and late '60 political movements certainly seem to suggest such logic as well. As Dower states, the growth of Japan as a cultural and economical powerhouse brought to light contradictions in society—the *San Francisco System*, the ambiguous position of Okinawa and environmental issues (mercury poisoning in Minamata) to name a few; pitting "liberal and left-wing critics against the dominant conservative elites" and introducing "a more radical anti-imperialist critique to the discourse on peace and democracy". In light of rapid economical growth, hegemonic ideologies of nationalism, capitalism, peace and democracy retained a strong grip on public consent, or as @dower_peace_1993 puts it, the "conservative hegemony-the bedrock of the 1955 System-continued to rule japan" [@dower_peace_1993, pp.5-6,p.21]. Nevertheless this counter-hegemonic shakes society in the late '60s.

>"It is estimated that between 1967 and 1970 alone, more than eighteen million Japanese took to the streets to protest the war in Vietnam and demand the reversion of Okinawa to Japan. Uncounted others were involved in the university struggles and citizens' movements against the ravages of the growth-oriented state. As elsewhere, "people's power" entered the Japanese lexicon at this time as a legitimate and essential alternative to bourgeois parliamentary politics; and, as elsewhere, the theory and practice of "people's power" ranged from peaceful protest to wanton violence. By the mid-1970s the nationwide people's movement was moribund, but it left as legacies the memory and experience of grass-roots mobilization that could be evoked in more particularistic causes thereafter." [@dower_peace_1993, p.22]

This was a period of hegemonic crisis, but one that in its aftermath did leave a considerably sour aftertaste in the mouths of many. Communists groups associated with New Left thought, such as the Japanese Red Army and the East Asia Anti-Japan Armed Front, proceeded directly to direct action and vise-versa so did the political society too respond with violence. Furthermore, in light of economic growth and relative public wealth, the hegemonic ideologies of economic and ethnic nationalism (what @dower_peace_1993 coins a "late-Showa cult of exceptionalism" [-@dower_peace_1993, p.6]) had despite high profile political scandals as the Lockheed bribery thus far helped retain a strong, manufactured grip on consent. Nevertheless, with the collapse of the bubble economy so too did contradictions in the dominant, hegemonic ideology once again become unearthed (Akio Morita and Shintaro Ishihara's 1989 essay *The Japan That Can Say No* has not aged particularly well), renewing distrust in established politics and the political system behind it. In other words, the political reform of the 1955 System by temporarily allied political outsiders in 1994 was the logical outcome of an increased alienated Japanese civil society. 

###The Frankfurt School & Post-Ideology (The Lost Decades)

The Frankfurt School of Critical Theory furthers the theoretical approach to how culture shapes ideology. In particular, Adorno and Horkheimer's Dialectic of Enlightenment

Habermas: public sphere

Adorno: the culture industy


This line of reasoning is in itself of course highly ideological and if any of this sounds unapologetically populist, that is no coincidence. I consider this logic an important tactic of what I call *digital populists*, populists focusing on cultural-ideological warfare on the Internet and whose rhetoric is shaped by sub-cultures online. I maintain that this Gramscian understanding of ideology and hegemony is beneficial in understanding the processes of reasoning behind populist, neo-nationalist (and ultimately, 'cyber-nationalist') ideology. Moreover, the open and public nature of the Internet and social media would present an ideal public space for the under-represented to form a cultural identity and engage in ideological struggle with the hegemonic dominant ideology. The rise of online *influencers* using social media such as Youtube, Niconico, Twitter, Instagram and Facebook to spread politically inspired messages, and right-wing populists utilizing this medium to sell a narrative of revolution, certainly seem to suggest so. Furthermore, As I will expand on in the next chapter, its very creation is commonly framed as being rooted in the American libertarian counter-culture movement of the sixties, after all. 

The debate on ideology far from stopped since. Francis Fukuyama for example claimed in his essay *The End of History?* that we've reached a post-ideological world in which western liberal democracy was the end-point of ideological evolution, an idea that could not be improved upon. On the other side, and furthering Lukács' ideas on alienation due the increased importance of commodity fetishism in capitalist society, Žižek views late-capitalist cynicism as inherent to modern-day ideology, summarized best as "they know very well what they are doing, but still, they are doing it". We are aware of the contradictions, of the false consciousness, but we renounce it only in cynical subversion [-@zizek_mapping_2012, p.18, pp312-5].


##Neo-Nationalism

Can we then interpret this world-wide growth of neo-nationalist movements as counter-hegemonic process? 

###Populism

How then are we to understand populism? Open just about any recent article on politicians such as Donald Trump, Bernie Sanders, Viktor Orbán, Corbyn, Jair Bolsenaro or Matteo Salvini and the possibility is high any of them will have been name-called a populist, disregarding any dissimilarities in either political agenda or geographical situation. Often used in a pejorative fashion, there is however little explanation if any at all offered in those takes, and with an unprecedented soar in the frequency of usage of this term in Western discourse (a Google Trends search for populism both worldwide and in Japan over the past 10 years, as illustrated on **Figure \ref{fig:populism-gt}**, reveal a worldwide rise of public interest in populism correlating to the political shifts referred to earlier),[^35] the term populist is increasingly used interchangeable or combined with demagoguery.[^28]

\begin{figure}[!htb]
 \centering
  \caption{\label{fig:populism-gt} The Google Trends of Populism Worldwide \& Japan (10 Years).}
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/populismtrends.eps}\end{figure}

####Theory

####Populism in Japan（日本型ポピュリズム）

http://www.tokyoreview.net/2018/09/antonio-inoki-fighting-spirit-diplomacy/


###Nativism

Vanaf hier specifiek over rechts nu en netouyo praten

###Nationalism

##Cyber-Nationalism

https://en.wikipedia.org/wiki/Cyber-nationalism

###The Medium is the Message

Despite some cultural lag, there are now many theoretical options to approaching the Internet, new media, and politics. In an early stage, Rimmer and Morris-Suzuki (1999), following sociologists Kumon Shumpei and Masuda Yoneji's writings on a 'teledemocracy', take an utopian view and predicted the Internet would serve democracy by fundamentally altering its users thinking patterns and leading to a power-shift away from mass-media. Recent debate on the Internet's role in populist politics in East-Asia (Youngmi Kim 2009, Azuma Hiroki 2011, Tamura en Kobayashi 2014) have instead taken a distinct dystopian turn, employing such terms as 'the People's Will 2.0', and again arguing that due the very nature of computer-mediated communication and social media, with traits such as anonymity, filter-bubbles and so-called 'echo-chambers', the individual 'will' has been reduced to a general 'will' led by emotion rather than rationality. Thus, following this logic, Internet as an open medium for communication would become an invaluable tool for political leaders utilizing a populist narrative.

While the Toronto School of communication theory has some detractors due its reliance on dichotomies, its members Harrold Innis (of "The Bias of Communication") and Mcluhan argue that the invention of print-media led to both a horizontal (regional) and vertical (chronological) continuity and structures redefining our cognitive senses, bringing about a literate 'space-biased' culture rather than an oral 'time-biased' one, and thus a heightened sense of individualism, capitalism and nationalism.[^23] With his idea of a 'global village', McLuhan however hypothesized that a shift towards electronic media, referring at the time primarily to radio and television, would again shift society. This time from a literate culture to a 'post-literate' visual culture that stimulates all senses and transcends time and space, thus leading individualism to a collective, homogeneous identity, in which the lack of a physical body or physical cues creates a different relation to oneself and one's surroundings. (McLuhan, 1962, p. 156, McLuhan 1967:63). Amongst other important early scholars within Media Studies stands Friedrich Kittler, generally associated with the German media theory school. Unlike McLuhan, who argues media as an extension of human senses, Kittler approaches media through his New Materialism theory and his concept of 'discourse networks', applying Foucoult's concept of power and archeology of knowledge in function of media, to allows media its own agency.


Paradigm shift: postmodernist fragmentation due inhibiting the linear reading exerpience

A Declaration of the Independence of Cyberspace



###Imagined (cyber)-communities

These ideas also fits well political scientist Benedict Anderson's notion of Imagined Communities, coined during his research on nationalism and the rise of nation-states. Anderson suggests that nations are not communities in a strict sense, but 'imagined' communities at best, implying that the sense of kinship felt between its members is but a social construct based on mutual experiences evolved from print capitalism and the rise of mass-media, and thus develop both a sense of imagined sameness, as well as clearly defined paradigm of 'otherness'. In a similar sense, social media on the Internet creates a perceived sense of affinity between its members and the social and interpersonal change of this 'global village', or 'imagined cyber-community' can be argued to transcends that of it's nation. In similar fashion, anthropologist @appadurai_modernity_1996 too already argued early on that the rise of the Internet as a new 'mediascape' would lead to the creation of new, transnational and asynchronous imagined communities, based on ideology rather than on national narratives, and diverting from traditional mass-media. Murai Shusuke (-@murai_net_2012, 375–76) argues however the opposite; precisely due Japanese Internet-users' monolingualism, not withstanding full global access through the Internet, any possibility of trans-nationality is severely limited. Within the anonymity of on-line bulletin boards such as 2channel, social markers remain thus primarily defined by language and nation-based ideology. (Naoki Sakai here?) @sakai_translation_1997


Kitada too views the development of the world wide web in Japan as intrinsically linked to the lost decade(s), with the particular subculture developed on 2channel as a cynical nihilism derived from the post-bubble economical crisis, and one that through its consumption of irony as joke gave room for nationalism. That is to say, nationalist rhetoric that started as an expression of irony, gave in to the desire to consume grand non-narratives

@kitada__2008

##Model

blabla

\begin{table}[!htb]
\footnotesize
\centering
\setlength{\tabcolsep}{5pt}
\caption{Model of Cyber-Nationalism Applied to Netto-Uyoku}\label{tab:modelcybernationalism}
\scalebox{0.8}{
\begin{tabular}{ll}
\toprule
Ideology&Topics\\
\midrule
Nationalism&Identity, Japan, Patriotism\\
Nativism&Foreigners, Koreans, China\\
Revisionism&Pacific War, Comfort Women, Territorial Disputes\\
Populism&Mass Media, Truth, (Left Wing) politics\\
Digitalism&Internet, 2channel, matome\\
\bottomrule
\end{tabular}
}
\end{table}



[@rimmer_japanese_1999]


##Conclusion

This paper takes a critical approach to ideology, basing itself primarily on the work of Gramsci and thinkers aligned with the Frankfurt School of critical theory. Thus in this paper I view ideology as a world-view rooted in class-conflict; and in capitalist nations that rely on consent over coercion, as a means to consolidate power. Consolidating power over civil society as done by those in control of the political society (the 'elite' or establishment) through disseminating ideology (by means of popular culture and mainstream media: the hegemonic ideology). Contradictions in society, a consequence of the capitalist nature of commodity fetishism, lead to alienation among exploited classes and therefore to class-awareness and an opening for counter-hegemonic processes in civil society. This reasoning is a strong element of populist rhetoric and neo-nationalists. I adhere to @mudde_oxford_2013's definition of populism as a thin-centered ideology based on the antagonizing of an 'elite' in function of a homogeneous 'will' of 'the people'. Right-wing populists view the 'elite' in this case as primarily a left-wing entity utilizing the media to spread manufactured consent through a *fake* world-view. In this narrative the populists *are* the counter-hegemonic forces. They utilize alternative means in civil-society to appeal to 'the people', the exploited classes that are more often than not defined based on nationalist ideologies: ethnic background or cultural values (i.e. Judeo-christian values). This *fake* world-view borders on a nativist conspiracy theory wherein globalist values of the elite lead to clashes of culture and the disintegration of 'the people's' best interest.

What the French fachosphère, the Japanese Netto-Uyoku and the American Alt-Right have in common is exactly that: a neo-nationalist ideology of populism, nationalism and nativism. I argue however a difference between those that adhere to this ideology and utilize the Internet purely for organizational means (ie. protest marches), and *netizens* as a sub-culture adhering to an ideology of Internet as a 'new frontier'

 For them, however, the Internet forms an escape in the form of a 'new frontier'; one that ought to be free from elite interference. With some violent exceptions, there is a difference between 

 In other words, what I have defined as cyber-nationalism.

If self-perceived contradictions in society (such as immigration and terrorism) brought about a wave of right-wing populism with 2016 as a pivotal year, then 2009 - 2011 could be considered the same for Japan. Blatantly populist politicians as Shintaro Ishihara and Hashimoto Toru gain renewed fame, 




#The Anatomy of Japanese Cyber-Nationalism ー From 2channel to Wikipedia

I illustrated in the previous chapter that Netto-Uyoku are often associated particularly with 2channel, Niconico—and with its relatively recent rise of usage in Japan, on Twitter as well [@katayama_2-channel_2007;@tsuji_eng:_2008;@rumi_koreans_2011;@murai_net_2012;@yasuda_eng:_2012;@morris-suzuki_freedom_2013;@taka_twitter_2015-1]. Furthermore, all of these belong to the top visited websites in Japan, with the latter two dominantly fixed in the top 10.[^97] In the previous chapter I've also brought up McLuhan's argument that the content of the message is itself intrinsically shaped by the vessel through which it is delivered. Following this argument through in the age of social media, Lev Manovich argues that software has taken a central position in our outlook and interaction with the world around us [-@manovich_software_2013]. As someone creates a potentially viral image intended for politically persuasion and posts it online, they might do so using their laptop computer to edit different layers of the image through image-editing software as Photoshop. Next they might use Chrome as a browser to interpret and visualize the semantic text of the World Wide Web (hypertext), and upload the image on a platform as Twitter or 2channel. They have to adhere to the limits required on image-size and length of text, and preferably add symbols for interconnection or recognition to gain a wider reach (using hash-tags, the at sign, or trip-codes on pseudo-anonymous BBS systems). Combined, these are a great amount of different interfaces for communication. @azuma_otaku:_2001 expands. Whereas the content of other media has one final represented form, data on the World Wide Web is determined by software. A web-page built using the HTML syntax will represent the contents in a different fashion depending on the software and hardware it is opened with, and might even reveal the underlying structural composition when opened with a text-editor instead of a browser. Furthermore, similar to the non-linear structure of games, non-linear paths are an intrinsic element of the world wide web's hyper-connectedness [-@azuma_otaku:_2001, ch.3].

Since the effective start in the mid-2000's of what Tim O'Reilly coined the Web 2.0—a participatory web based on interactive collaboration and user-generated content—as well as the onset of machine learning and artificial intelligence in generating semantically interlinked content, a good decade has passed for social media and its hyper-extended *hyper-connectedness* to fully mature within our lives. Based on my theoretical framework in the previous chapter as well as the works of @johnson_mixed_2004, @van_dijk_politics_2006 and @fairclough_media_2010, I approach this chapter through a mixed methods critical content analysis applied to social media, attempting to bring to light from a semiotic perspective how the the Netto-Uyoku re-enforce and disperse ideological narratives on the Internet. While giving a brief overview of the other platforms mentioned above, I focus particularly on 2channel and Wikipedia. The former, of course, is the former largest online forum in the world and as illustrated the primary platform associated with the Netto Uyoku. The latter, an open and collaborative encyclopedia built on hyper-links, is both a prime example of Azumi's non-linear, endless structure inherent to the world wide web and, more concretely, gives us through its revision history insights in how and by whom persuasive narratives are formed. 

The development of the Internet in Japan has a similar history as in the United States and Europe, starting with universities developing technology to interlink academic papers. As the "first nationwide noncommercial computer network" in 1984, JUNET (Japan University/UnixNETwork) linked Tokyo University, Keio University and the Tokyo Institute of Technology [@aoki_virtual_1994]. According to @barubora_eng:_2017, the loosening grip of government policy in 1985 led to the consequent adaptation of bulletin board systems (BBS) for computer-mediated communication between hobbyists in Japan. Through translations in technological magazines,[^15] the ideology of American west coast voices crucial to the rise of Silicon Valley becomes known in Japan as *shisō nishikaigan shisō* 西海岸思想 or *Karuforunia shisō* カリフォルニア思想 (West Coast Thought or California Thought): an ideology that envisions increased participation in democracy through the development of IT and computer science. In his narrative on the development of computers and the Internet, John Markoff echoes this connection of the libertarian hackers-ethos to '60's counterculture [-@markoff_what_2005]. @barubora_eng:_2017 argue that while, as Markoff too states, much of the early rhetoric on the Internet in the united states is built on newsgroups discussing political activities (such as John Gilmore's *Cypherpunks* mailing list, who later co-founded the Electronic Frontier Foundation), in contrast were Japanese mailing lists and BBS then primarily built around niche sub-culture topics [-@barubora_eng:_2017, ch.1]. @aoki_virtual_1994 too argues that early adaption was associated with *otaku* (*otaku-zoku*, オタク族, a term that roughly in this timespan came to denote those with obsessive interests in sub-culture topics) and less accessible to the public due the difficulty of encoding Japanese characters on the Internet; early communication had to be written with the Latin script.[^102]

##2channel

Although I cannot dismiss previous literature in tracing the Netto-Uyoku and their rhetorical methods back to 2channel,[^31] just like doing so with the English image-board 4chan it would be unwise to dismiss those platforms in their whole as one homogeneous, even toxic community. With at their peak millions of messages per day.[^101] On a technical level, 2channel was created in 1999 by Hiroyuki Nishimura, a Japanese exchange student in the United States, based on the technical structure of early Usenet-inspired BBS *ayashī wārudo* あやしいわーるど (1996, lit. 'Strange World') and *amezō rinku* あめぞうリンク (1997), as a text-only multi-threaded anonymous messaging board [-@barubora_eng:_2017, ch.2], which were subsequently the origin for the more graphically-oriented Futaba Channel, the software base on which 4chan is based on).[^38]

###News Sokuho (ニュース速報)

With concerns over a trade war between Japan and South Korea mid 2019, nationalist incidents were consumed 

ニュース速報(VIP)


-@barubora_eng:_2017, ch.2 too describe the early 2000's as a period in which the post-modern cynicism inherent to these online sub-cultures 

I wrote a python script to webscrape one thread (spread over 11)

Reactions, indicated with ">>" followed with the post number of the referred message are rare and usually indicative of disagreement with 

###Matome-blogs

One trend that accompanied the growth of 2channel is the appearance of so-called *matome*-sites. Those are curated aggregation websites based around particularly popular (*viral*) threads on 2channel (and since the early '10's other social media platforms such as Twitter). The curator manually collects the material s/he deems most relevant to the viral topic in question—either as representation of public opinion, or for its comical value—and is usually accompanied with a particularly appealing title (what is in English colloquially known as 'clickbait') and a short personal comment. A common trait of those *matome*-sites is the usage of private advertising or services such as Google's Adsense for the pursuit of financial profit.[^103]

One of such *matome* sites, conservative 2channel news-aggregation blog *hoshu sokuhō* ( 保守速報, lit. 'Conservative Newsflash'), was linked to in a since removed message by prime minister Abe Shinzō's Facebook and Twitter account on 24-11-2014 and had previously been sued by the ethnic Korean freelance writer Lee Sinhae for libel [@the_huffington_post_jp_lee_2014;@j-cast_news_eng:_2014].[^104] The repercussions of the lawsuit have led to support of other popular *matome* blogs and the withdrawal of *hoshu sokuhō*'s sponsors and Google Adsense Support, as illustrated on **figure \ref{fig:matome-examples}**.[^105]

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.45\textwidth}
    \includegraphics[width=\textwidth]{images/2channel/hoshusokuho.jpg}
    \caption{\textit{hoshu sokuhō} on 15-07-2019. (Source: hosyusokuhou.jp)}
    \label{fig:hoshusokuho}
  \end{subfigure}
   \begin{subfigure}[b]{0.45\textwidth}
    \includegraphics[width=\textwidth]{images/2channel/moeruasia.jpg}
    \caption{Moeruasia on 07-07-2016. (Source: moeruasia.net using archiving service archive.is)}
    \label{fig:moeruasia}
  \end{subfigure}
  \caption{Screenshots of 2channel-based \textit{matome} blogs}\label{fig:matome-examples}
\end{figure}

Disregarding the content of the aggregated items in **figure \ref{fig:matome-examples}** (it is by now not particularly surprising that most items are related to Korea or left-wing politics, often accompanied with the rhetorical device of '*w*'s for intended ridiculing), two things are of note. On **figure \ref{fig:moeruasia}**, *Moeruasia* uses the ethnic slur *chon* チョン as well as *hibyō* / *hwabyeong* (火病, a term referring to a culture-bound mental illness). In the wake of this trial, such *matome* blogs have since opted to exclude messages with explicit racial hatred from their aggregated posts.

>「【チョン悲報】李信恵さん、保守速報の弁護士に正論で完全論破され火病、泣き落としにｗｗｗｗｗｗｗｗｗｗ」

>*[Chon hihō] Ri Nobue-san, hoshu sokuhō no bengoshi ni seiron de kanzen ronpa sare kabyō, naki otoshi ni wwwwwwwwww*

>[Tragic Chong News] Lee Sinhae was completely refuted by the sound reasoning of Hoshu Sokuho's lawyer; falls into mental illness and breaks down in tears hahahaha

The second point of note is on the screenshot of *hoshu sokuhō* (see **figure \ref{fig:hoshusokuho}**). As off 15-07-2019 *hoshu sokuhō* is still in search of adverts. Whereas this blog had previously been supported by ads of large companies as Epson [@hatachi__2018], only one advertisement is filled out (with a reference to a small-scale web-comic). To the left is an advertisement for an unofficial fan-blog of *Toranomon News* (*toranomon nyūsu*, 虎ノ門ニュース). As a conservative web-show drawing up to a combined half a million viewers within its first day on Youtube and Niconico, *Toranomon News* is worth expanding upon for both its eclectic cast of ultra-right conservative regular speakers as well as for its guest speakers.

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/2channel/toranomon.jpg} 
    \captionsetup[sub]{font=scriptsize,labelfont={bf,sf}}
    \caption*{\textbf{Above}: Aoyama Shigeharu, Hyakuta Naoki, Kent Gilbert, Kitamura Haruo, Inoue Kazuhiko, Fujii Genki　\newline \textbf{Below}: Takeda Tsuneyasu, Arimoto Kaori, Seki Hei, Shin'ichirō Suda, Takeda Kunihiko, Jōnen Tsukasa, Ōtaka miki, Orishima Ippei}
  \end{subfigure}
  \caption{Screenshot of Toranomon News on Youtube (Source: youtube.com) }\label{fig:toranomon}
\end{figure}

The majority of those hosts, including Kent Gilbert and the Chinese born Seki Hei, have previously capitalized and continue to do so on a print-medium market for historical revisionist and nationalist "Japan as Number One" literature and literature highly critical of China and South-Korea. Since 2015 they've joined hands to target influence public opinion online, with youtuber and imperial descendant Takeda Tsuneyasu on the panel and youtuber Kazuya (stylized as KAZUYA) as frequent guest. Other guests include Abe Shinzō himself, as well as former Minister of Internal Affairs and Communications Yoshitaka Shindō, various LDP lawmakers including Mio Sugita, Nippon Kaigi associate Sakurai Yoshiko and former idol Chiba Reiko.

Hyakuta Naoki, regular commentator on Toranomon News and author of the best-selling 2006 war drama "The Eternal Zero" (which in its 2013 screen-adaption won the Japan Academy Prize for best film) went on to co-pen 『日本よ、世界の真ん中で咲き誇れ』 (*Nihon yo, sekai no man'naka de sakihokore*, "Japan! Be Proud of Yourself in the “Center of the World!") with Abe Shinzō in 2013 and was appointed by the latter as NHK governor from 2013 to 2015. Although his 2018 bestseller *Nihon Kokuki* (日本国紀, 'Chronicle of Japan') was criticized for historical revisionism and plagiarism from Wikipedia [@yamamoto__2018], he subsequently followed up with 今こそ、韓国に謝ろう ～そして、「さらば」と言おう～ (*"Ima koso, Kankoku ni ayamarou ~ soshite,`saraba' to iou ~"*, "Then let us now apologize to Korea-and say, 'Farewell'").

Some have embraced the Netto-Uyoku phrasing, such as youtuber Fuji Genki (see **Figure \ref{fig:genkifuji}**, who with 14,900 subscribers on his main account has published videos both in English and Japanese on accounts as Yamatotube2, *Chan'neru kura-ra* チャンネルくらら and *hoshu ronkaku chan'neru+* 保守論客チャンネル+ (lit. 'Conservative Polemicist Channel+'). A conservative online voice, he has referred to himself tongue-in-cheek as *nekouyo* ネコウヨ (a wordplay literally meaning 'cat-right' as opposite to 'net-right'). Of note is the English-language antagonizing of both Chinese imperialists and Japanese leftists as anti-Japanese elements.

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/genkifuji.jpg}
  \end{subfigure}
  \caption{Screenshot of Fuji Genki's English homepage (14-07-2019)}\label{fig:genkifuji}
\end{figure}

###Manufacturing Outrage

(die threads die ik heb dan checken tov de matome blogs)

Fabricating and enhancing outrage as echo-chamber for a 

##Wikipedia[^76]

Whereas the software the Japanese 2channel and English 4chan are based on were influential in shaping online communities throughout the late '90's and early '00's, the software Wikipedia (a free online encyclopedia based on transparent and open collaboration) runs on, MediaWiki, has since its inception in 2002 gained much traction worldwide with uses ranging from the political realm[^94] to lighter topics,[^93] and Wiki-style sub-communities built around every possible aspect of popular culture.[^95] Wikipedia itself is as of 2019 the \nth{5} most visited website in the world and \nth{6} most in Japan; with 7% of all articles being written in Japanese (the \nth{2} most represented language on Wikipedia). The specific mannerisms of utilizing Wikipedia have formed distinct subcultures and group dynamics, and vandalism and so-called *edit-wars* (disputes over content through reverting and adjusting user contributions) are not uncommon elements of those. The open nature of Wikipedia and its underlying MediaWiki software permits us a glimpse into topics that Wikipedia editors place high importance on. **Table \ref{tab:50mostcont}**[^64] for example displays the top 50 most contentious articles on the Japanese Wikipedia as of 2019 (eg. articles that have high rates of such *edit-warring*, as calculated by the amount of reverts done in contrast to the total amount of edits / revisions).[^66]

\begin{table}
\footnotesize
\centering
\setlength{\tabcolsep}{5pt}
\caption{50 most contentious articles on the Japanese Wikipedia (2019)}\label{tab:50mostcont}
\scalebox{0.8}{
\begin{tabular}{@{}p{0.1cm}lp{0.1cm}lp{0.1cm}lp{0.1cm}l@{}}
\toprule
1&Nanjing Massacre&14&Soka Gakkai&27&Keisuke Honda&40&HKT48\\
2&Netto Uyoku&15&Emperor&28&SKY PerfecTV! Channel List&41&South Korea\\
3&Japan&16&Taiwan&29&List of terms in ONE PIECE&42&Shuriken Sentai Ninninger\\
4&Maeda Atsuko (AKB48)&17&Mr. Osomatsu&30&List of monsters in Kamen Rider Series&43&Hatsune Miku\\
5&Shichibukai (One Piece)&18&Yuna Kim&31&K-on!&44&Witchy PreCure!\\
6&Devil's Fruit (One Piece)&19&Zaitokukai&32&Kantai Collectrion-Kancolle-&45&Fate / Grand Order\\
7&One Piece&20&Rino Sashihara (HKT48)&33&Navy (One Piece)&46&Magical Girl Madoka $\star$ Magica\\
8&Watanabe Mayu (AKB48)&21&Zainichi Koreans in Japan&34&Takahashi Minami (AKB48)&47&Kimura Takuya (SMAP)\\
9&Nogizaka46&22&Sakurai Sho (Arashi)&35&Kamen Rider Ghost&48&Naruto Characters\\
10&AKB48&23&Akihito&36&Hitoshi Matsumoto&49&Minecraft\\
11&Abe Shinzo&24&YouTube&37&Doubutsu Sentai Zyuohger&50&Korea origin theory\\
12&Keyakizaka46&25&Monkey D. Luffy (One Piece)&38&DPR Korea\\
13&Yukio Hatoyama&26&Asahi Shimbun&39&Hiroiki Ariyoshi\\
\bottomrule
\end{tabular}
}
\end{table}

Based on these statistics, I find that regardless whether sorted by total revisions, total reverts or total 'contention', the lists of Wikipedia articles are dominated almost entirely with articles devoted to Japanese idol pop-artists (in particular AKB48) and animation (specifically One Piece). Sorted on either total reverts or total contention these lists include throughout the years articles on prime minister Abe Shinzo, Japan, Soka Gakkai, the Nanjing Massacre, Netto-Uyoku, both south and north Korea, and Zainichi Koreans. Throughout other years, this list has included topics such as the South Korean figure skater Yuna Kim,[^33] the topic of male discrimination (*dansei sabetsu* 男性差別), an article on a supposed *Korean origin theory* (*kankoku kigen-setsu* 韓国起源説), global warming, Ishihara Shintarō, Hashimoto Tōru and the former prime ministers Asō Tarō, Hatoyama Yukio, Kan Naoto and Koizumi Jun'ichirō. Of note is a seemingly distinct lack of articles that would otherwise be considered controversial topics, such as the territorial disputes of the Liancourt Rocks. These are missing primarily due administrators' ability to 'protect' articles from anonymous or even any edit in general until new information comes up. That being said, on a platform that is dominated by articles on pop-culture pages when viewed over large time lapses, a closer look to individual months does reflect current events. The Japanese article on the Liancourt Rocks for example did reach first spot as the most edited article on August 2012, when the dispute gained renewed traction. Moreover, so did between May and June 2006 articles related to Netto-Uyoku sentiment.[^81] 

During the early 2000's reverts are still uncommon to the point they're not a reliable means to express quantifiable controversy of a topic within the Japanese Wikipedia community. Based on the total amount of revisions as an indicator of perceived importance by the Japanese Wikipedia community, top articles in the early days of the Japanese Wikipedia contain however few articles related to such pop culture phenomena. Instead in 2003 the most revised articles include the topics of the Japanese railway,[^72] religion[^73] as well as topics related to China[^74] and Japanese history.[^75] In 2004 2channel joins the top of this list as second most revised article, alongside articles related to media-channels[^80] and the Korean peninsula. It is only from 2005 onwards that we perceive an increase of mass-edited articles on pop-media (animation as *crayon shin-chan* クレヨンしんちゃん, *doraemon* ドラえもん, One Piece and Naruto reach the top of this list for example). Although this rate has decreased over the years, the rate of anonymous edits on the Japanese Wikipedia is still remarkably high when contrasted to the global scale; another indication of 2channel's *modus operandi* seeping into Wikipedia (see **figure \ref{fig:anon-wiki}**). Although anonymity is to be taken with a grain of salt, considering IP addresses are publicly available, of note here is particularly the intent of the user not to be associated with a user-name. 

\begin{figure}[!htb]
 \centering
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/anon-wiki.eps}
  \centering\caption{Percentage of Anonymous Edits in Japanese and Worldwide (15 Years)}\label{fig:anon-wiki}
\end{figure}

Using the statistic tool-set XTools,[^77] one can get further insights into the revision history of each article, as well as into the Wikipedia users contributing to them. An overview of revision statistics on two contested topics (see **figures \ref{fig:xtools-zainichi} and \ref{fig:xtools-asahi}** show a sharp increase of activity in the period of 2009 - 2011, an increase that cannot be explained solely by a rise in usage of Wikipedia as a platform but falls in line with a general increase of interest in right-wing politics (**figure \ref{fig:politictrends}**) and Netto-Uyoku (**figure \ref{fig:nettouyo}**).

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/zainichi.jpg}
  \end{subfigure}
  \caption{Revision Statistics for Japanese Wikipedia Article \textit{'Zainichi Koreans'} (在日韓国・朝鮮人)}\label{fig:xtools-zainichi}
\end{figure}

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/asahi-shimbun.jpg}
  \end{subfigure}
  \caption{Revision Statistics for Japanese Wikipedia Article \textit{'Asahi Shimbun'} (朝日新聞)}\label{fig:xtools-asahi}
\end{figure}

**figure \ref{fig:xtools-netto}** displays similar information on the topic of Netto-Uyoku. An article that has seen 2,281 edits by 756 users since its creation on 2005-09-30 through an anonymous edit with the following information: 

>ネット上で徘徊・跋扈する馬鹿な右翼のこと。２ちゃんねるなど無責任な管理者が運営する掲示板に生息する。また、まじめな議論をおこなおうとする、右翼に批判的な掲示板などを荒らすことも生業としている。２ちゃんねる風のプラカードをもって、杉並で「つくる会」教科書採択のために策動した連中もいる。
>*Netto-jō de haikai bakko suru bakana uyoku no koto. 2-Chan neru nado musekinin'na kanrisha ga un'ei suru keijiban ni seisoku suru. Mata, majimena giron o okonaou to suru, uyoku ni hihantekina keijiban nado o arasu koto mo nariwai to shite iru. 2-Chan neru kaze no purakādo o motte, Suginami de `tsukurukai' kyōkasho saitaku no tame ni sakudō shita renchū mo iru.*

>Stupid right-wingers loitering on the Internet. They inhabit bulletin board systems (BBS) such as 2channel, operated by irresponsible administrators. Moreover, they call for trolling BBS meant for attempting serious discussion and/or for making critical arguments against the right. There are also those that have participated in Suginawa protests on the adoption of a new school textbook with 2channel-themed placards.[^82]

Since then the article has grown to contain 70,744 characters and is linked to from other pages 405 times. As shown above, the topic remains controversial. The very last two edits in my data-source (and thus the most recent at 02/07/2019) are an addition and its subsequent revert of the following line, by user '高畑政行' (*Takahata Masayuki*).[^83]

>日本を取り戻し、世界でもっとも輝ける国にするために日々研鑽を惜しまない素晴らしい方達である。そのために、日本人による正当な民族差別を率先して行っている。
>Nihon o torimodoshi, sekai de mottomo kagayakeru kuni ni suru tame ni hibi kensan o oshimanai subarashīi kata-tachi dearu. Sono tame ni, nihonjin ni yoru seitōna minzoku sabetsu o sossen shite itte iru.

>"These are wonderful people who do not spare time in order to restore Japan and making it the brightest country in the world. To that end, they takes the initiative of legitimating ethnic discrimination by Japanese people."

Here, the phrasing of 'restoring Japan' is eerily similar to prime minister Abe's political catch-phrase 'We will restore Japan' (*Nippon o torimodosu*, 「日本を、取り戻す。」), used during his political campaign against the DPJ in the wake of the 2011 earthquake, as is what I translated as 'brightest country' similar to Abe's 『美しい国へ』 (*Utsukushii kuni he* ‘Toward a Beautiful Nation’). The initially vague expressions of 'restoring' (from what?) and 'bright' or 'beautiful' country (defined how?) are implicitly answered by this user: normalization of ethnic discrimination is a means to restore Japan (read: from ethnic minorities) and make it a bright (read: ethnically homogeneous) country. 

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/netto-uyoku.jpg}
  \end{subfigure}
  \caption{Revision Statistics for Japanese Wikipedia Article \textit{'Netto Uyoku'} (ネット右翼)}\label{fig:xtools-netto}
\end{figure}

A constant in these contested pages are large contributions by a small group of people. The top contributor to the article of *Nanking Massacre* (27.7% of all edits, between the period of 2009-11-01 and 2019-04-16) for example is a user by the handle of 大和屋敷 (*yamato-yashiki*). This is a user with as of 02-07-2019 16,682 edits over 3,229 pages including 139 edits to English-language Wikipedia articles (where he has since been blocked from contributing, having focused primarily on topics related to Korea, such as Korean Nationalism and the Japan-Korea Treaty of 1910, as well as 'softer' topics as Otaku, *Yakiniku* and 'Secret photography'). Moreover, this user has top reaching edits for other such contested topics as *Netto-Uyoku* (first place with 19.7%). The second largest contributor to this article (with 166 or 15.7% edits between 2015-10-21 and 2019-03-17) is 'Japanese Sincerity' (a twin-account of the since blocked account 'Japanese spirits' and most likely a reference to *yamato-damashii* 大和魂, a normative expression of *nihonjin*-style Japanese ethno-nationalism). A look at the profile page of 'Japanese Sincerity' on Wikipedia reveals the following information:

>「得意分野
日本史（特に昭和の時代）。イデオロギーでなく、事実の正確な記述や広い視点による解釈に固執します。記述に恣意的に反映するかどうかは別として、個人的には日本の皇室の大ファンであり、それも昭和天皇、上皇、今上天皇と戦後皇室の在り方に個人的には共感しています。」

>*"Tokui bun'ya 
nihonshi (tokuni Shōwa no jidai). Ideorogīdenaku, jijitsu no seikakuna kijutsu ya hiroi shiten ni yoru kaishaku ni koshū shimasu. Kijutsu ni shii-teki ni han'ei suru ka dō ka wa betsu to shite, kojin-teki ni wa Nihon no kōshitsu no dai fandeari, sore mo shōwadenkō, jōkō, kinjōten'nō to sengo kōshitsu no arikata ni kojin-teki ni wa kyōkan shite imasu."*

>"Specialty
Japanese history (in particular the Showa era). I am not ideological, and instead stick to writing accurate, factual descriptions and interpretations through broad perspectives. Regardless of whether it reflects in my articles, I am a big fan of the Imperial House of Japan, and feel sympathetic to the state of the Showa Emperor, Emperor Akihito, Emperor Naruhito and the postwar imperial family." (source: <https://ja.wikipedia.org/wiki/%E5%88%A9%E7%94%A8%E8%80%85:Japanese_sincerity>)

\begin{figure}[!htb]
 \centering
  \includegraphics[width=.9\textwidth]{images/wiki/japanese-spirits-abe.jpg}
  \centering\caption{English Wikipedia Edits by User 'Japanese spirits' on 'Shinzō Abe'}\label{fig:js-abe}
\end{figure}

Contrary to that information, this user's topics of choice and particular edits do reveal a highly ideological background. Of particular note are this users' 455 contributions to the English language Wikipedia, as well as several to the Spanish (46) and French Wikipedia (28), dominantly on topics of Japanese war crimes. As shown in **\ref{fig:js-abe} and \ref{fig:js-inada}**, through the now banned twin-account of 'Japanese spirits' this user has formerly contributed to the English articles on Inada Tomomi and Abe Shinzō with apologetic, reactionary edits (the former which are as of 9-07-2019 still largely in-tact). Support for the revisionist agenda of Nippon Kaigi is in this user's logic an act of honor and patriotism. Criticism of the Yasukuni Shrine too is disrespectful towards "the souls of dead Japanese soldiers" and, furthermore, the 2017 critical documentary *Yasukuni* betrayed a Chinese tinted political agenda. Through their main account 'Japanese Sincerity', this user has since opted for a softer tone. Their last contribution, on the article for 'Pantingan River massacre' (which is still largely in tact as of 9-07-2019), attempts to downplay events with the following line:

>"Following Tsuji's abnormal order which was considered to be a war criminal and beyond his commission, Japanese 122 Regiment of Sixty-fifth Brigade executed the US and Philippine soldiers in the Pantingan River [2]. Colonel Takeo Imai, of another Japanese regiment, was doubt the authority of the order which came from the top but not clearly from who? and Imai ignored the cruel order and did not any execusion[3]."

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/japanese-spirits-inada1.jpg}
  \end{subfigure}
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/japanese-spirits-inada2.jpg}
  \end{subfigure}
  \begin{subfigure}[b]{0.9\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/japanese-spirits-inada0.jpg}
  \end{subfigure}
  \caption{English Wikipedia Edits by User 'Japanese spirits' on 'Tomomi Inada'}\label{fig:js-inada}
\end{figure}

Another prolific Wikipedia user (and contributor to the *Nanking Massacre* article with 10.5% of its edits done between 2009-12-03 and 2019-04-30) is the user '花蝶風月雪月花警部' (*kachō fūgetsu setsugetsuka keibu*).[^70] The actions of this user however involve policing primarily un-sourced or biased edits, and a Google search of this account reveals several topics accusing that user of being an 'Anti-Japanese left-wing traitor' (*han-nichi baikoku sayoku* 反日売国サヨク) and an ethnic Korean (*zainichi chōsenjin* 在日朝鮮人).[^68] One other such active user, 'JapaneseA' (2,655 pages created and 46,343 pages edited) has received similar critique[^100] and their policing conflicts have led to bans of active editors as 'Chichiii', who has added 11,999 edits to 3,926 articles and authored 572 articles including *Emperor Apologize request by Korea* (*Kankoku ni yoru ten'nō shazai yōkyū* 韓国による天皇謝罪要求), *Foreign Regional Suffrage* (*gaikokujin chihō sansei-ken* 外国人地方参政権) and *The issue of the Chinese Embassy and Primary land acquisition in Tokyo* (*chūgoku taishikan tonai ittōchi baishū mondai* 中国大使館都内一等地買収問題).[^98]

If we take a look at some of the other contested articles, similar trends arise. Going through the revision history of articles as *'Japan'* (*'nihon'*, 日本), *'Hatoyama Yukio'* (鳩山由紀夫), *'Foreign suffrage in Japan'* (*nihon ni okeru gaikokujin sanseiken*, 日本における外国人参政権), *'Zainichi Koreans'* (*zainichi kankoku・chōsenjin* 在日韓国・朝鮮人), *'Asahi Shimbun'* (朝日新聞) and *'Zaitokukai'* reveals primarily edits by 'Chichiii', '花蝶風月雪月花警部' (*kachō fūgetsu setsugetsuka keibu*) and '大和屋敷' (*yamato yashiki*).[^71] Another top contributor with a telling user name to that latter article is the user '竹島は日本' (*takeshima ha nihon* , 'Takeshima is Japanese'), who has also contributed to articles related to 2channel,[^78] Baseball star Suzuki Ichirō (popularly referred to as *Ichirō*, イチロー) and the Wikipedia article on Makoto Sakurai. 

One aspect of personalization on Wikipedia is the usage of badges on one's profile.[^89] Take for example the user 'S.S.Exp.Hashimoto', primarily active on railway-related articles but just as well a top contributor to the articles *'Netto-Uyoku'*, *'Taiwan'* and *'Foreign suffrage in Japan'* (with a total of 4,698 pages edited between 2004-02-28 and 2019-07-06, including several on the English Wikipedia). The user-page includes some information on the user's interest in railways (the handle itself is a reference to to the Keio Line semi-express train towards Hashimoto, Kanagawa prefecture) and 2channel. More interesting is however this user's usage of badges, as illustrated on **figure \ref{fig:hashimoto}**. Badges that by the way are not uncommon, as seen on the profile of a top contributor to *'asahi shimbun'*, '護国防共団' (*gokoku bōkyō-dan*, lit. 'anti-communist national defense corps') and *Taiwan* top editor `Kamakura' (who between 2003-08-19 and 2019-06-30 has made 7,616 edits to over 3,933 articles, including 315 edits on the English wikipedia), illustrated on respectively **figure \ref{fig:defense-corps}** and **figure \ref{fig:kamakura}**.

In all three cases the users express support for the Self Defense Force (SDF). 'S.S.Exp.Hashimoto' and 'Kamakura' both take pride into their identity as 2channel users,[^69] have Shintoist beliefs and express their support for nuclear energy, while `S.S.Exp.Hashimoto' and '護国防共団' (*gokoku bōkyō-dan*) both describe themselves as conservative. '護国防共団' (*gokoku bōkyō-dan*) and 'Kamakura' show their support for the Emperor System and the LDP. User 護国防共団 (*gokoku bōkyō-dan*) takes pride in being Japanese, shows support for the Nippon Kaigi, political visits to the Yasukuni Shrine and the LDP. 'S.S.Exp.Hashimoto' expresses a dislike against Mainland China and Communism, while simultaneously expressing love for Taiwan (as documented earlier, a Wikipedia topic this user is affiliated with) and the United States. Finally, 'Kamakura' has further syncretic tendencies expressing belief in Taoism and Buddhism. Nevertheless does 'Kamakura' just as well express support for the death penalty.[^79]

\begin{figure}[!htb]
  \centering
  \begin{subfigure}[b]{0.3\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/hashimoto.jpg}
    \caption{\textbf{User}: `S.S. Exp.Hashimoto'}
    \label{fig:hashimoto}
  \end{subfigure}
   \begin{subfigure}[b]{0.3\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/defense-corps.jpg}
    \caption{\textbf{User}: `護国防共団' (\textit{gokoku bōkyō-dan})}
    \label{fig:defense-corps}
  \end{subfigure}
  \begin{subfigure}[b]{0.3\textwidth}
    \includegraphics[width=\textwidth]{images/wiki/kamakura.jpg}
    \caption{\textbf{User}: `Kamakura'}
    \label{fig:kamakura}
  \end{subfigure}
  \caption{Examples of Wikipedia Badges}\label{fig:badge-examples}
\end{figure}

Furthermore, the possibilities of interlinking articles between different language variants of Wikipedia offers previously unseen ways of global interconnection. This has political consequences as well. I've shown above the tendency of editing articles on non-Japanese Wikipedia variants (primarily the English language variant) by several users depicting tropes common to the Netto-Uyoku. Whereas the English-language article[^59] portrays Netto-Uyoku as "Japanese neo-nationalists who interact almost entirely within their own cyber community, shut off from the rest of Japanese society" and who "first appeared on the Internet during the Lost Decade, which was an economic crisis in Japan from the 1990s to 2010s" (perpetuating the idea of Netto-Uyoku as a disenfranchised by-product of the Lost Decade), on 2018-11-11 a user by the name of 'Normal Japanese' replaced the page contents with "anti-Japanese left wings will perish" (which was reverted one minute afterwards). The normative framing of oneself as "normal Japanese", representing the general will of the Japanese people, is a common red line throughout Netto-Uyoku rhetoric, as is the usage of "anti-Japanese left wings" (a direct translation of *han'nichi sayoku*, 反日左翼) and 'perish' (*shine*, 死ね) as aggressive verbal attack.[^84] 

With heated tensions between Japanese and South-Korean nationalists, it is not unexpected to find traces of struggles online and on Wikipedia as well (as suggested by **figures \ref{fig:netto-altright}** and **\ref{fig:netto-altright-kor}**). Although the page on Zaitokukai has variants in different languages, The article on the umbrella term for such organizations as the Action Conservative Movement is available only on the Japanese and Korean Wikipedia. As another example of utilizing interlinking articles for nationalist purposes, a large-scale DDoS attack on 2channel's servers occurring on 01-03-2010 has an article in Japanese (*Kangokujin ni yoru 2-chan neru e no saibātero jiken* '韓国人による2ちゃんねるへのサイバーテロ事件') and Korean (*2010nyeon han·il sam-iljeol saibeo gong-gyeog sageon*, '2010년 한·일 삼일절 사이버 공격 사건'), as well as an English variant ('2010 Japan–South Korea cyber-warfare') created on 24-12-2014 by a Korean-speaking user.[^90] Translated to English, the Japanese title of the page is more akin to 'the cyber-terror incident on 2channel by South Koreans', explicitly using a reference to terrorism as an ideologically motivated attack. The Korean title then translates to "The 2010 South Korea-Japan 3-1 cyber-attack", with 3-1 (*sam-iljeol*, 삼일절) as an explicit reference to the Korean March \nth{1} Movement in 1919. 

Another common aspect of Wikipedia are lists or categories with correlations identified on an individual base. Take for example the category 'Anti-Japanese sentiment in Korea' (61 pages), its Japanese equivalent *Kankoku no han'nichi kanjō* 韓国の反日感情 (56 articles) and its Korean equivalent *daehanmingug-ui ban-il gamjeong* '대한민국의 반일 감정' (80 articles). The English page has an additional "See also: Category:Anti-Korean sentiment in Japan." tag that is present neither on the Japanese nor Korean variants.[^91] That category then contains 33 articles, including a link to 2channel, with edits made to this page primarily by users who have expressed Korean identity or interest into Korea in their user-pages (such as the user 'Caspian blue'[^85]). Between April and July 2019‎, an anonymous user made additions to several pages such as Japanese idol Chiba Reiko[^96] and film director and comedian Kitano Takeshi, including the Wiki-formatted reference `[[Category:Anti-Korean sentiment in Japan]]'. As of July 2019 Kitano Takeshi is still listed as belonging to this category, although neither the English nor Japanese variant contain mentions of anti-Korean sentiment either on the main document or in prior revisions).[^99]

The revision pages of those pages too confirm what I have thus far demonstrated. Users are trying to influence public perception on sensitive topics both regionally and internationally. Of note here is the user '青鬼よし' (*ao-oniyoshi*), with 7,662 edits on 2,192 articles between 2009-02-22 and 2019-07-09 and a top editor on the Japanese article for '*Hatoyama Yukio*' and '*March 1st Movement*'. This user's edits include 577 edits on the English wikipedia, focusing primarily on the article for 'Kofun period' (87), 'Japan–Korea disputes' (30) and 'Korea under Japanese rule' (15) before this account on the English Wikipedia was locked.[^88] Since then, a 'Category:Suspected Wikipedia sockpuppets of Azukimonaka' lists '青鬼よし' as one of 25 double accounts of the same user contributing edits to controversial topics on Korean and Japanese history, including 'KoreanShoriSenyou' (which when written in Japanese characters could refer to the account as intended exclusively or possibly combatively for disposal or procession of anything Korean-related (コリアン処理専用 or コリアン処理戦用) and Azukimonaka (whose top edits include pages on 'Eugenics in Japan', 'Foreign relations of south Korea', 'Japanese expansionism' and 'Manga', as well as on the category of 'Anti-Japanese sentiment in Korea'). Finally, another user, 'Sennen goroshi' (千年殺し, a reference to a particular practical joke in the animation Naruto) has made 4,837 edits on 1,588 English Wikipedia pages between 2007-07-28 and 2019-06-16, dominantly on topics related to Japanese and Korean nationalism, yet does not appear to be Japanese.[^86] Nevertheless on the English language Wikipedia page for 'Anti-Korean sentiment in Japan', this user engages in a brief edit-war with user 'Caspian blue', as seen on **figure \ref{fig:caspian}**; taking sides based arguably through the soft-power influence of both South Korea and Japan.[^87] If soft-power is any indication, that could explain why two seemingly unrelated users attempt to tip the balance in favor of a country they feel an imagined affiliation with.

\begin{figure}[!htb]
  \caption{\label{fig:caspian} Edit Skirmish on English Wikipedia Page 'Anti-Korean sentiment in Japan'.}
 \centering
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/wiki/sennen-caspian.jpg}
\end{figure}

##Examples of Grassroots counter-activism: 'Ban Matsuri'

As I've demonstrated in the first chapter, the world wide web and social media platforms are increasingly relevant tools for shifting public opinion. Moreover, this is done from the ideologically populist stance of representing the people's will as bottom-up media lacking of gatekeepers—a Habermasian public sphere on which counter-hegemonic ideologies can spread. In particular I've demonstrated attempts to steer public opinion on Wikipedia by those who reside in 2channel's most active echo-chambers. At the same time, those platforms have also been utilized for the purpose of astroturfing, and the usage of bots or sockpuppets for political persuasion has been widely demonstrated including in Japan [@schafer_japans_2017]. 

In contrast, these media platforms do have specific terms of services that include a ban on inciting violence or hate. For that, users have the option to report content and, based on the amount of reports, those platforms will automatically flag, block or remove accounts and their associated content. The colloquial 'Netto-Uyoku ban ' (ネトウヨBAN祭り *netouyo ban matsuri*, lit. 'Netto-Uyoku Ban Festival')[^107] is one such instance of grassroots activism. In 2018 the *Asahi Shimbun* reported a large scale deletion of Youtube channels, including that of *Toranomon News* regular Takeda Tsuneyasu [@shino_eng:_2018]. This was followed by a *Sankei Shimbun* tabloid reporting over 2000 Youtube channels and 2000 Twitter accounts suspended, with over 50 million tweets deleted and damage to channels such as 「某国のイージス」 (*Bōkoku no ījisu*, lit. 'A Certain Country's Isis'), Tony Marano (known as *tekisasu oyaji* テキサス親父 or 'Texas Daddy')[^1] and that of Kazuya and *Toranomon News* [@ogawa_eng._2019].[^106] These are users that identify themselves with a particular subcategory of 2channel and used the MediaWiki software to organize themselves. Those users have reported and documented on a massive scale Youtube and Twitter accounts they deemed belonging to Netto-Uyoku users, leading to the suspension of thousands of Youtube channels and Twitter accounts (including that of Zaitokukai-founder Makoto Sakurai), as well as the removal of hundreds of thousands of messages and videos. 

by reporting particular websites using means like Google's Adsense, which effectively blocks the income of news aggregation websites like the particularly influential hosyusokuhou.jp.

A trend amongst deleted videos was the usage of usage of automated voices and text scrolling over a black background or several images. Furthermore, a look at the list of removed accounts 

 

「某国のイージス」や、「竹田恒泰（旧ｃｈ）」「ＫＡＺＵＹＡチャンネル」「テキサス親父」「ＤＨＣテレビ『真相深入り！虎ノ門ニュース』」、まとめサイトの「保守速報」など、膨大な保守発信が被害にあってきた。

　現在、ユーチューブで累計２０００チャンネルのバン、ツイッターで累計２０００アカウント凍結、ツイート削除に至っては累計５０００万件に及ぶとされる。ヘイトと言えない大量の言論までもが、同時に封殺される異常事態は、組織的な仕掛けなしに考え難い。

One of the larger subsections (boards) of 2channel, ニュース速報 (嫌儲) started in protest of curated aggregation sites profiting on comical posts on particular 2channel boards.



 in curated 


##Conclusion

Like elsewhere in the world Wikipedia as a platform and the software behind it have both gained a strong grip on Japanese Internet users' methods for informing oneself. Nevertheless, as demonstrated on the previous pages political topics are dominantly revised by a small group of Wikipedians in order to express political ideology and influence the public opinion. I have further shown ties between editors on the Japanese Wikipedia and 2channel, both in methods of organization (high tendencies for editing anonymously as well as using Wiki platforms for meta-discussions on Wikipedia) and in taking one's usage of 2channel as a source of pride and identity. Neither are these users expressing their interests on Wikipedia exclusively around political topics either, with either histories of editing topics of popular culture topics, or direct references to popular culture on one's profile. The dominance of Japanese popular culture and the soft-power strategy of Cool Japan is further proven by the high percentage of articles[^92] and edits devoted to popular culture topics like Japanese animation and idol formations. Moreover, due the ease of intersection with other language versions of Wikipedia, the most dedicated among those editors attempt the same thing on a wider scale. Something that is not done solely as an expression of (Japanese) nationalism, either. National soft-power strategies for disseminating the hegemonic ideology have worked on a global scale, leading to such phenomena of neither ethnically Korean nor Japanese citizens trying to tip the balance of information-making in favor of either nation. 

By placing a name on this phenomenon, imagined cyber-communities built around shared ideological values utilize normative rhetorical devices for influencing public opinion on Wikipedia as a public sphere. For the same reason, the imagined Japanese other of the Netto-Uyoku (payoku), who are dominantly present on the same 2channel, began to utilize MediaWiki for the organization of grassroots counter-activism. Their actions have led to the deletion of thousands of public Youtube and Twitter accounts as well as the removal of income for influential news-aggregation websites.

\newpage



\chapter*{Conclusion}
\addcontentsline{toc}{chapter}{Conclusion} 

In my introductory first chapter, I've made the argument that the Internet has seen increasing politicization; ranging from populist usage of big-data and paid propaganda campaigns operating as *faux* grassroots activism, to microcosmic counter-culture subcultures in the West; primarily built around the discussion of Japanese pop-culture and disrupting the public discourse on political issues. Furthermore, I brought up the topic of online culture wars. While a lack of seemingly similar culture wars in Japan could be seen as a sign that the political shift of such subcultures as that on *4chan*'s political board reflects larger social trends within the United States and/or Europe and leaves little space for media agency, I tend to believe culture is a feedback loop and at the very least the political rhetoric utilized in this public discourse finds its roots in the particular culture developed in those communities. *Regardless, in Japan too have the Netto-Uyoku, the decentralized populist right-wing nationalist (that is, cyber-nationalist) voice on the Japanese Internet, shaken to some extent public discourse on politics, and can their rhetoric be traced back to those subcultures.*

In that chapter I next listed several questions I intended to answer during this paper:

- What is the demography of the Netto-Uyoku movement?
- How should we define Netto-Uyoku ideology?
- How do the Netto-Uyoku compare to the ultra-nationalist Uyoku Dantai?
- What processes do the Netto-Uyoku employ to disseminate ideology?
- What are the dynamic processes of the media platforms that the Netto-Uyoku utilize?
- How do the Netto-uyoku compare to other online-based neo-nationalist movements? Can we speak of a distinct Japanese character compared to contemporary movements, or should we view the Netto-Uyoku primarily as part of a greater trend of Internet-fueled populist neo-nationalism? Secondly, is there a common reaction to, for example, the Alt-Right and Trump-era politics?
- How does the movement organize and mobilize, both online and in real life?
- Is there possible space for furthering a Netto-Uyoku political "agenda" through influencing its international counterparts?

The term Netto-Uyoku was coined fifteen years ago. In my second chapter I've reviewed a select amount of literature both from the early period covering the Netto-Uyoku as a fringe element of greater topics, to more recent literature covering the Netto-Uyoku and the Internet.

In the third chapter, I've attempted to map the ideology behind the right-wing reactionary voices utilizing the Internet drawing on Frankfurt School scholars' theorization of ideology and media. It is a pitfall to apply theory rooted in western cultural traditions without balancing the different socio-cultural contexts of the subject, and arguments too could be made against the continuous western hegemony of academia. Yet, when we follow Anderson's and McLuhan's logic on media and literacy as crucial to nationalism, and see the world as a 'global village' connected by the digital, it wouldn't be a far stretch to consider the universal nature of the concepts presented in this chapter.

While I could never claim information warfare, populist demagoguery or nationalism to be new tactics in politics, it is not far-fetched to claim this is now done to great success on the Internet; fueled by both the technological peculiarities of the Internet itself (algorithms etc) and the rhetoric formed on Internet subcultures. In the fourth chapter I've covered the development of Japanese Internet subcultures and the close ties of Otaku culture with the adaption of the Internet.

https://www.buzzfeednews.com/article/ryanhatesthis/brazil-jair-bolsonaro-facebook-elections

In the third chapter, I've found many of the ideological goals of the Netto-Uyoku to fall in line with that of the current administration, who've in turn done well in dog-whistling to the Netto-Uyoku. This could be interpreted as one reason for a lack of political success for the Netto-Uyoku-associated Makoto Sakurai and his Japan First Party.

I conclude that the Netto-Uyoku, like its counterparts across the world, is on one hand a continuation of an ideological war 


Whereas the rise in global right-wing populism shook the world in 2016, which falls in line with the wide-spread counter-hegemonic narrative disseminated in part by cyber-nationalists, I've argued that this has appeared much earlier in Japan. More specifically in an outburst of public outrage after events occurring around 2011: scandals in politics, public media and the 2011 Fukushima Nuclear Disaster (as suggested on page \pageref{populism-gt} by **Figure \ref{fig:politictrends}**). *Interest*[^23] in politics has taken an increasingly large relative share of Google searches across the world. In Japan, interest has remained relatively stable with the exception of a massive peak in 2011; A massive peak we've noted by the way on **Figure \ref{fig:nettouyoku}** (page \pageref{nettouyoku-gt}).

Following various contradictions in post-war Japan's society, The New Left and student protests influenced by Marxist scholars shook civil society. Now, anti-intellectual right-wing populists are (sub-)consciously applying the same Marxist school of thought. Contradictions in society, most notably the effects of alienation in the wake of the Lost Decades, have renewed public distrust. Within this sphere of alienation and crises of identity, digital natives built intrinsic cyber-communities with a distinct anti-establishment discourse—a cyber-discourse with vast ties to the libertarian mindset that shaped the ideology behind the Internet in the first place. 

As we see happening across the world, I argued these communities to be ripe for political exploitation (in the form of a potential political electorate) by those same right-wing populists. Whether its Donald Trump's presidential campaigns, Duterte in the Phillipines or the Flemish right-wing populist Vlaams Belang in 2019, right-wing populists have since the second half of the 2010's gained considerable support throughout the world by including digital natives in their campaign strategies. Distinct from national-scale politics in the United States however, I conclude that in Japan the current iteration of the LDP administration has successfully capitalized on this public distress. Although perceived societal contradictions up to the '90's shook the core of the LDP strong enough to bring about a massive reform of the voting system, I next argued that from the '90's onwards societal contradictions between the 'hegemonic ideology' and the perceived reality (seen to its inevitable conclusion following the 2011 Fukushima Nuclear Disaster and the reveal of the North Korean kidnappings) brought about a new iteration of the LDP, or rather one that answered to the counter-hegemonic narrative of the Japanese cyber-nationalists. The actions of the Netto-Uyoku and the Zaitokukai have let to *public* disavowal by Abe Shinzo, yet on social media the prime minister uses *dog-whistling* methods to appeal to those groups by expanding (**op inspelen**) upon those groups' rising concerns and antagonizing enemies on common ground: established forms of media, conservation of the ethnic-Japanese identity, and hostile positions towards both Korea's and China. Perhaps in this sense Steve Bannon had a point after all?

Finally I've demonstrated a higher awareness of group identity amongst those who reject the Netto-Uyoku. If the Netto-Uyoku exist and are to be named, then those who have become aware of this phenomenon and feel rejection form a group identity too, both in the off-line public sphere as on the Internet. Offline we have of course various counter protests such as SealDs, C.R.A.C. and influenced by its Western counterparts, the Antifa. Online we have seen communities form around exposing and removing Netto-Uyoku means of radicalization (I refer in particular to the 2018 - 2019 Netouyo Ban Festival). It is forebearing to claim, but perhaps this too can be seen as a trend of greater political shifts?

\newpage


\begingroup
\chapterstyle{thatcher}

\chapter*{References}
\addcontentsline{toc}{chapter}{References} 

\setlength{\parindent}{-0.2in}
\setlength{\leftskip}{0.2in}
\setlength{\parskip}{0em}
\noindent

This document utilizes the author-date citation system of The Chicago Manual of Style 16th Edition (commonly referred to as **Chicago B**).

\vspace{4mm}
\setlength{\parskip}{0em}
\footnotesize

<div id="refs"></div>
\endgroup

\newpage

\appendix
\pagenumbering{Roman}
\chapterstyle{thatcher}

#Appendix

##Images

###\ref{fig:searchengine}

The web-portal *Yahoo! Japan* (a joint venture between the American Yahoo! and Son Masayoshi's SoftBank) retains a monopolistic grip on the Japanese Internet market as its most visited website. Nevertheless, as seen on **Figure \ref{fig:searchengine}**, Google is by far the dominant search engine, more so when taking into account that Yahoo! Japan's search engine has since 2010 implemented Google's search engine algorithms (which may account for its increase in market share since). Results based on Google's statistics can therefore be argued to effectively reflect the overall interest of Internet users in Japan.

\begin{figure}[!htb]
 \centering
  \caption{\label{fig:searchengine} Search Engine Market Share Japan (10 Years).}
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/searchengine.eps}
  \end{figure}

###Google Trends
\label{appendix:googletrends}

 This graph indicates peak interest over a duration of time and contrasts interest thus on a relative scale; it does not scale Japanese results to worldwide results quantitatively.

###\ref{fig:politictrends}

(als ik tijd heb deze figuren nog online zetten dynamisch me anotaties btw)

**Figure \ref{fig:politictrends}** suggests a global increase in public awareness of politics (the frequency of searches in part of the total amount of searches has practically doubled) and dominated by a search interest in left-wing topics (crossed by right-wing topics one only in November 2016, in the wake of the presidential elections). In Japan however, interest in political topics as measured by Google Trends remains however fairly stable throughout the line, with one significant voorbarig

\begin{figure}[!htb]
  \caption{\label{fig:politictrends} The Google Trends of Right-Wing and Left-Wing Politics Worldwide \& Japan (15 Years).}
 \centering  
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/politictrends.eps}
\end{figure}

**Figure \ref{fig:nettouyoku}**

\begin{figure}[!htb]
  \caption{\label{fig:nettouyoku} The Google Trends of Netto-Uyoku \& Japan (15 Years).}
 \centering
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/nettouyoku.eps}
\end{figure}

**Figure \ref{fig:netto-altright}**

\begin{figure}[!htb]
  \caption{\label{fig:netto-altright} Google Trends Breakdown by Region of Netto-Uyoku \& Alt-Right as Topics (15 Years).}
 \centering
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/netto-altright.eps}
\end{figure}

**Figure \ref{fig:netto-altright-kor}**

\begin{figure}[!htb]
  \caption{\label{fig:netto-altright-kor} The Google Trends of Netto-Uyoku \& South Korea Since 2010.}
 \centering
  \includegraphics[width=0.95\textwidth,trim=4 4 4 4,clip]{images/netto-altright-kor.eps}
\end{figure}

##Other

Edit later



##Wikipedia

###Wikipedia Reverts

In order to calculate contentious Japanese Wikipedia pages I use a rudimentary way of comparing the total amount of reverts to the total amount of revisions on a page (limited to articles, I exclude *namespaces* for pages such as *Userpages*). I wrote a script in the Java programming language to obtain the top 1000 revised articles (both in total and during a certain time span). My dataset is a 5GB data-dump (*jawiki-20190620-stub-meta-history.xml.gz*) obtained from <https://dumps.wikimedia.org/jawiki/20190620/>. This compressed file contains an XML file with meta-data of every Japanese Wikipedia page (such as title, namespace, and revision information) up to 2019-06-20.[^63] Reverts are then based on keywords (eg. 'rv', '取り消し', '巻き戻し') in the comments of revisions and are therefore not completely exhaustive (this would most likely include reverts of acts of vandalism, but will not include the actual act of vandalism in which one reverts parts of- or even the complete article). While this methodologically requires further attention, preliminary results undeniable show in quantifiable ways particular political topics to be in the top of so-called '*Wiki edit-wars*'. I've run the script for each year between the range of 2003 (the beginning of the data-dump) and 2019. Per year I've included levels of controversy based both on the total amount of revisions and reverts up to that year, as well as solely on the revisions and reverts committed in that particular frame of time.

## Tables

###50 Most Popular Websites in Japan (2019)

These statistics are calculated on a three-monthly basis, determined by a combined page views and unique visitors of all pages belonging to one particular domain [@noauthor_alexa_2019]. 

\begin{table}[!htb]
\footnotesize
\centering
\setlength{\tabcolsep}{5pt}
\caption{50 Most Popular Websites in Japan (2019)}\label{tab:50mostpopjp}
\scalebox{0.8}{
\begin{tabular}{@{}p{0.1cm}lp{0.1cm}lp{0.1cm}lp{0.1cm}lp{0.1cm}lp{0.1cm}lp{0.1cm}lp{0.1cm}l@{}}
\toprule
1&Google.com&11&Fc2.com&21&Amazon.com&31&Blogspot.com&41&Msn.com\\
2&Youtube.com&12&T.co&22&Yahoo.com&32&Tmall.com&42&Nikkei.com\\
3&Yahoo.co.jp&13&Baidu.com&23&Qq.com&33&Apple.com&43&5ch.net\\
4&Amazon.co.jp&14&Instagram.com&24&Mercari.com&34&Microsoft.com&44&Naver.jp\\
5&Google.co.jp&15&Kakaku.com&25&Goo.ne.jp&35&Taobao.com&44&Dmm.com\\
6&Twitter.com&16&Livedoor.jp&26&Blog.jp&36&Netflix.com&46&Nhk.or.jp\\
7&Facebook.com&17&Livedoor.com&27&Weblio.jp&37&Pixiv.net&47&Line.me\\
8&Rakuten.co.jp&18&Ameblo.jp&28&Live.com&38&Japanpost.jp&48&Sohu.com\\
9&Wikipedia.org&19&Dmm.co.jp&29&Hatenablog.com&39&Github.com&49&Office.com\\
10&Nicovideo.jp&20&Pornhub.com&30&Xvideos.com&40&Impress.co.jp&50&Tabelog.com\\
\bottomrule
\end{tabular}
}
\end{table}


### Japanese Wikipedia Top 50 (as of 2019)
\label{sec:wikiappendix}

Based on respectively my measurement of controversy (reverts divided by revisions), the total amount of revisions and the total amount of reverts, I've compiled a list of the 50 highest ranking articles. 

\begin{table}
\footnotesize
\centering
\setlength{\tabcolsep}{5pt}
\caption{50 most contentious, revised and reverted articles on the Japanese Wikipedia (2019)}\label{tab:50expanded}
\scalebox{0.9}{
\begin{tabular}{@{}p{0.1cm}lll@{}}
\toprule
&Top 50 contentious articles&Top 50 revised articles&Top 50 reverted articles\\
\midrule
1&南京事件&ZIP!&AKB48\\
2&ネット右翼&海賊戦隊ゴーカイジャー&安倍晋三\\
3&日本&ONE PIECEの登場人物一覧&日本\\
4&前田敦子&天才てれびくんシリーズのドラマ&ONE PIECE\\
5&王下七武海&ゲゲゲの鬼太郎の登場キャラクター&前田敦子\\
6&悪魔の実&WWEに所属する人物一覧&乃木坂46\\
7&ONE PIECE&オールスター感謝祭&創価学会\\
8&渡辺麻友&アニメ+&南京事件\\
9&乃木坂46&めざましテレビ&悪魔の実\\
10&AKB48&名探偵コナンの登場人物&王下七武海\\
11&安倍晋三&ちちんぷいぷい (テレビ番組)&ネット右翼\\
12&欅坂46&相棒の登場人物&けいおん!\\
13&鳩山由紀夫&ONE PIECEの登場人物一覧&ONE PIECEの登場人物一覧\\
14&創価学会&3年B組金八先生)&海賊 (ONE PIECE)\\
15&天皇&SASUKE&渡辺麻友\\
16&中華民国&青森放送&仮面ライダーシリーズ登場怪人一覧\\
17&おそ松さん&海賊 (ONE PIECE)&大韓民国\\
18&金妍兒&AKB48/log20110116&天皇\\
19&在日特権を許さない市民の会&イナズマイレブンの登場人物&嵐 (グループ)\\
20&指原莉乃&情報ライブ ミヤネ屋&海軍 (ONE PIECE)\\
21&在日韓国・朝鮮人&フジテレビジョン&モンキー・D・ルフィ\\
22&櫻井翔&福山潤&在日特権を許さない市民の会\\
23&上皇明仁&SMAP&鳩山由紀夫\\
24&YouTube&グルメチキンレース・ゴチになります!&在日韓国・朝鮮人\\
25&モンキー・D・ルフィ&新日本プロレス&プリキュアシリーズ\\
26&朝日新聞&仮面ライダーフォーゼ&仮面ライダーゴースト\\
27&本田圭佑&ゲームセンターCX&SMAP\\
28&スカパー! チャンネル一覧&めちゃ×2イケてるッ!&SKE48\\
29&ONE PIECEの用語一覧&スーパー戦隊シリーズ&水樹奈々\\
30&仮面ライダーシリーズ登場怪人一覧&AKB48&AKB48\\
31&けいおん!&読売ジャイアンツ&指原莉乃\\
32&艦隊これくしょん -艦これ-&相棒&中華民国\\
33&海軍 (ONE PIECE)&プリキュアシリーズ&福山潤\\
34&高橋みなみ&モーニング娘。&Hey! Say! JUMP\\
35&仮面ライダーゴースト&仮面ライダーディケイド&欅坂46\\
36&松本人志&24時間テレビ 「愛は地球を救う」&ドラえもん\\
37&動物戦隊ジュウオウジャー&成田国際空港&サザエさんの登場人物\\
38&朝鮮民主主義人民共和国&アニメ版ポケットモンスターの登場人物&ONE PIECEの用語一覧\\
39&有吉弘行&仮面ライダー電王&本田圭佑\\
40&HKT48&銀魂 (アニメ)&魔法少女まどか$\star$マギカ\\
41&大韓民国&BLEACHの登場人物&相棒\\
42&手裏剣戦隊ニンニンジャー&関西国際空港&B'z\\
43&初音ミク&安倍晋三&イチロー\\
44&魔法つかいプリキュア!&仮面ライダー鎧武/ガイム&朝鮮民主主義人民共和国\\
45&Fate/Grand Order&阪神タイガース&上皇明仁\\
46&魔法少女まどか$\star$マギカ&トリコ&織田信長\\
47&木村拓哉&龍が如くシリーズの登場人物&二宮和也\\
48&NARUTO -ナルト-の登場人物&ジャニーズJr.&ドラゴンボール\\
49&Minecraft&スーパーJチャンネル&櫻井翔\\
50&韓国起源説&SKE48&FAIRY TAILの登場人物\\
\bottomrule
\end{tabular}
}
\end{table}

### Methodology)
\label{sec:methodology}

[populism_trends]: images/populism_trends.jpg

[^2]: As illustrated on **Figure \ref{fig:nettouyoku}**, this usage has since 2009 overtaken by the more pejorative four-character abbreviation *neto-uyo* (ネトウヨ). Unless I'm translating texts with the intent of maintaining this pejorative connotation I will however retain the term Netto-Uyoku.
[^6]: A literal translation of *kōdō suru hoshu undō* (行動する保守運動).
[^7]: "The Group Seeking Recovery of Sovereignty" (*Shuken Kaifuku wo Mezasu Kai* 主権回復を目指す会).
[^8]: "The Citizens’ Group Refusing to Tolerate Special Rights for Zainichi Koreans" (*Zainichi Tokken wo Yurusanai Shimin no Kai* 在日特権を許さない市民の会).
[^9]: Although @higuchi_japans_2016 describe the ACM as ultra-nationalist in nature, this paper agrees with @gill_nativist_2018 in that "‘ultra’ implies a *quantitative* increase in the degree of extremism, from ‘right’ to ‘far right’ to ‘ultra-right’". It will instead utilize the term neo-nationalism to distinct the ACM from ultra-nationalist Japanese militants collectively known as *uyoku dantai* (右翼団体, "right wing groups"). While often used in the context of Europe and North-America's rise in populism, the term neo-nationalism refers to a type of nationalism marked by right-wing populism, cultural racism, anti-globalisation and nativism, and arguably more closely describes the ACM ideologically [@dougherty_new_2016; @hirsh_why_2016].
[^10]: This VRT report can be viewed in full at <https://www.vrt.be/vrtnws/nl/2018/09/05/pano-wie-is-schild-vrienden-echt/>. An English version, referring to S&V as the Flemish Alt-Right, is available at <https://www.vrtsales.be/productions/documentary/behind-scenes-flemish-alt-right-shield-friends>.
[^11]: @soll_long_2016 traces fake news in the west as a concept back to the invention of print media five centuries ago, to Gutenberg's invention of the printing press in 1439. In his essay, he recalls for example an account in 1475 of deliberate use of misinformation to persecute a Jewish community in Trent, Italy. 
[^12]: Albeit in October 2017 renamed to 5channel (*5-channeru* 5ちゃんねる, accessible at <https://5ch.net>), this paper will for the sake of continuity with previous literature on the topic, continue to refer to this message board as *2channel*.
[^13]: Khellberg came under increasing scrutiny for racial remarks and has been referred to as part of a gateway to the reactionary right [@lewis_alternative_2018; @dickson_why_2019; @roose_mass_2019].
[^4]: This theory, known as "The Great Replacement" (not so coincidentally the title of the perpetrator's manifesto), is featured on the Identitarian Movement's homepage and has been adopted by populist right-wing figures such as Dutch politician Geert Wilters and Hungarian Prime Minister Viktor Orbán. It has arguably been endorsed by President of the United States Donald Trump, who has shared tweets with the hashtag "#whitegenocide" [@weiss_opinion_2018; @manjoo_opinion_2019].
[^14]: This paper expands upon the author's undergraduate thesis [@poppe_digitaal_2017], written under the supervision of Prof. Dr. Dimitri Vanoverbeke. In his undergraduate thesis, the author examined the Netto-Uyoku as potential electorate of populist politicians on both a national and regional scale. 
[^16]: In the second article, @laurent_nordactu_2016 describes the *fachosphère* as part of the Identitarian Movement and "une nébuleuse de sites, de comptes sur les réseaux sociaux, visant à diffuser de la « réinformation », en clair de la propagande allant dans le sens des militants qui les animent", a nebula of websites and accounts on social networks, designed to disseminate "réinformation" or in other words propaganda embracing the ideas of the activists, amongst the users of those platforms.
[^17]: 4chan has been commonly accredited with popularizing many aspects now common to Internet communities. The message-board has several sections devoted to Japanese pop-culture, and in 2019 claimed over 27,700,000 unique visitors per month. Of particular note is the self-assessed demography of its users, consisting of a a mostly millennial, male user-base from the United States and Western Europe, listing interests as "Japanese culture, anime, manga, video games, comics, technology, music, movies" [@noauthor_advertise_nodate; @ellis_4chan_2018].
[^18]: The controversy has had widespread coverage, including condemnation by Canadian Prime Minister Justin Trudeau, and was extensively covered by Alt-Right key-figure Milo Yiannopoulos on the far-right website Breitbart News Network. The outcome of this campaign has been claimed to have had radicalizing effects amongst its supporters [@wofford_is_2014; @johnston_chat_2014;@morgan_analysis_2016; @martens_rally_2017].
[^20]: It should be noted that a short news-report on Youtube covering this topic, "A Lot Of White Supremacists Seem To Have An Asian Fetish (HBO)" by @vice_news_lot_2017, had as of writing, a ratio of 6,1K dislikes to 5,6K likes. In the comment section I identified a newly posted comment by "Notification Email" (barring a play-list of several game-related videos an otherwise empty account) to state "absolute state of (((modern journalism))) ... the truth is people longing culture about sincerity, chivalry, family value, etc. the west is beyond saved from the sinner, hedonist, liar, and degenerate." Another comment, by the account "ShadyxFiascoX 32", had 166 likes and stated "Personally Hitler loved Japan and said they had a good culture. What the hell is (((Vice))) talking about". In both cases the triple parentheses (originated from Alt-Right discourse) imply Jewish ownership of the video's owner, Vice News. One comment, by "Ochiai's Channel" misinterprets this video's content by posting "I am Japanese, and can I consider his talk as a hate speech against us?!". His channel, with a follower count of 610 subscribers and viewed over 87K times as of writing, states both in Japanese and English *2-Channeru-nado ni katte ni rinku o iron'na tokoro ni hattari,nan nara katte ni bideo o ichibu o kiritotte riyō suru no, OKdesu! ... Tada, han'nichi no hitotachi wa, do no yōna katachideare, riyō wa okotowarishimasu.* (「２ちゃんねる等に勝手にリンクを色んな所に貼ったり、なんなら勝手にビデオを一部を切り取って利用するの、OKです！ ... ただ、反日の人達は、どのような形であれ、利用はお断りします。」) and "You can paste my videos anywhere, or you can even download it and edit to use it. ... However, if you're anti-Japan or pro-migration, you're not welcome to do any of those in any means" [@noauthor_ochiais_nodate].
[^21]: It is fitting too then that former Vice President of the United States, Al Gore, referred to the Internet in a 1994 speech for the International Telecommunication Union, as "information superhighways" that would serve as a "metaphor of democracy" and lead to a "global community". The text is available in full at <http://vlib.iue.it/history/internet/algorespeech.html>.
[^22]: "Determinism is a philosophical system that posits every physical event, including human cognition and action, is causally determined by an unbroken chain of past occurrences and therefore makes it possible for us to know future effects with certainty. Technological determinism claims that technology is an autonomous, "self-controlling, self-determining, self-generating, self-propelling, self-propelling, selfperpetuating and self-expanding force ... out of human control, changing under its own momentum and 'blindly' shaping society" [@chandler_act_1995, p.1]
[^5]: A conservative Nippon Foundation platform *nippon.com* English-language publication by author Furuya Tsunehiro (a cultural critic, online personality and until 2014 himself a frequent guest on Channel Sakurai). He claims that "disturbing as the voice of cyber-extremism may be, its influence on Japanese politics and society remains limited, and its heyday is nearing an end" [@furuya_roots_2016]. The platform is part of the Sasakawa Peace Foundation, founded by war-criminal and World Anti-Communist League (WACL) member Sasakawa Ryōichi [@kirkup_obituary:_1995].
[^19]: @davison_language_2012 defines this as "a piece of culture, typically a joke, which gains influence through online transmission."
[^24]: After the Unite the Right rally in Charlottesville, The term Alt-Lite occasionally came into usage to differentiate its relatively moderate members from more extremist white-nationalist Alt-Right members such as Richard Spencer. When referring to the Alt-Right in this paper, this author uses the term as an overarching umbrella term indicating both. For a closer take on the Alt-Right, the Alt-Light and the "Online culture wars", this author recommends @nagle_kill_2017.
[^26]: For other mainstream news examples, see The New York Times' *How The Trolls Stole Washington* [-@hess_how_2017] and Washington Post's *We Actually Elected A Meme As President* [@ohlheiser_analysis_2016].
[^27]: A news aggregation and discussion platform. Based on combined page views and unique visitors it is, according to Alexa Internet, as of June 2019 the \nth{16} most visited global website. Within the list of social media platforms it is preceded only by Youtube, Facebook, Twitter and Instagram, as well as the Chinese web portals Tencent QQ and Sohu [@noauthor_alexa_nodate]. 
[^28]: One The Huffington Post article, for example, referred to Roman politician Publius Clodius Pulcher as "the Trump of Ancient Rome, a Populist Demagogue Who Helped Bring Down the Republic" [@freeman_meet_2016].
[^29]: The Southern Poverty Law Center reports that while global "terrorist attacks dropped from about 17,000 in 2014 to about 11,000 in 2017, including a 40 percent decline in the Middle East", "the United States has seen a recent surge in terror-related violence, with 65 attacks [in 2017], up from six in 2006", with two-third "tied to racist, anti-Muslim, homophobic, anti-Semitic, fascist, anti-government or xenophobic motivations" [@morlin_study_2018].
[^30]: Translates to Shield & Friends, a reference to a period of Flemish romantic nationalism (the Battle of the Golden Spurs) and in particular to the \nth{14} century shibboleth for identifying Frenchmen based on their inability to pronounce this phrase.
[^32]: Although affinity for Japan by the Far Right is of course by no means a new phenomenon. In 2010 for example, a European delegation including previous French Front National leader Jean-Marie Le Pen and Belgian Vlaams Belang associate and European Parliament member Phillip Claeys, visited the politically controversial Yasukuni Shrine reportedly on invitation by the far-right *Uyoku Dantai* issuikai [@k.c._how_2010;@phillips_bnp_2010]. 
[^34]: I've contrasted the term 'Netto-Uyoku' as a 'Topic' (which includes related keywords collected through neural networks) with the literal search terms '*netto-uyoku*' 「ネット右」 and '*netouyo*' 「翼ネトウヨ」. Interest indicates relative interest to the full amount of searches at that time, it is not an indicator of quantity. The highest value (100) represents the highest proportion of search results with all other results calculated in proportion. For more information on the methodology behind Google Trends, I refer to **\ref{appendix:googletrends}**.
[^35]: Although these worldwide trends reflect similar trends in Japan, they are preceded with a short massive spike of interest in both July 2011 and August 2012, suggesting the concept of populism to have penetrated the Japanese public lexicon period a fair bit earlier as on a global scale. A period, barely a year after the devastating 2011 Tōhoku earthquake in which political outsiders Shintaro Ishihara and Hashimoto Taro are making headlines, current prime minister Abe Shinzo was staging his political comeback, Tsuneo Watanabe, who was once called Japan's most powerful media baron [@onishi_shadow_2006], publishes a book warning against the dangers of populist nationalism (@watanabe_anti-populism_2012), and literary critic Azuma Hiroki gains renewed success with his publication of *ippan-ishi 2.0* (General Will 2.0, 一般意志2.0).
[^36]: <https://en.oxforddictionaries.com/definition/ideology>
[^37]: "The term ideology, which had originally indicated a new science, became a condescending catch-word that served to demarcate political enemies. Ideology and ideologue began to connote the unwarranted interference of philosophical theory in political practices"[ @mudde_oxford_2013, p:19]. These shifts are still on-going in today's political discourse and the term is often used in a dichotomous relationship to the truth or to a "moderate position" such as pragmatism. One recent piece by the USA political think tank Niskanen Center, for example, uses the terms ideologues and extremists interchangeably [@niskanen_center_if_2019], while a 2016 Business Insider article paraphrases Barack Obama as calling Donald Trump pragmatic rather than ideological, "someone who is stringently tied to a political philosophy" [@darcy_obama_2016] and Donald Trump, at the 73rd Session of the United Nations General Assembly, announced his rejection of the "ideology Of globalism" [@schwartz_trump_2018]. 


[^39]: These include statements that are not false *persé* but just as well (EXTEND ON THIS PART)



[^40]: In post-colonial theory, the concept of the subaltern refers to those in the margins of colonial society, lacking of agency and being forced to resort to speak the colonial oppressor's language. Crucial early works on the topic include Edward Said's *Orientalism* (1978) and Gayatri Chakravorty Spivak's deconstructive essay *Can the Subaltern Speak?* (1983), which criticizes the practice of interpreting the Other through western methodology. Something I feel I am guilty of, writing this very paper on Japanese *digital nationalism* using mostly western traditions of academic theory and methodology as universally applicable. I find some irony too in basing my Japanese resume on my English manuscript, neither of which are my native languages.
[^41]: These concepts have been translated as *War of Position* and *War of Maneuver* [ @buttigieg_gramsci_1995;@gramsci_selections_1985: p.46]. It must be noted that this part of Gramsci's reasoning has since gained renewed popularity and seen appropriation by both Identitarian movements and the Alt-Right. Social institutions education and the mass media are seen as platforms for manufacturing consent to a hegemonic left-wing or globalist ideology, and the notion of Gramsci's counter-hegemony is re-framed as *metapolitics* [@stein_jeff_2018]. Belgian populist right-wing party member Dries Van Langenhove claims his Identitarian youth movement Schild & Vrienden to function as a vehicle of metapolitics [@nws_van_2018], and previous Vlaams Belang leader Filip de Winter added that "The methodology Gramsci promoted is the right one" ("De methodiek die Gramsci aanprees, is de juiste") [@ceulaer_6_2016].
[^42]: In this paper's introduction, I've noted the Alt-Right's infatuation with Japan in particular. Asking why, one might look at war-time relations between the far-right in the West and Japan. In Fukushima's mount Iimori, for example, I examined both an archaeological column of Pompeii, donated by Italian fascist leader Mussolini, and a 1930's German donation in the form of a black granite plate with an Iron Cross–as form of praise for the *bushido*-related war-time propagandistic media-event of the White Tiger Company military unit (*Byakkotai*, 白虎隊), the story of 19 teenagers that committed ritual suicide after mistakenly believing their castle to be fallen during the Bosshin War. Perhaps in more recent memory, one other answer could be found in a dialectic processes of cultural hegemony between Japan and the West. With the widespread 80's narratives of Japan as economical powerhouse and the growing cultural *soft* power of Cool Japan, many a page were written on the *Japanese model* (I think for example of Chalmers 1982 *MITI and the Japanese Miracle*), and thus a window opened to sell Japan's hegemonic ideology of *nihonjin* 日本人論 style of (ethno-)nationalism to the West. 
[^43]: Brother of Benedict Anderson, who gained fame with his notion of socially constructed "imagined communities" [-@anderson_imagined_2006].
[^44]: Far below Belgium (9), the United Kingdom (33) South Korea (41) and the United States (48). This ranking is based on among others restrictions of journalism in official press rooms (see concept of the "reporters club", the 記者クラブ *kisha kurabu*), strict policies against whistle blowers, and an increasingly hostile public climate towards public media [@noauthor_japan_2019].




[^46]: The company has been involved with other international political campaigns, and was backed by the conservative computer scientist Robert Mercer, an important financial contributor to Breitbart News [@kang_facebook_2018;@rosenberg_how_2019].
[^47]: A regulation on data protection and privacy for European Union and European Economic Area individuals, which concretely requires informed consent to analytics and targeted ads.
[^3]: Summed up in the first chapter of Marx' *Das Kapital* as "Sie wissen das nicht, aber sie tun es", commonly translated as "They do not know it, but they do it".
[^48]: Although not from a Marxist school of thought, these topics have also been explored by Walter Lippman in his seminal work *Public Opinion* (1922) and Edward Samuel Herman and Noam Chompsky's work on propaganda (in other words, an ideological form of communication to gain consent) in mass media, *Manufacturing Consent: The Political Economy of the Mass Media*, building on Gramsci and Althusser).
[^49]: Of semi-related note, this author is coincidentally the father of American politician Pete Buttigieg, a 2020 Democratic Party presidential candidate running on the platform as as the first openly LGBT+ presidential candidate.
[^50]: The very fact that I'm applying Marxist critical theory betrays my ideological bias, after all, and I therefore cannot claim objective neutrality.
[^51]: "In reality, it is a material political and ideological formation that has the function of managing the new mode of production of a transnational High-Tech Capitalism" [@rehmann_bernie_2016].
[^52]: These are concepts by the way that Althusser has also systematized as the *ideological state apparatus* and *repressive state apparatus*. 
[^53]: *55-nen taisei* (55年体制). An electoral system of Single Non-transferable Vote in which the Liberal Democratic Party (LDP) held political dominance over the Japan Socialist Party (JSP).
[^54]: In *The Japanese Economy*, @flath_japanese_2005 refers to the zaibatsu as "at best a kind of *petite bourgeoisie* [-@flath_japanese_2005, p.75]. @miwa_fable_2010 in polemic fashion dismisses the *Keiretsu* and *Zaibatsu* (industrial and financial business conglomerates) in its entirety as fictional scapegoats of "Marxist scholars in post-war Japan" and "populist journalists" [@miwa_fable_2010, p.52]. He further argues a historical growing demand for literature on Japanese economics and a lack of Japanese-literate Western economics who have resorted to accounts by academics from other disciplines, perpetuating conventional Japan-centric claims on *main bank systems* and *industrial policy* [@miwa_fable_2010, pp.54-57].



[^56]: On 26-07-2019 A *New York Times* article on this reddit sub-community, *The_Donald*, reports that after repeated incitement of violence aimed increasingly at police officers and public officials, the forum has now been "quarantined". This means that its content is no longer algorithmically featured on the front-page of the platform, that users have to log-in and specifically agree to enter this sub-community, and that no revenue will be generated through ads [@chokshi_reddit_2019]. Reportedly, both Donald Trump's campaign manager and social media manager visit The_Donald on a daily basis [@parscale_reddit_2016;@restuccia_get_2019] and Donald Trump himself reportedly gave a Q&A in the community as well [@robertson_donald_2016].
[^55]: Widespread social media platforms as Youtube, Facebook and Twitter are already making efforts to remove contents that is deemed hateful or contains "bigoted ideologies". Trump has criticized this move as being biased against conservative users[@stack_trump_2019;@roose_youtube_2019]
[^57]: Particularly on 4chan and 2channel are ambiguity and cynicism inherent elements of discourse, increasing the difficulty of a critical reading. A blatantly offense message could be masked as irony either as defense for actual offensive intent, or as a deadpan form of inter-textual parody. This phenomenon is referred to as Poe's Law.
[^58]: With social media, I refer to all online platforms used for computer-mediated communication in which a sense of community or interactivity can grow.
[^23]: Another interesting expression considering this very word is rooted in capitalist commodity fetishism.
[^60]: Tessa Morris-Suzuki is professor of Japanese History and frequent contributor to *The Asia-Pacific Journal: Japan Focus*. Her academic work focuses primarily on the topic of identity and politics in Japan.
[^61]: She ends with a cautious warning that, reminiscent of Karl Popper's *paradox of tolerance*, "democracy is left impoverished when freedom of hate speech is protected more zealously than freedom of reasoned political debate" @morris-suzuki_freedom_2013.
[^62]: In the wake of the arrest of several Zaitokukai-members, @nikkei_news__2013 published an article revealing his birth name to be Takada Makoto (高田誠). Due the wide spread of his pen name, I will continue to refer to him as Sakurai Makoto.
[^63]: For more information on the elements of this XML dump, see <https://glimmerphoenix.github.io/WikiDAT/pages/meta-history/>.
[^64]: This is a translation. For the methodology employed as well as the original, slightly more expanded list, I refer to section \ref{sec:wikiappendix} and **table \ref{tab:50expanded}** on page \pageref{tab:50expanded}.


[^65]: *This is not an evident division taking in that topics within pop-culture evidently possess political power as well. Korean ice-skater Kim Yuna for example is included in most top 50 sections, yet I've chosen to include her into the section politics based on the topic of contingency (controversies based on her Korean background and victory over the Japanese Asada Mao). As a general rule, the section pop-culture includes topics that have been heatedly discussed based not on politics but solely interest in the pop-culture (such as as One Piece and AKB48). The topic politics then includes for example topics as the Zaitokukai and Netto-Uyoku, but also the Asahi Shimbun and Japan.*


[^66]: As of 2019, the article with the highest rate of reverts in contrast to its rate of revisions is the topic of Japanese war crimes in Nanjing during the Second Sino-Japanese War. This paper follows the English designations as used by Wikipedia. *Nankin jiken* 南京事件 is therefore not translated as Nanjing Incident but as Nanjing Massacre instead.


[^45]: For the employed methodology I refer to section \ref{sec:wikirevision} (page \pageref{sec:wikirevision}).
[^67]: Available at <https://www.inf.uni-konstanz.de/exalgo/software/wikievent/>.
[^68]: See for example <https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q10183667130> and <https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q13171578898>. 
[^69]: The catchphrase used on that particular badge (「この利用者は2ちゃんねらーですが何か?」 *Kono riyōsha wa 2-chan nera ̄ desugananika?*) translates as a rhetorical question expressing indifference, "This user is a 2channel-user, so what?".
[^70]: The origin of the name is unclear but possibly refers to a poem. 花蝶風月 *kachō fūgetsu* is the title of a popular *vocaloid* composition *dōjin* album released on Comiket in 2017, and translates as "Beauty of Flowers and Butterflies" or "Blossoms and butterflies, the cool breeze and a bright moon". 雪月花 *setsu gekka* refers to an ancient Chinese poem (attributed to Bai Juyi) and is a common theme amongst ukiyo-e artists. It translates as "Snow, Moon and Flowers". 警部 *keibu* translates as "police force" and possible refers to the user's role as administrator or supervisor on Wikipedia.
[^71]: Going through the article on *Zaitokukai* in particular reveals a large portion of blocked accounts, including for example contributor *Asahara Shoko* 麻原彰晃, a reference to Aum Shinrikyo founder Asahara Shoko.
[^72]: Such as *'List of railway stations in Japan'* (*nihon no tetsudō-eki ichiran*, 日本の鉄道駅一覧), *'List of railway lines in Japan'* (*nihon no tetsudō rosen ichiran*, 日本の鉄道路線一覧), *'Tokyo Express Railway'* (*tōkyōkyūkōdentetsu*, 東京急行電鉄) and *'Japanese National Railway 113-series Trains'* (*kokutetsu 113-kei densha*, 国鉄113系電車). High interest in railways and trains (*tetsudō otaku* 鉄道オタク or *densha otaku* 電車オタク) is not an uncommon phenomenon.
[^73]: *'Christian glossary'* (*kirisutokyō yōgo ichiran* キリスト教用語一覧), *Catholicism* (*katorishizumu*, カトリシズム), *'Christianity'* (*kirisutokyō*, キリスト教), *'List of Gods'* (*kami no ichiran*, 神の一覧) and *'Religion'* (*shūkyō*, 宗教)
[^74]: *'China'* (*chūgoku*, 中国), *'Taiwan'* (台湾), *'List of Chinese Emperors'
* (*chūgoku teiō ichiran*, 中国帝王一覧)
[^75]: *'World War II'* (*dainijisekaitaisen*, 第二次世界大戦), *'Pacific War'* (*taiheiyōsensō*, 太平洋戦争), *'Japanese History'* (*nihon'norekishi*, 日本の歴史)
[^76]: Throughout this section, I will refer to Wikipedia users using single quotation marks (with additional *romanized* readings when required) and to translated Wikipedia articles using italics and single quotation marks, adding the romanized readings and original Japanese expression the first I refer to that article.
[^77]: An open-source tool-set building on the Wiki-media API, available at <https://www.mediawiki.org/wiki/XTools>.
[^78]: In particular the topics *'2channeler'* (*2-channerā*, 2ちゃんねらー), *'List of 2channel boards'* (*2-channeru no ita no ichiran*, 2ちゃんねるの板の一覧) and '*news bulletin (VIP) + board*' (*nyūsu sokuhō (VIP) + ita*, ニュース速報(VIP)+板).
[^79]: The user also expresses their love for cats (*kono riyōsha wa neko ga suki desu* 「この利用者は猫が好きです。」). This badge is possibly an inside-reference to the deceased 'Nekosuki600', a 2channel user who was amongst the earliest contributors to Wikipedia and claimed by user 'Kamakura' to be their role-model. <https://jawp2ch.miraheze.org/wiki/Nekosuki600>.
[^80]: *'Fuji Television'* (*Fuji terebijon*, フジテレビジョン), *'Nippon Television Broadcasting Network'* (*nihon terebi hōsōmō*, 日本テレビ放送網), *'TV TOKYO'* (*terebi tōkyō*, テレビ東京), Mainichi Broadcasting (*mainichi hōsō*, 毎日放送), *'Tokyo Broadcasting Holdings'* (*tōkyōhōsō hōrudingusu*, 東京放送ホールディングス), *'Japan Broadcasting Association'* (*nihon hōsō kyōkai*, 日本放送協会), *'Chubu Nippon Broadcasting'* (*chūbu nippon hōsō*, 中部日本放送), *'Nippon Broadcasting'* (*nippon hōsō*, ニッポン放送), *'Asahi Broadcasting Group Holdings'* (*asahihōsō gurūpu hōrudingusu* 朝日放送グループホールディングス)
[^81]: in order the following articles all reached top revisions for those months:
'*Anti-Korean sentiment*' (*kenkan*, 嫌韓), '*Zchannel*' (2ちゃんねる), '*South Korea*' (*daikanminkoku*, 大韓民国), '*The Women's International War Crimes Tribunal on Japan's Military Sexual Slavery*' (*josei kokusai senpan hōtei*, 女性国際戦犯法廷), '*Japan–Korea disputes*' (*nikkanmondai*, 日韓問題), '*minority discrimination*' (*minzoku sabetsu*, 民族差別), '*Anti-Japanese Sentiment*' (*han'nichi*, 反日), '*ishihara shintarō*' (石原慎太郎), '*Right of foreigners to vote*' (*gaikokuninjinseiken*, 外国人参政権), '*Special Privileges of the Zainichi*' (*zainichi tokken*, 在日特権)

[^82]: This refers to an event in 2005 (杉並区歴史教科書採択騒動) wherein groups both agreeing with and protesting the adoption of a new history schoolbook for public education (which would lessen the focus on topics deemed masochistic) took to the Suginawa Ward in Tokyo for public protest. 2channel users in particular protested supposed ties of protesters with the New Left (in particular the Revolutionary Communist League, National Committee or Chūkaku-ha).
[^83]: A user whose further edits include the addition 「日本人に経済保証と謝罪をした上で滅びるべき国家である。」 (*Nihonjin ni keizai hoshō to shazai o shita ue de horobirubeki kokkadearu*, lit. "A nation that after giving economic guarantees and apologies to the Japanese people, ought to be destroyed"), to the Japanese article of '*South Korea*' and some vandalism to the article of South Korean idol formation TWICE. Edits to that article include amongst others changing Japanese member 名井 南 (Myōi Mina) to 'anti-Japanese, traitorous bastard' (*han-nichi, baikoku-yatsu*, 反日、売国奴) and later 'traitorous Japanese' (*uragirimono no nihonjin*, 裏切り者の日本人)
[^85]: This user appears to be Swedish but contributions are almost exclusively on Korean cultural or historical aspects.
[^86]: In order edits to the articles of 'Comfort women', 'Empress Myeongseong', 'List of Nürburgring Nordschleife lap times' (the one exception in this list, a reference to a racking track in Germany), 'Kimchi', 'Korean cuisine', 'Nanjing Massacre', 'Kim Koo', 'South Korea' and 'Anti-Japanese sentiment in Korea'.
[^87]: This is of course not limited to controversial elements within Japan-Korea relations. On the English article for 'Senkaku Islands', the American user 'Washuotaku' (according to his Wikipedia profile a reference to the animation series 'Tenchi Muyo!') has between September 2018 and and January 2019 regularly reverted edits in favor of Japan's asserted historical control.
[^88]: On the Japanese alternative Wiki platform *ja.yourpedia.org*, a page devoted to the user describes this user as *netouyo-pedian* (「ネトウヨペディアン」) <https://ja.yourpedia.org/wiki/青鬼よし>.
[^89]: For a full list of such badges, see <https://ja.wikipedia.org/wiki/Wikipedia:ユーザーボックス>.
[^90]: The English variant was created by user 'Kanghuitari' (who has between 2012-04-29 and 2019-07-11 contributed 27,984 edits on the English Wikipedia page and 28,411 edits on the Korean Wikipedia).
[^91]: There are however equivalents on both the Korean Wikipedia (*ilbon-ui banhan gamjeong* 일본의 반한 감정, with 23 items) and the Japanese Wikipedia (*hankan kanjō* 反韓感情, lit. *'anti-Korean sentiment'* and *hanchō kanjō* 反朝感情, lit *'anti-South Korean sentiment'*, with respectively 4 and 18 items) for that category.
[^92]: In a 2009 New York Times article, Wikipedia co-founder Jimmy Wales claimed that 80% of Japanese Wikipedia articles were devoted to pop culture [@cohen_wikipedia_2009].
[^94]: Governmental instances in the United States use the software as content management system for internal information sharing (Diplopedia and Intellipedia), for example. WikiLeaks, famous for publishing various sensitive documents, was originally built on this software as well.

[^93]: Wikipedia co-founder Jimmy Wales founded Fandom, a for-profit variant of MediaWiki, specifically for in-depth pages on popular culture topics. 
[^95]: I have for example found numerous Japanese Wiki-style outlets solely on the topic of AKB48's idol formations, with <https://48pedia.org> (as of 12-07-2019) alone already containing 2,062 pages.
[^96]: Since 2016 Chiba Reiko did publish various works on the topic, such as the 2016 *"Sayonara payoku ― chibarei ga mita sayoku no jittai"* 『さよならパヨク ―チバレイが見た左翼の実態―』 (lit. "Farewell *Payoku*-The Actual Condition of the Left Wing As Seen by Chiba-Rei") and the collaboration with Zaitokukai-founder Makoto Sakurai 『くたばれパヨク』 (*"Drop dead payoku*"), as well as the 2017 *"mama ha aikoku"* 『ママは愛国』 ("*Mommy is a patriot*") with prolific right-wing author Kurayama Mitsuru and *"kanashī sayoku ni goyōshin!"* 『悲しいサヨクにご用心!』 (lit. "Beware of the sad left-wingers") with Kurayama Mitsuru and LDP lawmaker Mio Sugita.


[^97]: For more information, I refer to **table \ref{tab:50mostpopjp}**.
[^59]: The page was created on 2016-06-01 with the most recent revision made on 2019-07-17.
[^84]: Adachi Yasushi (a House of Representatives member and Deputy Secretary General of Japan Innovation Party) for example, tweeted on 11 Nov 2017 「朝日新聞、死ね。」 (*asahi shimbun shine*, lit. Asahi Shimbun, die.), which has since gained traction on Twitter with the hashtag "#朝日新聞死ね" [@adachi_eng._2017].

[^15]: Such as Mitsuhiro Takemura's メディア・エクスタシー (*media ekusutashī*, 'Media Ecstasy') and Kazuhiko Nishi's  『ASCII』 (*asukī*, アスキー) and its spin-off 『ログイン』 (*roguin*, LOGiN), although the latter gradually evolved into a solely gaming-centered magazine (the now famous Famitsu). Its founder, Nishi Kazuhiko is mostly known for his work on the Japanese desktop-computer PC-8001, and the development of the MSX in a joint project with Bill Gates.
[^25]: 8chan has been described as a more radical spin-off of 4chan. An anonymous post on 8chan linked to a live-stream of the Christchurch, New Zealand terror attack, suggesting that the perpetrator was active on 8chan [@brewster_after_2019]. Prior to the Poway synagogue terror attack, a user on 8chan signed their post with the name of the alleged shooter, and in similar fashion to the Christchurch perpetrator, posted a manifest referencing the white genocide conspiracy theory and Internet sub-culture elements [@collins_anti-semitic_2019; @stewart_8chan_2019].
[^31]: Take for example the suffix 「～ﾆﾀﾞ」 *nida* as a pejorative expression in imitating someone with an ethnic Korean background.
[^33]: In the wake of Yuna Kim's victory over the Japanese skater Mao Asada in the 2010 Winter Olympics, rumors were spread on 2channel over a supposed improper win [@cnn_korean_2010].
[^98]: A MediaWiki-based 2channel aggregation (*matome*) page, 2ちゃんねるウィキペディアスレまとめwiki (*2-channeru wikipedia sure matome wikki*, '2channel Wikipedia threat aggregation wiki') contains entries on various of the aforementioned Wikipedia editors. The entry on 'Chichiii' in particular states 「2008年からアカウントで参加。典型的なネトウヨであり、在日朝鮮人が何か事件を起こすと大喜びで加筆する」 (*2008-Nen kara akaunto de sanka. Tenkei-tekina netōyodeari, zainichichōsenjin ga nanika jiken o okosu to ōyorokobi de kahitsu suru*, 'Joined with an account in 2008. A typical netouyo, this user happily writes revisions whenever Zainichi Koreans have cause some kind of incident'). For more information, see <https://jawp2ch.miraheze.org/wiki/Chichiii>.
[^99]: Rumors of Takeshi Kitano having either anti-Korean sentiment or being ethnically Korean himself have been renewed in in 2018, after a South Korean idol reportedly came under fire for posting on *instagram* a gift received from the film-maker. The Korea Times erroneously reported 'anti-Korean Japanese filmmaker Kitano Takeshi' as having co-authored a book on the Senkaku Islands with Ishihara Shintaro in the early 2000s [@dong_ikon_2018]. This was echoed by British outlet Metro [@dong_ikon_2018].
[^100]: See for example <https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q10171294600>.
[^38]: In another interesting intersection, Hiroyuki Nishimura has since lost legal ownership of 2channel to the owner of the extreme right-wing 4chan spin-off *8chan*, Jim Watkins [@silverman_meet_2017], and in turn himself became owner of 4chan. He has since gone on to create an intended 2channel rival *2ch.sc*, which has attracted some of 2channel's former 'population'.
[^101]: @katayama_2-channel_2007 reported in 2017 2.7 million messages per day spread over 800 different categories. Whereas 2channel was in 2017, a decade after that report, still the \nth{18} most visited website in Japan [@poppe_digitaal_2017, p.15], in its current state as 5channel it is has since dropped to \nth{43} position.
[^102]: Which incidentally lies at the root of particular now 'mainstream' *net-slang*, such as the common usage of multiple letters 'w' as signifier of humor (the loose equivalent of the now rather outdated '*lol*', laughing out loud). As abbreviation of '(笑)' (*wara*, 'to laugh'), this *slang* saw its first usage on platforms that required Japanese to be written with the Latin script. 
[^103]: This is pejoratively known as *afikasu* アフィカス, a contraction of *afirieto* アフィリエイト and *kasu* カス, loosely translated as 'affiliate-tainted'. 
[^104]: A judicial decision ordered a compensation of 2 million yen in favor of the journalist, which was confirmed in a final decision on 11-12-2018 in her favor after an appeal by *hoshu sokuhō* to the highest court was won [@okamoto_eng:_2018].
[^105]: Council member and blogger Kotsubo Shinya (whose blog is located at the subtly-titled *samurai20.jp*) defended *hoshu sokuhō* with the argument that freedom of speech should be absolute [@furuta_eng:_2018].
[^1]: Various publications have been accredited to Tony Marano, including a book co-authored by Kent Gilbert (『素晴らしい国・日本に告ぐ！』 *Subarashī kuni ・ Nihon ni tsugu!*, lit. "Wonderful Country, I'll Inform japan!") and an article co-authored by Hyakuta Naoki (「朝日の慰安婦報道を断罪する！」 *Asahi no ianfu hōdō o danzai suru!*, lit. "We condemn the Asahi Comfort Women Report!"). The latter was published by the monthly magazine *WiLL*, whose regular contributors include *Toranomon News* hosts and regular guests Fujii Genki, Kent Gilbert, Seki Hei, Jōnen Tsukasa and Sakurai Yoshiko. It wouldn't be far-fetched to claim a pattern here. On his main English account 'PropagandaBuster' Tony Marano writes "In an attempt to counter political correctness from the news media, I will examine propaganda masquerading as truth in the America news media.  Also explore and expose the mental disorder of liberalism and political correctness infecting Hollywood, academia, and the re-education camps (public schools).  Unchecked far left liberals in the United States are the single cause for the rapid decline of this nation, we must counter their leftist, anti-American ideology on every level." A textbook example of neo-nationalism on the Internet.
[^106]: As the content is not explicitly, verbally classifiable as inciting hate or violence, the accounts of Takeda Tsuneyasu, Kazuya and Toranomon News have since been restored.
[^107]: In the context of *2channel*, *matsuri* 祭り refers to a large-scale online meeting with a particular ideological purpose, such as 'attacking' a self-perceived other. 