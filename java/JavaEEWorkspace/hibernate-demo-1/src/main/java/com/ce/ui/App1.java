package com.ce.ui;

import com.ce.entity.Song;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App1 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		Song song1 = new Song();
		song1.setSongid(2);
		song1.setName("Lag Jaa Gale");
		song1.setArtist("Latha Mangeshkar");
		
		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}

}
