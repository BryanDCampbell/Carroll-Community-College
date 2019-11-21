import java.util.Scanner;

/**
 * Question 2 [15 Points]
 * TicketCalc Class
 * 
 * Carroll County police are going to install speed cameras on roads around town.
 * Write a program that determines if the violator will receive a fine.
 * 1. You will need to create a class called TicketCalc
 * 2. The class should have 2 fields, one for speed limit and the other for the violator's speed.
 * 3. Write a constructor that takes 2 parameters representing speed limit and violator's speed.
 *  - Constructor will initialize your fields with the parameter values.
 *  - Call this constructor in your main method after you gather the input from your user.
 *  - Pass that input as arguments to the Constructor when you create your object.
 *  - You will NOT be using your setters. You are writing them for practice.
 * 4. Write a method in the class that uses conditional statements to determine the fine the violator will receive
 * based on how fast they were going over the speed limit.
 * It should return a double representing the fine amount.
 *  -Less than 12 miles over the speed limit:
 *		You receive a warning. $0.00 fine.
 *	- 12 miles or more and less than 20 miles over the speed limit:
 *		You receive a $200.00 fine.
 *	- 20 miles or more and less than 25 miles over the speed limit:
 *		You receive a $300.00 fine.
 *	- 25 miles or more and less than 40 miles over the speed limit:
 *		You receive a $500.00 fine.
 *	- 40 miles or more over the speed limit:
 *		You receive a $1,000.00 fine.
 *
 * 5. In main, you should check if the method returns 0.00 then don't print a ticket. Any other amount should print
 * a ticket message.
 * 6. You may choose to use console input/output OR Dialog boxes (Don't use both).
 *
 * 7. Comments and style are worth up to 2 points.
 * 8. Use JAVADOC comments to document your class description, constructor and
 * methods.
 * 9. Make sure your fine output is formatted with '$', comma delimiters and 2 decimal places
 *
 * EXAMPLE OUTPUT #1:
 * ------------------
 * Enter the speed limit: 25
 * Enter the violator's speed: 35
 * No ticket issued, Have a nice day!
 *
 * EXAMPLE OUTPUT #2:
 * ------------------
 * Enter the speed limit: 55
 * Enter the violator's speed: 80
 * You receive a ticket with a $500.00 fine.
 *
 * EXAMPLE OUTPUT #3:
 * ------------------
 * Enter the speed limit: 35
 * Enter the violator's speed: 47
 * You receive a ticket with a $200.00 fine.
 *
 * @author BRYAN CAMPBELL
 */

public class Question2 {
    public static void main(String[] args){

        //Create a Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the speed limit: ");
        double speedLimit = keyboard.nextDouble();

        System.out.println("Enter the violator's speed: ");
        double violatorSpeed = keyboard.nextDouble();

        //Set the constructor
        TicketCalc ticket = new TicketCalc(speedLimit,violatorSpeed);

        //Print the return
        System.out.println(ticket.ticket());

    }
}