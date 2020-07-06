/**
 * Slot Machine Simulation - [100 points](p. 807 Programming Challenge #10)
 * A slot machine is a gambling device into which the user inserts money then pulls a lever (or presses a button.)
 * The slot machine then displays a set of random images. If two or more of the images match, the user wins an amount
 * of money that the slot machine dispenses back to the user.
 *
 * Create a JavaFX application that simulates a slot machine. The GUI should look like the file SlotMachineImage.jpg
 * included in this project. You can also find the GUI layout on p. 807 of the textbook (Figure 11-39)
 *
 * The application should let the user enter into a TextField, the amount of money they are inserting into the machine.
 * When the user clicks the "Spin" button, the application should display three randomly selected symbols.
 * (Slot machines traditionally display fruit symbols. You will find a set of fruit symbol images in this project file
 * in the src directory) The program should also display the amount that the user won for the spin and the total
 * amount won for all spins.
 *
 * The amount won for a spin is determined in the following way:
 * - if none of the randomly displayed images match, the user has won $0. (If you like, you can subtract their bet from
 * the total amount to show how much they have lost.)
 * - if two of the images match, the user has won two times the amount entered in the TextField
 * - if three of the images match, the user has won three times the amount entered.
 *
 * You should use Exception handling as well. When the user clicks the "Spin" button, if they have entered a non-numeric
 * value in the TextField, a JOptionPane message dialog should appear telling them to "Enter a positive, numeric value."
 * (Hint: the Double.parseDouble() method will throw a NumberFormatException if it does not find a double to parse)
 *
 * You should also create your own Exception class called NegativeValueEntered that extends Exception,
 * in a separate java file. All you will need in this class is a no-arg constructor. See p. 714 about creating your
 * own Exception Classes.
 *
 * The Spin button Event Handler will catch the Exceptions if they occur. See p. 706 on how to handle multiple
 * Exceptions.
 *
 */

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        //TODO: Write your Slot Machine GUI code here
    }


    public static void main(String[] args) {
        launch(args);
    }
}
