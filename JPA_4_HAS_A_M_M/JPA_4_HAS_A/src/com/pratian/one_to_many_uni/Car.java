package com.pratian.one_to_many_uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars_1_M_uni")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "car_id")
	private long carId;
	
	@Column(name = "reg_no", unique = true)
	private String registrationNo;
	private short mileage;
	private byte noOfSeats;
	private String maker;
	private String model;
	
	// Default Constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Car(String registrationNo, short mileage, byte noOfSeats, String maker, String model) {
		super();
		this.registrationNo = registrationNo;
		this.mileage = mileage;
		this.noOfSeats = noOfSeats;
		this.maker = maker;
		this.model = model;
	}

	// Getter and setter methods
	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

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

}
