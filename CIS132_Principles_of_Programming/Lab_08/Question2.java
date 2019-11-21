import java.util.Scanner;

/**
 * Password Verifier [25 points]
 *
 * Imagine you are developing a software package for an online shopping site that
 * requires users to enter their own passwords. Your software requires that users'
 * passwords meet the following criteria:
 * 1. The password should be at least 8 characters long.
 * 2. The password should contain at least one uppercase and at least one lowercase
 * letter.
 * 3. The password should contain at least one digit.
 *
 * Once the password passes the criteria (loop until they enter a valid password),
 * have them enter it again and see if the two passwords match (case-sensitive!).
 * If match, print message saying password saved.
 * If not match, print message saying passwords do not match.
 *
 * @author BRYAN CAMPBELL
 */
public class Question2
{
    //creates an object to store a password the user wants to save
    public static String password;

    //method that determines whether the password is at least 8 characters long
    public static boolean characters()
    {
       if(password.length() >7) {
           return true;
       }
       return false;
    }

    //method that determines whether the password contains at least one uppercase and lowercase character
    public static boolean cases()
    {
        char[] charArray;
        charArray = password.toCharArray();
        boolean uppercase = false, lowercase = false;
        for(int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                uppercase = true;
            }
            if (Character.isLowerCase(charArray[i])) {
                lowercase = true;
            }
        }
        if(uppercase == true && lowercase == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //method that determines whether the password contains at least one numeric digit
    public static boolean digits()
    {
        char[] charArray;
        charArray = password.toCharArray();
        boolean digits = false;
        for(int i = 0; i < charArray.length; i++)
        {
            if(Character.isDigit(charArray[i]))
            {
                digits = true;
            }
        }
        if(digits == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        password = new String();
        Scanner keyboard = new Scanner(System.in);

        //prints prompt for user to enter a password
        System.out.println("Enter a password that meets the following criteria:\n" +
                "1. The password should be at least 8 characters long.\n" +
                "2. The password should contain at least one uppercase and at least one lowercase letter\n" +
                "3. The password should contain at least one digit.)");
        password = keyboard.nextLine();

        //loops until user enters a password that meets the correct criteria
        while(cases() == false || characters() == false || digits() == false)
        {
            System.out.println("\nThis does not meet the password criteria. Enter a correct password.");
            password = keyboard.nextLine();
        }

        //print that prompts the user to re-enter their password as the object password2
        System.out.println("Please re-enter your password: ");
        String password2 = keyboard.nextLine();

        //password2 doesn't match the password they previously entered
        if(!password2.equals(password))
        {
            System.out.println("Passwords do not match");
        }

        //password2 matches the password they previously entered
        if(password2.equals(password))
        {
            System.out.println("Password saved");
        }
    }
}


