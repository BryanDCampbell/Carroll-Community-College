package edu.carrollcc.cis132;

/**
 * Question 2 [10 Points] The following program has formatting problems.
 * Add "escape sequences" to the existing code to insert end of lines and tabs in the output.
 * A table of Common escape sequences is found on page 40 of your textbook.
 * Do NOT change print to println.
 * The output should display as follows:
 *
 * These are my favorite pets:
 *      Dogs
 *      Cats
 *      Tropical Fish
 *
 * Test your program by compiling and running it.
 * @author BRYAN CAMPBELL
 */

public class Question2
{
    public static void main(String[] args)
    {
        System.out.print("These are my favorite pets:\n");
        System.out.print("\tDogs\n");
        System.out.print("\tCats\n");
        System.out.print("\tTropical Fish");
    }
}
