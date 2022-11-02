package Gr11_Novemeber_Prace_2021;

import java.time.format.DateTimeFormatter;

public class Learner {
    
    private String learnerName;
    private String learnerCode;
    private Activity activityOne;
    private Activity activityTwo;
    
    private Learner(String s, Activity act1, Activity act2){
        
        learnerName = s;
        activityOne = act1;
        activityTwo = act2;
        
        //generate learner code
        String first3Letters = learnerName.substring(0, 2).toUpperCase();
        int last2 = (int)(Math.random()*100);
        learnerCode = first3Letters + last2;
        
        
        
    } 

    public String getLearnerCode() {
        return learnerCode;
    }

    public void setLearnerCode(String learnerCode) {
        this.learnerCode = learnerCode;
    }
    
    public double calcStudentTotalCost(){
        return Activity.INSURANCE_COST + activityOne.getCost() + activityTwo.getCost();
    }
    
    public String toString(){
        DateTimeFormatter time = DateTimeFormatter.ofPattern("")
        System.out.println("NAME: " + learnerName + " " + learnerCode);
        System.out.println("Activity 1: " + activityOne.);
        
    }
    
}
