package com.pratian.one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerMgr {

	long createCustomer(Customer customer) {
		long customerId = 0;

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		try {
			session.save(customer);
			tx.commit();
			customerId = customer.getCustomerId();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return customerId;
	}

	int addCar(Vehicle car) {
		int flag = 0;

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		try {
			tx.commit();
			flag = 1;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return flag;
	}
}
