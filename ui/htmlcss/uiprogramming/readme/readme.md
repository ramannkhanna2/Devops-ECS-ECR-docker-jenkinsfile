# Role of a UI Developer

A UI developer's role is to translate creative software design concepts and ideas into reality using front end technology. ... The task of a user experience designer is to design and create a software interfaces by prioritizing Users and business requirements over technology limitations and constraints.

## Knowledge Required 
* HTML5
* JavaScript
* CSS/SCSS 
* Ajax 
* Advance Developers can hava React/Angular/Typescript


# UX Designer v/s UI Developers 
* Create user stories, personas, and storyboards.
* Determine information architecture and create sitemaps.
* Create prototypes and wireframes.
* Conduct usability testing

## Knowledge Required 
* PhotoShop 
* Wireframe Tools 
* Animation Tools 
* Creative Background 


# Modern UI Technolgies 
* HTML 
* Javascript / Typescript 
* CSS 
* WebPack and Bundling 
* Ajax and Async Programming 


# HTML5 
## Getting started ##

To begin work on our blog, we will first build the basic structure required by any HTML5 web page. Once you have this structure in place, you can save it as a template for use again and again each time you create a new page. Create a new folder on your desktop called blog. Then, start your text editor, create a new file, and save it as index.html within the blog folder. Within your blank text file, enter the following text.
~~~html
	<!DOCTYPE html>
	<html lang="en">
		<head>
			<meta charset=utf-8 />
			<title>My blog</title>
		</head>
		<body>
		</body>
	</html>
~~~
Save your work. Now let's take a look at the code.

### The DOCTYPE ###

The first line of our new document is the DOCTYPE and simply lets your web browser know which version of HTML you used to create your page. Because there are many different versions of HTML with different sets of features and rules, the browser needs the information in the DOCTYPE to determine how to render the page.

### The `<head>` tag ###

The line that starts with `<html>` is our first HTML tag. HTML tags are used to define elements of our web page. The `<html>` tag defines an element that contains all other elements and represents the beginning and end of our document. In HTML5, all tag names are lowercase and typically have an opening and a closing tag. Therefore, the `<html>` tag in our code is composed of two parts: `<html>` and `</html>`. The tag also contains what is known as an attribute. The lang="en" section of the code is used to specify that the contents of the page are written in English. We will be working more with attributes once we start adding content to our page.

### The `<head>` tag ###

The `<head>` tag defines a section of the document that contains information that generally won't be displayed in the browser, but is important to the display of the page. The `<meta>` tag that is contained within the `<head>` element is used, for example, to define which set of characters should be used to display the text content on the page. The `<title>` tag contains the title of the page -- the text that gets displayed in the browser's title bar and when the page gets bookmarked. Information on the visual appearance of the page (in the form of CSS code) or links to external CSS files are also typically contained in the `<head>` element.

### The `<body>` tag ###

The body tag contains all of the visual content of the page. Anything that you want the viewer to see or interact with is typically included in this element. We'll be spending the rest of the tutorial building content within the body tag.

### A quick note on code formatting ###

You might have noticed that the code throughout this tutorial is formatted with tabs. I use this formatting to get a better sense of which HTML elements contain other elements. This spacing was created only to make it easier to read the code and your browser won't care whether it's there or not. So feel free to use tabs and blank lines if you'd like, but know that it's not important that you copy the spacing exactly as typed here.

## Setting up our blog landing page ##

The landing page for our blog will be composed of several different elements:

* A header that contains our blog title
* Navigation
* Blog posts
* A footer containing information on the blog like author and copyright information

Let's start building the page.

### The `<header>` tag ###

There are a number of HTML elements that are used to define sections within a web page. The `<header>` tag is one such element and is typically used to define the banner that is often included across the top of a page. To create a `<header>` simply type an opening and closing tag just after the opening `<body>` tag.

	<header>

	</header>

Save your work. Now go to your web browser and open the index.html document from the File menu. You should see a blank page. Although the `<header>` section is in place, it doesn't have a visible component by default. We'll change that in our CSS tutorial, but for now, let's add some content to it.

### The `<h1>` tag

The `<h1>` tag is used to define the top-level heading of your page. Add an open and closing `<h1>` within the `<header>` tag and populate it with the name of your blog.

~~~html
	<header>
		<h1>My blog</h1>
	</header>
~~~

Now if you preview your page in the browser (just click refresh if the page is already open), you should see the name of your blog in the upper left corner of the page. While it may not be the most well-designed page, it has given us a start on our content.

### The `<nav>` tag

Right below the closing `<header>` tag, we'll add a new section to the page using the `<nav>` tag. As the name implies, this tag is used to define the region of the page that will contain our navigation links.
~~~html
	<nav>

	</nav>
~~~

#### Creating a nav menu using an unordered list

Now we'll create a menu for our navigation section. To do so, we'll make use of an HTML element known as the unordered list, defined using the `<ul>` tag. Unordered lists are often displayed in the browser as a bulleted list. They also have a counterpart known as the ordered list (`<ol>` tag) which is used to create what is typically displayed as a numbered list. Unordered and ordered lists are composed of list items, represented by the `<li>` tag. Let's go ahead and create our menu.
~~~html
	<ol>
		<li>Home</li>
		<li>Portfolio</li>
		<li>About me</li>
		<li>Contact me</li>
	</ol>
~~~
Save and preview your page again. A basic menu is in place, but it's not quite functional yet. Let's fix that now.

### The `<a>` tag

At this point in time, we should start thinking about the structure of the files that make up our blog. Our entire site is currently only composed of one page -- the home page. Based on our new navigation menu, we can now see that at least three more pages need to be created. Using the template site structure that we started above, let's create those pages now and save them to the blog folder.

* Portfolio - portfolio.html
* About me - about.html
* Contact me - contact.html

Once you are done, return to the index.html file and change the navigation menu to look like this:
~~~html
	<ol>
		<li><a href="index.html">Home</a></li>
		<li><a href="portfolio.html">Portfolio</a></li>
		<li><a href="about.html">About me</a></li>
		<li><a href="contact.html">Contact me</a></li>
	</ol>
~~~
If you preview the page now (remember to save first), you should be able to click the links in the navigation menu to visit any of the new pages you created.

The anchor element (`<a>` tag) can be used to create hyperlinks to different sections of the page, different pages on your site, pages on external sites, files (such as PDF files), and special addresses such as e-mail addresses. In our navigation menu, we have used the `href` attribute to specify which internal pages to direct the user to when they click each link. We will explore more advanced use of the `<a>` tag as we work through the tutorial.

## The `<article>` tag ###

Below the navigation menu, we will create a short list of blog entries. To define each entry as as a separate post, we'll use the `<article>` tag. Let's create our first entry.
~~~html
	<article>
		<h2>Learning HTML5</h2>
		<p>Posted by Author on February 1, 2012</p>
		<p>I'm learning HTML5 and so far, it's going great! I have learned a few things that I thought I would share:</p>
		<ol>
			<li>HTML is easy!</li>
			<li>HTML is used to structure content</li>
			<li>HTML is used alongside CSS and JavaScript to build web pages</li>
		</ol>
	</article>
~~~
We have introduced a few new tags in this section. The `<h2>` tag is a second-level heading. By using an `<h1>` tag to define the topmost heading on our page and the `<h2>` tag to define each section, we create a nice hierarchy for our content. The `<p>` is one of the most oft-used tags and is used to define a paragraph. We have discussed the ordered list briefly, but now we're seeing it in action.

## Images ##

So far, we have only included text on our page, but it would be nice to also include images in our blog posts. Let's create a new post that contains an image.

Within your blog folder, create a new folder named 'img' that we will use to store images. Although we are not required to create a separate folder for images, we're doing so to keep things organized. You are free to organize your files however you'd like. Next, let's download an image to that folder by navigating to http://bit.ly/yHrJpW and saving the image to the 'img' folder as 'parrot.jpg'. Now we need some information on the size of image. Opening the file in Photoshop reveals that the file is 480 pixels wide by 480 pixels tall.

Create the following blog post right above the previous blog post.
~~~html
	<article>
		<h2>My pet parrot</h2>
		<p>Posted by Author on February 2, 2012</p>
		<img src="img/parrot.jpg" width="480" height="480" alt="My pet parrot hanging out in the backyard" />
		<p>My pet parrot hanging out in the backyard</p>
	</article>
~~~~
As you can see, the `<img>` tag contains several pieces of information on the image. First, the src attribute contains the URL of the actual parrot image itself. The width and height attributes specify the size of the image in pixels. Finally, the alt attribute contains alternative text that describes the image. The alt text is particularly important for browsers that don't display images or for screen readers that rely on a text-based description of the image. For users with visual impairments, the alt tag allows any information contained in the image to be conveyed. Finally, unlike other tags that we have explored so far, there isn't a closing tag for our image. This is because the `<img>` tag is a self-closing tag, meaning that we can simply include a slash at the end of the tag to close it.

Save your page and preview it in the browser.

## Variations on the `<a>` tag ##

We will close out our tutorial by looking at some variations on the anchor tag. Specifically, we will create links to external sites and a link to an e-mail address. We'll also add a third level to the hierarchy we have setup with the header tags. To start, let's create one final blog post.

	<article>
		<p>Posted by Author on February 3, 2012</p>
		<h2>My favorite links</h2>
		<h3>School</h3>
		<ul>
			<li>I attend <a href="http://www.vinsys.com">UT</a></li>
			<li>I am a student in the <a href="http://www.vinsys.com/education/departments/ci/programs/it/">Learning Technologies</a> program</li>
		</ul>
		<h3>Web Design</h3>
		<ul>
			<li><a href="http://www.vinsys.com">Vinsys</a></li>
			<li><a href="http://www.vinsys.com">Make Better Web sites</a> is a great place to get inspiration</li>
		</ul>
	</article>

By including the full URL (including http://), your browser will know to link to an external site instead of another page on your site.

Next, add a `<footer>` tag right before the `</body>` tag and populate it with the following content

	<footer>
		<p>&copy;2012 The author <br />
		<a href="mailto:nilesh.devdas@vinsys.com">E-mail the author</a></p>
	</footer>

In this code, we are first including an HTML character code -- &copy; -- which your browser translates into the copyright symbol. The <br /> tag creates a line break and is an example of another self-closing tag. Finally, by including the keyword 'mailto:' in our URL, the browser will know to launch a mail program and address a new message to the address listed.

## Wrapping up ##
For your reference, here's our completed HTML code:
~~~html
	<!DOCTYPE html>
	<html lang="en">
		<head>
			<meta charset=utf-8 />
			<title>My blog</title>
		</head>
		<body>
			<header>
				<h1>My blog</h1>
			</header>
				<nav>
					<ol>
						<li><a href="index.html">Home</a></li>
						<li><a href="portfolio.html">Portfolio</a></li>
						<li><a href="about.html">About me</a></li>
						<li><a href="contact.html">Contact me</a></li>
					</ol>
				</nav>
			<article>
				<p>Posted by Author on February 3, 2012</p>
				<h2>My favorite links</h2>
				<h3>School</h3>
				<ul>
					<li>I attend <a href="http://www.vinsys.com">UT</a></li>
					<li>I am a student in the <a href="http://www.vinsys.com/education/departments/ci/programs/it/">Learning Technologies</a> program</li>
				</ul>
				<h3>Web Design</h3>
				<ul>
					<li><a href="http://net.vinsys.com/">Vinsys</a> Best Place For Training </li>
					<li><a href="http://www.vinsys.com">Best Website</a> Great Place to learn</li>
				</ul>
			</article>
			<article>
				<h2>My pet parrot</h2>
				<p>Posted by Author on February 2, 2012</p>
				<img src="img/parrot.jpg" width="480" height="480" alt="My pet parrot hanging out in the backyard" />
				<p>My pet parrot hanging out in the backyard</p>
			</article>
			<article>
				<h2>Learning HTML5</h2>
				<p>Posted by Author on February 1, 2012</p>
				<p>I'm learning HTML5 and so far, it's going great! I have learned a few things that I thought I would share:</p>
				<ol>
					<li>HTML is easy!</li>
					<li>HTML is used to structure content</li>
					<li>HTML is used alongside CSS and JavaScript to build web pages</li>
				</ol>
			</article>
			<footer>
				<p>&copy;2012 The author <br />
				<a href="mailto:author@email.com">E-mail the author</a></p>
			</footer>
		</body>
	</html>
~~~~

# Example-1 

~~~html
<!DOCTYPE html>
<html>
<head>
    <title>
        My Website
    </title>
</head>
<body>
Hello, World!
</body>
</html>
~~~


# Example-2
~~~html 
<!DOCTYPE html>
<html>
<head>
    <title>
        My Website
    </title>
</head>
<body>
<h1>Hello, world!</h1>
<p>This is a paragraph of text, and it's inside a p tag.</p>
<p>This is another block of text. Inside another p tag. Mind blowing.</p>
<ul>
    <li>This is a list item in an unordered list.</li>
    <li>This is another list item.</li>
    <li>And yet again, this is a list item.</li>
</ul>
</body>
</html>

~~~

# Example-3 (Tags Continued) 
~~~html 
<!DOCTYPE html>
<html>
<head>
    <title>
        My Website
    </title>
</head>
<body>
<h1>This is Page 1!</h1>

<p>
    We're going to play so much on this page. It will be so fun. You have no
    idea. HTML is a party.
</p>
</body>
</html>
~~~

# Example 4 (Tags Continued)

~~~html
<!DOCTYPE html>
<html>
<head>
    <title>
        My Website
    </title>
</head>
<body>
<h1>This is Page 2!</h1>

<img width="15%" src="https://image.slidesharecdn.com/vinsysbrochure-170330105115/95/vinsys-leading-corporate-technology-training-pmp-itsm-cobit-training-for-professional-1-638.jpg?cb=1490871163"/>

<h2>Hey Welcome ~~~ </h2>
<p>You did it. <a href="page1.html">Click here to go back to Page 1.</a></p>
</body>
</html>
~~~


# Example 5 (Tables)
~~~html
<!DOCTYPE html>
<html border="1">
<head>
    <title>My Website</title>
</head>
<body>
<h1>Check out that table.</h1>
<table>
    <tr>
        <th>First Header</th>
        <th>Second Header</th>
    </tr>
    <tr>
        <td>First Row, First Cell</td>
        <td>First Row, Second Cell</td>
    </tr>
    <tr>
        <td>Second Row, First Cell</td>
        <td>Second Row, Second Cell</td>
    </tr>
</table>
</body>
</html>
~~~


# Example 6 Inline Style 
~~~html
<!DOCTYPE html>
<html>

<head>
    <title>
        My Website
    </title>
    <style>
        body {
            font-family: 'Varela Round', sans-serif;
            line-height: 1.6;
            color: #3a3a3a;
        }

        p {
            font-size: .95em;
            margin-bottom: 1.8em;
        }

        h2,
        h3,
        a {
            color: #093a58;
        }

        h2,
        h3 {
            margin-top: 0;
        }

        a {
            text-decoration: none;
        }

        img {
            max-width: 100%;
            /*display: none;*/
        }

    </style>
</head>
<body>
<h1>How To Be Attractive</h1>
<h2>An overview by me.</h2>
<h3>For you.</h3>
<h4>Because I care.</h4>
</body>
</html>
~~~

# Example-7 Style Continued 

~~~html
<!DOCTYPE html>
<html>
<head>
    <title>
        My Website
    </title>
    <style>
        body {
            font-family: 'Varela Round', sans-serif;
            line-height: 1.6;
            color: #3a3a3a;
        }

        p {
            font-size: .95em;
            margin-bottom: 1.8em;
        }

        h2,
        h3,
        a {
            color: #093a58;
        }

        h2,
        h3 {
            margin-top: 0;
        }

        a {
            text-decoration: none;
        }

        li {
            list-style-type: square;
        }

        img {
            max-width: 100%;
            border-radius: 50%;
            /*display: none;*/
        }

    </style>
</head>
<body>
<h1>Better Look and Feel</h1>

<p>
    All it takes is to add css
</p>

<p> What are the steps to be more good looking?</p>

<ol>
    <li>Make Good Font Selection</li>
    <li>
        Or You Can Use the BootStrap
    </li>
    <li>
        Or Write your own custom css
    </li>
    <li>Relish in the joys of the internet as there are many ready made CSS and Templates</li>
</ol>
<img
        src="https://media4.giphy.com/media/13FrpeVH09Zrb2/giphy.gif"
        alt="CSS Is not messy but it takes time"/>
</body>
</html>
~~~


# Example 8 Layouts  
~~~html
<!DOCTYPE html>
<html>
<head>
    <title>About Me</title>

    <style></style>
</head>
<body>
<div class="header">
    This is a header
</div>
<div class="menu">
    <a href="homepage.html">Home</a>
    <br/>
    <a href="aboutpage.html">About</a>
    <br/>
    <a href="contactpage.html">Contact</a>
    <br/>
</div>
<div class="content">
    <h1>About me</h1>
    <p style="font-style: italic;">A Short Note</p>
    <p>
        About Yourself <br/>
    </p>
</div>
<div class="footer"></div>
</body>
</html>

<!-- contact me -->
<!DOCTYPE html>
<html>
<head>
    <title>Contact Me</title>

    <style></style>
</head>
<body>
<div class="header">This is a header</div>
<div class="menu">
    <a href="homepage.html">Home</a><br/>
    <a href="aboutpage.html">About</a><br/>
    <a href="contactpage.html">Contact</a><br/>
</div>
<div class="content">
    <h1>Here's how you can contact me!</h1>
    <ul>
        <li>Phone: 999999999</li>
        <li>Email: nilesh@example.com</li>
    </ul>
</div>
<div class="footer"></div>
</body>
</html>

<!-- -->
<!DOCTYPE html>
<html>
<head>
    <title>My Website</title>
    <style></style>
</head>
<body>
<div class="header">This is a header</div>
<div class="menu">
    <a href="homepage.html">Home</a><br/>
    <a href="aboutpage.html">About</a><br/>
    <a href="contactpage.html">Contact</a><br/>
</div>
<div class="content">
    Vinsys, an ISO 9001:2015 certified organization, is a globally acclaimed individual and corporate training provider,
    has a legacy of empowering professionals with knowledge for 15+ years. Till date, we have enlightened and trained
    600,000+ professionals around the world. Today, we have spread our wings across the globe and have footprints in
    Australia, China, India, Kenya, Malaysia, Oman, Singapore, Tanzania, UAE, and the USA.
</div>
<div class="footer"></div>
</body>
</html>

~~~

# Example-10  Linking the CSS using Stylesheet css
~~~html
<!DOCTYPE html>
<html>
  <head>
    <title>My Website</title>
    <link href="main.css"  rel="stylesheet">
  </head>
  <body>
    <div class="header">This is a header</div>
    <div class="menu">
      <a href="homepage.html">Home</a><br />
      <a href="aboutpage.html">About</a><br />
      <a href="contactpage.html">Contact</a><br />
    </div>
    <div class="content">
      Vinsys, an ISO 9001:2015 certified organization, is a globally acclaimed individual and corporate training provider,
      has a legacy of empowering professionals with knowledge for 15+ years. Till date, we have enlightened and trained
      600,000+ professionals around the world. Today, we have spread our wings across the globe and have footprints in
      Australia, China, India, Kenya, Malaysia, Oman, Singapore, Tanzania, UAE, and the USA.
    </div>
    <div class="footer"></div>
  </body>
</html>

~~~
* Main CSS 
~~~css
html {
  height: 100%;
}
body {
  font-family: Arial;
  height: 100%;
  margin: 0px;
}
.header {
  background-color: #99b5dd;
  position: fixed;
  top: 0px;
  width: 100%;
  height: 60px;
  padding: 0px 10px;
  font-size: 50px;
  z-index: 10;
}
.menu {
  background-color: #de90b1;
  height: 100%;
  width: 15%;
  position: fixed;
  left: 0px;
  top: 60px;
  padding: 10px 0px 0px;
  text-align: center;
  z-index: 5;
}
.content {
  height: 200px;
  position: absolute;
  top: 60px;
  left: 15%;
  padding: 10px;
  z-index: 0;
}
.footer {
  background-color: #0f215d;
  position: fixed;
  bottom: 0px;
  height: 60px;
  width: 100%;
  z-index: 10;
}
~~~

# Example 11 - BootStrap 
~~~html
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03"
            aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="#">Navbar</a>

    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<!--<div class="jumbotron">-->
<!--    <h1 class="display-4">Hello Bootstrap !!!!</h1>-->
<!--    <p class="lead">Lead </p>-->
<!--    <hr class="my-4">-->
<!--    <p>Write you Paragraphs here </p>-->
<!--    <p class="lead">-->
<!--        <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>-->
<!--    </p>-->
<!--</div>-->
<div class="container">
    <table class="table table-bordered table-striped mt-4">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">Handle</th>
        </tr>
        </thead>
        <tr>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
        </tr>
        <tr>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>

        </tr>
        <tr>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
        </tr>
        <tr>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>

        </tr>
    </table>
    <div class="row">
        <div class="col-md4">
            <div class="card">
                <div class="card-header bg-dark text-white">Card</div>
                <div class="card-body bg-light">
                    <img class="rounded-circle" width="30%"
                         src="https://www.vinsys.com/blog/wp-content/uploads/2019/07/500x500_vinsys_logo-1.png">
                </div>
                <div class="card-footer bg-dark text-white">Copyright</div>
            </div>
        </div>
    </div>
    <div class="mb-4"></div>
</div>
</body>
</html>
~~~


# Pure CSS 

~~~html
<html>
<head>
    <title>The PURE.CSS Example</title>
    <meta name="viewport" content="width = device-width, initial-scale = 1">
    <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css"
          integrity="sha384-Uu6IeWbM+gzNVXJcM9XV3SohHtmWE+3VGi496jvgX1jyvDTXfdK+rfZc8C1Aehk5" crossorigin="anonymous">
    <style>
        .grids-example {
            background: rgb(250, 250, 250);
            margin: 2em auto;
            border-top: 1px solid #ddd;
            border-bottom: 1px solid #ddd;
            font-family: Consolas, 'Liberation Mono', Courier, monospace;
            text-align: center;
        }
    </style>
</head>

<body>
<a class="pure-button" href="#">A Pure Button</a>

<div class="grids-example">
    <div class="pure-g">
        <div class="pure-u-1-3"><p>First Column</p></div>
        <div class="pure-u-1-3"><p>Second Column</p></div>
        <div class="pure-u-1-3"><p>Third Column</p></div>
    </div>
</div>


<div>
    <form class="pure-form">
        <fieldset>
            <legend>A compact inline form</legend>
            <input type="email" placeholder="Email"/>
            <input type="password" placeholder="Password"/>
            <label for="default-remember">
                <input type="checkbox" id="default-remember"/> Remember me
            </label>
            <button type="submit" class="pure-button pure-button-primary">Sign in</button>
        </fieldset>
    </form>
</div>

<!-- Stacked Form -->
<div>
    <form class="pure-form pure-form-stacked">
        <fieldset>
            <legend>A Stacked Form</legend>
            <label for="stacked-email">Email</label>
            <input type="email" id="stacked-email" placeholder="Email"/>
            <span class="pure-form-message">This is a required field.</span>
            <label for="stacked-password">Password</label>
            <input type="password" id="stacked-password" placeholder="Password"/>
            <label for="stacked-state">State</label>
            <select id="stacked-state">
                <option>AL</option>
                <option>CA</option>
                <option>IL</option>
            </select>
            <label for="stacked-remember" class="pure-checkbox">
                <input type="checkbox" id="stacked-remember"/> Remember me
            </label>
            <button type="submit" class="pure-button pure-button-primary">Sign in</button>
        </fieldset>
    </form>

</div>
<div>
    <table class="pure-table">
        <thead>
        <tr>
            <th>#</th>
            <th>Make</th>
            <th>Model</th>
            <th>Year</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td>Honda</td>
            <td>Accord</td>
            <td>2009</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Toyota</td>
            <td>Camry</td>
            <td>2012</td>
        </tr>
        <tr>
            <td>3</td>
            <td>Hyundai</td>
            <td>Elantra</td>
            <td>2010</td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>
~~~

# CSS With Media Queries 
* Add your styles as per queries 
~~~css
/* Smartphones (portrait and landscape) ----------- */
@media only screen 
and (min-device-width : 320px) 
and (max-device-width : 480px) {
/* Styles */
}

/* Smartphones (landscape) ----------- */
@media only screen 
and (min-width : 321px) {
/* Styles */
}

/* Smartphones (portrait) ----------- */
@media only screen 
and (max-width : 320px) {
/* Styles */
}

/* iPads (portrait and landscape) ----------- */
@media only screen 
and (min-device-width : 768px) 
and (max-device-width : 1024px) {
/* Styles */
}

/* iPads (landscape) ----------- */
@media only screen 
and (min-device-width : 768px) 
and (max-device-width : 1024px) 
and (orientation : landscape) {
/* Styles */
}

/* iPads (portrait) ----------- */
@media only screen 
and (min-device-width : 768px) 
and (max-device-width : 1024px) 
and (orientation : portrait) {
/* Styles */
}

/* Desktops and laptops ----------- */
@media only screen 
and (min-width : 1224px) {
/* Styles */
}

/* Large screens ----------- */
@media only screen 
and (min-width : 1824px) {
/* Styles */
}

/* iPhone 4 ----------- */
@media
only screen and (-webkit-min-device-pixel-ratio : 1.5),
only screen and (min-device-pixel-ratio : 1.5) {
/* Styles */
}
~~~

