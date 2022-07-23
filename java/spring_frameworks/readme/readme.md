# Softwares Required for this Unit 
*  STS (Spring Tool Suite 4.8)
*  Java 11 
*  Postman 
*  Chrome or any other browser 


#The Spring Framework 
The Framework consists of features organized into about 20 modules. These modules are grouped into Core Container, Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation, and Test, as shown in the following diagram.  
![Framework](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/images/spring-overview.png)


# Starting with a Spring boot Application 
To Create a application using spring boot use your Spring tool Suite 

![STS Starter](https://i.ibb.co/d6FRLr1/lab8-1.png)
The new Spring Starter project

Handling dependency management is a difficult task for big projects. Spring Boot resolves this problem by providing a set of dependencies for developers convenience.  
Spring Boot Starters make the bootstrapping process much easier and faster. The starter brings you required Maven dependencies as well as some predefined configuration bits.


Any Required Dependency can be added with spring boot starter avoiding long configurations


# Lets create a sample Spring Boot Web Starter Based Application 
![STS Spring boot](https://i.ibb.co/q9XbsPV/lab8-2.png)

The above will define GAV 
* GroupID 
* Artifact ID 
* Version of your application 

It will also decide your packaging method (Jar/WAR) and as well as the The java Version for your application  

***Note:*** 
Certain Version (Spring boot 2.x and above) would require Java 11 hence you need to check you java version
![Starter Selection](https://i.ibb.co/j3YcdGV/lab8-3.png)

Select the Required Starters   
Available starters
*  Spring Web 
*  Spring JPA 
*  Spring Boot Actuator 
*  ..... Many as show in the picture 

Here We will select only the Spring Web Starter 
![Web-Starter](https://i.ibb.co/pzbNG7V/lab8-4.png)

Check the classpath for the project which you added the Spring web starter the dependenties have automatically been added  
 
![Dependencies](https://i.ibb.co/fqcbM8r/lab8-5.png)


~~~java
package com.vinsys.lab8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

}

~~~
The Spring boot Application Wraps your application in the SpringApplication run method. 



* Understanding the pom.xml
~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.2</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.vinsys.lab8</groupId>
	<artifactId>lab8</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>lab8</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>
~~~

The Below defined dependencies have been automatically added to the pom 
* The Spring boot starter web allows you to have support for 
    * Tomcat Embedded Server 
    * Web Api (MVC and RestControllers)
    * The HTTP Support Api 
* The Boot-Starter test allows to add the Spring boot unit testing (With Spring web dependencies)

~~~xml
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
~~~


The below Section of the code in the pom.xml allows you to create Fat Jar . 
A Fat Jar is a jar that bundles all the dependencies required by a autonomous jar File 
This is what makes spring more and more easy to use 

~~~xml
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
~~~

Understanding the Spring application.properties
The Application Properties (application.properties|application.yaml) can be used to customize and configure the behaviour of the spring components   
At this moment we will only set the Application name and the Server port 
~~~properties
spring.application.name=Airports App
server.port=8080
~~~

Building A new Rest Service :  
Create a new Class in you Package and Name it as VerionInfoAPIController 
![Controller](https://i.ibb.co/rFxHJLs/lab8-6.png)

Marking the class as Restcontroller so that The Spring Boot Component Scan can Scan the Annotation and Register the class as API Rest Service 

~~~java 
package com.vinsys.lab8;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerionInfoAPIController {

}


~~~

The Spring Application Supports many Such annotation to define a Service one should mark a method with 
appropriate method Mapping which are support e.g. 
* GET 
* POST 
* PUT 
* HEAD 
* DELETE
* OPTION 

The Get Method can be marked using @GetMapping similary @PostMapping will map post method 
Read more about the Http Click the link [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) 

We will be using a get method to demonstrate our first example 
Add a method as defined below in your code 
~~~java
package com.vinsys.lab8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerionInfoAPIController {

	@GetMapping(path = "version")
	public String getVersion() {
		return "1.0-Snapshot";
	}
}
~~~

To run the code in you Application Do the following 
Right click on you Launcher Class and Run as a Spring boot Application 

![Running](https://i.ibb.co/b7GhjCf/lab8-7.png)


See the output on the console you will see a web server launched and awaited 
![Logs](https://i.ibb.co/YpF52jM/lab8-8.png)  

Testing the Web Service : 
The WebService Which you have developed either using 
* PostMan 
* or a browser as its a get Method 

![Postman Testing](https://i.ibb.co/JQ1Jm3J/lab8-9.png)

Adding A post mapping to your service


~~~java 
package com.vinsys.lab8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerionInfoAPIController {

	@GetMapping(path = "version")
	public String getVersion() {
		return "1.0-Snapshot";
	}

	@PostMapping(path = "addInfo", consumes = "application/json")
	public String addInfo(@RequestBody Payload payload) {
		System.out.println(payload.getAuthor());
		System.out.println(payload.getName());
		System.out.println(payload.getVersion());
		return "Success";
	}
}

~~~ 

Create the New Payload Class 
~~~
package com.vinsys.lab8;

public class Payload {

	String version;
	String name;
	String author;

	public String getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
~~~

**Note** Restart you application before testing if you have not added the DevTool Starter to your pom 

Testing the Post Controller using Postman
![Testing](https://i.ibb.co/9tPQ7wV/lab8-19.png)

* The Body should have Type as raw and The Content Type to be set as JSON 
* The Method Should be post and must use POST to call the @PostMapping services 


 
# Adding Services and Other Applications Beans 
Refer to you SuperGrad (Airports Application) Which Demonstrates the complete Application Beans  


## Testing Dependency Injection 
Creating a new class as a dependency for our service and mark the class as a service 

~~~java
package com.vinsys.lab8;

import org.springframework.stereotype.Service;

/**
 * @Bean or @Service ... will register this class on component scan and will be
 *       taken as a service
 * @author nilesh
 *
 */
@Service
public class Application {

	public Double getRandom() {
		return Math.random();
	}
}

~~~

## injecting the class dependency in our service 
~~~java
package com.vinsys.lab8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerionInfoAPIController {

	@Autowired
	private Application application;
	
	@GetMapping(path = "version")
	public String getVersion() {
		return "1.0-Snapshot";
	}

	@PostMapping(path = "addInfo", consumes = "application/json")
	public String addInfo(@RequestBody Payload payload) {
		System.out.println(payload.getAuthor());
		System.out.println(payload.getName());
		System.out.println(payload.getVersion());
		System.out.println(application.getRandom());
		return "Success";
	}
}
~~~

Test the injected Autowired Dependency using postman by again calling the service 
