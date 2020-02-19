/*
Palindrome Tester (20 points)
Palindrome: a word or phrase whose letters/numbers read the same (ignoring spaces and punctuation) way in either forward
or reverse direction. Famous examples include â€œAmore, Romaâ€œ, â€œA man, a plan, a canal: Panamaâ€ and â€œNo â€˜xâ€™ in â€˜Nixonâ€™â€œ.

Write a program that asks the user to enter a word or sentence.
It reads a sentence from the keyboard and determines if it is a palindrome or not.
The entered string may contain letters, numbers, spaces and punctuation.
Your program should ignore spaces, punctuation, and whether letters are upper/lowercase.
Print a message to the screen with your answer and ask if they would like to test another word or sentence.
(HINT: Chapter 8 has some useful tools)

@author BRYAN CAMPBELL

 */

import java.util.Scanner;

public class Question1 {

    //It reads a sentence from the keyboard and determines if it is a palindrome or not.
    static boolean isPalindrome(String entry)
    {
        //Your program should ignore spaces, punctuation, and whether letters are upper/lowercase.
        String entrySimple = entry.replaceAll("\\W", "").toLowerCase();

        //METHOD TO REVERSE PALINDROME ENTRY
        //a and b represent the opposite ends of the user entered string.
        int a = 0, b = entrySimple.length() - 1;

        // Working inward, comparing opposite ends of user entered string to each other
        while (a < b) {

            // If at any point the characters don't match, isPalindrome is false.
            if (entrySimple.charAt(a) != entrySimple.charAt(b))
                return false;

            // Progressing through the string, a is increased and b is decreased at each step.
            a++;
            b--;
        }
        // Given everything matches correctly, isPalindrome is true.
        return true;


    }



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Introducing the palindrome checker, and explanation of what a palindrome is.
        System.out.println("PALINDROME CHECKER");
        System.out.println("Palindrome: a word or phrase whose letters/numbers read the same " +
                "(ignoring spaces and punctuation) way in either forward or reverse direction.\n");

        boolean end = false;
        do {
            //Write a program that asks the user to enter a word or sentence.
            System.out.println("Enter a word or phrase to check if it is a palindrome: ");

            //The entered string may contain letters, numbers, spaces and punctuation.
            String entry = keyboard.nextLine();

            //Print a message to the screen with your answer and ask if they would like to test another word or sentence.
            System.out.print("The word or phrase you entered IS ");

            //calling isPalindrome, prints out correct statement if it is true or false
            if (isPalindrome(entry)) {
                System.out.print("a palindrome!\n");
            }
            else {
                System.out.print("NOT a palindrome!\n");
            }

            System.out.println("Would you like to test another word or phrase? (Y or N)");
            String keepTesting = keyboard.nextLine();

            //user types Y/y to continue and N/n to finish and close program
            if (keepTesting.toUpperCase().equals("Y")) {
                end = false;
            }
            else if (keepTesting.toUpperCase().equals("N")) {
                end = true;
                System.out.println("Thank you. Goodbye.");
            }

            //If the user does not enter one of Y/y/N/n, user is informed they must enter a correct input
            else {
                do{
                    System.out.println("Invalid input! Please enter Y or N");
                    keepTesting = keyboard.nextLine();

                    if (keepTesting.toUpperCase().equals("Y")) {
                        end = false;

                    }
                    else if (keepTesting.toUpperCase().equals("N")) {
                        end = true;

                    }
                } while(!keepTesting.toLowerCase().equals("y") && !keepTesting.toLowerCase().equals("n"));
            }
        } while (end == false);
    }
}
