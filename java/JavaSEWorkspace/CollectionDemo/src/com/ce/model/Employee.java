package com.ce.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private LocalDate dateJoined;
	private double salary;
	private Gender gender;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(int empId, String name, LocalDate dateJoined, double salary, Gender gender) {
		this.empId = empId;
		this.name = name;
		this.dateJoined = dateJoined;
		this.salary = salary;
		this.gender = gender;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, name=%s, dateJoined=%s, salary=%s, gender=%s", empId, name,
				dateJoined, salary, gender);
	}

	@Override
	public int compareTo(Employee o) {
//		Integer currentEmpId = this.empId;
//		Integer otherEmpId = o.empId;
//		return currentEmpId.compareTo(otherEmpId);
		
		return ((Integer)this.empId).compareTo(o.empId);
	}
		
}
