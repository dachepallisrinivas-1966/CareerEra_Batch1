package com.ce.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ce.model.Employee;
import com.ce.model.Gender;
import com.ce.service.NameComparator;
import com.ce.service.SalaryComparator;

public class EmployeeListDemo {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(101, "srinivas", LocalDate.of(2001, Month.APRIL, 15), 50000.0, Gender.MALE));
		emps.add(new Employee(103, "john", LocalDate.of(2002, Month.JUNE, 17), 56000.0, Gender.MALE));
		emps.add(new Employee(105, "david", LocalDate.of(2001, Month.SEPTEMBER, 26), 45000.0, Gender.MALE));
		emps.add(new Employee(104, "angel", LocalDate.of(2003, Month.JUNE, 18), 49000.0, Gender.FEMALE));
		emps.add(new Employee(102, "sandy", LocalDate.of(2001, Month.SEPTEMBER, 6), 50000.0, Gender.FEMALE));
		emps.add(new Employee(107, "marie", LocalDate.of(2001, Month.APRIL, 8), 52000.0, Gender.FEMALE));
		emps.add(new Employee(108, "asfand", LocalDate.of(2005, Month.APRIL, 21), 75000.0, Gender.MALE));
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
		
		Collections.sort(emps);
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
		
		Collections.sort(emps, new NameComparator());
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
		Collections.sort(emps, new SalaryComparator());
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------------------");
	}

}
