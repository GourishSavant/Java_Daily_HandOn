package com.pratian.one_to_one_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestMain2 {

	public static void main(String[] args) {
		
		// Get Entity Manager Factory
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
				
				// Get Entity Manager 
				EntityManager em = factory.createEntityManager();
				
				// Begin Transaction
				em.getTransaction().begin();
	    
	    // Get customer and its reservation details
	    Query query = em.createQuery("from Customer_1_1_Uni");
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
	    
	    	// Commit Transaction
	 		em.getTransaction().commit();

	 		// Close the entity manager and factory
	 		em.close();
	 		factory.close();
	}
}
