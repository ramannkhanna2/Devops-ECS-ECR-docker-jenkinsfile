## Functional Programming in java 
Java functional programming comes into existence after Java 8th version onwards. Functional programming means a fundamental change in the approach of problem-solving. Functional programming allowing programming with expressions (declaring functions), passing functions as arguments and also used functions as statements.

Types of Functional Programming

Streams functional Programming
Lambda Expressions functional Programming
Method Reference functional Programming

## Lambda Expressions
A lambda expression consists of two parts separated by the “->” operator. The left side of the operator represents the list of input parameters, while the right side represents the function body.  
## Example Code for lambda
~~~~
(parameters) -> { statements };
~~~~

## Examples of Lambda 
~~~~java
// No arguments:
()-> System.out.println("lambda without parameter");
// One argument:
(parameter)-> System.out.println(parameter);
// Two arguments:
(x, y) -> x + y;
// Explicit argument types:
(Integer x, Integer y) -> x + y;
// Multiple statements:
(Integer x, Integer y) -> {
    System.out.println(x);
    System.out.println(y);
    return x + y;
}
~~~~


## Streams Functional Programming
~~~~java
package lab3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList(new String[] { "cat", "mat", "rat", "sat", "ate", "bet" });
		List<String> lettersA = numbers.stream().filter((x) -> x.contains("a")).collect(Collectors.toList());
		lettersA.forEach((a) -> {
			System.out.println(a);
		});
	}
}

~~~~


## Stream using Static Function .... 

~~~~java
package lab3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList(new String[] { "cat", "mat", "rat", "sat", "ate", "bet" });
		List<String> lettersA = numbers.stream().filter(StreamExample::filterA).collect(Collectors.toList());
		lettersA.forEach((a) -> {
			System.out.println(a);
		});
	}

	static boolean filterA(String input) {
		return input.contains("a");
	}
}
~~~~

    Built-In Functional Interface in Java 8
    Java 8 has many built-in functional interface classes in the java.util.function package that we can see in its documentation.
    
    In this article, I will only explain four of the most commonly used functional interfaces, but if you’re interested in more, you can read it in the Java API documentation noted above.
    
    Consumer<T>: A functional interface that accepts an object and returns nothing.
    Producer<T>: A functional interface that accepts nothing and returns an object.
    Predicate<T>: A functional interface that accepts an object and returns a boolean.
    Function<T, R>: A functional interface that accepts an object and returns another object.


## Writing your own functional Interface 
~~~~java
@FunctionalInterface
public interface CustomFunctionalInterface {

    CustomClass customMethod(String x);

    default String getDefaultMethodString() {
        return "Default Method";
    }
}
~~~~

