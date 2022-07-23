package com.airportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author Nilesh the application where spring boot container will
 *         initialize.... Standard Launcher application code ...
 */
@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableScheduling
public class AirportappsApplication {
	public static void main(String[] args) {
		// Wrapping the application in the spring container....
		SpringApplication.run(AirportappsApplication.class, args);
	}

}
