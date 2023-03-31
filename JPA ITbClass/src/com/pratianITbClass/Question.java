package com.pratianITbClass;

public class Question {
	private int questionId;
	private String questionPaper;
	
	
	public Question() {
		
	}


	public Question(int questionId, String questionPaper) {
		super();
		this.questionId = questionId;
		this.questionPaper = questionPaper;
	}


	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}


	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	/**
	 * @return the questionPaper
	 */
	public String getQuestionPaper() {
		return questionPaper;
	}


	/**
	 * @param questionPaper the questionPaper to set
	 */
	public void setQuestionPaper(String questionPaper) {
		this.questionPaper = questionPaper;
	}



	
	
}
