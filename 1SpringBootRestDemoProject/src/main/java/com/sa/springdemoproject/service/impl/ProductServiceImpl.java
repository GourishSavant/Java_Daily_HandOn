package com.sa.springdemoproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.springdemoproject.entities.Product;
import com.sa.springdemoproject.exception.ProductAlreadyExistException;
import com.sa.springdemoproject.exception.ProductNotFoundException;
import com.sa.springdemoproject.repository.ProductRepository;
import com.sa.springdemoproject.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repo;

	public List<Product> getAllProducts() throws ProductNotFoundException {
//		List<Product> products = repo.findAll(); //in-built method 
		//Or
		List<Product> products = repo.getProducts(); //custom query
		if(products.isEmpty()) {
			throw new ProductNotFoundException("Product is empty. Please add...");
		}
		return products;
	}

	public Product saveProduct(Product product) throws ProductAlreadyExistException {
		Product product2 = null;
		if(repo.existsById(product.getProductId())) {
			throw new ProductAlreadyExistException("Product already exists. Please add another product...");
		}
		else {
			product2 = repo.save(product);
		}
		return product2;
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
