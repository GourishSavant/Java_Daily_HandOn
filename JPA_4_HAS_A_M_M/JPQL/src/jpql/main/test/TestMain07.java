package jpql.main.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpql.entities.User;

public class TestMain07 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "test_jpql";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Write jpql Query statement to fetch users whose age is less than 22 
		String jpqlQuery = 
			"select u from UserEntity u where u.age < ?1";
		
		// Get Query
		TypedQuery<User> query = em.createQuery(jpqlQuery, User.class);
		query.setParameter(1, 22);
		
		// Execute the query
		List<User> users = query.getResultList();
		
		// Get the users
		for(User user : users) {
			System.out.println("--------------------------------------");
			System.out.println("User Id : " + user.getUserId()) ;
			System.out.println("User Name : " + user.getName());
			System.out.println("Age : " + user.getAge());
		}
	}

}
