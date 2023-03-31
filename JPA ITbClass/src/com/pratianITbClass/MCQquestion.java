package com.pratianITbClass;

public class MCQquestion extends Question {
	private int Option1;
	private int Option2;
	private int Option3;
	private int Option4;
	
	
	public MCQquestion(int questionId,String questionPaper,int option1, int option2, int option3, int option4) {
		super(questionId,questionPaper);
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
	}
	public MCQquestion() {
		super();
	}
	/**
	 * @return the option1
	 */
	public int getOption1() {
		return Option1;
	}
	/**
	 * @param option1 the option1 to set
	 */
	public void setOption1(int option1) {
		Option1 = option1;
	}
	/**
	 * @return the option2
	 */
	public int getOption2() {
		return Option2;
	}
	/**
	 * @param option2 the option2 to set
	 */
	public void setOption2(int option2) {
		Option2 = option2;
	}
	/**
	 * @return the option3
	 */
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
