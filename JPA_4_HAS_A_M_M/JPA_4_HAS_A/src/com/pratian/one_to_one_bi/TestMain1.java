package com.pratian.one_to_one_bi;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;

public class TestMain1 {
	public static void main(String[] args) {
		// Create a reservation
//		Reservation_1_1_Bi reservation1= new Reservation_1_1_Bi( "Confirmed", "Email");
//		
//		// Create a customer
//		Customer_1_1_Bi customer1= new Customer_1_1_Bi("Ganesh",Date.valueOf("1997-01-16"),"98001 11223","ganesh@gmail.com");
//		customer1.setReservation(reservation1);  
//		reservation1.setCustomer(customer1);
//        
//		// Create a customer
//        Customer_1_1_Bi customer2= new Customer_1_1_Bi("Raju",Date.valueOf("1998-12-26"),"98001 11111","raju@gmail.com");
//        Reservation_1_1_Bi reservation2 = new Reservation_1_1_Bi( "Confirmed", "Email");
//		customer2.setReservation(reservation2);
//		reservation2.setCustomer(customer2);
//        
//		// Get Entity Manager Factory
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
//		
//		// Get Entity Manager 
//		EntityManager em = factory.createEntityManager();
//		
//		// Begin Transaction
//		em.getTransaction().begin();
//		
//		// Store customer1
//		em.persist(reservation1);
//		em.persist(customer1);
//		
//		// Store customer2
//		em.persist(reservation2);
//		em.persist(customer2);
//		
//        em.getTransaction().commit();
//        em.close();  
        
		
			// Get Entity Manager Factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		// Get Entity Manager 
		EntityManager em = factory.createEntityManager();
		
		// Begin Transaction
		em.getTransaction().begin();
		
		String hql="SELECT c FROM Customer_1_1_Bi c WHERE c.reservation.state=:state";
		Query query = em.createQuery(hql);
		query.setParameter("state", "Confirmed");
		List<Customer_1_1_Bi> customers= query.getResultList();
		for(Customer_1_1_Bi c:customers)
		{
			System.out.println("CustomerId: "+ c.getCustomerId()+"\t"+"Customer Name: " + c.getName()+
							  "\t"+"Reservation Status: " + c.getReservation().getState() + "\t"
							  + "Reservaton No: " + c.getReservation().getReservation_no());
		} 
		
		
      
	}

}
