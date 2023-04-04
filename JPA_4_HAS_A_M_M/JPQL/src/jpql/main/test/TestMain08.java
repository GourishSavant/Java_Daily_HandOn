package jpql.main.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import jpql.entities.User;

public class TestMain08 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "test_jpql";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Write jpql Query statement to update name of an user 
		String jpqlQuery = 
			"update UserEntity u set u.name = ?1 where u.age = ?2";
		//select * from users where uName = ?;
		
		// Begin the transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		// Get Query
		Query query = em.createQuery(jpqlQuery);
		query.setParameter(1, "Chandra Shekhar H M");
		query.setParameter(2, 22);
		
		// Execute the query
		int noOfUpdates = query.executeUpdate();

		// Commit the transaction
		et.commit();
		
		// Close the resources
		em.close();
		emf.close();
		
		// Display no of updates performed
		System.out.println("--------------------------------------");
		System.out.println("No of Updates : " + noOfUpdates);
	}

}
