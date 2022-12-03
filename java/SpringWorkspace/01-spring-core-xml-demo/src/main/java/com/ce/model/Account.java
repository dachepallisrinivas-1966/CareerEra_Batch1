package com.ce.model;

public class Account {
	private String bankName;
	private String branch;
	private String city;
	
	public Account() {
		/* default constructor */
	}

	public Account(String bankName, String branch, String city) {
		this.bankName = bankName;
		this.branch = branch;
		this.city = city;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("bankName=%s, branch=%s, city=%s", bankName, branch, city);
	}
	
	
	
}
