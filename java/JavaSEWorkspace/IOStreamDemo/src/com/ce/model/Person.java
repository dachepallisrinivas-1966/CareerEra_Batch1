package com.ce.model;

import java.beans.Transient;
import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private int age;
	
	private transient int salaryAccountNumber;
	
	
	public Person() {
		/* default constructor */
	}

	public Person(String name, int age, int salaryAccountNumber) {
		super();
		this.name = name;
		this.age = age;
		this.salaryAccountNumber = salaryAccountNumber;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s, salaryAccountNumber=%s]", name, age, salaryAccountNumber);
	}


	
	
	
}
