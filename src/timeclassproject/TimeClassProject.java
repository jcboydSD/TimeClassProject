package timeclassproject;

/******************************************************************************
 * TimeClassProject.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program displays time from various inputs in a standardized format
 *****************************************************************************/

public class TimeClassProject {

    public static void main(String[] args) 
    {
        System.out.println("Ch 7 Time by JC Boyd\n");
        
        Time onlyHour = new Time(5);
        Time hourMin = new Time(7, 30);
        Time hourMinSec = new Time(15, 16, 17);
        Time am = new Time(3, 45, 20, "am");
        Time pm = new Time(6, 12, 45, "pm");
        
        onlyHour.display();
        hourMin.display();
        hourMinSec.display();
        am.display();
        pm.display();
        
    } //end main
    
} //end class TimeClassProject
