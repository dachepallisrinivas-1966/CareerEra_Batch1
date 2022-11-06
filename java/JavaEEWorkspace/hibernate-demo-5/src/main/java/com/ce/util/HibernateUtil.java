package com.ce.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Artist;
import com.ce.entity.Movie;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Artist.class);
			configuration.addAnnotatedClass(Movie.class);
			
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
}


