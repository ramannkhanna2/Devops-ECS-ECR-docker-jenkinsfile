## Built in packages in Java
* java.io : Provides classes for system input/output operations. Classes like BufferedReader, BufferedWriter, File, InputStream, OutputStream, PrintStream, Serializable etc are part of this package.
* java.lang : Contains classes and interfaces that are fundamental to the design of Java programming language. Classes like String, StringBuffer, System, Math, Integer etc are part of this package.
* java.net : Provides classes for implementing networking applications. Classes like Authenticator, HttpCookie, Socket, URL, URLConnection, URLEncoder, URLDecoder etc are part of this package.
* java.sql : Provides the classes for accessing and processing data stored in a database. Classes like Connection, DriverManager, PreparedStatement, ResultSet, Statement etc are part of this package.
* java.util : Contains the collections framework, some internationalization support classes, properties, random number generation classes. Classes like ArrayList, LinkedList, HashMap, Calendar, Date, TimeZone etc are part of this package.


# Java lang package(java.lang)
Using the java Lang Package you donot need to import the lang package as it is implicitply available 

~~~~java
class SimpleJavaLangExample  {
   public static void main(String args []) {
      int a = 20, b =30;
      int sum = Math.addExact(a,b);
      int max = Math.max(a,b);
      double pi = Math.PI;
      System.out.printf("Sum = "+sum+", Max = "+max+", PI = "+pi); 
    }
 }
~~~~
Test the above code in you IDE and Record the output to check the use of the Math Functions

* Verify the Code Above the  Math  class is from the java.lang package 
* Similarly there are many other Classes that would be from the package 
    *  System 
    *  String 
    *  Thread 
    *  Exception ... and many More 
    
    
# Java io package(java.io)
Java IO(Input/Output) package provides classes and interfaces for handling system(computer, laptop etc) input and output operations. Using these classes programmer can take the input from user and do operations on that and then display the output to user. Generally input is given using keyboard/keypad. We can also do file handling(read/write) using the classes of this package.
~~~~java
import java.io.*;

public class Main {
   public static void main(String[] args)  {
      try {
         BufferedReader in = new BufferedReader(new FileReader("c:\\filename"));
         String str;
         
         while ((str = in.readLine()) != null) {
            System.out.println(str);
         }
         System.out.println(str);
      } catch (IOException e) {
      }
   }
}
~~~~
Test the above code in your ide to check the use of how to read the file in java 


## Example Code (Snippet Useful for our Project)
Reading A CSV file and splitting the content of the File using , seperator  
~~~~java
package lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("c:\\anycsvfile.csv"));
			String str;
			while ((str = in.readLine()) != null) {
				String[] cols = str.split(",");
				for (int i = 0; i < cols.length; i++) {
					System.out.println(cols[i]);
				}
			}
			System.out.println(str);
		} catch (IOException e) {
			// ideally you should catch all you exception
		}finally {
			// ideally you should release all your resource here
		}
	}
}
~~~~
![TIP](https://img.icons8.com/material-outlined/24/000000/info.png)  
The above code should be modified and used in the project to read you csv file to upload data to the system.

## Java util package(java.util)
Java util package provides the basic utility classes to java programmers. It is one of the most useful package for java programmers, it helps them to achieve different types of requirements easily by using it's predefined classes.
The program below uses Arrays class of this package to sort an array of integers. The Arrays class provides many api's(methods) for different array requirements
* Data Structures in java  are majorly built on the collection framework
* Collections are used in every programming language and when Java arrived, it also came with few Collection classes – Vector, Stack, Hashtable, Array.
* The collection Package is made up of mainly 
    1. Interfaces
        Java Collections Framework interfaces provides the abstract data type to represent collection.
        
        java.util.Collection is the root interface of Collections Framework. It is on the top of the Collections framework hierarchy. It contains some important methods such as size(), iterator(), add(), remove(), clear() that every Collection class must implement.
        
        Some other important interfaces are java.util.List, java.util.Set, java.util.Queue and java.util.Map. The Map is the only interface that doesn’t inherit from the Collection interface but it’s part of the Collections framework. All the collections framework interfaces are present in java.util package.
    2. Implementation Classes
        Java Collections framework provides implementation classes for core collection interfaces. We can use them to create different types of collections in the Java program.

        Some important collection classes are ArrayList, LinkedList, HashMap, TreeMap, HashSet, and TreeSet. These classes solve most of our programming needs but if we need some special collection class, we can extend them to create our custom collection class.
    3. Algorithms
        Algorithms are useful methods to provide some common functionalities such as searching, sorting and shuffling.

![The Collection Framework](https://i.ibb.co/BtLwQSc/lab3-1.png)

## Simple List Example 
~~~~java
public class ListExample {
    public static void main(String[] args) {
        // use type inference for ArrayList
        List<Integer> list = Arrays.asList(3,2,1,4,5,6,6);

        // alternative you can declare the list via:
        // List<Integer> list = new ArrayList<>();
        // and use list.add(element); to add elements
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

}
~~~~
## Sample Sorting Code with Java 
~~~~java 
import java.util.Arrays;
 
 class SortExampleJava {
   public static void main(String args []) {
      int[] intArray = {10,30,20,50,40};
      Arrays.sort(intArray);
      System.out.printf("Sorted array : %s", Arrays.toString(intArray)); 
    }
 }
~~~~
## Using the ArrayList
~~~~java
public class ArrayListExample  {
    public static void main(String[] args)
    {
  
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al
            = new ArrayList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);
  
        // Printing elements
        System.out.println(al);
  
        // Remove element at index 3
        al.remove(3);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(al);
  
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}
~~~~

## Using the Linked List 
~~~~java
import java.io.*;
import java.util.*;
  
public class LinkedListExample   {
    public static void main(String[] args)
    {
  
        // Declaring the LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);

        // Printing elements
        System.out.println(ll);
  
        // Remove element at index 3
        ll.remove(3);
  
        // Displaying the List
        // after deletion
        System.out.println(ll);
  
        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
~~~~ 


## Using the Stack Implementation with Iterator
~~~~java
import java.util.*;
public class StackExample {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Duestche");
        stack.push("Java");
        stack.push("Grads");
        stack.push("Program");
  
        // Iterator for the stack
        Iterator<String> itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println();
  
        stack.pop();
  
        // Iterator for the stack
        itr= stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
~~~~

## A Hasset Example which can help you to avoid duplicate values 
~~~~java
import java.util.*;
public class HashSetDemo {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();
 
        hs.add("Vinsys");
        hs.add("Java");
        hs.add("Grads");
        hs.add("Program");
        hs.add("is Very Helpful");
  
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
~~~~

## Using the HashMap for Key=Value  
~~~~java
import java.util.*;
public class HashMapDemo {
    public static void main(String args[])
    {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
  
        hm.put("Greeting" , "Welcome to DB Java Grads Program");
        hm.put(2, "Java Grads is a Great Program ");
        hm.put(3, "We Can Learn Java From it ");
  
        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
  
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
~~~~ 

## Interfaces which extend the Collections Interface

1. Iterable Interface: This is the root interface for the entire collection framework. The collection interface extends the iterable interface. Therefore, inherently, all the interfaces and classes implement this interface. The main functionality of this interface is to provide an iterator for the collections. Therefore, this interface contains only one abstract method which is the iterator. It returns the

2. Collection Interface: This interface extends the iterable interface and is implemented by all the classes in the collection framework. This interface contains all the basic methods which every collection has like adding the data into the collection, removing the data, clearing the data, etc. All these methods are implemented in this interface because these methods are implemented by all the classes irrespective of their style of implementation. And also, having these methods in this interface ensures that the names of the methods are universal for all the collections. Therefore, in short, we can say that this interface builds a foundation on which the collection classes are implemented.

3. List Interface: This is a child interface of the collection interface. This interface is dedicated to the data of the list type in which we can store all the ordered collection of the objects. This also allows duplicate data to be present in it. This list interface is implemented by various classes like ArrayList, Vector, Stack, etc. Since all the subclasses implement the list, we can instantiate a list object with any of these classes


## Self Study More Read..... For Collections 
* List Interface
* Abstract List Class
* Abstract Sequential List Class
* Array List
* Vector Class
* Stack Class
* LinkedList Class
* Queue Interface
* Blocking Queue Interface
* AbstractQueue Class
* PriorityQueue Class
* PriorityBlockingQueue Class
* ConcurrentLinkedQueue Class
* ArrayBlockingQueue Class
* DelayQueue Class
* LinkedBlockingQueue Class
* LinkedTransferQueue
* Deque Interface
* BlockingDeque Interface
* ConcurrentLinkedDeque Class
* ArrayDeque Class
* Set Interface
* Abstract Set Class
* CopyOnWriteArraySet Class
* EnumSet Class
* ConcurrentHashMap Class
* HashSet Class
* LinkedHashSet Class
* SortedSet Interface
* NavigableSet Interface
* TreeSet
* ConcurrentSkipListSet Class
* Map Interface
* SortedMap Interface
* NavigableMap Interface
* ConcurrentMap Interface
* TreeMap Class
* AbstractMap Class
* ConcurrentHashMap Class
* EnumMap Class
* HashMap Class
* IdentityHashMap Class
* LinkedHashMap Class
* HashTable Class
* Properties Class
* Other Important Concepts
* How to convert HashMap to ArrayList
* Randomly select items from a List
* How to add all items from a collection to an ArrayList
* Conversion of Java Maps to List
* Array to ArrayList Conversion
* ArrayList to Array Conversion
* Differences between Array and ArrayList


##  java.sql (JDBC Package)
We have relational databases, from which at many times we need to access the data. For various data processing related matters from RDDBMS we have java.sql package. The various classes in the package are shown below:

* Steps to create JDBC connection:  
Register the database driver with java.sql.DriverManager, where DriverManager is a class which is given under JDBC specifications. You can do this by loading driver implementation class into the JVM by using Class.forName().
Open a session to database, i.e. establish a connection to database. You can do this by calling DriverManager.getConnection() method, which returns Connection object

~~~~java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JdbcConnection {
 
    public static void main(String a[]){
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.
                getConnection("jdbc:mysql://<hostname>:<port num>/<DB name>","user","password");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
~~~~


* Statement and ResultSet in JDBC  
JDBC Statement:

java.sql.Statement is an interface. It provides some methods through which we can submit SQL queries to the database. It will be implemented by driver implementation providers. createStatement() method on Connection object will return Statement object.

JDBC ResultSet:

java.sql.ResultSet also an interface and is used to retrieve SQL select query results. A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row. The next method moves the cursor to the next row, and because it returns false when there are no more rows in the ResultSet object, it can be used in a while loop to iterate through the result set. It provides getXXX() methods to get data from each iteration. Here XXX represents datatypes.

~~~~java
public class QueryResultsExample {
 
    public static void main(String a[]){
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager
                .getConnection("jdbc:mysql://<hostname>:<port num>/<DB name>"
                    ,"user","password");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            ResultSet rs = stmt.executeQuery("yourselectstatement......");
            while(rs.next()){
                System.out.println(rs.getString("yourcolname"));
                System.out.println(rs.getInt("yourcolname"));
            }
            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
~~~~

* Updating Records using JDBC 

~~~~java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCUpdateExample {
 
    public static void main(String[] args) {
         
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                    getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
                        ,"user","password");
            stmt = con.createStatement();
            String query = "update table emp set salary=2000 where empid=200";
            //count will give you how many records got updated
            int count = stmt.executeUpdate(query);
            System.out.println("Updated queries: "+count);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}
~~~~
