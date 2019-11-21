import java.util.Scanner;

/**
 * Question 1 [10 Points]
 * McDaniels FastFood Menu
 * (Does not require a separate class)
 *
 * Write a program that displays a menu to the console and prompts the user to enter a meal selection
 * number within the range of 1 through 10.  The program should display a menu item for that number.
 * If the number is outside the range of 1-10, the program should display an error message.
 * You should use a "Switch Statement" to solve this problem.
 *
 * Example Output 1:
 * Welcome to McDaniels Fast Food Restaurant
 * 1 = Cheeseburger Value Meal
 * 2 = 10 Piece Chicken Nuggets
 * 3 = Fried Chicken Sandwich Meal
 * 4 = Grilled Chicken Sandwich Meal
 * 5 = Garden Salad
 * 6 = Milkshake
 * 7 = Fish Fillet Sandwich Meal
 * 8 = Big Breakfast Meal
 * 9 = Coffee
 * 10 = Ice Cream Cone
 * What item do you want to order (enter 1-10)?
 * 5
 * You have ordered a Garden Salad, please pay at the next window.
 *
 * Example Output 2:
 * Welcome to McDaniels Fast Food Restaurant
 * 1 = Cheeseburger Value Meal
 * 2 = 10 Piece Chicken Nuggets
 * 3 = Fried Chicken Sandwich Meal
 * 4 = Grilled Chicken Sandwich Meal
 * 5 = Garden Salad
 * 6 = Milkshake
 * 7 = Fish Fillet Sandwich Meal
 * 8 = Big Breakfast Meal
 * 9 = Coffee
 * 10 = Ice Cream Cone
 * What item do you want to order (enter 1-10)?
 * 11
 * Sorry, we do not currently carry that menu item.
 *
 *
 * Comments and style are worth up to 2 points.
 *
 * @author BRYAN CAMPBELL
 */

public class Question1
{
    public static void main(String[] args)
    {
        //Print out "Welcome!" message
        System.out.println("Welcome to McDaniel's Fast Food Restaurant!");

        //Print out Mcdaniel's Fast Food Restaurant menu and user query
        System.out.println(
                "1 = Cheeseburger Value Meal\n" +
                "2 = 10 Piece Chicken Nuggets\n" +
                "3 = Fried Chicken Sandwich Meal\n" +
                "4 = Grilled Chicken Sandwich Meal\n" +
                "5 = Garden Salad\n" +
                "6 = Milkshake\n" +
                "7 = Fish Fillet Sandwich Meal\n" +
                "8 = Big Breakfast Meal\n" +
                "9 = Coffee\n" +
                "10 = Ice Cream Cone");
        System.out.println(
                "What item would you like to order (enter 1-10)?");

        //Creating a Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();

        //Create the Switch Statement
        switch (choice)
        {
            case 1:
                System.out.println(
                        "You have ordered a Cheeseburger Value Meal, please pay at the next window.");
                break;
            case 2:
                System.out.println(
                        "You have ordered the 10 Piece Chicken Nuggets, please pay at the next window.");
                break;
            case 3:
                System.out.println(
                        "You have ordered a Fried Chicken Sandwich Meal, please pay at the next window.");
                break;
            case 4:
                System.out.println(
                        "You have ordered a Grilled Chicken Sandwich Meal, please pay at the next window.");
                break;
            case 5:
                System.out.println(
                        "You have ordered a Garden Salad, please pay at the next window.");
                break;
            case 6:
                System.out.println(
                        "You have ordered a Milkshake, please pay at the next window.");
                break;
            case 7:
                System.out.println(
                        "You have ordered a Fish Fillet Sandwich Meal, please pay at the next window.");
                break;
            case 8:
                System.out.println(
                        "You have ordered a Big Breakfast Meal, please pay at the next window.");
                break;
            case 9:
                System.out.println(
                        "You have ordered a Coffee, please pay at the next window.");
                break;
            case 10:
                System.out.println(
                        "You have ordered an Ice Cream Cone, please pay at the next window.");
                break;
            default:
                System.out.println(
                        "Sorry, we do not currently carry that menu item.");
                break;
        }
    }
}

