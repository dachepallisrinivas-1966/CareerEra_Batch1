package com.ce.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ce.entity.Manager;
import com.ce.util.HibernateUtil;

public class App3_Table_Per_Class_Strategy_Retrieval {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Manager mgr = session.get(Manager.class, 102);
		if (mgr != null)
			System.out.println(mgr);
		else
			System.out.println("Manager is not found");
		
		session.close();
		
	}

}
