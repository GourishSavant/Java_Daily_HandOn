package com.pratian.one_to_many_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "owners_1_M_uni")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long ownerId;
	private String name;
	
	@OneToMany
	@JoinColumn(name = "owner_id")
	private List<Car> cars = new ArrayList<Car>();
	
	// Default Constructor
	public Owner() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Owner(String name) {
		super();
		this.name = name;
	}

	// Getter and setter methods
	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public void addCar(Car car) {
		this.cars.add(car);
	}
}
