package com.ce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ce.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
