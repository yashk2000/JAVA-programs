import java.util.*;
class CalenderTrial{
  public static void main(String[] args) {
    System.out.println("The date is : "+Calendar.getInstance().getTime());//using an anonymus object to pirnt the time
    Calendar O1=Calendar.getInstance();
    System.out.println("Year : "+O1.get(Calendar.YEAR));//pritning year
    System.out.println("Month : "+O1.get(Calendar.MONTH));//printing month
    System.out.println("Day : "+O1.get(Calendar.DATE));//printing day
    System.out.println("Hour : "+O1.get(Calendar.HOUR));//printing the hour
    System.out.println("Minute : "+O1.get(Calendar.MINUTE));//priting minute
    System.out.println("Second : "+O1.get(Calendar.SECOND));//printing second
    O1.add(Calendar.DATE, -34);
    System.out.println("34 days ago : "+O1.getTime());
    O1.add(Calendar.MONTH, 1);
    System.out.println("1 month later : "+O1.getTime());
    //can do anything like .DATE, .MONTH, .YEAR, .MINUTE, .SECOND
    System.out.format("%tB %te, %tY%n", c, c, c);//"November 2, 2018"
    System.out.format("%tl:%tM %tp%n", c, c, c);// "2:27 am"
    System.out.format("%tD%n", c);//"06/27/18"
  }
}
