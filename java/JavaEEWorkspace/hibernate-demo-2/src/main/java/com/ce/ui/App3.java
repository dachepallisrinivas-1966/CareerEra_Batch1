package com.ce.ui;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Employee;
import com.ce.entity.Laptop;

public class App3 {

	public static void main(String[] args) {
		// configuration
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Laptop.class);

		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, 3L);
		
		if (employee != null) {
			System.out.println(employee);
			Scanner scan = new Scanner(System.in);
			System.out.println("Want to see laptop details?");
			String choice = scan.next();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.println(employee.getLaptop());
			}
		} else {
			System.out.println("Employee not found");
		}

	}

}
