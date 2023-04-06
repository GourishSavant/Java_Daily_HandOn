package com.pratian.one_to_one_bi;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestMain2 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		String hql = "SELECT c FROM Customer_1_1_Bi c WHERE c.reservation.state=:reservation_state";
		Query query = session.createQuery(hql);
		query.setParameter("reservation_state", "Confirmed");
		List<Customer_1_1_Bi> customers = query.list();
		for (Customer_1_1_Bi customer : customers) {
			System.out.println("-------------------------------------------");
			System.out.println("Customer Id  : " + customer.getCustomerId());
	    	System.out.println("Customer Name : " + customer.getName());
	    	System.out.println("Date of Birth : " + customer.getDateOfBirth());
	    	System.out.println("Email Id : " + customer.getEmail());
	    	System.out.println("Phone No : " + customer.getPhoneNo());
	    	System.out.println("Reservation No: " + customer.getReservation().getReservation_no());
	    	System.out.println("How Made: " + customer.getReservation().getHow_made());
	    	System.out.println("Reservation Status: " + customer.getReservation().getState());
	    	
		}
	}
}
