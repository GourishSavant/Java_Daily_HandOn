package jpa_app.many.to.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

	public static void main(String[] args) {

		// Create delegates
		Delegate delegate1 = new Delegate();
		delegate1.setDelegateName("Bharat Adiga");
		
		Delegate delegate2 = new Delegate();
		delegate2.setDelegateName("Dhanraj");
		
		Delegate delegate3 = new Delegate();
		delegate3.setDelegateName("Chaithanya");
		
		Delegate delegate4 = new Delegate();
		delegate4.setDelegateName("Sunil");

		// Create Events
		Event java101 = new Event();
		java101.setEventName("Java - 101");
		
		Event cplus101 = new Event();
		cplus101.setEventName("C++ - 101");
		
		Event math101 = new Event();
		math101.setEventName("Math - 101");

		// Add delegates to event and events to delegates
		java101.getDelegates().add(delegate1); delegate1.getEventList().add(java101);
		java101.getDelegates().add(delegate2); delegate2.getEventList().add(java101);
		java101.getDelegates().add(delegate3); delegate3.getEventList().add(java101);

		cplus101.getDelegates().add(delegate2); delegate2.getEventList().add(cplus101);
		cplus101.getDelegates().add(delegate3); delegate3.getEventList().add(cplus101);
		math101.getDelegates().add(delegate4);  delegate4.getEventList().add(math101);

		// Get Entity Manager Factory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		
		// Get Entity Manager 
		EntityManager em = factory.createEntityManager();
		
		// Begin Transaction
		em.getTransaction().begin();

		// Persist objects
		em.persist(delegate1);
		em.persist(delegate2);
		em.persist(delegate3);
		em.persist(delegate4);

		em.persist(java101);
		em.persist(cplus101);
		em.persist(math101);
		
		// Commit Transaction
		em.getTransaction().commit();

		// Close the entity manager and factory
		em.close();
		factory.close();
	}

}
