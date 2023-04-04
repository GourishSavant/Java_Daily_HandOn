package com.pratian.many_to_one_bi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerMgr {

	int createCustomer(Customer_M_1_Bi customer)
	{
		int flag=0;
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		try{
			session.save(customer);
			tx.commit();
			flag=1;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
		}
		return flag;
	}
	int addReservation(Reservation_M_1_Bi r)
	{
		int flag=0;
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		try{
			session.save(r);
			tx.commit();
			flag=1;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
		}
		return flag;
	}
}
