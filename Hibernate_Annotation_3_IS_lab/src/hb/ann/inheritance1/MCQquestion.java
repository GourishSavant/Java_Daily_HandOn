package hb.ann.inheritance1;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity(name="MCQquestion")

@DiscriminatorValue(value="MCQquestion")
public class MCQquestion extends Question {
   
	private int Option1;
	private int Option2;
	private int Option3;
	private int Option4;
	
	public MCQquestion(int questionNo, int questionType,int option1, int option2, int option3, int option4) {
		super(questionNo,questionType);
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
	}

	public MCQquestion() {
		
	}


	public int getOption1() {
		return Option1;
	}

	public void setOption1(int option1) {
		Option1 = option1;
	}

	public int getOption2() {
		return Option2;
	}

	public void setOption2(int option2) {
		Option2 = option2;
	}

	public int getOption3() {
		return Option3;
	}

	public void setOption3(int option3) {
		Option3 = option3;
	}

	public int getOption4() {
		return Option4;
	}

	public void setOption4(int option4) {
		Option4 = option4;
	}
	
	
	
}
