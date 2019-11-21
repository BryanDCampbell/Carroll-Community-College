/**
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

 * @author BRYAN CAMPBELL
 */


public class TicketCalc
{
    /**
     *Create private fields for TicketCalc
     */
    private double speedLimit;
    private double violatorSpeed;

    /**
     * Create Constructor to initialize fields
     */
    public TicketCalc(double spdLimit, double vSpeed)
    {
        speedLimit = spdLimit;
        violatorSpeed = vSpeed;
    }

    /**
     * Create a method using conditional statements
     */
    public String ticket()
    {
        String fine = null;

        /**
         *tooFast is how fast the violator is driving over the speed limit
         */
        double tooFast= violatorSpeed-speedLimit;

        /**
         *create an if-else to determine the violator's type of ticket
         */
        if ((tooFast)<12)
        {
            fine = "You receive a warning. $0.00 fine. Have a nice day!";
        }
        else if(tooFast >= 12 && tooFast < 20)
        {
            fine = "You receive a ticket with a $200.00 fine.";
        }
        else if(tooFast >=20 && tooFast < 25)
        {
            fine = "You receive a ticket with a $300.00 fine.";
        }
        else if(tooFast >=25 && tooFast <40)
        {
            fine = "You receive ticket with a $500.00 fine.";
        }
        else if(tooFast >= 40)
        {
            fine = "You receive a ticket with a $1,000.00 fine.";
        }

        return fine;
    }
}
