package timeclassproject;

/******************************************************************************
 * Time.java 
 * Programmer: @author jcboyd
 * 
 * Class associated with TimeClassProject.java
 *****************************************************************************/

public class Time 
{
    private int hour, minutes, seconds; //time values
    private String indicator = "am"; //for am or pm
    
    //*************************************************************************            
    
    public Time(int hour, int minutes, int seconds)
    {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    } //end Time 3 parameters - primary constructor
    
    //*************************************************************************

    public Time(int hour, int minutes)
    {
        this(hour, minutes, 0);
        
    } //end Time 2 parameters

    //*************************************************************************
    
    public Time(int hour)
    {
        this(hour, 0, 0);
    } //end Time 1 parameter

    //*************************************************************************
    
    public Time(int hour, int minutes, int seconds, String indicator)
    {
        this(hour, minutes, seconds);
        if (indicator == "pm")
        {
            this.hour += 12;
        } //end if
    } //end Time 4 paramters

    //*************************************************************************
    
    public void display()
    {
        System.out.printf("Time = %d:%d:%d\n", 
                this.hour, this.minutes, this.seconds);
    } //end display

} //end class Time
