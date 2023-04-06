package com.pratian.one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pratian.many_to_one_uni.HibernateUtil;

public class TestMain {

	public static void main(String[] args) {
		// Create owner
		Owner owner1 = new Owner("Surya");
		Owner owner2 = new Owner("Chandra");
		Owner owner3 = new Owner("Akash");
		Owner owner4 = new Owner("Bhoomi");

		// Create cars
		short mileage = 13;
		byte noOfSeats = 4;
		Car car1 = new Car("KA-01-AA-1000", mileage, noOfSeats, "Ford", "Ford Mustang");
		
		mileage = 28;
		noOfSeats = 5;
		Car car2 = new Car("KA-02-BB-2000", mileage, noOfSeats, "Maruti Suzuki", "Maruti Suzuki Dzire");
		
		mileage = 14;
		noOfSeats = 2;
		Car car3 = new Car("KA-03-CC-3000", mileage, noOfSeats, "Mahendra", "Mahindra Bolero Pik-Up");
		
		mileage = 14;
		noOfSeats = 2;
		Car car4 = new Car("KA-04-DD-4000", mileage, noOfSeats, "Lamborghini", "Lamborghini Huracan");
		
		mileage = 16;
		noOfSeats = 6;
		Car car5 = new Car("KA-05-EE-5000", mileage, noOfSeats, "Mahendra", "Mahindra Thar");
		
		mileage = 20;
		noOfSeats = 7;
		Car car6 = new Car("KA-06-FF-6000", mileage, noOfSeats, "Toyota", "Toyota Maruti Ertiga");
		
		mileage = 20;
		noOfSeats = 7;
		Car car7 = new Car("KA-07-GG-7000", mileage, noOfSeats, "Toyota", "Toyota Maruti Ertiga");
		
		mileage = 20;
		noOfSeats = 7;
		Car car8 = new Car("KA-08-HH-8000", mileage, noOfSeats, "Toyota", "Toyota Maruti Ertiga");
		
		// Add cars to owner
		owner1.addCar(car1);
		owner1.addCar(car5);
		owner2.addCar(car4);
		owner2.addCar(car6);
		owner3.addCar(car2);
		owner3.addCar(car3);
		owner3.addCar(car7);
		owner4.addCar(car8);
		
		// Get Session factory and session
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		// Begin transaction
		session.beginTransaction();
				
		// Store cars
		session.persist(car1);
		session.persist(car2);
		session.persist(car3);
		session.persist(car4);
		session.persist(car5);
		session.persist(car6);
		session.persist(car7);
		session.persist(car8);
		
		// Store owners
		session.persist(owner1);
		session.persist(owner2);
		session.persist(owner3);
		session.persist(owner4);
		
		// Commit
		session.getTransaction().commit();
		
		// Close the session
		session.close();
		
	}

}
