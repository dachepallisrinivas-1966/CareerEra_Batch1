package com.ce.ui;

import com.ce.model.Product;

public class ProductApp {

	public static void main(String[] args) {
		
		Product.setTax(18);
		
		Product p1 = new Product();
		p1.setCode(101);
		p1.setName("soap");
		p1.setPrice(35.0);
	
		
		System.out.println(p1.getCode() + "\t" + p1.getName() + "\t" + p1.getPrice() + "\t" + Product.getTax());
		
		Product p2 = new Product();
		p2.setCode(102);
		p2.setName("oil");
		p2.setPrice(180.0);
		System.out.println(p2.getCode() + "\t" + p2.getName() + "\t" + p2.getPrice() + "\t" + Product.getTax());
	}

}
