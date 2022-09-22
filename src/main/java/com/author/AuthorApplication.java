package com.author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class AuthorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorApplication.class, args);
		System.out.println(Math.random()*10000000);
	}

}
