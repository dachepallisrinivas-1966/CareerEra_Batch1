package com.ce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ce.exception.EmployeeException;
import com.ce.model.Employee;
import com.ce.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee add(Employee emp) throws EmployeeException {
		if (emp != null) {
			emp = empRepo.save(emp);
		}
		return emp;
	}

	@Override
	public Employee save(Employee emp) throws EmployeeException {
		if (emp != null) {
			emp = empRepo.save(emp);
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		return empRepo.findAll();
	}

	@Override
	public void deleteById(Long empId) {
		empRepo.deleteById(empId);
		
	}

	@Override
	public Employee findById(Long empId) {
		return empRepo.findById(empId).orElse(null);
	}

}
