package com.service;

import com.model.Product;

public interface ProductService {
	
	void addProduct(Product product);
	
	void deleteProduct(int index);
	
	void getAllProduct(Product product); 
	
}
