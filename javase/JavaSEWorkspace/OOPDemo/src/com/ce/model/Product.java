package com.ce.model;

public class Product {
	private int code;
	private String name;
	private double price;
	
	/* static data member (or) class variable */
	private static int tax;
	
	public void setCode(int code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* static method */
	public static void setTax(int t) {
		tax = t;
	}
	
	public int getCode() {
		return this.code;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	/* static method */
	public static int getTax() {
		return tax;
	}
	
	
}

