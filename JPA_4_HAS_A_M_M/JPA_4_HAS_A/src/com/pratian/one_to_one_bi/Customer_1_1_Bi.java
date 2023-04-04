package com.pratian.one_to_one_bi;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Customer_1_1_Bi {
	// Instance variables
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO) 
	@PrimaryKeyJoinColumn  
	private int customerId;
	
	private String name;
	private Date dateOfBirth;
	private String phoneNo;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "reservation_no")
	private Reservation_1_1_Bi reservation;
	
	// Default Constructor
	public Customer_1_1_Bi() {
	}

	// Parameterized Constructor
	public Customer_1_1_Bi( String name, Date dateOfBirth,
			String phoneNo, String email) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.email = email;
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Reservation_1_1_Bi getReservation() {
		return reservation;
	}
	public void setReservation(Reservation_1_1_Bi reservation) {
		this.reservation = reservation;
	}
}