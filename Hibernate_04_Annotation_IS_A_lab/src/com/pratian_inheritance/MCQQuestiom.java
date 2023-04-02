package com.pratian_inheritance;

public class MCQQuestiom extends Question {
    private int hardQuestion;
    private int simpleQuestion;
    
	public MCQQuestiom() {

	}

	public MCQQuestiom(int questionNo,String questionPaper,int hardQuestion, int simpleQuestion) {
		super(questionNo,questionPaper);
		this.hardQuestion = hardQuestion;
		this.simpleQuestion = simpleQuestion;
	}

	public int getHardQuestion() {
		return hardQuestion;
	}


	public void setHardQuestion(int hardQuestion) {
		this.hardQuestion = hardQuestion;
	}

	
	public int getSimpleQuestion() {
		return simpleQuestion;
	}


	public void setSimpleQuestion(int simpleQuestion) {
		this.simpleQuestion = simpleQuestion;
	}
    
    
    
}
