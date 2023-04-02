package com.pratian_inheritance;

public class HandsomeQuestion extends Question{

	private int labPractice;
	private int labError;
	
	public HandsomeQuestion() {
	
	}

	public HandsomeQuestion(int questionNo,String questionPaper,int labPractice, int labError) {
		super(questionNo,questionPaper);
		this.labPractice = labPractice;
		this.labError = labError;
	}

	
	public int getLabPractice() {
		return labPractice;
	}
	
	public void setLabPractice(int labPractice) {
		this.labPractice = labPractice;
	}

	
	public int getLabError() {
		return labError;
	}

	
	public void setLabError(int labError) {
		this.labError = labError;
	}
	
	
	
	
	
}