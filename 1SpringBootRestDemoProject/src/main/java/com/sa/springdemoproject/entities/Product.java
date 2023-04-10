package com.sa.springdemoproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Maps as Table in DB
@Data //Getter and setter methods, toString
@AllArgsConstructor //Parameterized constructor
@NoArgsConstructor //Default Constructor
public class Product {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO) //Auto generated values
	private long productId;
	private String name;
	private int quantity;
	private double price;

}
