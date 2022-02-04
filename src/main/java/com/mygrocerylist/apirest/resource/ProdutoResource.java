package com.mygrocerylist.apirest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mygrocerylist.apirest.repository.ProductRepository;
import com.mygrocerylist.apirest.models.Product;


@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {
	
	@Autowired
	ProductRepository produtoRepository;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable(value = "id") long id){
		return produtoRepository.findById(id);
	}
	
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return produtoRepository.save(product);
	}
	
	
}
