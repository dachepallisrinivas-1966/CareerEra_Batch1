package com.ce.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Customer;
import com.ce.entity.Order;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(Order.class);
			configuration.addAnnotatedClass(Customer.class);
			
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}


