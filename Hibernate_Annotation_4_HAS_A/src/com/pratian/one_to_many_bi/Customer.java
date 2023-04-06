package com.pratian.one_to_many_bi;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers_1_M_bi")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private long customerId;
	private String name;
	
	@OneToMany
	@JoinTable(name = "customer_vehicles_1_m_bi")
	private Set<Vehicle> vehicles = new TreeSet<>();
	
	// Default Constructor
	public Customer() {  
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Customer(String name) {
		super();
		this.name = name;
	}

	// Getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void addVehicle(Vehicle vehicle) {
		this.getVehicles().add(vehicle);
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
