package com.ce.ui;

import java.util.LinkedHashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ce.entity.Artist;
import com.ce.entity.Movie;
import com.ce.util.HibernateUtil;

public class App1 {
	
	private static Session session = null;

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Artist a1 = new Artist(101, "Prabhu Deva", new LinkedHashSet<Movie>());
		Artist a2 = new Artist(102, "Sharukh", new LinkedHashSet<Movie>());
		Artist a3 = new Artist(103, "Deepika", new LinkedHashSet<Movie>());
		
		
		Movie m1 = new Movie(1, "Abhinetri", new LinkedHashSet<Artist>());
		Movie m2 = new Movie(2, "Chennai Express", new LinkedHashSet<Artist>());
		
		m1.getArtists().add(a1);
		m1.getArtists().add(a3);
		
		m2.getArtists().add(a2);
		m2.getArtists().add(a3);
		
		a1.getMovies().add(m1);
		a2.getMovies().add(m2);
		a3.getMovies().add(m1);
		a3.getMovies().add(m2);
		
		session.beginTransaction();
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
