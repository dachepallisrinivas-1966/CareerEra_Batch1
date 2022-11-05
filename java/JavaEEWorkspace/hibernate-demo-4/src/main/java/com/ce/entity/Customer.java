package com.ce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "name")
	private String name;
	@Column(name = "mobile")
	private String mobile;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Order> orders;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	// utility method
	public void addOrder(Order order) {
		if (orders == null) {
			orders  = new ArrayList<>();	// lazy initialization
		}
		order.setCustomer(this);
		orders.add(order);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
	
}
