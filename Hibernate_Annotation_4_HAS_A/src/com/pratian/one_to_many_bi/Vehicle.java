package com.pratian.one_to_many_bi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles_1_M_bi")
public class Vehicle implements Comparable<Vehicle>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vehicle_id")
	private long vehicleId;
	
	private short mileage;
	private byte noOfSeats;
	private String maker;
	private String model;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	// Default Constructor
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Vehicle(short mileage, byte noOfSeats, String maker, String model) {
		super();
		this.mileage = mileage;
		this.noOfSeats = noOfSeats;
		this.maker = maker;
		this.model = model;
	}

	// Getter and setter methods
	public short getMileage() {
		return mileage;
	}

	public void setMileage(short mileage) {
		this.mileage = mileage;
	}

	public byte getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(byte noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
	public int compareTo(Vehicle other) {
		return this.maker.compareToIgnoreCase(other.maker);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
