package com.ce.model;

public class Student extends Person {
	private double fee;
	
	public Student() {
		super();
	}

	public Student(String name, int age, double fee) {
		super(name, age);
		this.fee = fee;
	}
	
	public double getFee() {
		return this.fee;
	}

}
