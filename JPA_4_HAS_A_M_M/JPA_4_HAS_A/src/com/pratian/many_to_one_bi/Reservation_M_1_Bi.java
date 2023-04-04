package com.pratian.many_to_one_bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation_M_1_Bi {

	@Id
	@GeneratedValue
	@Column(name = "RESERVATION_NO")
	private int reservation_no;
	private String state;
	private String how_made;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer_M_1_Bi customer; // many reservations for a Customer

	public Reservation_M_1_Bi() {
	}

	public Reservation_M_1_Bi(String state, String how_made) {
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

	public Customer_M_1_Bi getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_M_1_Bi customer) {
		this.customer = customer;
	}

}
