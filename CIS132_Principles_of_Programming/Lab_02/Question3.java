package cis132;


/**
 * Question 3 [10 points].
 * Correct the following program to show the calculated total pay without
 * changing the print statement.
 *
 * @author BRYAN CAMPBELL
 */
public class Question3 {

    public static void main(String[] args)
    {
        short grossPay = 0, basePay = 675, overTimePay = 262, bonusPay = 1200;

        //TODO: Uncomment and correct the following line to calculate total pay
        grossPay = (short)(basePay + overTimePay + bonusPay);

        //Don't change this statement
        System.out.printf("The total pay is $%,.2f. \n", (double)grossPay);
    }

}
