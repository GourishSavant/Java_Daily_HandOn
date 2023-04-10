package com.sa.springdemoproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sa.springdemoproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	//in-built methods - Service layer or 
	//Custom query - Repository layer
	
	@Query(value = "select p from Product p") //HQL/JPQL
	//Or
//	@Query(value = "select * form product", nativeQuery = true) //SQL
	public List<Product> getProducts();
}
