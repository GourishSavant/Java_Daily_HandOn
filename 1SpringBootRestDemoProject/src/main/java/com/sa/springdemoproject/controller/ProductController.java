package com.sa.springdemoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sa.springdemoproject.entities.Product;
import com.sa.springdemoproject.exception.ProductAlreadyExistException;
import com.sa.springdemoproject.exception.ProductNotFoundException;
import com.sa.springdemoproject.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
////	@RequestMapping(value = "/products", method = RequestMethod.GET)
//	//Or
//	@GetMapping("/products")
//	public List<Product> get(){
//		List<Product> products = null;
//		try {
//			products = service.getAllProducts();
//		} catch (ProductNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		return products;
//	}
	
	//Or - use ResponseEntity - status code and handle response properly
	
	//@RequestMapping(value = "/products", method = RequestMethod.GET)
	//Or
	@GetMapping("/products")
	@Operation(summary = "To get all products")
	public ResponseEntity<?> get(){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
		} catch (ProductNotFoundException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}
	
	@PostMapping("/product")
	@Operation(summary = "To save a product")
	public ResponseEntity<?> post(@RequestBody Product product){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.saveProduct(product), HttpStatus.OK);
		} catch (ProductAlreadyExistException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}
	

}
