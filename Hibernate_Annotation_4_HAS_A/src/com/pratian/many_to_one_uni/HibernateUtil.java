package com.pratian.many_to_one_uni;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactoryInstance;
	public static SessionFactory getSessionFactory()
	{	
		if (sessionFactoryInstance==null)
		{
			Configuration config=new Configuration();
			config=config.configure();
			sessionFactoryInstance=config.buildSessionFactory();		
		}
		return sessionFactoryInstance;
	}
}
