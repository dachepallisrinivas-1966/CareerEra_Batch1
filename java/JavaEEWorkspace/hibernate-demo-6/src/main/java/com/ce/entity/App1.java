package com.ce.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ce.util.HibernateUtil;

public class App1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Emp e = new Emp(101, "Vamsy", 25000);
		Manager m = new Manager(102, "Ramesh", 35000, 9000);
		ContractEmployee ce = new ContractEmployee(103, "Keerthi", 45000, 56);
		
		session.beginTransaction();
		session.save(e);
		session.save(m);
		session.save(ce);
		session.getTransaction().commit();

		session.close();
		
	}

}
