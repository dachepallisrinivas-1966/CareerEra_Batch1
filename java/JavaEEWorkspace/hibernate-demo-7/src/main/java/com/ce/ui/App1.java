package com.ce.ui;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ce.entity.Job;
import com.ce.util.HibernateUtil;

public class App1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

//		Query query = session.createQuery("from Job");
//		List<Job> jobs = query.list();
//		jobs.forEach(System.out::println);
		
		TypedQuery<Job> query = session.createQuery("from Job", Job.class);
		query.getResultList().forEach(System.out::println);
		
		TypedQuery<Job> query2 = session.createQuery("from Job j WHERE j.jobId = 'j1'", Job.class);
		System.out.println(query2.getSingleResult());
		
		
		TypedQuery<Job> query3 = session.createQuery("from Job j WHERE j.jobTitle like 'M%'", Job.class);
		query3.getResultList().forEach(System.out::println);
		
	}

}
