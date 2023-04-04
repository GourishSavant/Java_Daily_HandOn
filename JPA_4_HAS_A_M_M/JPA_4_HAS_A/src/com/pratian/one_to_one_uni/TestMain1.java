package com.pratian.one_to_one_uni;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain1 {

	public static void main(String[] args) {
		// Create reservation
		Reservation_1_1_Uni reservation = new Reservation_1_1_Uni("Confirmed", "Email");

		// Create a customer
		Date date = Date.valueOf("1995-03-24");
		Customer_1_1_Uni customer = new Customer_1_1_Uni("Chandra", date, "1234567890", "chandra@gmail.com");
		customer.setReservation(reservation);
		
		// Get Entity Manager Factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		// Get Entity Manager 
		EntityManager em = factory.createEntityManager();
		
		// Begin Transaction
		em.getTransaction().begin();
		 
		em.persist(reservation); //Saving or inserting data into tables
		em.persist(customer);
				
		// Store customer using CustomerMgr
//		CustomerMgr mgr = new CustomerMgr();
//		mgr.createCustomer(customer);
		
		// Commit Transaction
		em.getTransaction().commit();

		// Close the entity manager and factory
		em.close();
		factory.close();
		
		
	}
}
