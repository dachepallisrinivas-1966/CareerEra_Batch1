package com.ce.model;

public class Manager extends Employee {
	private double allowance;
	
	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, double allowance) {
		super(name, age, salary);
		this.allowance = allowance;
	}
	
	public double getAllowance() {
		return this.allowance;
	}

}
