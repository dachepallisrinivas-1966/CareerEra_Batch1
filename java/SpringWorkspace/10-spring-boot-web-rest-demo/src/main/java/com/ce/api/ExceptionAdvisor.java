package com.ce.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.ce.exception.EmployeeException;

@RestControllerAdvice
public class ExceptionAdvisor {

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<String> handleEmployeeException(EmployeeException excep) {
		return new ResponseEntity<String>(excep.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleEmployeeException(MethodArgumentTypeMismatchException excep) {
		return new ResponseEntity<String>("empid is not a number", HttpStatus.BAD_REQUEST);
	}
}
