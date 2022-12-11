package com.ce;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
