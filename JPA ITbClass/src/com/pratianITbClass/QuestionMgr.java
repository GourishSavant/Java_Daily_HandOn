package com.pratianITbClass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pratian.inheritance_OneTblPerClass.HibernateUtil;
import com.pratian.inheritance_OneTblPerClass.Room1;

public class QuestionMgr {
	int addQuestion(Question question)
	{
		int flag=0;
		Session session= HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try{
			session.save(question);
			tx.commit();
			flag=1;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
		}
		return flag;
	}
}
