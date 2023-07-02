package com.example.API_Development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.API_Development_Assignment")
public class ApiDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDevelopmentApplication.class, args);
	}

}
