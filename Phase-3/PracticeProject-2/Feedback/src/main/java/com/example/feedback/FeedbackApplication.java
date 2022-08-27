package com.example.feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.feedback")
public class FeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackApplication.class, args);
	}

}
