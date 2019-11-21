import java.io.File;
import java.util.Scanner;
/**
 * RainFall Array [50 points]
 * **This lab enhances the in-class RainFall lab from 4/16/2019
 * **Please note: Lab 7 will add to this lab.**
 *
 * In the file "MonthRain.java" write a class that does the following:
 *
 * **************************************************
 * MonthRain Class should have 2 attributes:
 * String monthName
 * double totalRain
 *
 * It should have the following methods:
 * 1. A no-arg constructor that sets the monthName to "" and totalRain to 0.0
 *
 * 2. A 2-arg constructor that accepts the monthName and totalRain as parameters
 *
 * 3. A copy constructor that accepts a MonthRain object as an argument. It should assign the
 *  argument's monthName field to this.monthName and the argument's totalRain to this.totalRain
 *
 * 4. Setters and Getters for the attributes
 *
 * 5. A toString method that returns a String with the month name and total rainfall:
 *      ex)
 *      January  18.5
 *
 * 6. A compareTo method that accepts a MonthRain object as an argument and returns:
 *    -1 if the totalRain for the calling object is less than the argument object totalRain
 *    0 if the totalRain for the calling object is less than the argument object totalRain
 *    1 if the totalRain for the calling object is less than the argument object totalRain
 *

 * 7. An equals method that accepts a MonthRain object as an argument and returns:
 *      true if the monthName equals the argument object's monthName
 *      false if the monthName does not equal the argument object's monthName
 *      **REMEMBER to use equals method comparison for Strings
 *
 *  ***********************************************
 *
 * In the file "RainFall.java" write a Class that does the following:
 *
 *  RainFall class stores the total rainfall for each of the 12 months into an array of MonthRain objects
 *  The program should have 1 attribute that is an array of MonthRain objects.
 *  The program should have methods that do the following:
 *  1. A constructor that accepts an array as an argument and creates objects for each element and copies
 *  the argument array contents into the attribute array.
 *  (HINT: Remember to instantiate your array with a max size(12) and use the MonthRain copy constructor!)
 *
 *  2. Total rainfall for the year
 *
 *  3. The average monthly rainfall
 *
 *  4. Month with the most rain
 *
 *  5. Month with the least rain
 *
 *  6. toString method that returns a String representing all the elements of the array
 *  (HINT: use the MonthRain toString method in a loop)
 *
 * *************************************************
 * In the Question1.java file
 * DEMONSTRATE the classes in the main method
 * 1. Ask the user to enter the name of the month and the rainfall for each month (double)
 *      DO NOT ALLOW NEGATIVE NUMBERS
 *
 * 2. Use an array of MonthRain objects to store the information as you go along.
 *
 * 3. Create a RainFall object using the constructor that accepts an array as an argument
 *
 * 4. Display a menu that allows user to select from the following:
 *         Please select a Menu Option
 *         1. Total Rainfall
 *         2. Average Rainfall
 *         3. Month with Most Rainfall
 *         4. Month with Least Rainfall
 *         5. Print all the Months and Rainfall
 *         6. EXIT
 *
 * BONUS (5 POINTS - Instead of asking the user for the data one by one, ask the user for a file name,
 * (sample input files provided) to load the data for each month from the file by reading the file.
 * Month name will be on a line, with its rainfall on the next line. )
 *
 * **************************************************************************************************
 * Add a class called ArrayTools to your LabSix project.
 * Use the following skeleton to implement static selectionSort and static sequentialSearch in the ArrayTools class
 * as described.
 * Edit your menu to have more options. Option 7 should ask user for a Month name.
 *
 *  * Display a menu that allows user to select from the following:
 *  *         Please select a Menu Option
 *  *         1. Total Rainfall
 *  *         2. Average Rainfall
 *  *         3. Month with Most Rainfall
 *  *         4. Month with Least Rainfall
 *  *         5. Print all the Months and Rainfall
 *  *         6. Print Sorted Months and Rainfall
 *  *         7. Print rainfall for a specific month
 *  *         8. EXIT
 *
 * @author BRYAN CAMPBELL
 */

public class Question1
{
    public static void main(String[] args)
    {
        int NUM_MONTHS = 12;
        MonthRain[] array = new MonthRain[NUM_MONTHS];

        Scanner keyboard = new Scanner(System.in);

        /**BONUS (5 POINTS - Instead of asking the user for the data one by one, ask the user for a file name,
         *(sample input files provided) to load the data for each month from the file by reading the file.
         *Month name will be on a line, with its rainfall on the next line. )
         */
        String textLocation = new String();
        System.out.println("Please enter a file name to load data: ");
        textLocation = keyboard.nextLine();

        File file = new File("src/" + textLocation);

        try
        {
            Scanner fileScanner = new Scanner(file);
            String month;
            double rain;
            int i = 0;

            while (fileScanner.hasNextLine())
            {

                month = fileScanner.nextLine();
                rain = fileScanner.nextDouble();
                fileScanner.nextLine();

            /** 2. Use an array of MonthRain objects to store the information as you go along.
             */
                MonthRain newer = new MonthRain(month, rain);
                array[i] = newer;
                i++;
            }

        }
        catch (Exception e) { }

        /**1. Ask the user to enter the name of the month and the rainfall for each month (double)
         *DO NOT ALLOW NEGATIVE NUMBERS
         */
//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.println("What month are we talking about?:");
//            String month = keyboard.nextLine();
//
//
//            System.out.println("What's the rainfall for " + month + "?:");
//            double rain = keyboard.nextDouble();
//            keyboard.nextLine();
//            while (rain < 0.0)
//            {
//                System.out.println("Invalid input. What's the rainfall for " + month + "?:");
//                rain = keyboard.nextDouble();
//                keyboard.nextLine();
//            }
//
        /** 2. Use an array of MonthRain objects to store the information as you go along.
         */
//            MonthRain newer = new MonthRain(month, rain);
//            array[i] = newer;
//        }

        /** 3. Create a RainFall object using the constructor that accepts an array as an argument
         */
        RainFall r = new RainFall(array);


        /** 4. Display a menu that allows user to select from the following:
         *         Please select a Menu Option
         *         1. Total Rainfall
         *         2. Average Rainfall
         *         3. Month with Most Rainfall
         *         4. Month with Least Rainfall
         *         5. Print all the Months and Rainfall
         *         6. EXIT
         */

        int choice;
        do
            {
            System.out.println("Please select a Menu Option\n" +
                    "\t\t1. Total Rainfall\n" +
                    "\t\t2. Average Rainfall\n" +
                    "\t\t3. Month with Most Rainfall\n" +
                    "\t\t4. Month with Least Rainfall\n" +
                    "\t\t5. Print all the Months and Rainfall\n" +
                    "\t\t6. Print Sorted Months and Rainfall\n" +
                    "\t\t7. Print Rainfall for a Specific Month\n" +
                    "\t\t8. EXIT");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.printf("The total rainfall for the year is: %.1f \n", r.total());
                    break;
                case 2:
                    System.out.printf("The average rainfall for the year is: %.1f \n", r.averageMonthly());
                    break;
                case 3:
                    System.out.println("The month with the most rainfall is: " + r.mostRain());
                    break;
                case 4:
                    System.out.println("The month with the least rainfall is: " + r.leastRain());
                    break;
                case 5:
                    System.out.println(r.toString());
                    break;
                case 6:
                    r = new RainFall(ArrayTools.selectionSort(array));
                    System.out.println(r.toString());
                    break;
                case 7:
                    System.out.println("Which month would you like to know the rainfall of?:");
                    String selection;
                    selection = keyboard.nextLine();
                    int index = ArrayTools.sequentialSearch(array, selection);
                    System.out.println(array[index].toString());
                    break;
                case 8:
                    break;
                default:
            }
        }
        while (choice != 8);
    }

}