package com.pratian.one_to_one_bi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerMgr {

	int createCustomer(Customer_1_1_Bi c)
	{
		int flag=0;
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		try{
			session.save(c);
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
	int addReservation(Reservation_1_1_Bi r)
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
