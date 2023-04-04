package jpql.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpql.entities.User;

public class TestMain5 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "myJPAUnit";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Write jpql Query statement
		String jpqlQuery = "select u from UserEntity u";
		
		// Get Query
		TypedQuery<User> query = em.createQuery(jpqlQuery, User.class);
		
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
