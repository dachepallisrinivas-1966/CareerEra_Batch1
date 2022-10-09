package com.ce.service;

import java.util.Comparator;

import com.ce.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return ((Double)o1.getSalary()).compareTo(o2.getSalary());
	}

}
