package com.ce.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Job;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Job.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}


