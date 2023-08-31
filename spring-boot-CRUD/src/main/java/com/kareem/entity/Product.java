package com.kareem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@jakarta.persistence.Id
	@GeneratedValue
	private int Id;
	private String name;
	private int quantity; 
	private double price;

}
