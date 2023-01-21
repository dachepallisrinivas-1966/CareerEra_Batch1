package com.ce.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ce.model.Employee;
import com.ce.service.EmployeeService;

@RestController
@RequestMapping("/emps")
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> findAll() {
		return new ResponseEntity<List<Employee>>(empService.findAll(), HttpStatus.OK);
	}
}
