package cis132;
/**
 * Question 1
 * Triangle Class (10 points)
 * 
 * Write a class, in a separate file, called Triangle
 * The class should have 2 private fields: base, height
 *
 * The class should have appropriate mutators (setters) and accessors (getters) for the fields
 *
 * The class should have a method called calcArea() that calculates the area of a triangle
 * using its base and height fields, then return the value as a double.
 *
 * TRIANGLE AREA FORMULA: 0.5 * base * height
 *
 * Ask the user to input the base and height of a triangle. Use the Scanner object (Console Input and Output) to
 * read in the values.
 * Create an instance of the Triangle object and call the appropriate methods to set the values of the fields.
 * Print out the area of the Triangle using the Triangle object you created and the calcArea() method.
 *
 * Sample Output and Input #1
 *
 * Enter the base of a triangle: 1.75
 * Enter the height of a triangle: 4.8
 * The area of your triangle is: 4.2
 *
 * Sample Output and Input #2
 *
 * Enter the base of a triangle: 10
 * Enter the height of a triangle: 5
 * The area of your triangle is: 25.0
 *
 * Comments (document your methods) & Style worth up to 2 points
 *
 * @author BRYAN CAMPBELL
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        //TODO: Write code to demonstrate your Triangle class here

        //Create a triangle object
        Triangle triforce = new Triangle();

        //Use Scanner to ask user for a base
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the base of a triangle: ");
        double base = b.nextDouble();

        //Set the base in the triangle object
        triforce.setBase(base);

        //Use Scanner to ask user for a height
        Scanner h = new Scanner(System.in);
        System.out.print("Enter the height of a triangle: ");
        double height = h.nextDouble();

        //Set the height in the triangle object
        triforce.setHeight(height);

        //Calculate the area using your object instance method
        double area = triforce.calcArea();

        //Print a message showing the Aera of your triangle
        System.out.println("The area of your triangle is: " + area);
    }
}
