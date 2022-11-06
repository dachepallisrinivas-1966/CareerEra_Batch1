package com.ce.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.ContractEmployee;
import com.ce.entity.Emp;
import com.ce.entity.Manager;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Emp.class);
			configuration.addAnnotatedClass(Manager.class);
			configuration.addAnnotatedClass(ContractEmployee.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}


