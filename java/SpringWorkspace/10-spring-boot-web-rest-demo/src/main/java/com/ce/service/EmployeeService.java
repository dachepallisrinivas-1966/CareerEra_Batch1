package com.ce.service;

import java.util.List;

import com.ce.exception.EmployeeException;
import com.ce.model.Employee;

public interface EmployeeService {
	Employee add(Employee emp) throws EmployeeException;
	Employee save(Employee emp) throws EmployeeException;
	void deleteById(Long empId);
	Employee findById(Long empId);
	
	List<Employee> findAll();
	
}
