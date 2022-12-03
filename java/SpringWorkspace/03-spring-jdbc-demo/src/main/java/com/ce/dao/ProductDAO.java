package com.ce.dao;

import java.util.List;

import com.ce.model.Product;

public interface ProductDAO {
	int insertProduct(Product product);
	List<Product> getAllProducts();
}
