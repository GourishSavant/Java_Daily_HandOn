package jpql.main.test;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import jpql.entities.User;

public class TestMain11 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "test_jpql";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Get Query
		TypedQuery<User> query = em.createNamedQuery("findUsersByAge", User.class);
		
		// Execute the query
		query.setParameter("userAge", 18);
		List<User> users = query.getResultList();

		// Close the resources
		em.close();
		emf.close();
		
		// Get the users
		for(User user : users) {
			System.out.println("--------------------------------------");
			System.out.println("User Id : " + user.getUserId()) ;
			System.out.println("User Name : " + user.getName());
			System.out.println("Age : " + user.getAge());
		}
	}

}
