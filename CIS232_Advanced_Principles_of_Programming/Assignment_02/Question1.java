import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

/**
 * Inheritance (50 Points)
 *
 * In a course, the teacher gives the following tests and assignments:
 *  - a lab activity that is observed by the teacher and assigned a numeric score.
 *  - a pass/fail exam that has 10 questions. The minimum passing score is 70.
 *  - an essay that is assigned a numeric score.
 *  - a final exam that has 50 questions.
 *
 * 1. Design an Essay class that extends the GradedActivity class presented in Chapter 9.
 * The files are included in this lab. You will only use GradedActivity for Lab2
 * The Essay class should determine the grade that a student receives on an essay.
 * The student's essay score can be up to 100 and is determined in the following manner:
 * Grammar: up to 30 points
 * Spelling: up to 20 points
 * Correct Length: up to 20 points
 * Content: up to 30 points
 * Create final static constants for those max values in Essay class.
 *
 * Your class should also have fields for each of those scores.
 * Write appropriate constructor, mutators and accessors. Constructor should accept 4 arguments to set those scores.
 * It should also have a method for summing the total points that returns a double.
 * It will use the GradedActivity setScore method to set the score.
 *
 * Use the Question1 class to demonstrate your new class.
 *
 * @author BRYAN CAMPBELL
 */

public class Question1 {

    public static int eGrammar, eSpelling, eContent, eCorrectLength;

    public static void main(String[] args) {

        //Demonstrate Essay class here. Ask for the scores on each part of the essay. You should use validation to make sure
        //the scores don't exceed the points allowed for each part. Use your constants in the Essay class for the max
        //values.
        //Create an object then print the total points and the GradedActivity setScore method to set the score.
        //Then print the letter grade for the Essay activity.

        //Program prompts User to enter values for different components of the Essay grade
        System.out.println("Please enter essay scores for");

        //Prompts User to enter a value for Grammar grade
        System.out.println("Grammar: ");
        //Calls the returnValue constructor
        eGrammar = returnValue(Essay.GRAMMAR);

        //Prompts User to enter a value for Spelling grade
        System.out.println("Spelling: ");
        //Calls the returnValue constructor
        eSpelling = returnValue(Essay.SPELLING);

        //Prompts User to enter a value for Correct Length grade
        System.out.println("Correct Length: ");
        //Calls the returnValue constructor
        eCorrectLength = returnValue(Essay.CORRECT_LENGTH);

        //Prompts User to enter a value for Content grade
        System.out.println("Content: ");
        //Calls the returnValue constructor
        eContent = returnValue(Essay.CONTENT);

        //Calls Essay constructor with User entered values for parameters
        Essay studentEssay = new Essay(eGrammar, eSpelling, eCorrectLength, eContent);
        //Prints out the essay grade
        System.out.printf("The total points earned are: %.0f %n", studentEssay.getScore());
        System.out.println("The essay letter grade is: " + studentEssay.getGrade());
    }

    //Constructor to reduce repetitive code with upper limit set by selected max constant
    public static int returnValue(int max){
        Scanner keyboard = new Scanner(System.in);
        //Stores user input as integer input
        int input = keyboard.nextInt();
        //If input does not meet the following requirements, enters a loop
        if (input > max || input < 0) {
            do {
                //Prompts the user to enter a valid value
                System.out.println("Invalid input. Please enter a value between 0 - " + max + ":");
                //If user does not enter an integer, catches the exception
                try{
                    input = keyboard.nextInt();
                }catch(Exception e){
                    keyboard.nextLine();
                }
            } while (input > max || input < 0);
        }
        return input;
    }
}
