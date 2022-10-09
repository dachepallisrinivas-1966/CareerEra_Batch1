package com.ce.ui;

import java.util.Arrays;
import java.util.List;

import com.ce.model.Employee;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
			new Employee(1, "srinivas", 30000.0),
			new Employee(2, "john", 37000.0),
			new Employee(3, "david", 23000.0),
			new Employee(4, "jenny", 42000.0),
			new Employee(5, "miller", 29000.0),
			new Employee(1, "srinivas", 30000.0),
			new Employee(4, "mercy", 42000.0)
		);
		
		// empList.stream().forEach(emp -> System.out.println(emp));
		
		empList.stream().forEach(System.out::println);
		
		System.out.println("------------------------------------------------------------");
		
		empList.stream()
				.filter(emp -> emp.getSalary() >= 30000)
				.sorted()
				.forEach(System.out::println);

	}

}
