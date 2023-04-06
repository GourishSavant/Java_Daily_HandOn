package com.pratian.one_to_one_uni;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestMain2 {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
	    Session session=factory.openSession();
	    
	    // Get customer and its reservation details
	    TypedQuery<Customer_1_1_Uni> query = session.createQuery("from Customer_1_1_Uni");
	    List<Customer_1_1_Uni> list = query.getResultList();
	    
	    for(Customer_1_1_Uni customer : list) {
	    	System.out.println("Customer Id  : " + customer.getCustomerId());
	    	System.out.println("Customer Name : " + customer.getName());
	    	System.out.println("Date of Birth : " + customer.getDateOfBirth());
	    	System.out.println("Email Id : " + customer.getEmail());
	    	System.out.println("Phone No : " + customer.getPhoneNo());
	    	System.out.println("Reservation No : " + customer.getReservation().getReservation_no());
	    	System.out.println("How Made : " + customer.getReservation().getHow_made());
	    	System.out.println("Reservation State : " + customer.getReservation().getState());
	    }
	}
}
