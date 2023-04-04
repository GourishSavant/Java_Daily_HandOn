package jpql.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpql.entities.User;

public class TestMain4 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "myJPAUnit";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Write jpql Query statement
		String jpqlQuery = "select count(*) from UserEntity u";
		
		// Get Query
		Query query = em.createQuery(jpqlQuery);
		
		// Execute the query
		Long noOfUsers = (Long)query.getSingleResult();
		
		// Display number of users
		System.out.println("--------------------------------------");
		System.out.println("No Of users : " + noOfUsers);
	}

}
