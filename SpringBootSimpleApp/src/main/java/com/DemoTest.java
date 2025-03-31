package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		// entry of the application
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args); // start the application
		System.out.println("Spring Boot Is Ready...");

	}

}
