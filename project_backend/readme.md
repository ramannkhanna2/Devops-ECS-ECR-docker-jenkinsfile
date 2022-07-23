# About the Project 
OurAirports is a application desgined to meet he requirements to search all the airports of the world 
* The airports of the world are located in a src\main\resources\static\sqlscripts\airports_SQL 
* It is expected that you download the airports sql and upload the sql to you mysql and create the desired data 
* The application scaffolding is desgined in the the following format 
	|----src 
		  |---- com.airportsapp.vo (Standard Pojo VO Classes to hold Json to java and java to Json) 
		  			|---AirportVO.java
		  			|---CountryVO.java
		  			|---NavAidVO.java
		  			|---RegionVO.java
		  |----- com.airports.bo   (JPA Entities) 
		  			|----AirportEntity.java
				 	|----CountryEntity.java
				 	|----NavAidEntity.java
				 	|----RegionEntity.java			
		  |------com.airportapp.functions (Stream Functional programm) 
		  			|---- TransformerFunctions.java
		  |-----com.airportapp.repository (JPA Repository) 
					|-----IAirportRepository.java
					|-----ICountryRepository.java
					|-----INavAidRepository.java
					|-----IRegionRepository.java
		  |-----com.airport.security  (JWT Security ) 
		  		  	|----- LoginVO.java
		  			|----- LoginRestService.java
		  			|----- JWTUtil.java
		  			|----- JWTRequestFilter.java
		  			|----- CustomUserDetailsService.java
		  			|----- SecurityConfigurer.java
		  |-----com.airportapp.webservice (RestServices) 
		  			|-------AirportRestController.java
		  			
The Project contains the scafolfing for 54 Unit Test Cases and Katas Performed for your Solution 
Using the Scaffolding Studentsly will have to implement the following functionality 
@Test
	public void testListAllAirports() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAirportsByName() {
		fail("Not Yet Impemented");
	}

	@Test
	public void testFindAirportsByCountry() {
		fail("Not Yet Impemented");
	}

	@Test
	public void testFindAirportsBySize() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testFindAirportsByRunways() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testFindHelipads() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testFindAirportsByContinent() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testListAllRegions() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testListAllNavaids() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testGetRandomAirport() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testListCountries() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testListContinents() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testLogin() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testSignup() {
		fail("Not Yet Implemented");
	}

	@Test
	public void testHelp() {
		fail("Not Yet Implemented");
	}

	@Test
	public void listAirportsSorted() {
		fail("Not Yet Implemented");
	}

	@Test
	public void listAirportsPaginated() {
		fail("Not Yet Implemented");
	}
	
The flow : 
1.   User UI is written in React in the front end project 
2.   The UI will have the above functionality and connected via api calls to the backend to the system 
3.   Students will complete test cases and Achieve 
		* 80 % Coverage Report 
		* all Api with integration with the UI 
		* Web CSS integration of layout 
		* Documentation of the Site 
		* Implement Coverage Report 
		* Use of Design Patterns 
		* Deploy to GCP 
		* Apply the CICD Pipeline 
		
> Note the students will complete the project on thier own from the learning from the each day session 

# Getting Started



Setting up your project 
# softwares required 
* Maven 
* Java 11 
* Node with Npm 
* create-react-app installed 
* Spring tool suite

> Cloning the repo 

* git clone  <your Url> 

* cd <yourproject>

* mvn clean compile package 


Setting up your workspace 

* Start a new Workspace using Spring tool Suite


![Existing Maven](https://i.ibb.co/G2mnGfn/existing-maven.png)


* Choose Next  and Select the folder where you cloned your repository 
![Maven Project](https://i.ibb.co/xM0vzgz/maven2.png)


* Verify the source code and check the provided services 

![Source Code](https://i.ibb.co/sKTyY7F/verify-Source.png)


*Running the Application Locally   


![Local app](https://i.ibb.co/wB9RCJW/Run-As-Spring-boot-Application.png)



* Verify the port on which the application is started  

![Verify Port](https://i.ibb.co/Bt8yg7D/Tomcat-Started.png)


* Testing your app locally 

![Local](https://i.ibb.co/DwFYGF2/localhosttest.png)

# Deploying the application to the cloud over a app engine

1. Sign in to Cloud Console and create a new project or reuse an existing one. (If you don't already have a Gmail or Google Workspace account, you must create one.)

![Google Console](https://i.ibb.co/4W47v6W/google1.png)


2. Once you have clicked on the new project you will create the required project of your name as below 

![Create Project](https://i.ibb.co/rfc3K48/google2.png)


* Identifying your project details 

![Project Details ](https://i.ibb.co/cFLFrtT/google3.png)

>Note : Google Cloud can be operated from the cloud shell 

* Activate Cloud Shell


From the Cloud Console, click Activate Cloud Shell 
![](https://i.ibb.co/ZHV8H44/google4.png)

Once you click on the shell button you will get the shell for your application 
![Google Shell](https://i.ibb.co/94qty8B/google5.png)


Run the Following command to authorize the cloud shell To make call to the GCP APi 

![](https://i.ibb.co/n3ckR9Z/google6.png)

Run the auth Login 
![](https://i.ibb.co/Q8c4Ycd/google8.png)


Listing the project 
![Cloud](https://i.ibb.co/m5xspGb/google9.png)


* Updating your pom.xml

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" ...>
  ...
  <build>
    <plugins>
      <plugin>
        <groupId>com.google.cloud.tools</groupId>
        <artifactId>appengine-maven-plugin</artifactId>
        <version>2.2.0</version>
        <configuration>
          <version>1</version>
          <projectId>GCLOUD_CONFIG</projectId>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
~~~
** Add the above snippet with your project Id ** 

* Adding the App Engine Descriptor

~~~cmd 
mkdir -p src/main/appengine/
touch src/main/appengine/app.yaml
~~~
**Contents of the app.yaml**  
~~~yaml
runtime: java11  
instance_class: F1
~~~

#### **Different instance classes allow you to use different amounts of memory. F1 instance class is the smallest instance.**

* Deploy the app to App Engine
    First, initialize the project to be able to run App Engine apps. 

~~~cmd
gcloud app create --region us-central
You are creating an app for project [...].
WARNING: Creating an App Engine application for a project is irreversible and the region
cannot be changed. More information about regions is at
https://cloud.google.com/appengine/docs/locations
~~~

![AppEngin](https://i.ibb.co/GW2NfrX/google10.png)


Then Deploy your application using 
~~~cmd 
mvn -DskipTests package  appengine:deploy
~~~

![](https://i.ibb.co/ZV9XhLQ/google12.png)


Finally Run your 
~~~cmd
gcloud app browse
~~~
This willprint your cloud app url 



![](https://i.ibb.co/RYGFXRV/successcloud.png)


![Locating App](https://i.ibb.co/CwXCCN4/cloudlocation.png)
![AppSpot](https://i.ibb.co/bs7TdHc/appsopt.png)

Testing your deployed Application 


![Deployed App](https://i.ibb.co/1fMd7tp/appdeployed.png)

> ## <div style="color:red"> **Once you have tested delete your app project to avoid billing ** </div>


