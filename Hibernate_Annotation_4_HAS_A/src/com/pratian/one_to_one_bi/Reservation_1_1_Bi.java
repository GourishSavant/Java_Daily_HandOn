package com.pratian.one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reservation_1_1_Bi {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private int reservation_no;
	private String state;
	private String how_made;
	
	@OneToOne(mappedBy = "reservation")
	private Customer_1_1_Bi customer;

	// Default Constructor
	public Reservation_1_1_Bi() {
	}

	public Reservation_1_1_Bi(String state, String how_made) {
		this.state = state;
		this.how_made = how_made;
	}

	public int getReservation_no() {
		return reservation_no;
	}

	public void setReservation_no(int reservation_no) {
		this.reservation_no = reservation_no;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHow_made() {
		return how_made;
	}

	public void setHow_made(String how_made) {
		this.how_made = how_made;
	}

	public Customer_1_1_Bi getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_1_1_Bi customer) {
		this.customer = customer;
	}

}
