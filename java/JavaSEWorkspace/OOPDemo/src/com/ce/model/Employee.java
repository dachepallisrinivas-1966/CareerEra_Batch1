package com.ce.model;

public class Employee extends Person {
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}

}
