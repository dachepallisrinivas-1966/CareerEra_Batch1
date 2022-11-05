package com.ce.ui;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ce.entity.Customer;
import com.ce.entity.Order;
import com.ce.util.HibernateUtil;

public class App1 {
	
	private static Session session = null;
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Customer customer = session.get(Customer.class, 1);
		List<Order> orders = customer.getOrders();
		orders.forEach(System.out::println);
		session.close();
	}
}
