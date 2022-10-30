package com.ce.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Employee;
import com.ce.entity.Laptop;

public class App2 {

	public static void main(String[] args) {
		// configuration
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Laptop.class);

		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// creating a session
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, 2L);
		
		if (employee != null) {
			session.beginTransaction();
			session.delete(employee);
			session.getTransaction().commit();
		} else {
			System.out.println("Employee not found");
		}

	}

}
