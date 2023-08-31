package com.kareem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kareem.entity.Product;
import com.kareem.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/product")
	public Product createproduct(@RequestBody Product product) {
		return service.createproduct(product);
	}

	@GetMapping("/product")
	public List<Product> getAllproduct() {
		return service.FindAll();
	}

	@PutMapping("product/{Id}")
	public Product updateproduct(@RequestBody Product product,@PathVariable int Id) {
		Product updaProduct = service.updateProduct(product, Id);
		return updaProduct;
	}

	@DeleteMapping("product/{Id}")
	public void deleteproductbyid(@PathVariable int Id) {
		service.deleteproductbyid(Id);
	}
}