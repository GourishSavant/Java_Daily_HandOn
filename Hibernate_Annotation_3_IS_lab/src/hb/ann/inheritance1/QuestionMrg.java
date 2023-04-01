package hb.ann.inheritance1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QuestionMrg {
	int addQuestion(Question question)
	{
		int flag=0;
		Session session= HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(question);// Inserting room details into room table
			tx.commit();
			flag=1;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			session.close();
		}
		return flag;
	}
	
	
}
