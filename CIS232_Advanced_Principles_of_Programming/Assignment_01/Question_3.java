/*
Date Formatter (10 points)

Using the Java package: java.time, get the current LocalDateTime and display it to the console.
Using the java.time.format.DateTimeFormatter class and the ofPattern() method 
format and display the date so the output resembles the
following examples (Your date and time will be different, but you will try to find the same format patterns I used):

Before formatting: 2020-02-11T09:27:39.376
After formatting: 02-12-2020
After formatting: Tue, February 12, 2020
After formatting: 02/12/2020 09:27
After formatting: Tuesday February 12, 2020 09:27 AM
After formatting: 9:27 AM February 12/2020  //HINT: no zero before the 9 in the hour portion.

Then, use the SimpleDateFormat class and methods to create the output trying to find the same format patterns I used

@author BRYAN CAMPBELL

 */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Question3 {
    public static void main(String[] args) {

        //Use to create divisions and make the project easier to read
        String breaker = "\n*****************************************************\n";
        System.out.println(breaker);

        //Using the Java package: java.time, get the current LocalDateTime and display it to the console
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Before formatting: " + currentDate);

        System.out.println(breaker);

        //Using the java.time.format.DateTimeFormatter class and the ofPattern() method, format and display the date
        //so the output resembles the following examples (Your date and time will be different):

        System.out.println("Using DateTimeFormatter\n");

        //After formatting: 02-12-2020
        DateTimeFormatter format1= DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("After formatting: " + currentDate.format(format1));

        //After formatting: Tue, February 12, 2020
        DateTimeFormatter format2= DateTimeFormatter.ofPattern("E, MMMM dd, yyyy");
        System.out.println("After formatting: " + currentDate.format(format2));

        //After formatting: 02/12/2020 09:27
        DateTimeFormatter format3= DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println("After formatting: " + currentDate.format(format3));

        //After formatting: Tuesday February 12, 2020 09:27 AM
        DateTimeFormatter format4= DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy hh:mm a");
        System.out.println("After formatting: " + currentDate.format(format4));

        //After formatting: 9:27 AM February 12/2020  //HINT: no zero before the 9 in the hour portion.
        DateTimeFormatter format5= DateTimeFormatter.ofPattern("h:mm a MMMM dd/yyyy");
        System.out.println("After formatting: " + currentDate.format(format5));

        System.out.println(breaker);

        secondPart();
    }

    //Then, use the SimpleDateFormat class and methods to create the output trying to find the same format patterns
    public static void secondPart() {
        SimpleDateFormat second = new SimpleDateFormat();

        System.out.println("Using SimpleDateFormat\n");

        //After formatting: 02-12-2020
        second.applyPattern("MM-dd-yyyy");
        String s = second.format(new Date());
        System.out.println("After formatting: " + s);

        //After formatting: Tue, February 12, 2020
        second.applyPattern("E, MMMM dd, yyyy");
        s = second.format(new Date());
        System.out.println("After formatting: " + s);

        //After formatting: 02/12/2020 09:27
        second.applyPattern("MM/dd/yyyy HH:mm");
        s = second.format(new Date());
        System.out.println("After formatting: " + s);

        //After formatting: Tuesday February 12, 2020 09:27 AM
        second.applyPattern("EEEE MMMM dd, yyyy hh:mm a");
        s = second.format(new Date());
        System.out.println("After formatting: " + s);

        //After formatting: 9:27 AM February 12/2020  //HINT: no zero before the 9 in the hour portion.
        second.applyPattern("h:mm a MMMM dd/yyyy");
        s = second.format(new Date());
        System.out.println("After formatting: " + s);
    }


}
