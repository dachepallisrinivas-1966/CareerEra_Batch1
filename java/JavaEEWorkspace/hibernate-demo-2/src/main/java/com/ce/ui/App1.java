package com.ce.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Employee;
import com.ce.entity.Laptop;

public class App1 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Laptop.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		Laptop lap1 = new Laptop("HP");
		Employee emp1 = new Employee("Srinivas", "Dachepalli", lap1);
		
		Laptop lap2 = new Laptop("Lenovo");
		Employee emp2 = new Employee("Sai Pallavi", "Nemani", lap2);
		
		session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}

}
