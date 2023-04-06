package com.pratian.one_to_one_uni;

import java.sql.Date;

public class TestMain1 {

	public static void main(String[] args) {
		// Create reservation
		Reservation_1_1_Uni reservation = new Reservation_1_1_Uni("Confirmed", "Email");

		// Create a customer
		Date date = Date.valueOf("1995-03-24");
		Customer_1_1_Uni customer = new Customer_1_1_Uni("Chandra", date, "1234567890", "chandra@gmail.com");
		//add reservation to customer
		customer.setReservation(reservation);
		
		// Store customer using CustomerMgr
		CustomerMgr mgr = new CustomerMgr();
		mgr.createCustomer(customer);
	}
}
