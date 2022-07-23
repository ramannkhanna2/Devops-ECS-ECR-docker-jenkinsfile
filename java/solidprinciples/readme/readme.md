# SOLID is a collection of important programming practices that were developed by Robert C. Martin.

SOLID consists of 5 coding practices:
SRP - Single responsibility principle
OCP - Open/close principle
LSP - Liskov substitution principle
ISP - Interface segregation principle
DIP - Dependency inversion principle


# SRP - Single responsibility principle
SRP - says that each method / class should be responsible for one specific activity. Inserting everything into one method does not meet the basic assumptions of objectivity, but also makes it difficult to read, repair or expand programs.

* This principle is very noticeable when we write an application that begins to grow with time. It is enriched with new functionalities. Then we want to use already existing classes and their capabilities. However, it turns out, that the class that A should do is also do B, C and D, which is not desired by the currently created implementation. Then the problem arises because we can no longer use the given class. In this situation, you can avoid sticking to the SRP.

~~~java 
import java.util.ArrayList;
import java.util.List;

class Note {
    private final List<String> comments = new ArrayList<>();
    private static int count = 0;

    void addComment(String text) {
        comments.add("" + (++count) + ": " + text);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), comments);
    }

// Persistent Responsibility 
import java.io.PrintStream;

class Persistence {
    void saveToFile(Note note, String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(note.toString());
        }
    }
}



class SRP {
    public static void main(String[] args) throws Exception {
        Note note = new Note();
        note.addComment("First note");
        note.addComment("Second note");

        Persistence persistence = new Persistence();
        String filename = "notes.txt";
        persistence.saveToFile(note, filename);

        System.out.println(note);
        Runtime.getRuntime().exec("gedit " + filename);
    }
}
~~~
# OCP - Open/close principle
The OCP principle says that the classes that we create are open to extensions and closed to modifications.

* The application that we create must be ready for extensions, because the systems are changing very quickly these days. Thanks to the OCP principle, we are able to repeatedly use our classes for various tasks, which promotes reusability of the code, but also makes it easy to understand.

~~~java
package solid.principles;

public abstract class Shape {
	public abstract double area();
}
~~~ 


~~~java 
package solid.principles;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return width * height;
	}
}

package solid.principles;

public class Circle extends Shape {
	public double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return radius * radius * Math.PI;
	}
}
~~~ 
* In other words we’ve closed it for modification by opening it up for extension.




# LSP - Liskov substitution principle
Functions that use pointers or references to base classes must also be able to use class objects that inherit from the base classes without having a thorough knowledge of these objects.



~~~java 
public class Rectangle {
    private int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure(" +
                "width=" + width +
                ", height=" + height +
                ')';
    }
}
~~~

~~~java
public class RectangleFactory {
    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }

    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }
}
~~~

~~~java

public class LspClient {
    public static void main(String[] args) {
        Rectangle rectangle = RectangleFactory.newRectangle(2, 4);
        Rectangle square = RectangleFactory.newSquare(4);

        showArea(rectangle);
        showArea(square);
    }

    private static void showArea(Rectangle figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure.toString());
    }
}
~~~ 

# ISP - Interface segregation principle
* ISP says: "Clients should not be forced to depend upon interfaces that they do not use"

* The interface should give a specific shape to the class, and the methods that must be implemented within the class should be common to all implementation classes.

~~~java
import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<String> documents = new ArrayList<>();

    void addDocument(String text) {
        documents.add(text);
    }

    @Override
    public String toString() {
        return String.join(", ", documents);
    }
}
~~~

~~~java 
public interface Fax {
    void InternetFax(Document d) throws Exception;
}
~~~

~~~java
public interface MultiFunctionDevice extends Printer, Scanner, Fax {
}
~~~


~~~java
public class MultiFunctionMachine implements MultiFunctionDevice {
    private Printer printer;
    private Scanner scanner;
    private Fax fax;

    MultiFunctionMachine(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

    public void Print(Document d) throws Exception {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }

    public void InternetFax(Document d) throws Exception {
        fax.InternetFax(d);
    }
}
~~~

~~~java
class PhotocopierHP implements Printer, Scanner {
    public void Print(Document d) {
        System.out.println("Print the text from the document: " + d);
    }

    public void Scan(Document d) {
        System.out.println("Scan the text of the document: " + d);
    }
}
~~~


~~~java 
public interface Printer {
    void Print(Document d) throws Exception;
}
~~~


~~~java 
public class PrinterHP implements Printer {
    public void Print(Document d) {
        System.out.println("Print the text from the document: " + d);
    }
}
~~~

~~~java
public interface Scanner {
    void Scan(Document d) throws Exception;
}
~~~

~~~java
public class ScannerSony implements Scanner {
    public void Scan(Document d) {
        System.out.println("Scan the text from the document: " + d);
    }
}
~~~

~~~java 
public class IspDemo {
    public static void main(String[] args) throws Exception {

        Document document = new Document();
        document.addDocument("Offer");
        document.addDocument("Invoice");

        PrinterHP printerHP = new PrinterHP();
        printerHP.Print(document);

        ScannerSony scannerSony = new ScannerSony();
        scannerSony.Scan(document);

        PhotocopierHP photocopierHP = new PhotocopierHP();
        photocopierHP.Print(document);

        FaxPanasonic faxPanasonic = new FaxPanasonic();

        MultiFunctionMachine multiFunctionMachine = new MultiFunctionMachine(printerHP, scannerSony, faxPanasonic);
        multiFunctionMachine.InternetFax(document);
    }
}

~~~

# DIP - Dependency inversion principle
* High-level modules should not depend on low-level modules
  Both should depend on abstractions.
* Abstractions should not depend on details.
Details should depend on abstractions. Usually by abstraction, we mean an abstract class or interface. Essentially, this means that we are introducing a certain abstraction, which allows us to exchange individual elements of the program with other ones more suitable for a specific task.

~~~java 
Spring app Demo
~~~ 



