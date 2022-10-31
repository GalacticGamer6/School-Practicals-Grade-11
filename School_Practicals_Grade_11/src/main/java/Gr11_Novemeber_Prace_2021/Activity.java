
package Gr11_Novemeber_Prace_2021;

import java.time.LocalDate;

public class Activity {

    private String description;
    private double cost;
    private LocalDate actDate;
    public final double INSURANCE_COST = 105.25;
            
    public Activity(String inDescription,Double inCost,LocalDate inActDate){
        
        description = inDescription;
        cost = inCost;
        actDate = inActDate;
        
    }
    
    public String getDescription(){
        return description;
    }
    public double getCost(){
        return cost;
    }
    public LocalDate getActivityDate(){
        return actDate;
    }
    
}
