package com.ce.model;

import java.time.LocalDate;

public class User {
	private String fullName;
	private LocalDate dateOfBirth;
	private Gender gender;
	
	public User() {
		/* default constructor */
	}

	public User(String fullName, LocalDate dateOfBirth, Gender gender) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
