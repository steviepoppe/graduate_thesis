# Graduate thesis

A repository containing all relevant files for my final thesis as graduate student of Japan Studies.

## Tools used

I'm writing my paper in markdown syntax with a latex template using Sublime Text 3, I archive and annotate my sources with Zotero, and compile in different formats using [Pandoc](http://pandoc.org/). I'm using github for revision control.

I use following ST plug-ins:

- [Package Control](https://packagecontrol.io/)
- [MarkdownEditing](https://packagecontrol.io/packages/MarkdownEditing)
- [AcademicMarkdown](https://github.com/mangecoeur/AcademicMarkdown)
- [Citer](https://github.com/mangecoeur/Citer)
- [Pandoc](https://packagecontrol.io/packages/Pandoc)
- [GitSavvy](https://github.com/divmain/GitSavvy)
- [Wordcount](https://github.com/titoBouzout/WordCount)
- [IMESupport](https://github.com/chikatoike/IMESupport)

## Why?

Cross-platform compatibility, pretty type-setting, version control with git, ease of sourcing and footnoting, seperation of form and content and more control over layout with latex than WYSYWYG-editors as Word, I like the concept of [sustainable authorship](https://programminghistorian.org/en/lessons/sustainable-authorship-in-plain-text-using-pandoc-and-markdown) and I'm a tech-hipster (read: nerd).

## Workflow

I'll expand this section later. Most important steps are as following:

**Citer** -> Export list of sources as bibtex file, add its path to citer settings and efficiently find / add source references.

**Pandoc** -> Pandoc support for Sublime Text. Chance pandoc-arguments in settings per preferred output format to reflect template, latex-engine (export of Japanese characters requires the tex distribution miktex, specifically xelatex) and filter for citations (pandoc-citeproc).

**IMESupport** -> Support for using the Input Method Editor, necessary for typing for example Japanese, Korean and Chinese in Sublime Text. 

**GitSavvy** -> basic git support. Use ssh instead of https and set remote URL to a form that supports SSH (git remote set-url origin git+ssh://git@github.com/username/reponame.git). This assumes prior generation of SSH key and associating it with your account / remote repository. Generally more safe as using cedential helpers which stores your password unencrypted on disk.

I generally write my paper in Markdown syntax. I add a YAML header in my main document to place options for Pandoc (such as the CSL, bibliography and geometry I use) as well as any variables I use in my latex template. For any explicit layout needs in-document I can't handle with MD, I use latex instead (eg. \newpage)

I "compile" to PDF with Pandoc for work in progress versions but export to latex and then do final editing in a latex environment for my final version. 

## Useful shortcuts

| Shortcut | Description |
| ---------| ----------- |
| <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>P</kbd> | For accessing plug-ins / Command Palette  |
| <kbd>Alt</kbd>+<kbd>Shift</kbd>+<kbd>6</kbd> | Add footnote |
| <kbd>Ctrl</kbd>+<kbd>R</kbd><kbd>U</kbd> | outline view of the document |

## To do

Writing an undergraduate or graduate thesis is borderline doable in one document but anything longer is definitely unmanageable. In this case, a work-flow involving markdown documents per chapter is preferable, using a compile script for pandoc to export everything to tex, compile them in one final tex document and export to the final pdf (like [this](https://bartschat.github.io/post/thesis_workflow/)).

Also, zotero is not multilingual. Juris-M is a good variant with multilingual support, necessary for managing sources in multiple languages. HOWEVER there is no multilingual support for bibtex formats. My current workflow is thus to obtain my pre-final latex file, export the correct citation format with both the Japanese / Korean and English translations and manually replace my Japanese sources in the latex file with the correct citations, and then export to my final PDF. This is tedious. Not an issue when using a citation style that uses romaji instead though.

## More

Check these for more information:

- [How to use Markdown and Pandoc in Sublime Text 3
](https://donlelek.github.io/2015-03-25-how-to-use-markdown-and-pandoc-in-sublime-text-3/): self-explanatory
- [A Plain Text Workflow for Academic Writing with Atom](http://u.arizona.edu/~selisker/post/workflow/): same workflow, with [Atom](https://atom.io/) as text editor instead. I probably recommend this over Sublime Text tbh
- [My workflow for transforming academic Markdown into beautiful Word documents
](https://bartschat.github.io/post/thesis_workflow/): same workflow, using [Ulysess](https://ulysses.app/) instead.
