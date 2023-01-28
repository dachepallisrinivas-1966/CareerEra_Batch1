package com.ce.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ce.exception.EmployeeException;
import com.ce.model.Employee;
import com.ce.service.EmployeeService;

@RestController
@RequestMapping("/emps")
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService empService;
	
	// localhost:9090/emps
	@GetMapping
	public ResponseEntity<List<Employee>> findAll() {
		return new ResponseEntity<List<Employee>>(empService.findAll(), HttpStatus.OK);
	}
	
	// localhost:9090/emps/1
	@GetMapping("/{empId}")
	public ResponseEntity<Employee> findById(@PathVariable("empId") Long empId) {
		ResponseEntity<Employee> response = null;
		Employee employee = empService.findById(empId);
		if (employee == null)
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			response = new ResponseEntity<>(employee, HttpStatus.OK);
		return response;
	}
	
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) throws EmployeeException {
		emp = empService.add(emp);
		return new ResponseEntity<>(emp, HttpStatus.CREATED); 
	}
	
	
	@PutMapping
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) throws EmployeeException {
		emp = empService.save(emp);
		return new ResponseEntity<>(emp, HttpStatus.OK); 
	}
	
}
