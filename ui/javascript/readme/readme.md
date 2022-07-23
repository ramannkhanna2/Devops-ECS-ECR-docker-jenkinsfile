# Introduction to the Developer console
* Your code will always has some or the error during development how to first identify these error 
* In browser you have a lot to see in the developer console where you can 
    * Find errors 
    * Debug Your code 
    * Inspect Values 
    * Find Issues and problems 
    * Profile your code 

## Google Chrome Developer Tools 

*   The Google chrome Developer tools can be opend using F12
*   Same way most other browsers allow you to open the Developer Tools similarly 

# Example 1 Using the Inline Scripts
Using the &lt;script&gt; Tag 
for Instance 
~~~html
<!DOCTYPE HTML>
<html>
<body>
  <p>Before the script...</p>
  <script>
    alert( 'Hello, world!' );
  </script>
  <p>...After the script.</p>
</body>
</html>
~~~

# Example 2 Using the External Scripts
External Scripts are used where scripts are kept in the .js 
~~~html
<script src="/js/script1.js"></script>
<script src="/js/script2.js"></script>
~~~

#### **Note :**  

As a rule, only the simplest scripts are put into HTML. More complex ones reside in separate files.

The benefit of a separate file is that the browser will download it and then store in its cache.

After this, other pages that want the same script will take it from the cache instead of downloading it. So the file is actually downloaded only once making it faster 


#### **Note:** 
If src is set, the script content is ignored.
A single HTML &lt;script&gt; tag can’t have both the src attribute and the code inside.

# Example 3
~~~HTML
<script src="file.js">
  alert(1); // the content is ignored, because src is set
</script>
We must choose: either it’s an external <script src="..."> or a regular <script> with code.

The example above can be split into two scripts to work:

<script src="file.js"></script>
<script>
  alert(1);
</script>
~~~


# Example 4 JavaScript Code Structure 
*   We can have as many statements in the code as we want.  
*  Each statement can be separated with a semicolon.
*  A semicolon may be omitted in most cases when a line break exists.  
<br>
<br>

# Example 5 JavaScript Comments 

* Single Line Comments 
~~~javascript
// This comment occupies a line of its own
alert('Hello');

alert('World'); // This comment follows the statement
~~~

# Example 6 Multiline Comment 
* MultiLine Comment 
Multiline comments start with a forward slash and an asterisk /* and end with an asterisk and a forward slash */.


~~~javascript
/* An example with two messages.
This is a multiline comment.
*/
alert('Hello');
alert('World');
~~~

# Example 7 Using Variables 
* A variable is a “named storage” for data. We can use variables to store goodies, visitors and other data.
* To create a variable in JavaScript, we need to use the let keyword.
* The statement below creates (in other words: declares or defines) a variable with the name “message”:

~~~javascript
let user;
user = 'nilesh'; // store the string
~~~
<br>

# Example 8 Using Constants
* To declare a constant (unchanging) variable, one can use const instead of let:
* Variables declared using const are called “constants”. They cannot be changed. An attempt to do it would cause an error:

~~~javascript
const COLOR_RED = "#F00";
const COLOR_GREEN = "#0F0";
const COLOR_BLUE = "#00F";
const COLOR_ORANGE = "#FF7F00";
~~~

## Summary 

We can declare variables to store data. That can be done using var or let or const.

* let – is a modern variable declaration. The code must be in strict mode to use let in Chrome (V8).

* var – is an old-school variable declaration. Normally we don’t use it at all, but we’ll cover subtle differences from let in the chapter The old "var", just in case you need them.

* const – is like let, but the value of the variable can’t be changed.


# Example 9 Datatypes 
*  A variable in JavaScript can contain any data. A variable can at one moment be a string and later receive a numeric value:

~~~javascript
a = 10;  // number 
a = "Nilesh";  // string 
a = []; // array 
a = {}; // object
a = true; // boolean
a = null 
~~~ 
### Dataypes in javascript 
* **There are 7 basic types in JavaScript.**
* number for numbers of any kind: integer or floating-point.
* string for strings. A string may have one or more characters, there’s no separate single-character type.
* boolean for true/false.
* null for unknown values – a standalone type that has a single value null.
* undefined for unassigned values – a standalone type that has a single value undefined.
* object for more complex data structures.
* symbol for unique identifiers.


# Example 10 Operators (“unary”, “binary”, “operand”)
* Unary operator example 

~~~javascript 
let x = 1;
x = -x;
alert( x ); // -1, unary negation was applied
~~~


* An operator is binary if it has two operands. The same minus exists in the binary form as well:


~~~javascript
let x = 1, y = 3;
alert( y - x ); // 2, binary minus subtracts values
~~~


# Example 11 Loops and Conditions 
* Using the while loop 
    * The while loop has the following syntax:
    * ~~~javascript
        while (condition) {
         // code
            // loop body"
        } 
      ~~~

While the condition is true, the code from the loop body is executed.

~~~javascript
let i = 0;
while (i < 3) { // shows 0, then 1, then 2
  alert( i );
  i++;
}
~~~

<br></br>

# Example 12 For Loop

* The for loop is the most often used one.

e.g 
~~~javascript 
for (begin; condition; step) {
  // ... loop body ...
}
~~~

Lets Implement as sample example 

~~~javascript
for (let i = 0; i < 3; i++) { // shows 0, then 1, then 2
  alert(i);
}
~~~

* Breaking  the loop 

~~~javascript 
let sum = 0;

while (true) {

  let value = +prompt("Enter a number", '');

  if (!value) break; // (*)

  sum += value;

}
alert( 'Sum: ' + sum );
~~~

* using Continue to continue to the next iteration
~~~javascript 
for (let i = 0; i < 10; i++) {

  // if true, skip the remaining part of the body
  if (i % 2 == 0) continue;

  alert(i); // 1, then 3, 5, 7, 9
}
~~~
<br>

# Example 13 Using the switch Statement 

~~~javascript 
switch(x) {
  case 'value1':  // if (x === 'value1')
    ...
    [break]

  case 'value2':  // if (x === 'value2')
    ...
    [break]

  default:
    ...
    [break]
}
~~~

* Using the the Switch Example 

~~~javascript 
let a = 2 + 2;

switch (a) {
  case 3:
    alert( 'Too small' );
    break;
  case 4:
    alert( 'Exactly!' );
    break;
  case 5:
    alert( 'Too large' );
    break;
  default:
    alert( "I don't know such values" );
}
~~~

# Example 14 Writing Functions 

* To create a function we can use a function declaration.

~~~javascript
function showMessage() {
  alert( 'Hello everyone!' );
}
~~~

Our new function can be called by its name: showMessage().

* Function with Parameters 

~~~javascript
function showMessage(a, b , c) {
  alert( 'Hello everyone!' );
}
~~~

* Function with Parameters 

~~~javascript
function showMessage(a, b , c) {
  alert( 'Hello everyone!' );
}
~~~

* function with Default Values 
~~~javascript 
function test(a=10, b=10, c){
    console.log(a,b,c);
}

test()
~~~

*  function accepting functions as params 
~~~javascript
function test(myfn){
    myfn();
}

t = function m1(){
    console.log("xxx")
}
test(t);
~~~

* functions returning the value
~~~javascript 
function test(){

    a = {}; 
    a.username = 'nilesh'; 
    a.password = 'pqr'; 
    return a; 
}
console.log(test())
~~~ 

* function returning functions 

~~~javascript 
function test(){

    return ()=>{ //anonyfn }; 
}
console.log(test())
~~~ 


~~~javascript 
function a(){
	 function b(){
   	console.log("b was invoked....")
   }
   return b; 

}
console.log(a()())
~~~ 


#### Tips 
* Values passed to a function as parameters are copied to its local variables.
* A function may access outer variables. But it works only from inside out. The code outside of the function doesn’t see its local variables.
* A function can return a value. If it doesn’t then its result is undefined.



# Example 15 using Conditions if/else 

* The “if” statement
~~~javascript
if (year == 2021) {
  alert( "You are a Db 2021 Grad!" );
}
~~~

* The “else” clause

~~~javascript 
let year = prompt('In which year was ECMAScript-2015 specification published?', '');

if (year == 2015) {
  alert( 'You are alumini' );
} else {
  alert( 'You Are not a alumni of 2015 ?' ); // any value except 2015
}
~~~

* using the Ternerary Operator 
The condition is evaluated, if it’s truthy then value1 is returned, otherwise – value2.


~~~javascript
let result = condition ? value1 : value2

let isValidAge = age > 18 ? true : false;
~~~

<br></br>

# Example 16 Understanding The  DataStructure 
*  Array []
*  Object {} 
*  JSON.stringify()  JSON 
*  JSON.parse();

* Array of Numbers 
~~~javascript 
a = [1,2,4,5,10,6,3]
a = {'a': 1};
a = [{'a': 1},{'a': 1},{'a': 1}]
~~~

# Using the Closures of Lambda's 

*  Lambda function or aka Arrow function expressions

// Traditional Function
~~~javascript
function (a){
  return a + 100;
}
~~~
// Arrow Function Break Down

// 1. Remove the word "function" and place arrow between the argument and opening body bracket
~~~javascript
(a) => {
  return a + 100;
}
~~~

// Traditional Function
~~~javascript
function (a, b){
  return a + b + 100;
}
~~~

// Arrow Function
~~~javascript
(a, b) => a + b + 100;
~~~
// Traditional Function (no arguments)
~~~javascript
let a = 4;
let b = 2;
function (){
  return a + b + 100;
}
~~~

# Example 17  Arrow Function (no arguments)

~~~javascript
let a = 4;
let b = 2;
() => a + b + 100;
~~~

* Example of the Set Time out Event Loop
~~~javascript 
const s = new Date().getSeconds();

setTimeout(function() {
  // prints out "2", meaning that the callback is not called immediately after 500 milliseconds.
  console.log("Ran after " + (new Date().getSeconds() - s) + " seconds");
}, 500)

while (true) {
  if (new Date().getSeconds() - s >= 2) {
    console.log("Good, looped for 2 seconds")
    break;
  }
}
~~~
<br></br>
# Example 18 Using the AJAX Request xhr 
~~~html
<div id="demo">
</div>
~~~

~~~javascript 
//The first line in the example above creates an XMLHttpRequest object:
var xhttp = new XMLHttpRequest();
//The onreadystatechange property specifies a function to be executed every time the status of the XMLHttpRequest object changes:

xhttp.onreadystatechange = function() {
  //When readyState property is 4 and the status property is 200, the response is ready:
  if (this.readyState == 4 && this.status == 200) {
       // Typical action to be performed when the document is ready:
       document.getElementById("demo").innerHTML = xhttp.responseText;
    }
};
//
xhttp.open("GET", "filename", true);
xhttp.send();
~~~ 

# Example 19  Async and Await in javascripts 

 * We have the async keyword, which you put in front of a function declaration to turn it into an async function

~~~javascript
async function hello() { 
    return "Hello" 
};
hello();
~~~

# Example 20 Invoking promises  
* Invoking the function will return the promise

~~~javascript 
 hello.then(console.log) // will print the returned value
~~~


