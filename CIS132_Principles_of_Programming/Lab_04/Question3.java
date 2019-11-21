import java.util.Scanner;

/**
 * Question 3 [25 Points]
 * CombinedShipping Class.
 *
 * The ExFed Shipping Company charges the following rates:
 *
 * Number of Items                          Flat Rate per 500 miles shipped
 * 1 item                                   $3.50
 * 2 - 5 items                              $4.50
 * 6 -10 items                              $7.50
 * 11 or more items                         $9.50
 *
 * Print a welcome message that includes the above list of
 * shipping charges.
 *
 * The shipping charges per 500 miles are not prorated. For example, if 1 item
 * is shipped 550 miles, the shipping charge would be $7.00. If 1 item is shipped
 * 1100 miles, the charge would be $10.50.
 *
 * Use if-else statements to find the flat rate per 500 miles shipped.
 * For example: If I am shipping 3 items, I will be charged $4.50 per 500 miles.
 * Then use a method to calculate how much shipping will be charged based on the mileage entered.
 * You can use Math.ceil(double val) method to find value to multiply your flat rate charge by.
 * Math.ceil(double val) is passed a double value and will return the "ceiling"
 * (rounds up to the nearest whole number as a double).
 * For Example:
 * I want to ship 3 packages 575 miles. I want to figure out how much to multiply my flat rate of $4.50 by.
 * We know it is 2 because 575/500 = 1.15. I don't pro-rate the shipping charges (don't multiply by 1.15)
 * Math.ceil(1.15); //returns 2.0
 * The Math class is already imported to your program through java.lang.Math
 *
 * I am shipping 3 packages: Flat rate = 4.50 and miles shipped multiplier = 2. (because Math.ceil((double)575/500) = 2);
 *
 * IF YOU USE INTEGERS BE SURE TO CAST AS DOUBLES TO AVOID INTEGER DIVISION!
 *
 * Design and implement a class that has fields for the number of items, miles shipped, and has a method that
 * returns the shipping charge as a double or float. You can use a 2-arg constructor OR use setters to set your fields.
 *
 * Don't forget your setters and getters.
 *
 * Make sure you format your shipping charges to have a $ sign and 2 decimal places
 * when you print them.
 * You may choose to use console input/output OR Dialog boxes (Don't use both).
 * If using Dialog boxes, only use 1 Dialog box for the Welcome message.
 *
 * Sample Output #1:
 * ********************
 * Welcome to ExFed Shipping Company
 * Number of Items                          Flat Rate per 500 miles shipped
 * 1 item                                   $3.50
 * 2 - 5 items                              $4.50
 * 6 -10 items                              $7.50
 * 11 or more items                         $9.50
 *
 * How many items are you combining to ship?
 * 3
 * How many miles?
 * 600
 * Your shipping charge is $9.00.
 *
 * Sample Output #2:
 * *******************
 * Welcome to ExFed Shipping Company
 * Number of Items                          Flat Rate per 500 miles shipped
 * 1 item                                   $3.50
 * 2 - 5 items                              $4.50
 * 6 -10 items                              $7.50
 * 11 or more items                         $9.50
 *
 * How many items are you combining to ship?
 * 1
 * How many miles?
 * 350
 * Your shipping charge is $3.50
 *
 *
 * Comments and style are worth up to 2 points.
 * Use JAVADOC comments to document your class description, constructor and
 * methods (do not need them for setters and getters).
 *
 * @author BRYAN CAMPBELL
 */

public class Question3 {

    public static void main(String[] args) {
        // TODO code main to demonstrate your CombinedShipping class here
        CombinedShipping user = new CombinedShipping();
        //Print out "Welcome!" message
        System.out.println("*******************");
        System.out.println("Welcome to ExFed Shipping Company");
        System.out.println("Number of Items                          "
                +"Flat Rate per 500 miles shipped\n"
                +"1 item                                   $3.50\n"
                +"2 - 5 items                              $4.50\n"
                +"6 -10 items                              $7.50\n"
                +"11 or more items                         $9.50\n");

        System.out.println("How many items are you combining to ship?");
        //Creating a Scanner to read user input
        Scanner keyboard = new Scanner (System.in);
        double items = keyboard.nextInt();
        user.setItems(items);

        System.out.println("How many miles?");
        double miles = keyboard.nextInt();
        user.setMiles(miles);

        System.out.printf("Your shipping charge is $%.2f.", user.fee());



    }

}
