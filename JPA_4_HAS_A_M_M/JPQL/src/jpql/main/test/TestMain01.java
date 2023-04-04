package jpql.main.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpql.entities.User;

public class TestMain01 {

	public static void main(String[] args) {
		// Create users
		User user1 = new User("Chandra", 22);
		User user2 = new User("Ranjan", 21);
		User user3 = new User("Bhavani", 18);
		User user4 = new User("Ravi", 32);
		
		// Get Entity Manager Factory
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("test_jpql");
		
		// Get Entity Manager
		EntityManager em = factory.createEntityManager();
		
		// Begin Entity transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		// Persist users
		em.persist(user1);
		em.persist(user2);
		em.persist(user3);
		em.persist(user4);
		
		// Commit the transaction
		et.commit();
		
		// Close the resources
		em.close();
		factory.close();
	}
}
