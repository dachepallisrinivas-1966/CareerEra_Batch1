package com.ce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ce.dao.EmployeeDAO;
import com.ce.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO empDAO;
	
	@Override
	public Employee save(Employee emp) {
		return empDAO.save(emp);
	}

	@Override
	public void deleteById(Long empId) {
		empDAO.deleteById(empId);

	}

//	@Override
//	public Optional<Employee> findById(Long empId) {
//		return empDAO.findById(empId);
//	}
//
//	@Override
//	public List<Employee> findAll() {
//		return empDAO.findAll();
//	}

}
