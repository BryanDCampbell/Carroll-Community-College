import java.util.Scanner;

/**
 * Question 2 [15 Points]
 *
 * Write a Rectangle Class with three fields and has a constructor with three parameters,
 *   - integers: width and height
 *   - character: drawChar
 * The class will have a method called printOutline that prints a rectangle to the
 * console that is the outline based on the dimensions width and height.
 * The method will use the character drawChar as its outline character. The method
 * should use nested for loops to print the output.
 * (HINT: Try to get the output to print a full rectangle without the spaces in the middle,
 * then alter your code to just print the character on the outline - think about your nested for-loops and what
 * values should have a character print or a space print.)
 *
 * The main method will demonstrate this class by asking the user for width, height and
 * a draw character.
 * (HINT: use charAt(0) method to get character from input String)
 * It will call the constructor with these values and then
 * draw a rectangle outline to the console.
 * Input Validation: Do not allow the user to enter negative numbers for height and width.
 * Loop until they enter a positive value.
 *
 * Example Output 1:
 * Please enter a character for your drawing:
 * $
 * Please enter a positive integer width:
 * 4
 * Please enter a positive integer height:
 * 5
 *
 * $$$$
 * $  $
 * $  $
 * $  $
 * $$$$
 *
 * Example Output 2:
 * Please enter a character for your drawing:
 * !
 * Please enter a positive integer width:
 * -1
 * INVALID - enter a positive integer width:
 * 6
 * Please enter a positive integer height:
 * -8
 * INVALID - enter a positive integer height:
 * 10
 *
 * !!!!!!
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !    !
 * !!!!!!
 *
 * @author BRYAN CAMPBELL
 *
 * Comments and style are worth up to 2 points.
 */
public class Question2 {

    public static void main(String[] args) {

        System.out.println("Please enter a character for your drawing:");

        //create a scanner object for user input

        Scanner character = new Scanner(System.in);

        String c = character.nextLine();
        char drawChar = c.charAt(0);

        System.out.println("Please enter a positive integer width: ");

        //create scanner object for user input

        Scanner keyboard = new Scanner(System.in);
        int width = keyboard.nextInt();

        //use while loop to determine the correct input value

        while (width <=0){
            System.out.println("INVALID - enter a positive integer width: ");
            width = keyboard.nextInt();
        }

        System.out.println("Please enter a positive integer length: ");
        int length = keyboard.nextInt();

        //use while loop to determine the correct input value

        while (length <=0){
            System.out.println("INVALID - enter a positive integer length: ");
            length = keyboard.nextInt();
        }

        //set the Rectangle constructor with width, length, and drawChar

        System.out.println();
        Rectangle rectangle = new Rectangle(width,length,drawChar);
        rectangle.printOutline();
    }
}

