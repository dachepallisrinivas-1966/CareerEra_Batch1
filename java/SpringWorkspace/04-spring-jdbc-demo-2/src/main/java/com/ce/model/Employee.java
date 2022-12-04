package com.ce.model;

import java.time.LocalDate;

public class Employee {
	private long empId;
	private String fullName;
	private double basic;
	private LocalDate joinDate;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(long empId, String fullName, double basic, LocalDate joinDate) {
		this.empId = empId;
		this.fullName = fullName;
		this.basic = basic;
		this.joinDate = joinDate;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, fullName=%s, basic=%s, joinDate=%s", empId, fullName, basic,
				joinDate);
	}
	
	
	
}
