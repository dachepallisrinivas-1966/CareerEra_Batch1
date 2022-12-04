package com.ce.dao;

import java.util.List;
import java.util.Optional;

import com.ce.model.Employee;

public interface EmployeeDAO {
	Employee save(Employee emp);
	void deleteById(Long empId);
	//Optional<Employee> findById(long empId);
	//List<Employee> findAll();
}


