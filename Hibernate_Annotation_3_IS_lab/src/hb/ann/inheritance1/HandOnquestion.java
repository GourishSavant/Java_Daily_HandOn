package hb.ann.inheritance1;

public class HandOnquestion extends Question {
  private int CompletedLab;
  private int Incompletedlab;
  
  
  
public HandOnquestion() {
	
}



public HandOnquestion(int questionNo, int questionType,int completedLab, int incompletedlab) {
	super(questionNo,questionType);
	CompletedLab = completedLab;
	Incompletedlab = incompletedlab;
}



/**
 * @return the completedLab
 */
public int getCompletedLab() {
	return CompletedLab;
}

/**
 * @param completedLab the completedLab to set
 */
public void setCompletedLab(int completedLab) {
	CompletedLab = completedLab;
}

/**
 * @return the incompletedlab
 */
public int getIncompletedlab() {
	return Incompletedlab;
}

/**
 * @param incompletedlab the incompletedlab to set
 */
public void setIncompletedlab(int incompletedlab) {
	Incompletedlab = incompletedlab;
}
  
  
}
