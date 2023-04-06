package com.pratian.one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OwnerMgr {

	long createOwner(Owner owner) {
		long ownerId = 0;

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		try {
			session.save(owner);
			tx.commit();
			ownerId = owner.getOwnerId();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		return ownerId;
	}

	int addCar(Car car) {
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
