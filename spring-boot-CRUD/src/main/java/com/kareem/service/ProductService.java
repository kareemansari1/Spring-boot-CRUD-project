package com.kareem.service;

import java.util.List;
import com.kareem.entity.Product;

public interface ProductService {

	// Create
	Product createproduct(Product product);

	// Read
	List<Product> FindAll();
	
	// Update
	Product updateProduct(Product product,int Id);
	
	// Delete
	void deleteproductbyid(int Id);

}
