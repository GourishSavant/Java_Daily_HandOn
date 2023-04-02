package com.pratian_inheritance;

public class Question {

	private int questionNo;
	private String questionPaper;
	
	public Question() {

	}

	public Question(int questionNo, String questionPaper) {
		super();
		questionNo = questionNo;
		questionPaper = questionPaper;
	}


	public int getQuestionNo() {
		return questionNo;
	}


	public void setQuestionNo(int questionNo) {
		questionNo = questionNo;
	}

	public String getQuestionPaper() {
		return questionPaper;
	}


	public void setQuestionPaper(String questionPaper) {
		questionPaper = questionPaper;
	}
	
	
}