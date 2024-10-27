DESCRIPTION
In this assignment, you'll write a Java program which asks the user to enter the name of a plain text file. The program reads the file and then outputs an html version according to the guidelines provided.

The purpose of the assignment is to provide some practice reading and writing files as well as reinforcing what you've learned about handling Strings

If you're unfamiliar with the basics of HTML or need a refresher, you can learn more at w3schools.

FILE NAMES
The user should enter the name of an input file which ends ".txt". The output file should have the same name as the input file, except that instead of ending ".txt", it should end ".html"

THE RULES
We'll only be working with a very small part of HTML in this assignment. You're welcome to add more if you'd like, but at a minimum, the HTML output should begin:

<html>
<body>

and should end:

</body>
</html>

Other transformations from the input file to HTML should be done according to the following:

If a line begins and ends with a pound sign ('#'), the program should output the contents of that line (minus the leading and trailing pound signs) within an h1 header tag. For example, if the line contained the text
#Big Important Point#

the program would output:
<h1>Big Important Point</h1>

Blank lines are replaced with HTML paragraph tags, i.e.,
<P>

(You do not have to close paragraphs with an XHTML-style closing paragraph tag </P>).

Lines that begin with a '-' character (i.e. a minus sign) are considered to be bullet points of an unordered list.
In your output, lists should begin:
<ul>

Each bullet point in the list will consist of the characters of the line following the '-' in the input, and will be enclosed in list item tags, i.e.,
<li>text following the '-'</li>

Lists should end:
</ul>

So for example, if in the input file we see:

- turkey
- lettuce
- tomato
- little bit of mayo

Your program would output

<ul>
<li>turkey</li>
<li>lettuce</li>
<li>tomato</li>
<li>little bit of mayo</li>
</ul>

Any line that doesn't match any of the previous rules will be output as is, but with a line break tag <br /> at the end.


AN EXAMPLE
If the input file is:

#shanty#

Who lives in a pineapple under the sea?
Spongebob Squarepants

- absorbent
- yellow
- porous

is he, Spongebob Squarepants

The program would output:

<html>
<body>
<h1>shanty</h1>
<p>
Who lives in a pineapple under the sea?<br />
Spongebob Squarepants<br />
<p>
<ul>
<li> absorbent</li>
<li> yellow</li>
<li> porous</li>
</ul>
<p> is he, Spongebob Squarepants<br />
</body>
</html>

which, when rendered in a web browser, would look something like:

shanty
Who lives in a pineapple under the sea?
Spongebob Squarepants

absorbent
yellow
porous
is he, Spongebob Squarepants

OUTPUTTING URLS
Any text in the input file of the form [[X][Y]] should be treated as a hyperlink, where X is the URL, and Y is the text to display on the screen. For example, if X is http://www.cis.temple.edu/~jfiore/2024/fall/1068 and Y is class, your program should output a hyperlink that displays the text class, which when clicked takes the user to the page http://www.cis.temple.edu/~jfiore/2024/fall/1068.

You are not required to handle the possibility that one of these blocks begins and ends on different lines of the input file.
