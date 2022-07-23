# Junit Testing with Java 
## Softwares Required 
*  Java 11 
*  Spring STS/Eclipse 
*  Internet Connectivity for Maven and other Related Downloads of the Tools 

Setting up your project for unit testing using JUnit 

* Create a new Workspace 
* Add a new Simple java Maven Project 

![New Maven Project](https://i.ibb.co/c6YKN36/lab11-1.png)

![Project Details](https://i.ibb.co/ZSTjLvF/lab11-2.png)

* In the pom.xml add the Support dependencies for JUnit 
~~~xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.vinsys</groupId>
	<artifactId>lab11-unittesting</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.7.2</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
</project>
~~~~

#### adding java 11 support
~~~ java
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.vinsys</groupId>
	<artifactId>lab11-unittesting</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.7.2</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.0</version>
				<configuration>
					<release>11</release>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>
~~~

* Creating a stand alone class for testing 
Run the test using the Run as Unit Test 
![UnitTestRun ](https://i.ibb.co/tMLrX5H/lab11-3.png)

## Adding Setup and TearDown





## Generating Report for Test 
~~~xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.vinsys</groupId>
	<artifactId>lab11-unittesting</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.7.2</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<reporting>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-report-plugin</artifactId>
				<version>3.0.0-M5</version>
			</plugin>

		</plugins>
	</reporting>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.0</version>
				<configuration>
					<release>11</release>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-site-plugin</artifactId>
				<version>3.7.1</version>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-project-info-reports-plugin</artifactId>
				<version>3.0.0</version>
			</plugin>
		</plugins>
	</build>

</project>
~~~ 
in the above pom.xml we have added 

*  The Maven site plugin 
~~~xml
	<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-site-plugin</artifactId>
				<version>3.7.1</version>
    </plugin>
~~~~

*  The Reporting Configuration and Plugin 
~~~xml
<reporting>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-report-plugin</artifactId>
				<version>3.0.0-M5</version>
			</plugin>
		</plugins>
</reporting>
~~~

* The Report site integration Plugin 
~~~xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-project-info-reports-plugin</artifactId>
    <version>3.0.0</version>
</plugin>
~~~

* To generate the Site Report now with the Test Report (- coverage ) Currently the coverge report is not enable hence we will be getting only the Test Reports only 

* Select you pom and run the target mvn site or (Goal set to set) from the ide 

![Unit Testing report](https://i.ibb.co/N9XwhhM/lab11-4.png)


## Enabling the Coverage Report unit testing 

*   Coverage report  
    JaCoCo reports help you visually analyze code coverage by using diamonds with colors for branches and background colors for lines:
*   Lines coverage reflects the amount of code that has been exercised based on the number of Java byte code instructions called by the tests.
*   Branches coverage shows the percent of exercised branches in the code – typically related to if/else and switch statements.
*   Cyclomatic complexity reflects the complexity of code by giving the number of paths needed to cover all the possible paths in a code through linear combination.


#### Adding the jacoco plugin 
~~~xml 
<reporting>
<plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <reportSets>
                    <reportSet>
                        <reports>
                            <report>report</report>
                        </reports>
                    </reportSet>
                </reportSets>
            </plugin>
</plugins>
</reporting>
<build>
    <plugins>
     <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.7</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
    </plugins>
</build>
~~~
The complete maven pom.xml 
~~~xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.vinsys</groupId>
	<artifactId>lab11-unittesting</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.7.2</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<reporting>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-report-plugin</artifactId>
				<version>3.0.0-M5</version>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<reportSets>
					<reportSet>
						<reports>
							<report>report</report>
						</reports>
					</reportSet>
				</reportSets>
			</plugin>
		</plugins>
	</reporting>
	<build>
		<plugins>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.7</version>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>report</id>
						<phase>prepare-package</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.0</version>
				<configuration>
					<release>11</release>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-site-plugin</artifactId>
				<version>3.7.1</version>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-project-info-reports-plugin</artifactId>
				<version>3.0.0</version>
			</plugin>
		</plugins>
	</build>
</project>
~~~

The coverage report would Generate the coverage of each package level and class level and method level 

* To generate the Coverage report 
   *  mvn site 

* The generated Site report  
![Site Report](https://i.ibb.co/nMgc7xv/lab11-5.png) 

The coverage will determine the overall lines covered in current build 














