package com.ce.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.ce.model.Employee;
import com.ce.service.EmployeeService;

public class EmployeeUI  {
	
	@Autowired
	private static EmployeeService empService;
	
	private static Scanner scanner = new Scanner(System.in);

	@Autowired
	private DateTimeFormatter dtf;


	public static void main(String[] args) {
		Menu menu = null;
		Menu[] menus = Menu.values();
		
		
		
		while(menu != Menu.QUIT) {
			Arrays.stream(menus).map(m -> m.ordinal() + "\t" + m).forEach(System.out::println);
			System.out.println("Choice: ");
			int ch = scanner.nextInt();
			
			if (ch < 0 || ch >= menus.length) {
				System.out.println("invalid choice");
				continue;
			}
			
			menu = menus[ch];
			switch (menu) {
//			case LIST: doList();
//						break;
			case ADD: doAdd();
						break;
			case REMOVE: doRemove();
						break;
			case QUIT: System.out.println("App Terminated");
						break;
			
			}
		}
		
	}
	
//	private void doList() {
//		List<Employee> emps = empService.findAll();
//		
//		if (emps.isEmpty()) {
//			System.out.println("No Employees Foun");
//		} else {
//			emps.stream().forEach(System.out::println);
//		}
//	}
	
	
	private static void doAdd() {
		Employee emp = new Employee();
		System.out.println("Enter Name: ");
		emp.setFullName(scanner.next());
		System.out.println("Enter Basic Pay: ");
		emp.setBasic(scanner.nextDouble());
		System.out.println("Enter Join Date (dd-MM-yy): ");
		emp.setJoinDate(LocalDate.parse(scanner.next(), dtf));
		
		emp = empService.save(emp);
		System.out.println("Employee added");
	}
	
	private static void doRemove() {
		System.out.println("EmpId: ");
		long empId = scanner.nextLong();
		empService.deleteById(empId);
		System.out.println("Employee deleted");
	}
	
	
	

}
