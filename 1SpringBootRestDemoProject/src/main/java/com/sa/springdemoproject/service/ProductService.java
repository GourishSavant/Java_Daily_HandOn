package com.sa.springdemoproject.service;

import java.util.List;

import com.sa.springdemoproject.entities.Product;
import com.sa.springdemoproject.exception.ProductAlreadyExistException;
import com.sa.springdemoproject.exception.ProductNotFoundException;

public interface ProductService {
	
	public List<Product> getAllProducts() throws ProductNotFoundException; //GET
	public Product saveProduct(Product product) throws ProductAlreadyExistException; //POST
	public Product updateProduct(Product product); //PUT
	public String deleteProduct(long id); //DELETE
	public Product getProductById(long id); //GET
	public Product getProductByName(String name); //GET
	
}
