## Softwares Required for this Labs
*  [JDK 1.8 or JDK 11](https://www.oracle.com/in/java/technologies/javase-jdk11-downloads.html#license-lightbox "Java 11")
*  [Eclipse 2021-06](https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-ee-developers "Eclipse 2021-06") | [Spring Tool Suite ](https://download.springsource.com/release/STS4/4.11.0.RELEASE/dist/e4.20/spring-tool-suite-4-4.11.0.RELEASE-e4.20.0-win32.win32.x86_64.self-extracting.jar "Spring STS") 
*  [Git](https://gitforwindows.org/)


## CheckList 
##### Check if the Required Java Version is installed in your system 
* Open a new Command Prompt and verify java -version 
![Check Java ](https://i.ibb.co/zbb0RRG/check-Java.png)
##### You must minimum java version 1.8 or above 

##### **Check if you have JDK Installed** 
###### JDK is (Java Development Kit & Compiler)
* Open A new Command Prompt and Check for the javac -version  
![Check Java ](https://i.ibb.co/9YPyk06/check-Javac.png)


#### **Create a new Workspace**
* The Workspace is place where your tool will manage a complete application source code and have required structure(scaffolding)
![Workspace](https://i.ibb.co/Nj1XzL2/lab1.png)

* Creating  a new Java Project   
* Select the Link in you STS/Eclipse to create a new Java project 
![New Workspace](https://i.ibb.co/qn6W3QH/Lab1-1.png)  
* Provide a name to the java project
![New Project](https://i.ibb.co/RCHPp1N/Lab1-2.png)

*  **Creating A User Defined Package**  
A Class Should always be in a package 
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories  
To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:  
Right Click on your ***src***  folder and create  a new package
![Link](https://i.ibb.co/qFFznMy/Lab1-Package.png)  
* Create a new Class withing the package 


~~~java
package lab1; // the package

/**
 * Documentation Block of Comment
 *
 */
public class HelloWorld {

	
	/**
	 * A Static block that is called once the class is loaded
	 */
	static {
		
	}
		
	/**
	 * The Constructor that would be called when a class is invoked to create a object 
	 */
	public HelloWorld() {
	}
	

	/**
	 * The Main Method that will be called as a part of the first Entry point
	 * @param args
	 */
	public static void main(String[] args) {
		// Statement to output data to screen 
		System.out.println("Welcome to World of java");
	}
}
~~~

* Running the Application   
To Run the application in the eclipse/sts you can right click the open editor anywhere and choose Run -> Run As Java Application  
![Run Java App](https://i.ibb.co/jTwb74h/Lab1-Runas.png)

Check the Outcome of the Application and Verify

#### The First Java Application is Built 

Questions and Answers 

Q.  Which of the following is not a valid comment:   
~~~~
a. /** comment */
b. /* comment */
c. /* comment
d. // comment
~~~~
Q.  What is the correct signature of the main method?
~~~~
a. public static void main 
b. void main
c. main 
d. static main 
~~~~

### Excercise : 
Use the Code in Snippet 2 and Find the Required Syntax errors in the program.
![Code2](./snippet2.txt)

## Common Issues and thier Solutions 

Compiler Problems
Common Error Messages on Microsoft Windows Systems

'javac' is not recognized as an internal or external command, operable program or batch file

If you receive this error, Windows cannot find the compiler (javac).

Here's one way to tell Windows where to find javac. Suppose you installed the JDK in C:\jdk1.8.0. At the prompt you would type the following command and press Enter:

C:\jdk1.8.0\bin\javac HelloWorldApp.java
If you choose this option, you'll have to precede your javac and java commands with C:\jdk1.8.0\bin\ each time you compile or run a program. To avoid this extra typing, consult the section Updating the PATH variable in the JDK 8 installation instructions.

Class names, 'HelloWorldApp', are only accepted if annotation processing is explicitly requested

If you receive this error, you forgot to include the .java suffix when compiling the program. Remember, the command is javac HelloWorldApp.java not javac HelloWorldApp.

Common Error Messages on UNIX Systems

javac: Command not found

If you receive this error, UNIX cannot find the compiler, javac.

Here's one way to tell UNIX where to find javac. Suppose you installed the JDK in /usr/local/jdk1.8.0. At the prompt you would type the following command and press Return:

/usr/local/jdk1.8.0/javac HelloWorldApp.java
Note: If you choose this option, each time you compile or run a program, you'll have to precede your javac and java commands with /usr/local/jdk1.8.0/. To avoid this extra typing, you could add this information to your PATH variable. The steps for doing so will vary depending on which shell you are currently running.

Class names, 'HelloWorldApp', are only accepted if annotation processing is explicitly requested

If you receive this error, you forgot to include the .java suffix when compiling the program. Remember, the command is javac HelloWorldApp.java not javac HelloWorldApp.

Syntax Errors (All Platforms)

If you mistype part of a program, the compiler may issue a syntax error. The message usually displays the type of the error, the line number where the error was detected, the code on that line, and the position of the error within the code. Here's an error caused by omitting a semicolon (;) at the end of a statement:

Testing.java:8: error: ';' expected
            count++
                   ^
1 error
If you see any compiler errors, then your program did not successfully compile, and the compiler did not create a .class file. Carefully verify the program, fix any errors that you detect, and try again.

Semantic Errors

In addition to verifying that your program is syntactically correct, the compiler checks for other basic correctness. For example, the compiler warns you each time you use a variable that has not been initialized:

Testing.java:8: error: variable count might not have been initialized
            count++;
            ^
Testing.java:9: error: variable count might not have been initialized
        System.out.println("Input has " + count + " chars.");
                                          ^
2 errors
Again, your program did not successfully compile, and the compiler did not create a .class file. Fix the error and try again.

Runtime Problems
Error Messages on Microsoft Windows Systems

Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp

If you receive this error, java cannot find your bytecode file, HelloWorldApp.class.

One of the places java tries to find your .class file is your current directory. So if your .class file is in C:\java, you should change your current directory to that. To change your directory, type the following command at the prompt and press Enter:

cd c:\java
The prompt should change to C:\java>. If you enter dir at the prompt, you should see your .java and .class files. Now enter java HelloWorldApp again.

If you still have problems, you might have to change your CLASSPATH variable. To see if this is necessary, try clobbering the classpath with the following command.

set CLASSPATH=
Now enter java HelloWorldApp again. If the program works now, you'll have to change your CLASSPATH variable. To set this variable, consult the Updating the PATH variable section in the JDK 8 installation instructions. The CLASSPATH variable is set in the same manner.

Could not find or load main class HelloWorldApp.class

A common mistake made by beginner programmers is to try and run the java launcher on the .class file that was created by the compiler. For example, you'll get this error if you try to run your program with java HelloWorldApp.class instead of java HelloWorldApp. Remember, the argument is the name of the class that you want to use, not the filename.

Exception in thread "main" java.lang.NoSuchMethodError: main

The Java VM requires that the class you execute with it have a main method at which to begin execution of your application. A Closer Look at the "Hello World!" Application discusses the main method in detail.

Error Messages on UNIX Systems

Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp

If you receive this error, java cannot find your bytecode file, HelloWorldApp.class.

One of the places java tries to find your bytecode file is your current directory. So, for example, if your bytecode file is in /home/jdoe/java, you should change your current directory to that. To change your directory, type the following command at the prompt and press Return:

cd /home/jdoe/java
If you enter pwd at the prompt, you should see /home/jdoe/java. If you enter ls at the prompt, you should see your .java and .class files. Now enter java HelloWorldApp again.

If you still have problems, you might have to change your CLASSPATH environment variable. To see if this is necessary, try clobbering the classpath with the following command.

unset CLASSPATH
Now enter java HelloWorldApp again. If the program works now, you'll have to change your CLASSPATH variable in the same manner as the PATH variable above.

Exception in thread "main" java.lang.NoClassDefFoundError: HelloWorldApp/class

A common mistake made by beginner programmers is to try and run the java launcher on the .class file that was created by the compiler. For example, you'll get this error if you try to run your program with java HelloWorldApp.class instead of java HelloWorldApp. Remember, the argument is the name of the class that you want to use, not the filename.

Exception in thread "main" java.lang.NoSuchMethodError: main
