package com.pratian.one_to_one_uni;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer_1_1_Uni {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String name;
	private Date dateOfBirth;
	private String phoneNo;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "reservation_no")
	private Reservation_1_1_Uni reservation;
	
	// Default Constructor
	public Customer_1_1_Uni() {
	}

	public Customer_1_1_Uni( String name, Date dateOfBirth,
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
	public Reservation_1_1_Uni getReservation() {
		return reservation;
	}
	public void setReservation(Reservation_1_1_Uni reservation) {
		this.reservation = reservation;
	}
}