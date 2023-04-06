package com.pratian.one_to_one_bi;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestMain1 {
	public static void main(String[] args) {
		// Create a reservation
		Reservation_1_1_Bi reservation1= new Reservation_1_1_Bi( "Confirmed", "Email");
		
		// Create a customer
		Customer_1_1_Bi customer1= new Customer_1_1_Bi("Ganesh",Date.valueOf("1997-01-16"),"98001 11223","ganesh@gmail.com");
		customer1.setReservation(reservation1);  
		reservation1.setCustomer(customer1);
        
		// Create a customer
        Customer_1_1_Bi customer2= new Customer_1_1_Bi("Raju",Date.valueOf("1998-12-26"),"98001 11111","raju@gmail.com");
        Reservation_1_1_Bi reservation2 = new Reservation_1_1_Bi( "Confirmed", "Email");
		customer2.setReservation(reservation2);
		reservation2.setCustomer(customer2);
        
		// Store customers and reservation using hibernate
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		// Store customer1
		session.save(reservation1);
		session.save(customer1);
		
		// Store customer2
		session.save(reservation2);
		session.save(customer2);
        session.getTransaction().commit();
        session.close();
        
		
//        Session session = HibernateUtil.getSessionFactory().openSession();
//		
//		String hql="SELECT c FROM Customer_1_1_Bi c WHERE c.reservation.state=:state";
//		Query query = session.createQuery(hql);
//		query.setParameter("state", "unConfirmed");
//		List<Customer_1_1_Bi> customers= query.list();
//		for(Customer_1_1_Bi c:customers)
//		{
//			System.out.println("CustomerId: "+ c.getCustomerId()+"\t"+"Customer Name: " + c.getName()+
//							  "\t"+"Reservation Status: " + c.getReservation().getState());
//		}
//		
//		session.close();
		
      
	}

}
