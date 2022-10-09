package com.ce.service;

import java.util.Comparator;

import com.ce.model.Employee;
import com.ce.model.Gender;

public class GenderComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Gender currentGender = o1.getGender();
		Gender otherGender = o2.getGender();
		return currentGender.compareTo(otherGender);
	}

}
