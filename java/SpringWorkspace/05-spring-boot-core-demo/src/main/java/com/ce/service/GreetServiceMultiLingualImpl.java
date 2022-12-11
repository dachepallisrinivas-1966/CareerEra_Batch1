package com.ce.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetServiceMultiLingualImpl implements GreetService {

	//@Value("${greetings.array}")
	//private String[] greetings;

	@Value("#{${greetings.set}}")
	private Set<String> greetings;
	
	@Override
	public String greet(String userName) {
		
		StringBuilder greeting = new StringBuilder();
		for(String greet : greetings) {
			greeting.append("\n" + greet + " " + userName);
		}
		return greeting.toString();
	}

}
