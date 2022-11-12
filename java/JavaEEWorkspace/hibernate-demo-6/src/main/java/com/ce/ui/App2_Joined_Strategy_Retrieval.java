package com.ce.ui;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ce.entity.Manager;
import com.ce.util.HibernateUtil;

public class App2_Joined_Strategy_Retrieval {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		try {
			Manager mgr = session.load(Manager.class, 1002);
			System.out.println(mgr);
		} catch(ObjectNotFoundException excep) {
			System.out.println("Manager is not found");
		}
		
		session.close();
		
	}

}
