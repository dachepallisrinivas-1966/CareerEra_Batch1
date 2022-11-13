package com.ce.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ce.entity.Book;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(new Book(null, "Let us C"));
		em.persist(new Book(null, "Pointers in C"));
		em.persist(new Book(null, "Java Complete Reference"));
		em.persist(new Book(null, "PLSQL Programming"));
		txn.commit();
		
		em.close();
		emf.close();

	}

}
