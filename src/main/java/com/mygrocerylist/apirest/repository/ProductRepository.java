package com.mygrocerylist.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygrocerylist.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	Product findById(long id);
		
}
