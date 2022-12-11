package com.ce.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ce.service.CounterService;
import com.ce.service.GreetService;

@Component
public class HomeUI implements CommandLineRunner {

	@Value("${app.title}")
	private String appTitle;
	
	@Autowired
	private Scanner scan;
	
	@Autowired
	@Qualifier("greetServiceDefaultImpl")
	private GreetService greetService;
	
	@Autowired
	@Qualifier("greetServiceTimeBasedImpl")
	private GreetService greetService2;
	
	@Autowired
	@Qualifier("greetServiceMultiLingualImpl")
	private GreetService greetService3;
	
	
	@Autowired
	private CounterService c1;
	
	@Autowired
	private CounterService c2;
	
	@Autowired
	private CounterService c3;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(appTitle);
		
		System.out.print("Enter you name: ");
		String name = scan.nextLine();
		
		System.out.println(greetService.greet(name));
		System.out.println(greetService2.greet(name));
		System.out.println(greetService3.greet(name));
		
		System.out.println(c1.next());
		System.out.println(c2.next());
		System.out.println(c3.next());
	}

}


