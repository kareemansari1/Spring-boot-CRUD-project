package com.kareem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kareem.entity.Product;
import com.kareem.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Product createproduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public List<Product> FindAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product updateProduct(Product product, int Id) {
		// TODO Auto-generated method stub
		Product productId = repository.findById(Id).get();
		productId.setName(product.getName());
		productId.setPrice(product.getPrice());
		productId.setQuantity(product.getQuantity());
		return repository.save(productId);
	}

	@Override
	public void deleteproductbyid(int Id) {
		// TODO Auto-generated method stub
		repository.deleteById(Id);

	}

}
