package com.ce.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ce.model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		
		//Employee employee2 = context.getBean("employee2", Employee.class);
		//System.out.println(employee2);
		
		//System.out.println(employee == employee2);
		//System.out.println(employee.hashCode() + "\t" + employee2.hashCode());
		
		//System.out.println(context.isSingleton("employee"));
		//System.out.println(context.isPrototype("employee"));
		
		
		((AbstractApplicationContext) context).close();
	}

}
