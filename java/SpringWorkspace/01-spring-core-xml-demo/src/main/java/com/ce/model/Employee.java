package com.ce.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private String[] hobbies;
	private List<String> skills;
	private Set<String> qualifications;
	private Map<String, String> contacts;
	
	private Account salaryAccount;
	
	public Employee() {
		/* default constructor*/
	}
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Set<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(Set<String> qualifications) {
		this.qualifications = qualifications;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public Account getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(Account salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [empId=%s, empName=%s, salary=%s, hobbies=%s, skills=%s, qualifications=%s, contacts=%s, salaryAccount=%s]",
				empId, empName, salary, Arrays.toString(hobbies), skills, qualifications, contacts, salaryAccount);
	}

	
}
