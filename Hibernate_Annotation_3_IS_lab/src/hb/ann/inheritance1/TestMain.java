package hb.ann.inheritance1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MCQquestion ques1 = new MCQquestion(1001,12,1,2,3,4);
		
		HandOnquestion ques2 = new HandOnquestion(1002,23,34,23);
		
		QuestionMrg quesMrg = new QuestionMrg();
		
		quesMrg.addQuestion(ques1);
		quesMrg.addQuestion(ques2);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "FROM Question"; //select * from room1;
		Query query = session.createQuery(hql);
		List<Question> questions  = query.list();
		for (Question question : questions) {
			System.out.println("---------------------------------");
			System.out.println("QuestionNo: " + question.getQuestionNo());
			System.out.println("QuestionType : " + question.getQuestionType());
		
			if (question instanceof MCQquestion) {
				MCQquestion mcqquestion= (MCQquestion) question;
				System.out.println("Option1 : " + mcqquestion.getOption1());
				System.out.println("Option2 : " + mcqquestion.getOption2());
				System.out.println("Option3 : " + mcqquestion.getOption3());
				System.out.println("Option4 : " + mcqquestion.getOption4());
				
			} else if (question instanceof HandOnquestion) {
				HandOnquestion handOn= (HandOnquestion) question;
				System.out.println("CompltedLabs : " + handOn.getCompletedLab());
				System.out.println("IncompletedLabs: " + handOn.getIncompletedlab());
				
			}
		}
		
	}

}
