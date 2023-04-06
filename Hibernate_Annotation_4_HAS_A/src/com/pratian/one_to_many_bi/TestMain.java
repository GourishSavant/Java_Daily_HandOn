package com.pratian.one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pratian.many_to_one_uni.HibernateUtil;

public class TestMain {

	public static void main(String[] args) {
		// Create customer
		Customer customer1 = new Customer("Surya");
		Customer customer2 = new Customer("Chandra");

		// Create cars
		short mileage = 13;
		byte noOfSeats = 4;
		Vehicle vehicle1 = new Vehicle(mileage, noOfSeats, "Ford", "Ford Mustang");
		
		mileage = 28;
		noOfSeats = 5;
		Vehicle vehicle2 = new Vehicle(mileage, noOfSeats, "Maruti Suzuki", "Maruti Suzuki Dzire");
		
		mileage = 14;
		noOfSeats = 2;
		Vehicle vehicle3 = new Vehicle(mileage, noOfSeats, "Mahendra", "Mahindra Bolero Pik-Up");
		
		mileage = 14;
		noOfSeats = 2;
		Vehicle vehicle4 = new Vehicle(mileage, noOfSeats, "Lamborghini", "Lamborghini Huracan");
		
		mileage = 16;
		noOfSeats = 6;
		Vehicle vehicle5 = new Vehicle(mileage, noOfSeats, "Mahendra", "Mahindra Thar");
		
		mileage = 20;
		noOfSeats = 7;
		Vehicle vehicle6 = new Vehicle(mileage, noOfSeats, "Toyota", "Toyota Maruti Ertiga");
		
		// Add cars to customer
		customer1.addVehicle(vehicle1); vehicle1.setCustomer(customer1);
		customer1.addVehicle(vehicle2); vehicle2.setCustomer(customer1);
		customer1.addVehicle(vehicle3); vehicle3.setCustomer(customer1);
		customer1.addVehicle(vehicle4); vehicle4.setCustomer(customer1);
		customer2.addVehicle(vehicle5); vehicle5.setCustomer(customer2);
		customer2.addVehicle(vehicle6); vehicle6.setCustomer(customer2);
		
		// Get Session factory and session
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		// Begin transaction
		session.beginTransaction();
				
		// Store cars
		session.persist(vehicle1);
		session.persist(vehicle2);
		session.persist(vehicle3);
		session.persist(vehicle4);
		session.persist(vehicle5);
		session.persist(vehicle6);
		
		// Store customers
		session.persist(customer1);
		session.persist(customer2);
		
		// Commit
		session.getTransaction().commit();
		
		// Close the session
		session.close();
		
	}

}
