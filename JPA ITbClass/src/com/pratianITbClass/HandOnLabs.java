package com.pratianITbClass;

public class HandOnLabs extends Question{
   private int completedLab;
   private int IncompletedLab;
   
   
public HandOnLabs() {
	
}

public HandOnLabs(int questionId,String questionPaper,int completedLab, int incompletedLab){
	super(questionId, questionPaper);
	this.completedLab = completedLab;
	IncompletedLab = incompletedLab;
}

/**
 * @return the completedLab
 */
public int getCompletedLab() {
	return completedLab;
}
/**
 * @param completedLab the completedLab to set
 */
public void setCompletedLab(int completedLab) {
	this.completedLab = completedLab;
}
/**
 * @return the incompletedLab
 */
public int getIncompletedLab() {
	return IncompletedLab;
}
/**
 * @param incompletedLab the incompletedLab to set
 */
public void setIncompletedLab(int incompletedLab) {
	IncompletedLab = incompletedLab;
}
   
   
   
}
