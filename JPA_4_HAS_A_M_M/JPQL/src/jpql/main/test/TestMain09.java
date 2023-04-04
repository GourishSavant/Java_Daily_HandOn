package jpql.main.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestMain09 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "test_jpql";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Write jpql Query statement to update name of an user 
		String jpqlQuery = 
			"delete from UserEntity u where u.age = :userAge";
		
		// Begin the transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		// Get Query
		Query query = em.createQuery(jpqlQuery);
		query.setParameter("userAge", 32);
		
		// Execute the query
		int noOfDeletions = query.executeUpdate();

		// Commit the transaction
		et.commit();
		
		// Close the resources
		em.close();
		emf.close();
		
		// Display no of updates performed
		System.out.println("--------------------------------------");
		System.out.println("No of Deletes : " + noOfDeletions);
	}

}
