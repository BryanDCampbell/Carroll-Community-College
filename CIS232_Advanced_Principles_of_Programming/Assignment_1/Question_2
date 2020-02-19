/*
Simple Inheritance (20 Points}
Write a simple Superclass and Subclass to show inheritance.
Add the 2 new class files to the src directory. (right-click src, select new->Java Class)
The Superclass should be called "PhoneNumber" and the Subclass should be called "Mobile"
Test your subclass in the main method in Question1.java by asking user to enter a mobile phone number
(any format you like). Ask if they would like to receive text messages. Use your subclass to instantiate a Mobile object.
Call setters to set your attributes.
Then, display to the console, the phone number and their texting preference. Don't write a constructor, just use Java
default for now. See UML diagram below for class fields and methods.

@author BRYAN CAMPBELL

UML DIAGRAM
|----------------------------------|
|          PhoneNumber             |
|----------------------------------|
| - number : String                |
|----------------------------------|
| + getNumber() : String           |
| + setNumber(num : String) : void |
|----------------------------------|
                 ^
                 |
                 |
                 |
|--------------------------------------|
|             Mobile                   |
|--------------------------------------|
| - receiveText : boolean              |
|--------------------------------------|
| + getReceiveText(): boolean          |
| + setReceiveText(b : boolean) : void |
|--------------------------------------|

 */
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //Test your subclass in the main method in Question1.java by asking user to enter a mobile phone number
        System.out.println("Please enter a mobile phone number (xxx-xxx-xxxx): ");
        String number = userInput.nextLine();

        //Ask if they would like to receive text messages.
        System.out.println("Would you like to receive text messages (Y/N)?");
        String receiveText = userInput.nextLine();

        Mobile newMobile = new Mobile();
        newMobile.setNumber(number);
        if (receiveText.toLowerCase().charAt(0) == 'y') {
            newMobile.setReceiveText(true);
        }
        else {
            newMobile.setReceiveText(false);
        }

        //Then, display to the console, the phone number and their texting preference.
        System.out.println("Your phone number is: " + newMobile.getNumber());
        System.out.print("Your texting preference is to: ");
        if (newMobile.getReceiveText() == true){
            System.out.print("receive text messages");
        }
        else {
            System.out.print("NOT receive text messages");
        }
    }
}
