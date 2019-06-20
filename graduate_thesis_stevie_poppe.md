---
banner: "images/banner.png"
author: Stevie Poppe
title: Netto-Uyoku
subtitle: Rethinking Expressions of Nationalism in the Age of the Internet
year: 2018 - 2019
class: 
supervisor: Prof. dr. Dimitri Vanoverbeke
characters: undetermined
abstract: "Abstract."
bibliography: "bibtex/Master.bib"
csl: "bibtex/chicago-author-date-jap.csl"
geometry: "lmargin=3.25cm, rmargin=2.95cm, tmargin=3cm, bmargin=3cm"
fontsize: "10pt"
mainfont: "CMU Serif"
sansfont: "CMU Sans Serif"
CJKmainfont: "Kozuka Mincho Pro"
toc-depth: 3
lang: en
blfootnote: This paper was written in a mixture of Markdown and Latex. Its source code, as well as that of any used scripts, are available at <https://github.com/steviepoppe/graduate_thesis/>.
keywords: Netto-uyoku, netouyo, social media, Internet, alt-right, neo-nationalism, nationalism
link-citations: true
indent: true
header-includes:
    - \usepackage{setspace}
    - \linespread{1.50}
---

\rhead{ポッペ・スティーヴィー}
\lhead{日本における「ネット右翼」}

\section*{目次}
\addcontentsline{toc}{section}{目次}  
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

\section*{日本語要旨}
\addcontentsline{toc}{section}{日本語要旨}  
\setcounter{tocdepth}{1}

日本語要旨

\newpage

\section*{各章抄訳}
\addcontentsline{toc}{section}{各章抄訳}  
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

\newpage

\pagenumbering{arabic}

\rhead{Stevie Poppe}
\lhead{Netto-Uyoku}

\tableofcontents
\pagebreak


#Introduction

On August. 28, 2010 The New York times published an article titled "New Dissent in Japan Is Loudly Anti-Foreign", referring to a rise in politically motivated protest marches associated with a supposed Japanese "Net-Right". In it, Martin Fackler describes this "Net-Right" (hereinafter referred to by its Japanese term *Netto-Uyoku* ネット右翼)[^2] as "a new type of ultranationalist group ... a virtual community". He goes on to state that "while these groups remain a small if noisy fringe element here, they have won growing attention as an alarming side effect of Japan’s long economic and political decline" [@fackler_new_2010-1].[^1] A small fringe element that is nevertheless noisy enough to reach print press in the United States, in its most commonly applied form the term Netto-Uyoku applies to a loosely connected, decentralized group of Internet users disseminating a form of extreme right-wing discourse online and active primarily on social media platforms such as Twitter, the anonymous messaging board 2channel,[^12] and streaming services such as Youtube and Niconico Douga.

Far from benign expressions of free speech limited to shadowy corners of the Internet, consequences of such outings have however very much crossed digital boundaries and materialized in disquieting, at times even violent ways. As Fackler alluded to in his New York Times piece, the Netto-Uyoku are often name-called in the same breath as the neo-nationalist[^9] Action Conservative Movement (ACM), which includes such groups as Zaitokukai[^8] and Shukenkai[^7] [@higuchi_japans_2016;@gill_nativist_2018]. Furthermore, according to a 2016 investigation by the Japanese department of Justice, a total of 1152 protest marches, xenophobic in nature and associated with the ACM, were found to be held across Japan between the period April 2012 and September 2015 [@nikaido__2016]. Makoto Sakurai, founder of the Zaitokukai and one key figure in both the ACM and Netto-Uyoku movement, has been arrested for violence associated with such protest marches, stepping down as its leader in 2014. He did however remain a prolific political commentator online, going on to form the populist right-wing Japan First Party in 2016, holding their first convention in a hotel of the equally controversial Toshio Motoya owned APA Group.

\newpage

Nevertheless, nearly a decade after Fackler's publication in the New York Times, coverage of the Netto-Uyoku and related topics such as the ACM and Zaitokukai does remains relatively scarce.[^4] Moreover, whenever the topic does reach mainstream outlets, there appears to be a tendency of framing the Netto-Uyoku as little more than a fringe movement and side-effect of economical malaise with little real-life influence.[^5] This is in spite of the fact that, as shown above, actions associated with this movement have had real-life consequences, not the least including the 2016 adoption of an anti-discrimination law in order to curb hate speech. Additionally, a 2017 paper on political bots in Japan even went as far as to suggest a hidden nationalist agenda of Prime Minister Abe Shinzo tied to that of the Netto-Uyoku, and viewing them as a potential "enormous online support army of Abe’s agenda" [@schafer_japans_2017], something that the author of this paper too has previously alluded to.[^14]

It goes without saying that expressions of neo-nationalist sentiment taking place largely within the confines of social media and shaped by a distinct Internet discourse are by no means limited to Japanese territory. The outcome of the United States' 2016 presidential elections, the 2016 British Brexit-referendum and the rise of neo-nationalist (that is to say, right-wing populist) ideology amongst various European political campaigns can be seen as trends of greater global political struggles. When more closely examined it will then too come to no big surprise, considering the extent it has penetrated our daily lives, that the role of the Internet and social media was of no small importance in those outcomes. Backing the cult of personality of respective presidents Vladimir Putin, Recep Tayyip Erdoğan and Xi Jinping, for example, as well as the in 2016 elected president of the Philippines Rodrigo Duterte, are supposed "online troll armies". Deliberately and both on a voluntary or paid basis spreading disinformation and attacking self-perceived enemies of their respective presidents, these online troll armies have on multiple instances been accredited with manipulation of political discourse online in order to influence elections, including in more recent memory the 2016 presidential elections in the United States.[^3] 

Moreover, the Alt-Right (arguably the western counterparts to the Netto-Uyoku and associated primarily with the United States) have drawn much ire after a white nationalist terror attack in Charlottesville, Virginia during its Unite the Right rally,[^29] and again after little public disavowal by the President of the United States.[^24] In similar fashion and overlapping ideologically with the Alt-Right, we find associated foremost with (Western) Europe, Australia and New Zealand, the so-called Identitarian Movement. It should then be noted too that the perpetrator of the March 2019 terror attack in New Zealand sprinkled his manifesto with deeply ironic Internet culture rhetoric inherent to those movements.[^13] In Belgium, the mid-2019 elected politician Dries van Langenhove (aligned with populist far right party Vlaams Belang),[^31] acquired attention through his mimicry of rhetoric used by online-based far-right nationalist movements such as the Alt-Right on platforms as Facebook and gaming chat application Discord,[^25] as revealed in a 2018 documentary of notorious Identitarian youth movement Schild & Vrienden[^30].[^10] In France, the term *fachosphère* came to denote similar trends on the French Internet after Le Monde published a series of articles linking Marine Le Pen's populist far-right Front National, Online video-game community jeuxvideo.com and Internet trolls [@laurent_nordactu_2016;@audureau_les_2017].[^16] In South Korea, the populist far-right Liberty Korea Party (LKP) has been condemned for its usage of "online Internet trolls", its former chairman, presidential candidate and Youtuber Hong Joon-Pyo has seen comparisons to Donald Trump [@he-rim_firebrand_2018], and the online platform Ilbe Storage is described as hosting the South Korean equivalent of the Japanese Netto-Uyoku and promoting an neo-conservative agenda as well [@shim_hardcore_2015]. 

If the actions of those online movements had any measurable effect on the outcome of the elections is wholly debatable, but in light of the above information, it is at the very least sensible to claim the Internet as a medium plays an undeniable role, not just in the organization of neo-nationalist movements, but in shaping elements of its discourse as well; a narrative that is by the way increasingly amplified by numerous mainstream news outlets.[^26] Furthermore, Japan's international soft power has without a doubt left its mark on many of those communities abroad as well, seeping particularly into the Alt-Right and Identitarian Movement.[^32] As one article states, it is increasingly common to encounter images online of Japanese animation characters sporting political symbols ranging from neo-Nazi imagery to Trump-related iconography such as MAGA hats [@charity_why_2016]. The English-language anonymous messaging board 4chan in particular,[^17] currently owned by 2channel founder Hiroyuki Nishimura, was intended to be a North-American copy of its Japanese equivalent 2channel with a focus on discussing Japanese pop-culture, but came under heavy scrutiny in 2014 for its association with the Gamergate controversy[^18] and the Alt-Right. 

*/pol/* ("Politically Incorrect", the political discussion section of 4chan) for example, contains strong neo-nationalist rhetoric exemplary of the Alt-Right, and three seminal studies on this topic found the microcosmic Internet communities formed around political boards like "*/pol/*" (as well as "*r/The_Donald*" on Reddit)[^27] to be hubs for influencing mainstream political discourse and setting "the narrative agenda for mainstream media outlets" [@hine_kek_2016; @pearson_scientists_2016; @zannettou_web_2017; @zannettou_origins_2018]. Alt-right appropriated *viral* imagery ("*memes*")[^19] such as that of a green anthropomorphic frog ("Pepe the Frog") too find their roots in those communities, and have been shared in some form by members of the current White House, including Donald Trump and Donald Trump Jr. [@lee_understanding_2016; @ohlheiser_analysis_2016; @phillips_alt-right_2016]. Furthermore, former Donald Trump strategist and Breitbart News Network owner Steve Bannon was a speaker at the 2017 Japanese Conservative Political Action Conference (J-CPAC) and praised Prime Minister Shinzo Abe as being "Trump before Trump", while other Alt-Right and Identitarian Movement associates have praised Japan as being an exemplary ethno-state. Other such Alt-Right associates include for example the white supremacist athor Jared Taylor (who was born in Japan and speaks fluent Japanese), Richard Spencer (who coined the term "Alt-Right") and Vice Magazine co-founder and Proud Boys[^33] founder Gavin McInnes, who participated in a reenactment of the 1960 assassination of Japanese Socialist Party (JSP) chairman Inejiro Asanuma by ultra-nationalist Otoya Yamaguchi [@feuer_founder_2018].[^20] Journalist Audrea Lim, in her The New York times editorial, even goes so far to claim "yellow favor" (a sexual obsession with those of Asian descent) as a common trait amongst the Alt-Right, stating that many public figures in the movement have had documented relationships with Asian women [-@lim_opinion_2018].

Thus, to reiterate, an increase of mainstream news reports claim western online communities with an origin in discussing Japanese pop-culture to effectively be 1. hotbeds for right-wing radicalization, and 2. important electoral spaces for both right-wing populist political parties and for politically motivated citizen movements in the United States and Europe. Members of those movements have praised Japan as the ideal of an "ethnostate", and have themselves gained political traction outside the realm of the digital. While it goes beyond this paper's scope to hypothesize on reasons for the Alt-Right's arguable infatuation with Japan, it would, based on the context painted in this paper's introduction, at least like to suggest a necessity of researching such instances of online neo-nationalism and how to approach this supposed link with\nth{21} century populism and Internet communities. 

Existing literature has thus far viewed the Netto-Uyoku in a greater debate of (trans)national identity, discrimination and of questions to what qualifies as freedom of speech [@tsuji__2008;@yasuda_:_2013;@morris-suzuki_beyond_2015]. Yet this author feels there is sufficient place available to discuss and hypothesize on the socio-cultural background of the Netto-Uyoku, as well as on its ideology, demography and *modus operandi*. This paper intents to read the Netto-Uyoku not as a noisy fringe element of Japanese society, but as a movement with political agency, with an ability to mobilize both on and off-line, and the power to exert influence on public discourse. Furthermore, while media-utilization is a strong trait of democratic elections worldwide, this paper argues that a shift of what could be considered top-down, mediated media (such as newspapers, radio and television) to so-called unmediated, bottom-up new media on the Internet, brings about new strategies and challenges to the political play-field. That, even in a country that since its post-war history has on a national scale, for all its intricacies, been mostly monopolized by a single party, the Liberal Democratic Party (LDP).

Within the context of Internet and politics, academics and journalists alike have to various degrees debated and hypothesized on the contribution of the Internet to political polarization, on the Internet's utilization by political actors applying populist strategies, and on the media effects of the so-called 'new media' on its users regarding political awareness and opinion-forming (such as the effects of so-called echo chambers).[^15] Although deliberate misinformation ("fake news") is by no means a new trend either,[^11] this too has thrived due the Internet's widespread usage. The lack of moderation and the spontaneity of social network platforms facilitates the (conscious) spreading and sharing of false information (or information seen loose of its context), without reflection or without source control, and has potentially far-reaching political consequences. While this paper refrains from taking a hard technological determinist position towards the Internet (the implication being that the existence of the Internet as new medium would by itself be a lead cause for societal change),[^22] and treats the Netto-Uyoku in part as a symptom of deeper cultural malaise, it does suggest that by no means should the Internet be dismissed as merely a tool of communication that is itself shaped by societal changes; two takes that both have often been reported in respects to the Netto-Uyoku and other online-based neo-nationalist movements (**sources here**). There is a great amount of scholarship on the topic of media, ideology and politics and the debate on the extent to which media itself shapes (political) ideology will prove to be crucial in deepening our understanding of the Netto-Uyoku. 

The first chapter of this paper serves to lay a common theoretical groundwork on concepts as neo-nationalism, populism, and media, and conciliates particular models with corresponding research by Japanese peers. The author follows @taggart_populism_2000, @laclau_populist_2005 and @mudde_oxford_2013 in their definitions of populism as a model antagonizing a homogeneous elite in contrast to "the People's Will", a homogeneous group of "ordinary people", utilizing a "us versus them" dichotomy. It then further analyzes compatibility with a so-called "Japanese model of populism" (*nihongata popyurizumu* 日本型ポピュリズム) as described by Japanese scholars such as @otake__2003, @kimura__2006, Matsutani Mitsuru [-@matsutani__2009; -@matsutani_nihon-gata_2010], @yoshida__2011, and @kobori_populism_2013. This is important for defining our view of neo-nationalism as distinct from nationalist ideology through its application of the above-defined thin-centered populism, which the author will attempt to apply to such instances of right-wing movements on the Internet as the Alt-Right and the Netto-Uyoku.

Furthermore, as we have seen earlier, there has been a tendency of technological determinism in mainstream coverage on the topic of such online expressions, driving the argument that the Internet as a medium itself can be seen as a root cause of the neo-nationalism driving politics today. To analyze the credibility of those claims, and in an attempt to critically approach the Internet and politics, this chapter will draw on the works of media studies-pioneers Marshall McLuhan, Harrold Inis and Friedrich Kittler. Although rooted in technological determinism, McLuhan argued similarly to @azuma_ippan_2011, @tamura_niggling_2014 that the very nature of electronic media would shrink the world into a 'global village' and cause social change through increased social and political involvement and awareness. Precisely because of the general lack of gate-keepers and the dual role of the Internet-user as both consumer and producer does the the Internet as medium thus serve as perfect representation McLuhan's notion of 'global village'.[^21] This chapter will also draw from the works of @appadurai_modernity_1996, @anderson_imagined_2006 and social critics as Kitada Akihiro [-@kitada__2008;-@kitada_owaranai_2018] and @murai_net_2012.

Based on the framework put in place in the first chapter, the second chapter will first give a brief overview on the development of the Internet, both on a global scale and on its implementation in Japan. Second, in order to understand the distinct Netto-Uyoku discourse, it will in detail analyze the development of digital communities and online discourse on the Japanese Internet. While the Internet's transnational means of communication are of critical importance to \nth{21} century globalism, the Internet does not exist in a void and even its very creation is political in nature. When itself seen as a cultural artifact, the cultural background of regions as mainland China and Japan infer a different logistical implementation of the Internet when compared to the United States, giving rise to different expression of the Internet in daily life. For this part, the author will draw heavily from Japanese cultural critics as @azuma__2007; @azuma_ippan_2011 and @kitada__2008; @kitada_owaranai_2018, @kurahashi_:_2018, @matsuda_uwasa_2014, @__2017-1.

Finally, the third chapter offers a closer look on the Netto-Uyoku and suggest a new definition of Netto-Uyoku as a loosely connected group of neo-nationalists formed in post-bubble cynicism resentment, using primarily the Internet and discourses formed on Japanese social media to disseminate ideology. 

Concretely, this paper attempts to answer such questions as:

- What is the demography of the Netto-Uyoku movement?
- How should we define Netto-Uyoku ideology, if at all present in Netto-Uyoku rhetoric?
- how do Netto-Uyoku ideologically compare to the ultra-nationalist Uyoku Dantai?
- What processes do Netto-Uyoku employ to disseminate ideology?
- What are the dynamic processes of the media platforms Netto-Uyoku utilize?
- How do Netto-uyoku compare to other online-based neo-nationalist movements? Can we speak of a distinct Japanese character compared to contemporary movements, or should we view Netto-Uyoku primarily as part of a greater trend of Internet-fueled populist neo-nationalism? Secondly, is there a common reaction to, for example, the Alt-Right and Trump-era politics?
- How does the movement organize and mobilize, both online and in real life?
- Is there possible space for furthering a Netto-Uyoku political "agenda" through influencing its international counterparts?

To achieve this, the third chapter will first conduct a discourse analysis, contrasting discourse on communities associated with Netto-Uyoku (such as 2channel and Niconico) with more mainstream platforms such as Youtube an Twitter, where we draw the bulk of our dataset. For this purpose, this paper will heavily utilize methods from the Digital Humanities and Socio-Informatic domains. Using a sentiment and frequency analysis on those platforms concerning topics closely tied to common Netto-Uyoku rhetoric (such as that targeting ethnic Koreans and Chinese, mainstream media, and the Japanese Prime Minister) might, for example, reveal certain levels of seepage and normalization of far-right thought in the mainstream discourse. Next, this chapter will take a look at the networks surrounding the ACM and the call for mobilization online. The discourse analysis will use quantitative and qualitative methods using social networking platforms or forums as Twitter and 2channel to provide the bulk of its data. Additionally, a frequency analysis of both twitter data as newspapers might also prove a growing trend of right-wing terminology originated on the Internet reaching mainstream discourse. 

This chapter will draw on previous research concerning the Netto-Uyoku, such as that by @yasuda_netto_2012, @yasuda_:_2013, @yasuda_:_2019, @tsuji__2008, @schafer_japans_2017 and @ota_saraba_2019.

Finally, it should be mentioned that any research involving the Internet and social networks online is bound to have some limitations. In this case limitations involve liquidity of data, copyright laws pertaining acquiring data and lack of reliability due anonymity blocking full intent of the author. 

Btw add some more sources for newspaper articles claiming 4chan is deeply important to 2016 elections as proof of this narrative of online culture wars being influential on politics. Also add Fukuyama sources on identity. 

Is 4chan a source of right wing radicalization though? Or does it reflect larger social trends? Or is culture a feedback loop an combination of both? 4chan itself is more than /pol/ too, and in reality memes and online subcultures are just one part of a complex whole? Doesn't mean it shouldn't be talked about though

Reference the populist antagonization of "mainstream" biased 'fake news' and internet news as proper alternative.

\newpage


#Chapter 1: Media, Populism and Japan - Connecting the Dots

In these previous pages, I've suggested that the Netto-Uyoku adhere to an ideology of right-wing populist nationalism (which I'll further refer to as neo-nationalism). I've further suggested that media and this current wave of populism sweeping the world are intrinsically linked. Finally, we can from the very meaning of the Japanese term Netto-Uyoku (the "Internet Right") draw an implied importance of the Internet and social media. These loaded statements inevitably lead to several challenges. As it is, concepts as ideology, populism and nationalism (along with such terms as freedom and democracy) are due their over-inflation in the mainstream discourse at an increasing risk of becoming neigh reduced to trending political buzzwords; or to borrow from Laclau's [-@laclau_populist_2005, p.70] theorization of semiotics and political identity, empty signifiers. Secondly, without specifically defining these terms in a universal way applicable to a Japanese context as well (if at all possible), such loaded statements lead to the pitfall of judging an outside phenomenon by my own sets of values, rooted in my western upbringing. Populism in particular, as a relative new field of study in academia, deserves a closer look.

In the following pages I will provide a summary of 

The question remains if these concepts can be defined in a universally applicable way without losing their very meaning and thus again be reduced to empty signifiers? -> 'global village'

    “In general, never substitute the sign for the thing except when it is impossible for you to show the latter, for the sign absorbs the child’s attention and makes him forget the thing represented’” (Rousseau, 1979, p.170) (On The Social Contract)

##Ideology

What is ideology

Cherry picking facts and framing them as objective reality

Slavoj Žižek -  The Sublime Object of Ideology

##Discourse

Identity, Hegemony and Empty Signifiers

##Approaches to Populism

Open just about any article on Donald Trump, Bernie Sanders, Brexit, Viktor Orbán, Bolsenaro, The Five Star Party,  and the possibility is high any of them will have been name-called as a populist. Often used in a pejorative fashion, there is however little explanation if any at all offered in those takes, and with an unprecedented soar in the frequency of usage of this term in Western discourse, the term populist is increasingly used interchangeable or combined with demagoguery.[^28]


### Populism and Demagoguery

So how does this differ from the concept of demagoguery, if at all?

Linguistic difference

https://theamericanscholar.org/a-vacuum-at-the-center/

Origin of the word

The term populist, has for example, The term demagogue for example refers

Populism has increasingly come to denote right-wing populism.

The most commonly referred to framework, one which this paper will follow too, is that of Kaltwasser and Mudde.

ポピュリズムとは何か

https://www.theguardian.com/news/2019/jan/10/we-the-people-the-battle-to-define-populism

The usage of the term populism has without a doubt soared in popularity. 
Different takes on populism. What approach does this paper take: thin-centered model definition by mudde, taggart, Laclau

a homogenous 'People' (or 'heartland', as defined by Taggart), the antagonistic struggle with a homogeneous elitist 'Other', and finally the populist actor framing themselves as a defender of the 'People's Will'. Lacleau, building on Saussure and Levi-Strauss' socio-linguistic work, denotes these terms as 'empty signifiers': abstract symbols expressing universal ideas through different contexts until seen complete loose from any conceptual meaning. Whilst their theories describe populism as a "*thin-centered*" ideology, thus broadening the contextual scale of application, this chapter will first analyze compatibility with a so-called "Japanese model of populism" (*nihongata popyurizumu* 日本型ポピュリズム) as described by Japanese scholars such as @otake__2003, @kimura__2006, Matsutani Mitsuru [-@matsutani__2009; -@matsutani_nihon-gata_2010], @yoshida__2011, and @kobori_populism_2013. Their respective research typically begin with Koizumi Jun'ichiro's television play and utilization of so-called 'wide-shows' and his utilization of television as a starting point. Although this paper's scope is limited to 'new media' and expressions of a Japanese populism, we can recognize a more recent "new wave of populism" during the early '00s, a period in time during which political reforms saw a rise of populist actors as Ishihara Shintaro and Hashimoto Toru, as well as in more recent memory Koike Yuriko's successful election as Tokyo Governor in 2016 and the Netto-Uyoku backed Party for Japanese Kokoro (*Nippon no Kokoro* 日本のこころ). 

###Three Pointers: The People, the Elite, the Will

While the normative signifier of 'the People' or 'heartland' refers to the ideal of one people or one nation, thus generalizing a group to one homogeneous whole without taking into account pluralist differences in this group, in populist ideology the 'Other' usually denotes a moral antagonist in the form of a social or economic 'elite' (usually referred to as 'the establishment'), utilizing its socio-economic 'power' to oppress these 'People'. For politicians already considered part of 'the establishment', this element of socio-economic 'power' could turn out a beneficial way to, through populist measures, blame one's lack of political success on (for example by antagonizing their banking world, or mainstream media and its press-members). Aside from the Other as an Elite, the 'new wave of right-wing populism' spreading across the world has strong tendencies of antagonizing the Other on basis of ethnic heritage: ranging from xenophobic rhetoric aimed at Muslim communities through West-Europe and the United States, to that aimed at Korean diaspora present in Japan. Finally, the 'People's Will', based on Rousseau's 'General Will' concept of direct democracy (rather than representative democracy) with a nation's people directly responsible for political decision making, takes a nativist turn as a populist trait, tilting towards authoritarianism by assuming a group's homogeneousness (Abts en Rummens 2007, 408–9). It remains important however to keep in mind that these trends of populism should not just be judged as purely anti-democratic, but just as well as a democratic corrective measure indicates groups in society who feel insufficiently represented.

Resentment of elites: politics of resentment

Identity: The Demand for Dignity and the Politics of Resentment

The public: Ciccariello-Maher: "Building the Commune", Chomsky: Manufacturing Consent
Mudde, "The Populist Zeitgeist", Moffit, "The Global Rise of Populism"

Moral grouping, not descriptive: the good vs the bad

Steve Bannon as populist


###Populism as self-correcting democracy?

ポピュリズムとは何か for example proposes populism as a form of self-correcting democracy, rebalancing an unfavorely tilted political system to account with disenchanted masses.

Jan Werner Muller, author of What is Populism, offers a counter-argument, analyzing patterns of authoritarian governance in regions were populists have gained sufficient political power.

One danger for democracy is the attack of 

Note that this fictional account of the People is by large a construct on the populist's terms. In other words, it is the populist that defines who belongs to this notion of the People and who should be excluded. This pattern simplifies matters: 

A zero-sum game; if one is 反日, regardless of ones Japanese passport, one cannot possibly represent the best interest of the *real* Japanese people.

The continuous antagonizing of established pillars of democracy such as public media, 

###Supply and Demand: Media as supply-side factor

###Japanese model of populism (*Nihon-gata Popyurizumu* 日本型ポピュリズム)

(Otake Hideo, Kimura Masato, Matsutani Mitsuru, Yoshida Tori, Kobori Masahiro)

Populist Sentiment in Japan’s 2017 General Election: Evidence from Social Media

##What is Neo-Nationalism?

In an interview with Cas Mudde, Mudde describes he ideology of the radial right as including "three features: nativism, authoritarianism, and populism." The previous pages have offered an extensive take on populism, ultimately residing with Mudde's 

https://www.vox.com/2016/5/31/11722994/european-far-right-cas-mudde

Although this author finds some irony in an increasingly globalist nationalism adhering to anti-globalist ideologies.

###Nativism

###Authoritarianism

##Media

Antonio Gramsci: "s a hegemonic culture using ideology rather than violence, economic force, or coercion. Hegemonic culture propagates its own values and norms so that they become the "common sense" values of all and thus maintain the status quo. Hegemonic power is therefore used to maintain consent to the capitalist order, rather than coercive power using force to maintain order. This cultural hegemony is produced and reproduced by the dominant class through the institutions that form the superstructure."

###Is the Medium the Message?

###Internet, a new 'global' village?

##Politicized digital spaces: Internet as harborer of democracy?

P371 Susan J Pharr Media and Politics in Japan

ARGUMENT dat media door informal decision making niet plural wordt, tov internet

As Pharr points out, however, when academic research on politics
has not ignored the media completely, it has tended to minimize the
media’s power to affect the polities in which we live. As several of the
authors in this volume indicate, the “minimal effects” model of
media such as television has been particularly dominant in the study
of American politics; little evidence has been offered of the media’s
ability to change citizens’ basic political attitudes and beliefs, and


Despite some cultural lag, there are now many theoretical options to approaching the Internet, new media, and politics. In an early stage, Rimmer and Morris-Suzuki (1999), following sociologists Kumon Shumpei and Masuda Yoneji's writings on a 'teledemocracy', take an utopian view and predicted the Internet would serve democracy by fundamentally altering its users thinking patterns and leading to a power-shift away from mass-media. Recent debate on the Internet's role in populist politics in East-Asia (Youngmi Kim 2009, Azuma Hiroki 2011, Tamura en Kobayashi 2014) have instead taken a distinct dystopian turn, employing such terms as 'the People's Will 2.0', and again arguing that due the very nature of computer-mediated communication and social media, with traits such as anonymity, filter-bubbles and so-called 'echo-chambers', the individual 'will' has been reduced to a general 'will' led by emotion rather than rationality. Thus, following this logic, Internet as an open medium for communication would become an invaluable tool for political leaders utilizing a populist narrative.


Neo-nationalism https://www.politico.com/magazine/story/2016/06/nationalism-donald-trump-boris-johnson-brexit-foreign-policy-xenophobia-isolationism-213995


Late Capitalism: Habermas, Adorno, Frederic Jameson, Kojeve (Hegel), Francis Fukuyama

Lyotard and Wittgenstein: metanarratives, narratology and communication

Foucault etc: poststructuralism: avoid viewing in dichotomies (new and old media: underlying structures are subject to bias and misinterpretation)
Postmodernity: obsession with history, collective memory and unease with colonial history
culture of memory
Role of internet in musealising of the world
memory narrative

. The term Erlebnisgesellschaft, literally “society of experience,” 

appadurai imagined nostalgia

imagined memory

amnesia a byproduct of cyberspace
McLuhan: medium message: internet as carrier of new history memory narrative

    "Our discontents rather flow from informational and perceptual overload combined with a cultural acceleration neither our psyche nor our senses are that well equipped to handle. The faster we are pushed into a global future that does not inspire confidence, the stronger we feel the desire to slow down, the more we turn to memory for comfort. But what comfort from memories of the twentieth century?!?"

## Media Theory

USE MATSUDA HERE FOR SOURCES ON MEDIA USAGE IN JAPAN




While the Toronto School of communication theory has some detractors due its reliance on dichotomies, its members Harrold Innis (of "The Bias of Communication") and Mcluhan argue that the invention of print-media led to both a horizontal (regional) and vertical (chronological) continuity and structures redefining our cognitive senses, bringing about a literate 'space-biased' culture rather than an oral 'time-biased' one, and thus a heightened sense of individualism, capitalism and nationalism.[^23] With his idea of a 'global village', McLuhan however hypothesized that a shift towards electronic media, referring at the time primarily to radio and television, would again shift society. This time from a literate culture to a 'post-literate' visual culture that stimulates all senses and transcends time and space, thus leading individualism to a collective, homogeneous identity, in which the lack of a physical body or physical cues creates a different relation to oneself and one's surroundings. (McLuhan, 1962, p. 156, McLuhan 1967:63). Amongst other important early scholars within Media Studies stands Friedrich Kittler, generally associated with the German media theory school. Unlike McLuhan, who argues media as an extension of human senses, Kittler approaches media through his New Materialism theory and his concept of 'discourse networks', applying Foucoult's concept of power and archeology of knowledge in function of media, to allows media its own agency.

These ideas also fits well political scientist Benedict Anderson's notion of Imagined Communities, coined during his research on nationalism and the rise of nation-states. Anderson suggests that nations are not communities in a strict sense, but 'imagined' communities at best, implying that the sense of kinship felt between its members is but a social construct based on mutual experiences evolved from print capitalism and the rise of mass-media, and thus develop both a sense of imagined sameness, as well as clearly defined paradigm of 'otherness'. In a similar sense, social media on the Internet creates a perceived sense of affinity between its members and the social and interpersonal change of this 'global village', or 'imagined cyber-community' can be argued to transcends that of it's nation. In similar fashion, anthropologist @appadurai_modernity_1996 too already argued early on that the rise of the Internet as a new 'mediascape' would lead to the creation of new, transnational and asynchronous imagined communities, based on ideology rather than on national narratives, and diverting from traditional mass-media. Murai Shusuke (-@murai_net_2012, 375–76) argues however the opposite; precisely due Japanese Internet-users' monolingualism, not withstanding full global access through the Internet, any possibility of trans-nationality is severely limited. Within the anonymity of on-line bulletin boards such as 2channel, social markers remain thus primarily defined by language and nation-based ideology. (Naoki Sakai here?) @sakai_translation_1997


    Ideologies are present in politics in many ways. More concretely, I shall look for three specific ideological traits in this thesis. First, political actors construct and act upon images of friends and enemies – normative images of themselves as the right electoral choice in comparison to their enemies, which may be concrete (political competitors) or more abstract phenomena (e.g. capitalism, globalization). Certainly, such images need also explanations of why the cause of the protagonist is more important than other causes.


Edward Said:

The alternative to an exclusionary representational system for Said would be one that is “participatory and collaborative, non-coercive, rather than imposed”, yet he recognised the extreme difficulty involved in bringing about such an alternative.[14] Difficult because advances in the “electronic transfer of images” is increasing media concentration in the hands of powerful, transnational conglomerates.[

Dus: internet onder amazon, google, etc, strengthens orientalism

Furthermore, within the field of social psychology Eun-Ju Lee applies a social identity approach (focusing on deindividuation and group polarization on the internet) and argues that the lack of social signals 


## Conclusion

\newpage

\epigraph{I sometimes suspect that we're seeing something in the Internet as significant as the birth of cities. It's something that profound and with that sort of infinite possibilities. It's really something new; it's a new kind of civilization. \\ --- \fauxsc{William Gibson}\small\textup{, 1995}}

# Chapter 2: The Japanese Internet - A Digital Love Story

https://www.fastcompany.com/3061574/the-new-nationalism-of-brexit-and-trump-is-a-product-of-the-digital-age

To what level is freedom of speech protected (on the internet) in Japan?

Iets over postmodernisme: animalization of Japanese society -> otaku subcultures and consumption of simulacrum.

物語消費論 Narrative Consumption Theory Eiji Ōtsuka

https://neojaponisme.com/2011/05/06/structure-and-power-1983/

    This also reminds me of when Derrida came to Japan in 1984 and did a talk with the leading ’80s postmodernists Asada Akira and Karatani Kojin. Karatani said something to the extent that deconstruction was “impossible” in Japan since Buddhist-influenced Japanese thought is already basically “deconstructed.”

    Derrida politely disagreed:

    “I wonder if deconstruction is truly so easy in Japan. I have my doubts about whether we can say that deconstruction is a direct element in Japanese-type thought. Certainly, Japanese often say that Buddhist thought or the Zen of Dogen was already a kind of deconstruction, but I wonder if that is so. If that were really so, then why, for example, has Asada’s book [Structure and Power] received such tremendous attention? If that phenomenon of Asada were nothing more than a repetition of deconstructive elements already found within Japanese thought, then it shouldn’t have called down such an enormous response in contemporary Japan.”


## Media-usage: some statistics

As Neil Postman states, new technology offers a new mode of discourse.

Internet's impact on the many layers of the users' personality

Also https://www.buzzfeednews.com/article/ryanhatesthis/the-far-right-weeb-army

    The level of cultural power held by a digital army of radicalized, disaffected young men hasn’t gone ignored by Prime Minister Abe’s increasingly conservative administration. The Daily Beast revealed last year that Abe is a registered member of an organization called the Nippon Kaigi, or “Japan Conference.” It’s a 38,000-member religious group that believes in extremely conservative ideas — things like the racial superiority of Japanese people, the repeal of equal rights for women, a return to an absolute monarchy, and severe restrictions of freedom of speech.

    By some accounts, the Nippon Kaigi have been pretty successful, especially when it comes to free speech. Between 2015 and 2016, Japan slipped from 61st to 72nd in a global ranking of press freedom conducted by Reporters Without Borders. In February of 2016, Japan’s top TV journalists described the Abe administration’s treatment of free speech as “tantamount to a war between the political power and the media.”

    The Abe government curtails free speech, especially in the media, through strict copyright laws, libel laws, political impartiality regulations for broadcasters, and the Specially Designated Secrets Act, which allows the government to jail journalists for up to five years for working with whistleblowers.

    But Abe's administration has a new trick. Japan’s public broadcaster, NHK, revealed in 2016 that the administration is using taxpayer money to pay a firm to pose as internet trolls. The firm monitors places like 2channel, Twitter, and Facebook, and uses dummy accounts to fight with people who are critical of Abe’s Liberal Democratic Party. The firm regularly reports posts as slander, forcing tech companies to delete them. Everything being monitored is then put in a report that’s distributed to Abe’s cabinet daily.



## Narratives on the Internet and the World Wide Web

it was in 1989, a year forever etched in our cultural collective memories among other due the opening of the Berlin Wall, the Tiananmen Square protests in China and the beginning of the Heisei period in Japan, that we too saw the development of the World Wide Web, and the first Internet connections in Japan.
    
 we witness was a year of 

Internet as expression of post-modernism?

https://en.wikipedia.org/wiki/Digital_rhetoric

What the Dormouse Said: How the Sixties Counterculture Shaped the Personal Computer Industry, 

    It’s easy to mistake the beta rebellion for a youthful, but otherwise undifferentiated, variation on the bad old tradition of patriarchy. Yet the phenomenon bears the unmistakable signs of a new, net-bred brand of misogyny. It exists squarely within the libertarian ethos that infused computer cultures spanning from the early, back-to-the-land, frontier hacker culture of the sixties and seventies to the Californian rebel capitalism of the dotcom neoliberalism of the nineties.

    As the same frontier sensibility that characterized early Internet culture also runs through American gun culture, it’s no great surprise that the rites of gun worship and principled geek isolation should overlap—or that they should find expression in the targeting of women whom beta men believe are dedicated to a matriarchal thwarting of male freedom and desire. But this seamless convergence of women-demonizing forces is, indeed, something new under the sun, an innovative incarnation of the free-floating male grievance that, as we’ve seen, metastasizes through culture. It’s striking, then, to note just how thoroughly both the press and the social media–centric feminist commentariat have consigned the beta rebellion to the dustbin of outmoded patriarchy—treating it as an obsolescing bug, as opposed to a distressing feature, of today’s Internet discourse.

    In her 2013 book Cybersexism, feminist journalist Laurie Penny admits that the culture of digital woman-hating does indeed have a surface affinity with geek culture, but then goes on to suggest that online misogyny is a conservative remnant of the pre-Internet past. “We have a brave new world which looks far too much like the cruel old world” and “recreates offline prejudices,” she writes.

    Academics have echoed this view, characterizing online misogyny as the politics of conservatism and patriarchy reproducing itself anachronistically in new media, or as just another emanation of hegemonic masculinity. For example, in a study of gender and age bias in online communities, Jonathan Warren, Sharon Stoerger, and Ken Kelley wrote that “many age-old forms of discrimination appear to have been preserved.” Pamela Turton-Turner analyzed “recent online hate campaigns mobilized against females,” which, she argues, are “symptomatic of a broader normalization of old-style sexism.” Adrienne Shaw agreed in an article titled “The Internet Is Full of Jerks Because the World Is Full of Jerks,” stating that “misogyny, racism, homophobia, etc. were not invented by the internet.”

    https://thebaffler.com/salvos/new-man-4chan-nagle

Technologically: "“The crucial thing is the URL. The crucial thing is that you can link to anything." - Tim-berners Lee

## Development of the Internet in Japan

    the philosopher Slavoj Zizek noted after Sanders lost the primaries, left and right are in some sense outdated ideas. The new division in politics is those who favor the current global hegemony and those who are against it. Like the Hollywood heroes, right and left have been competing to become this new radical anti-status quo party. And so far, in both Europe and America, the right has won, implying that, as Arendt predicted, the powerlessness created by bourgeoisie systems of capitalist exploitation might once again implode into far right totalitarianism.

## Early Cyber-communities (90's - 00's)

### Garakei

### 2chan

http://echo-news.net/en/ldp-sponsored-and-benefited-by-underground-anonymous-2channel-board

    The ニュース速報（嫌儲）community left for Reddit when 2ch changed their API to force all users to browse the site using an adware-ridden custom browser, which also collected personal information of users. However, I think many of them got bored with Reddit and went back to their own Kenmou-affiliated sites (besides the main board on 2ch, I think there are also Livedoor and mixi communities).

    But the split between the Kenmou community and the rest of 2ch goes back much further. About 10 years ago, matome (affiliate) bloggers began collating threads from News4VIP or ニュース速報（VIP）(similar to /b/, it was originally a place for spam and overall terrible threads but metamorphosed into a generalized chit-chat board about random topics). Average Japanese internet users could find out about net gossip without having to steep themselves in 2ch's unique culture (in 4chan terms: "lurk before you post").

    Because of the kind of users that News4VIPs attracted by virtue of its origins, the anonymity and captive audience inherent in large bulletin boards (GIFT, Japan-style) that allowed users to be 100% honne and abandon tatemae, as well as the culturally-ingrained racism against Chinese and Korean people in Japan, these matome blogs featured a lot of anti-Korean, anti-Zainichi vitriol spewed by VIPpers.

    As these blogs became popular, they became a vehicle for netuyo to advance far right wing causes on the Japanese internet. Furthermore, as their popularity increased, view-count ad money started becoming important, and to get more eyeballs on their posts, matome bloggers engaged in yellow journalism: they sensationalized 2ch posts, posted fake news, and practiced stealth marketing. So now there was a situation where matome bloggers were spreading netuyo crap for profit.

    This incensed the countable-on-one-hand number of left wingers on 2ch to such an extent that the staff gave them their own breaking news board, ニュース速報（嫌儲）, separate from VIPpers. This is where the term kenmou (嫌儲) comes from; it refers opposed to people opposed to the matome. 嫌 means "unpleasant" or "offensive" and 儲 is an uncommon Sino-Japanese character* that means "a store [or reserve] of saved money". In this case, it refers to the ad money accrued by matome bloggers using unscrupulous strategies such as yellow journalism. Why the character 儲 was used, and from where the reading of もう came, I have no idea.

    I've heard whispers that the kenmou community also disliked how the right wing ステマ from the matome blogs was spreading to the anime industry. Though I'm not 100% sure.

    https://ja.wikipedia.org/wiki/%E5%AB%8C%E5%84%B2

    As an aside, 2ch is related to Dwango, which runs a popular video sharing site, and is very, very friendly with the center-right LDP; a nephew of former PM Taro Aso is on its board of directors (and that of Kadokawa, a prolific licensor of novels and manga). Ever wonder why the '政治' category on the latter website is the Japanese equivalent of Breitbart? Now you know.

### Matome-blogs

### Niconico

http://echo-news.net/en/japans-nico-video-recklessly-collects-big-data-and-brain-wash-you


https://features.japantimes.co.jp/heisei-moments-part-3-introspection/


## Recent trends ('10s)

Globalisation of the Internet

subcultural self-identification

### Twitter

### Youtube

Reference Nobita as influential racist youtuber btw and also Black Pigeon Speaks as youtube influencer who operated the travel channel TVShinjuku, hosting discussion with Nobita and Yoko Mada (pictured with Steven Bannon)

(also kind of ironic that anti-globalism is a common ideology )
https://hopenothate.com/2018/04/20/japan-and-the-alternative-right/

### Instagram

## Fake news (デマ)

-> Manufacturing conspiracy theories: (see shaun)

@matsuda_uwasa_2014

It is not a coincidence that the commonly used Japanese term for what "fake news", *dema* (デマ), sounds eerily similar; it is after all an abbreviation of the Japanese translation for demagogy (デマゴギー).

https://dic.nicovideo.jp/a/%E3%83%87%E3%83%9E

Whole books could be (and already have been) written on the topic of Fake News. Often used in combination with the in 2016 elected word of the year "post-truth politics"

(coming to peace with idea that politicians lie)
 Fake news as a global 

## 不適切投稿

\newpage



# Chapter 3: Netto-Uyoku - Expressions of Nationalism in the Age of the Internet

Netto Uyoku and much of the Japanese 2ch subculture is also tied to the disaffected and materially and socially challenged. It has slightly more history than the other movements abroad because they are borne out of the lost two decades, while many others are indirect results of the 2008 financial crisis.

https://www.researchgate.net/publication/296688263_Subculture_as_social_knowledge_a_hopeful_reading_of_otaku_culture crucial source

https://www.buzzfeednews.com/article/ryanhatesthis/the-far-right-weeb-army also crucial


## Political ties

https://matome.naver.jp/odai/2144299876931181001

### Legislation

### LDP's Second Fall: the 2009 Elections

### 3/11 and Internet Backlash

### local elections and internet support

https://www.upi.com/Top_News/World-News/2018/04/15/South-Koreas-ruling-party-members-hit-with-online-comment-rigging-allegations/9571523771907/

http://blog.castac.org/2017/05/alt-right-japan-1/



Gerald L. Curtis


This could be seen through the actions of right-wing populist Zaitokukai founder Makoto Sakurai mobilizing followers for real-live demonstrations against the presence of Zainichi Koreans, but also through those of Prime Minister Shinzo Abe broadcasting his December 2012 speech in front of Akihabara (already a very deliberate choice of location) on popular video platform Niconico.

https://en.wikipedia.org/wiki/Creeping_normality

##History

To demonstrate the reach the Netto-Uyoku have had, this paper's introduction briefly touched upon an English-language print article in The New York Times. It goes without saying the term has been in use since a much earlier date. The first English-language mention in mainstream media can be traced back to March. 14, 2006, when Journalist Eric Johnston wrote a piece for The Japan Times on right-wing nationalism and the Internet in Japan, "Net boards venue for faceless rightists". In his piece, Johnston associates these "faceless rightists" (who he further refers to as "Net Uyoku") with the anonymous Internet forum 2Channel, online video platform Channel Sakura and the conservative political organization Nippon Kaigi [@johnston_net_2006]. In Japan, the term first reached print press in a 2005 Mainichi Shimbun article by @sasaki__2005, a journalist with a lengthy publishing record on Japanese Internet discourse.


methods of attacking

https://www.quora.com/How-do-the-Japanese-netouyo-compare-to-the-Western-alt-right

##Definition

##Ideology

###kenkan sentiment

"Go to youtube and search "韓国人" (Korean) , you will see what is farther than "hard right wing".

many viral blogs started making money by copying and pasting 2ch. They extract only nationalist posts because it makes their blogs more controversial and lucrative. and it began affecting not only internet users, but also general people.

白豚は帰ってください。
2：名無しさん：2016/12/06(火)13:49:00 ID:swqV+RPb

不潔毛唐によろしくお願いします。


Anti-Korean discourse: Manga Kenkanryu, 

Projecting an anti-Japanese (hannichi) narrative on the Korean other; 
Nativism

This paper would like to suggest a new definition of netto-uyo as a loosely connected group of neo-nationalists expressing post-bubble ressentiment using primarily the Internet and discourses formed on Japanese social media to disseminate ideology. This paper further suggests that 

If this paper were to take a technological determinist view, it would suggest that the medium of Internet itself is a main catalyst for forming the backbone of a supposed netto-uyo ideology. Its antithesis would take place in social determinism: 
What's left is but to suggest

radicalizing effect: through the rabbit hole with memes
forming communities around loneliness (see zaitokukai book)

ressentiment as driver for populist politics

“slave morality”, marked by nationalism, xenophobia and fragmentation -> Nietzsche

This paper attempts an explanation of netto-uyo relying strongly on critical theory.

As pointed out later in this chapter, there is a clear contrast in ideology between what could be referred to as the Old Right and what we refer to as the Net Right; due the loose nature of the netto-uyoku as a community, it is rightfully difficult to speak of any ideology at all. I would like to suggest a typology 

Internalizing world-views constructed on the internet? social constructionism: imagined worlds

https://web.resist.ca/~katemilberry/wordpress/?page_id=32

 hypothesizes that this loosely connected group of right-wing leaning activists referred to as netto-uyo disseminate ideology 

To understand how 

Disseminating ideology using the internet: how

##ACM

(exhaustive list as appendix)

###Zaitokukai

https://en.wikipedia.org/wiki/Tomomi_Inada

###Shukenkai

##Network

(exhaustive list as appendix)

###Sakurai Makoto

Claiming in 2017 to have received an invitation to speak at an event by self-proclaimed UK Alt-Right organization London Forum <https://ameblo.jp/doronpa01/day-20170730.html>, although canceling the event due a lack of further information on the event (insinuating the reason for this lack of information might be fear of terror attacks) <https://ameblo.jp/doronpa01/entry-12310380583.html> [@childs_neo-nazi_2018].

https://ja.wikipedia.org/wiki/%E6%A1%9C%E4%BA%95%E8%AA%A0_(%E6%B4%BB%E5%8B%95%E5%AE%B6)

##Hatespeech

http://hangul.shoutwiki.com/wiki/%E3%83%A1%E3%82%A4%E3%83%B3%E3%83%9A%E3%83%BC%E3%82%B8

##「ネトウヨ春のBAN（バン）祭り」

https://ja.wikipedia.org/wiki/%E5%B7%AE%E5%88%A5%E5%8B%95%E7%94%BB%E5%A4%A7%E9%87%8F%E9%80%9A%E5%A0%B1%E9%A8%92%E5%8B%95

https://ja.wikipedia.org/wiki/%E6%87%B2%E6%88%92%E8%AB%8B%E6%B1%82#%E7%89%B9%E5%AE%9A%E3%81%AE%E5%BC%81%E8%AD%B7%E5%A3%AB%E3%81%B8%E3%81%AE%E5%A4%A7%E9%87%8F%E6%87%B2%E6%88%92%E8%AB%8B%E6%B1%82

##Political affiliations

Typology

###Party for Japanese Kokoro

###LDP

Tomomi Inada posing with Neo-Nazi Yamada Kazunari

Taro Aso: hitler's motives were right

https://thediplomat.com/2018/06/why-steve-bannon-admires-japan/

    Since 2012, Abe’s governments have been pushing policies that are still only on the agenda of many populists. Take the attacks on the media, for example. When Abe was appointed prime minister in 2012, he posted on Facebook that “my war with the mass media has started. I will fight my way through it together with your support.” Further, his government passed the State Secrecy Laws, one effect of which is to restrict the media’s news gathering capacity. Momii Katsuto, the former head of NHK, the public broadcaster, and a close friend of Abe, caused a stir when he said that NHK “should not deviate from the government’s position in its reporting.”


###Japan First Party

###Populist support

http://hangul.shoutwiki.com/wiki/%E5%AE%89%E5%80%8D%E6%99%8B%E4%B8%89

##Discourses of Netto-Uyoku

##Netouyo

##Politically

Dogwhistling? Abe niconico / akihabara
Current anti-hate speech statement?

##Uyoku-Dantai

https://www.japantimes.co.jp/news/2019/01/05/national/media-national/internet-rightists-strategy-provocation-gaining-traction-japan/

##Counter-movements

###Antifa

###C.R.A.C.


##Internet:

Echo chambers

Algorithms

Fake news

While this paper will touch upon 

Polarization



Neto uyo as an expression of post modernism:

Theoretically, this 


 "The web centipede: understanding how web communities influence each other through the lens of mainstream and alternative news sources". 

 ""We are past being a literate culture and are now a visual culture," said "
 "Through the power of Trump, a bunch of people with anime avatars have attained far more influence."

 California-based psychologist Sandy Peace, who emphasizes the value of connectedness in her practice, attributes much of this anger to alienation and anomie. "The roots of trolling behavior, particularly among young men, are complicated, but I lay much of the blame on the internet and how it stymies interaction with real people and prevents the development of real feelings," she said. "The less connected you are, the less you have to lose, which makes it far easier to say shocking or hurtful things. Just like Trump: he doesn't care about whose feelings he hurts so long as he makes his point."


 To assert that alt-right shitposters were a deciding factor in Trump's victory risks minimizing the broader cultural, societal, and media trends that influenced their influence


 Alt-Right: From 4chan to the White House

Molly Sauter, another researcher at the Berkman Klein Center and author of The Coming Swarm, a book about hacker culture and hacktivism, correctly noted that to really get a meme, you have to be versed in layers upon layers of irony and in-group thinking, and therefore even memes that seem inoffensive to casual meme tourists might be problematic.


##Methodology

https://www.washingtonpost.com/news/the-intersect/wp/2016/09/26/these-charts-show-exactly-how-racist-and-radical-the-alt-right-has-gotten-this-year/?utm_term=.facc33794330 this one's important too

Python: random sample of politics debate on 2chan, twitter, youtube comments, sentiment analysis using own defined dictionary? for data corpus

dictionary of terms to associate with populist ideologies to then compare with tweets: (eg nihonjin, kokumin, zainichi, gaijin, imin, hannichi, elite, media, uyoku, payoku, etc)
4chan-ICWSM2017.pdf gebruiken

2chan posts zoeken met referentie naar 韓国
zelfde voor twitter
Hoe verschilt frequentie analysis?
Ook sentiment analysis van zowel twitter als 2chan
Check https://www.newsweek.com/gamergate-about-media-ethics-or-harassing-women-harassment-data-show-279736

\newpage

##Conclusion

#Conclusion

In my introduction, I've made the argument that the Internet has seen increasing politicization; ranging from populist usage of big-data and paid propaganda campaigns operating as *faux* grassroots activism, to microcosmic counter-culture subcultures in west, primarily built around the discussion of Japanese pop-culture, disrupting the public discourse on political issues. While a lack of seemingly similar culture wars in Japan could be seen as a sign that the political shift of such subcultures as that on 4chan's political board reflects larger social trends and leaves little space for media agency, I tend to believe culture is a feedback loop and at the very least the political rhetoric utilized in this public discourse finds its roots in the particular culture developed in those communities. Regardless, in Japan too have the Netto-Uyoku, the decentralized right-wing populist voice on the Japanese Internet, shaken to some extent public discourse on politics, and can their rhetoric be traced back to those subcultures.

In this paper's first chapter, I've defined key terminology used 

It is a pitfall to apply theory rooted in western cultural traditions without balancing the different socio-cultural contexts of the subject, and arguments too could be made against the continuous western hegemony of academia. Yet, when we follow Anderson's and McLuhan's logic on media and literacy as crucial to nationalism, and see the world as a 'global village' connected by the digital, it wouldn't be a far stretch to consider the universal nature of the concepts presented in this chapter.

While I could never claim information warfare, populist demagoguery or nationalism to be new tactics in politics, it is not far-fetched to claim this is now done to great success on the Internet; fueled by both the technological peculiarities of the Internet itself (algorithms etc) and the rhetoric formed on Internet subcultures

In the second chapter I've covered the development of Japanese Internet subcultures and the close ties of Otaku culture with the adaption of the Internet.

https://www.buzzfeednews.com/article/ryanhatesthis/brazil-jair-bolsonaro-facebook-elections

In the third chapter, I've found many of the ideological goals of the Netto-Uyoku to fall in line with that of the current administration, who've in turn done well in dog-whistling to the Netto-Uyoku. This could be interpreted as one reason for a lack of political success for the Netto-Uyoku-associated Makoto Sakurai and his Japan First Party.

I conclude that the Netto-Uyoku, like its counterparts across the world, is on one hand a continuation of 

\newpage

\appendix

#Appendix

Appendix

\newpage

\section*{References}
\addcontentsline{toc}{section}{References}  

\setlength{\parindent}{-0.2in}
\setlength{\leftskip}{0.2in}
\setlength{\parskip}{0em}
\noindent

\vspace{4mm}
\setlength{\parskip}{0em}
\footnotesize

[^1]: Available online at <https://www.nytimes.com/2010/08/29/world/asia/29japan.html>. 
[^2]: Commonly abbreviated as *neto-uyo* (ネトウヨ).
[^4]: With some exceptions including the seminal work *Netto to Aikoku* by journalist Yasuda Koichi [-@yasuda_netto_2012], and writings by @tsuji__2008, @murai_net_2012, @yamaguchi_xenophobia_2013, @higuchi_japans_2014 and @morris-suzuki_beyond_2015, pieces this paper often refers to.
[^6]: A literal translation of *Kodo Hoshu Undo* (行動保守運動).
[^7]: "The Group Seeking Recovery of Sovereignty" (*Shuken Kaifuku wo Mezasu Kai* 主権回復を目指す会).
[^8]: "The Citizens’ Group Refusing to Tolerate Special Rights for Zainichi Koreans" (*Zainichi Tokken wo Yurusanai Shimin no Kai* 在日特権を許さない市民の会).
[^9]: Although @higuchi_japans_2016 describe the ACM and Zaitokukai as ultranationalist in nature, this paper agrees with @gill_nativist_2018 in that "‘ultra’ implies a *quantitative* increase in the degree of extremism, from ‘right’ to ‘far right’ to ‘ultra-right’". It will instead utilize the term neo-nationalism to sufficiently distinct the ACM from the ultranationalist Japanese militants collectively known as *uyoku dantai* (右翼団体, "right wing groups"). While often used in the context of mid 2010's European and North-American movements, the term neo-nationalism refers to a type of nationalism marked by right-wing populism, cultural racism, anti-globalisation and nativism, and arguably most closely describes the ACM ideologically [@dougherty_new_2016; @hirsh_why_2016]. This will be covered to greater detail in chapter one and three.
[^10]: This VRT report can be viewed in full at <https://www.vrt.be/vrtnws/nl/2018/09/05/pano-wie-is-schild-vrienden-echt/>. An English version, referring to S&V as the Flemish Alt-Right, is available at <https://www.vrtsales.be/productions/documentary/behind-scenes-flemish-alt-right-shield-friends>.
[^11]: @soll_long_2016 traces fake news in the west as a concept back to the invention of print media five centuries ago, to Gutenberg's invention of the printing press in 1439. In his essay, he recalls for example an account in 1475 of deliberate use of misinformation to persecute a Jewish community in Trent, Italy. 
[^12]: *2-channeru* 2ちゃんねる. Albeit in October 2017 renamed to 5channel (*5-channeru* 5ちゃんねる, accessible at <https://5ch.net>), this paper will for the sake of continuity with previous literature on the topic, continue to refer to this message board as 2channel.
[^13]: During the terror attack, the perpetrator referenced an online trend concerning Swedish Youtube influencer Felix Khellberg (known by his online handler PewDiePie and as of writing subscribed to by over 95 million followers). Khellberg came under increasing scrutiny for racial remarks and has been referred to as part of a gateway to the reactionary right [@lewis_alternative_2018; @dickson_why_2019; @roose_mass_2019]. In the perpetrator's manifesto, the perpetrator describes himself as "just an ordinary White man, 28 years old" and references a white supremacy conspiracy theory popularized by Alt-Right Youtube influencer Lauren Southern. This theory, known as "The Great Replacement", is featured on the Identitarian Movement's homepage and has been adopted by populist right-wing figures such as Dutch politician Geert Wilters, Hungarian Prime Minister Viktor Orbán. It has arguably been endorsed by President of the United States Donald Trump, who has shared tweets with the hashtag "#whitegenocide" [@weiss_opinion_2018; @manjoo_opinion_2019].
[^14]: This paper expands upon the author's undergraduate thesis [@poppe_digitaal_2017], written under the supervision of Prof. Dr. Dimitri Vanoverbeke. In his undergraduate thesis, the author examined the Netto-Uyoku as potential electorate of populist politicians on both a national and regional scale.
[^15]: Reinforcement of one's ideas through repeated confrontation with opinions and news aligning with one's ideas.
[^16]:  In the second article, @laurent_nordactu_2016 describes the *fachosphère* as part of the Identitarian Movement and "une nébuleuse de sites, de comptes sur les réseaux sociaux, visant à diffuser de la « réinformation », en clair de la propagande allant dans le sens des militants qui les animent", a nebula of websites and accounts on social networks, designed to disseminate "réinformation" or in other words propaganda embracing the ideas of the activists, amongst the users of those platforms.
[^17]:  Since its launch in 2003 4chan has been commonly accredited with popularizing many aspects now common to Internet communities. The message-board has several sections devoted to Japanese pop-culture, and in 2019 claimed over 27,700,000 unique visitors per month.Of note is the self-assessed demography of its users, consisting of a a mostly millennial, male user-base from the United States and Western Europe, listing interests as "Japanese culture, anime, manga, video games, comics, technology, music, movies" [@noauthor_advertise_nodate; @ellis_4chan_2018].
[^18]: A co-ordinated and reactionary harassment campaign against women targeting sexism in video game culture and the multi-billion video game industry, the Gamergate Controversy can be interpreted as a culture war against diversification of a supposed gamer identity (a cultural identity that has traditionally been associated with men). The controversy has had widespread coverage, including condemnation by Canadian Prime Minister Justin Trudeau, and was extensively covered by Alt-Right key-figure Milo Yiannopoulos on the far-right website Breitbart News Network. The outcome of this campaign has been said to have had radicalizing effects amongst its supporters [@wofford_is_2014; @johnston_chat_2014; @martens_rally_2017].
[^20]: It should be noted that a short news-report on Youtube covering this topic, "A Lot Of White Supremacists Seem To Have An Asian Fetish (HBO)" by @vice_news_lot_2017, had as of writing, a ratio of 6,1K dislikes to 5,6K likes. The author identified a newly posted comment by "Notification Email" (barring a play-list of game-related videos an otherwise empty account) to state "absolute state of (((modern journalism))) ... the truth is people longing culture about sincerity, chivalry, family value, etc. the west is beyond saved from the sinner, hedonist, liar, and degenerate." Another comment, by the account "ShadyxFiascoX 32", had 166 likes and stated "Personally Hitler loved Japan and said they had a good culture. What the hell is (((Vice))) talking about". In both cases the triple parentheses (originated from Alt-Right discourse) implies Jewish ownership of the video's owner, Vice News. One comment, by "Ochiai's Channel" misinterprets this video's content by posting "I am Japanese, and can I consider his talk as a hate speech against us?!". His channel, with a follower count of 610 subscribers and viewed over 87K times as of writing, states both in Japanese and English *2-Channeru-nado ni katte ni rinku o iron'na tokoro ni hattari,nan nara katte ni bideo o ichibu o kiritotte riyō suru no, OKdesu! ... Tada, han'nichi no hitotachi wa, do no yōna katachideare, riyō wa okotowarishimasu.* (「２ちゃんねる等に勝手にリンクを色んな所に貼ったり、なんなら勝手にビデオを一部を切り取って利用するの、OKです！ ... ただ、反日の人達は、どのような形であれ、利用はお断りします。」) and "You can paste my videos anywhere, or you can even download it and edit to use it. ... However, if you're anti-Japan or pro-migration, you're not welcome to do any of those in any means" [@noauthor_ochiais_nodate].
[^3]: In the case of state-sponsored Internet propaganda, @kovic_digital_2018 defined this practice as "digital astroturfing", calling it "a form of manufactured, deceptive and strategic top-down activity on the Internet initiated by political actors that mimics bottom-up activity by autonomous individuals".
[^21]: It is fitting too then that former Vice President of the United States, Al Gore, referred to the Internet in a 1994 speech for the International Telecommunication Union, as "information superhighways" that would serve as a "metaphor of democracy" and lead to a "gobal community". The text is available in full at <http://vlib.iue.it/history/internet/algorespeech.html>.
[^22]: "Determinism is a philosophical system that posits every physical event, including human cognition and action, is causally determined by an unbroken chain of past occurrences and therefore makes it possible for us to know future effects with certainty. Technological determinism claims that technology is an autonomous, "self-controlling, self-determining, self-generating, self-propelling, self-propelling, selfperpetuating and self-expanding force ... out of human control, changing under its own momentum and 'blindly' shaping society" [@chandler_act_1995, p.1]
[^23]: See Walter J. Ong, impact of orality to literacy [-@ong_orality_nodate].
[^5]: One report, published on the conservative Nippon Foundation platform <nippon.com>, claims that "disturbing as the voice of cyber-extremism may be, its influence on Japanese politics and society remains limited, and its heyday is nearing an end" [@furuya_roots_2016].
[^25]: In another note-worthy intersection with the Alt-Right, Vlaams Belang leader Tom Van Grieken hosted an event debating the UN migration compact with amongst others Steve Bannon [@gotev_vlaams_2018]. Moreover, a youth subdivision of Vlaams Belang hosted Lauren Southern as guest-speaker during another congress supervised by Van Grieken [@rennenberg_vlaams_2018]. 
[^19]: @davison_language_2012 defines a "meme" as a "a piece of culture, typically a joke, which gains influence through online transmission." (**pagenumber**)
[^24]: After the Unite the Right rally in Charlottesville, The term Alt-Lite occasionally came into usage to differentiate its relatively moderate members from more extremist white-nationalist Alt-Right members such as Richard Spencer. When referring to the Alt-Right in this paper, this author uses the term as an overarching umbrella term. For a closer take on the Alt-Right, the Alt-Light and the "Online culture wars", this author recommends @nagle_kill_2017.
[^26]: One Politico reporter in an in-depth take on this states "Just about everyone else, if they’re aware of these efforts at all, assumes they amounted to little more than entertainment for bored geeks and some unpleasant episodes for the targets of its often racist and sexist harassment campaigns. After all, the idea that a swarm of socially alienated trolls played a meaningful role in a multibillion-dollar presidential campaign by, among other gambits, relentlessly spreading images of a cartoon frog is at least as ridiculous as the idea that a billionaire TV entertainer could win that campaign" [@schreckinger_world_nodate] . For other examples, see <https://www.nytimes.com/2017/02/28/magazine/how-the-trolls-stole-washington.html>, and <https://www.washingtonpost.com/news/the-intersect/wp/2016/11/09/we-actually-elected-a-meme-as-president-how-4chan-celebrated-trumps-victory/>.
[^27]: A news aggregation and discussion platform. Based on combined page views and unique visitors it is, according to Alexa Internet, as of June 2019 the \nth{16} most visited global website. Within the list of social media platforms it is preceded only by Youtube, Facebook, Twitter and Instagram, as well as the Chinese web portals Tencent QQ and Sohu [@noauthor_alexa_nodate]. 
[^28]: See for example this The Huffington Post article, which referred to Roman politician Publius Clodius Pulcher as "the Trump of Ancient Rome, a Populist Demagogue Who Helped Bring Down the Republic", <https://www.huffpost.com/entry/trump-rome-populist_b_9659660>.
[^29]: The Southern Poverty Law Center reports that while global "terrorist attacks dropped from about 17,000 in 2014 to about 11,000 in 2017, including a 40 percent decline in the Middle East", "the United States has seen a recent surge in terror-related violence, with 65 attacks [in 2017], up from six in 2006", with two-third "tied to racist, anti-Muslim, homophobic, anti-Semitic, fascist, anti-government or xenophobic motivations" [@morlin_study_2018].
[^30]: Translates to Shield & Friends, a reference to a period of Flemish romantic nationalism (the Battle of the Golden Spurs) and in particular the 14th century shibboleth for identifying Frenchmen based on their inability to pronounce this phrase.
[^31]:  Growing to become the second largest party in Belgium in the 2019 elections, Vlaams Belang (Flemish Interest)'s online campaign took inspiration from both the 2016 Brexit and Trump campaign, investing almost solely on social media advertisements and heavily targeting young voters aged 18 to 34 [@cerulus_inside_2019].
[^32]: Although affinity for Japan by the Far Right is of course by no means a new phenomenon. In 2010 for example, a European delegation including previous French Front National leader Jean-Marie Le Pen and Belgian Vlaams Belang associate and European Parlement member Phillip Claeys, visited the controversial Yasukuni Shrine reportedly on invitation by the far-right *Uyoku Dantai* issuikai [@k.c._how_2010;@phillips_bnp_2010]. 
[^33]: A far-right male-only organization notorious for inciting violence.