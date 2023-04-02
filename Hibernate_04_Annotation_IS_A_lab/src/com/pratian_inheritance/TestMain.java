package com.pratian_inheritance;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class TestMain {

	public static void main(String[] args) {

//  create  object for MCQQuestion
     MCQQuestiom question1= new MCQQuestiom(1,"Dynamic",5,3);
     
//  create Object for HandsomeQuestion
     HandsomeQuestion question2= new HandsomeQuestion(7,"abc",11,82);
//     create the MCQQuestion
     MCQQuestiom question3 = new MCQQuestiom(5,"Science",6,10);
//     create the HandsomeQuestion
     HandsomeQuestion question4= new HandsomeQuestion(2,"Engilsh",10,80);
     
     QuestionMrg Mrg =new QuestionMrg();
     Mrg.addQuestion(question1);
     Mrg.addQuestion(question2);
     Mrg.addQuestion(question3);
     Mrg.addQuestion(question4);
     
//     Session session = HibernateUtil.getSessionFactory().openSession();
//		String hql = "FROM Question";
//		Query query = session.createQuery(hql);
//		List<Question> rooms = query.list();
	}	
}
