package com.ce.ui;

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
		session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setName("priya");
		customer.setMobile("9247212540");
		
		Order order1 = new Order();
		order1.setOrderId(1001);
		order1.setItemName("washing machine");
		order1.setCost(15600.0);
		
		Order order2 = new Order();
		order2.setOrderId(1002);
		order2.setItemName("microwave oven");
		order2.setCost(15600.0);
		
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		
		session.persist(order1);
		session.persist(order2);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
