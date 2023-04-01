package hb.ann.inheritance1;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="Question") 
@Table(name= "Question_1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="QyestionType",discriminatorType = DiscriminatorType.STRING)
   

   public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionNo;
    private int questionType;
	
    
    
	public Question() {
		
	}
	

	public Question(int questionNo, int questionType) {
		super();
		this.questionNo = questionNo;
		this.questionType = questionType;
	}


	public int getQuestionNo() {
		return questionNo;
	}
	
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public int getQuestionType() {
		return questionType;
	}
	
	public void setQuestionType(int questionType) {
		this.questionType = questionType;
	}
    
    
}
