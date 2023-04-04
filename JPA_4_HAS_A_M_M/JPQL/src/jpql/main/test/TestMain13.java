package jpql.main.test;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import jpql.entities.User;

public class TestMain13 {

	public static void main(String[] args) {
		// Get EntityManagerFactory
		String unit = "test_jpql";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
		
		// Get the EntityManager
		EntityManager em = emf.createEntityManager();
		
		// Write Criteria to fetch
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class); // querying from operation
		
		// Query on age || name
		ParameterExpression<String> pe = cb.parameter(String.class);
		cq.select(root).where(cb.equal(root.get("name"), pe));

		// Execute the query
		TypedQuery<User> query = em.createQuery(cq);
		query.setParameter(pe, "Ranjan");
		User user = query.getSingleResult();
		
		// Close the resources
		em.close();
		emf.close();
		
		// Get the users
		System.out.println("--------------------------------------");
		System.out.println("User Id : " + user.getUserId()) ;
		System.out.println("User Name : " + user.getName());
		System.out.println("Age : " + user.getAge());
	}
}
