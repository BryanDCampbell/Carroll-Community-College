import java.util.Scanner;

/**
 * Question 1 [10 Points]
 * Dimes for Pay.
 *
 * Write a program that calculates how much a person would earn over a period
 * of time if his or her salary is one dime the first day, two dimes the
 * second day, four dimes the third day, eight dimes the fourth day and
 * continues to double each day.
 * The program should display a table showing the salary for each day, and then
 * show the total pay.
 * The output should be displayed in a dollar amount, with 2 decimal places and comma delimiters,
 * not the number of dimes.
 *
 *
 * Input Validation: Do not accept a number less than one for the number of
 * days worked.
 *
 * Example Output:
 How many days were worked?
 5
 Day             Amount
 1               $0.10
 2               $0.20
 3               $0.40
 4               $0.80
 5               $1.60

 Total           $3.10
 *
 * Comments and style are worth up to 2 points.
 *
 * @author BRYAN CAMPBELL
 */
public class Question1 {

    public static void main(String[] args) {

        final double basePay = 0.10;

        System.out.println("How many days were worked?");

        //create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        int days = keyboard.nextInt();

        while (days < 1) {
            System.out.println("This is not a valid response. Please enter the correct number of days worked.");
            days = keyboard.nextInt();
        }

        System.out.println("Day\t\t\t\tAmount");


        //use for-loop to calculate the salary each day
        double totalSalary = 0;
        for (int i = 1; i <= days; i++) {
            double salary = basePay * Math.pow(2, i - 1);
            System.out.printf("%d\t\t\t\t$%,.2f \n", i, salary);
            totalSalary = totalSalary + salary;
        }

        System.out.printf("\nTotal\t\t\t$%,.2f", totalSalary);
    }
}