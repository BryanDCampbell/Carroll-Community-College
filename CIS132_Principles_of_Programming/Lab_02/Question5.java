package cis132;

/**
 * Question 5 [10 points].
 * A cookie recipe uses the following ingredients:
 * .75 cup of butter
 * 1.5 cups of sugar
 * 2.25 cups of flour
 *
 * The recipe makes 48 cookies with these amounts of the ingredients.
 * Write a program that asks the user how many cookies he or she wants to make.
 * Divide the number of desired cookies by 48 to find the ratio to adjust the
 * recipe. Multiply that ratio times each ingredient amount and display
 * the number of cups needed for each ingredient.
 *
 Example output #1:

 How many cookies would you like to make?
 24

 You need:
 .375 cups of butter
 .75 cups of sugar
 1.125 cups of flour

 Example output #2:

 How many cookies would you like to make?
 96

 You need:
 1.5 cups of butter
 3.0 cups of sugar
 4.5 cups of flour

 * Use good programming style!
 *
 * @author BRYAN CAMPBELL
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        //TODO Write your code here
        double butter = 0.75;
        double sugar = 1.5;
        double flour = 2.25;
        double amount = 0;

        System.out.println("How many cookies would you like to make?");

        Scanner scan = new Scanner(System.in);

        String input;

        input = scan.nextLine();

        amount = Integer.parseInt(input);

        System.out.printf("You need:"
            + "\n %.3f cups of butter"
            + "\n %.3f cups of sugar"
            + "\n %.3f cups of flour", (butter/48 * amount), (sugar/48 * amount), (flour/48 * amount));
    }
}
