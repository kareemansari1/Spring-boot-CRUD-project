package com.kareem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kareem.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
