package cis132;

/**
 * Question 3
 * FrozenTreat Ice Cream Manufacturing Plant [25 points].
 *
 * Design a class for a FrozenTreat Ice Cream manufacturing plant (in a separate file).
 * The class should have 2 fields:
 * 1. Number of ice cream bars that can be made in an hour
 * 2. Number of hours the plant is operating per day
 * The fields should be doubles.
 *
 * Write accessors (getters) and mutators (setters) for these fields.
 *
 * The class should have a method with one parameter. The parameter is the number of ice cream bars
 * the user wants the ice cream plant to make. The method should return the number of days it will take to produce them.
 *
 * Method Formula:
 * (number ice cream bars desired)/(number ice cream bars made in an hour * number hours the plant is open each day)
 *
 * Demonstrate the class by writing a program in the Question3 main method.
 * Use Dialog boxes to ask the user how many ice cream bars can be produced in an hour.
 * It then should ask how many hours the plant operates every day.
 * Create an instance of your class and use the setters to store the data in your object.
 *
 * Use a Dialog box to ask the user how many ice cream bars they would like the plant to make.
 * Use the class object you created to call the method that calculates the number of days it will take to make
 * that many ice cream bars.
 * Use a Dialog box to display the number of days the plant will take to make the ice cream bars.
 * Make sure your numeric output contains comma delimiters and has 2 decimal places.
 * (HINT: Use String.format() method p. 114 to create a String and then print that String using the Dialog box)
 *
 * DO NOT USE CONSOLE INPUT/OUTPUT.
 * DO NOT FORGET TO CLOSE YOUR DIALOG BOX THREADS.
 *
 * Comments (document your methods) & Style worth up to 2 points.
 *
 * Example output #1 (Using Dialog Boxes)
 * ----------------
 * How many ice cream bars can be produced in an hour?
 * 100
 * How many hours does the plant operate per day?
 * 16
 * How many ice cream bars would you like to make?
 * 2000000
 * The plant will take 1,250.00 days to produce 2,000,000.00 FrozenTreat Ice Cream Bars.
 * ----------------
 *
 * Example output #2 (Using Dialog Boxes)
 * ----------------
 * How many ice cream bars can be produced in an hour?
 * 50
 * How many hours does the plant operate per day?
 * 8
 * How many ice cream bars would you like to make?
 * 200
 * The plant will take .50 days to produce 200.00 FrozenTreat Ice Cream Bars.
 * ----------------
 *
 * @author BRYAN CAMPBELL
 */

import javax.swing.JOptionPane;

public class Question3
{
    public static void main(String[] args)
    {
        //TODO demonstrate class usage here

        //Create a FrozenTreat object
        FrozenTreat freezer = new FrozenTreat();

        //Create a String of Dialog Boxes
        String barsHour, operationHour, desiredBars;

        //Using the mutator to set value for bars
        barsHour = JOptionPane.showInputDialog("How many ice cream bars can be produced in an hour?");
        double bars = Double.parseDouble(barsHour);
        freezer.setBars(bars);

        //Using the mutator to set value for hours
        operationHour = JOptionPane.showInputDialog("How many hours does the plant operate per day?");
        double hours = Double.parseDouble(operationHour);
        freezer.setHours(hours);

        //Asking the user to input total ice cream bars desired
        desiredBars = JOptionPane.showInputDialog("How many ice cream bars would you like to make?");
        double desired = Double.parseDouble(desiredBars);

        //Using the method to calculate the number of days needed to make the desired number of bars
        double days = freezer.calcDays(desired);
        JOptionPane.showMessageDialog(null, "The plant will take " +
                String.format("%,.2f", days) + " days to produce " + String.format("%,.2f", desired) +
                " FrozenTreat Ice Cream Bars");
        System.exit (0);


    }
}
