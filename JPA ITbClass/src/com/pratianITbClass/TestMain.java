package com.pratianITbClass;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pratian.inheritance_OneTblPerClass.ConferenceRoom1;
import com.pratian.inheritance_OneTblPerClass.GuestRoom1;
import com.pratian.inheritance_OneTblPerClass.HibernateUtil;
import com.pratian.inheritance_OneTblPerClass.Room1;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MCQquestion mcq= new MCQquestion(101,"HTML",1,2,3,4);
		
//		create the HandOn object;
		HandOnLabs labs= new HandOnLabs(102,"Java",05,06);
		
	MCQquestion mcq1= new MCQquestion(103,"javasccript ",7,9,2,6);
		
//		create the HandOn object;
		HandOnLabs labs1= new HandOnLabs(104,"sql",05,06);
		
		QuestionMgr add1= new QuestionMgr();
		add1.addQuestion(mcq);
		add1.addQuestion(labs);
		add1.addQuestion(mcq1);
		add1.addQuestion(labs1);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "FROM Question";
		Query query = session.createQuery(hql);
		List<Question> questions = query.list();
		for (Question ques : questions) {
			System.out.println("---------------------------------");
			System.out.println("QuestionId : " + ques.getQuestionId());
			System.out.println("QuestionPaper : " + ques.getQuestionPaper());

			if (ques instanceof MCQquestion) {
				MCQquestion mcqquestion = (MCQquestion) ques;
				System.out.println("Option 1: " +mcqquestion.getOption1() );
				System.out.println("Option 2: " +mcqquestion.getOption2() );
				System.out.println("Option 3: " +mcqquestion.getOption3() );
				System.out.println("Option 4: " +mcqquestion.getOption4() );
				
			} else if (ques instanceof HandOnLabs){
				HandOnLabs ll= (HandOnLabs) ques;
				System.out.println("Compltete Labs: " + ll.getCompletedLab());
				System.out.println("Incomplte Labs  : " + ll.getIncompletedLab());
			
			}
		}
	}

}
