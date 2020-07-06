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
 * @AUTHOR Bryan Campbell
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Random;

public class Main extends Application {

    //Fields.
    private TextField myTextField;
    private ImageView imageViewOne;
    private ImageView imageViewTwo;
    private ImageView imageViewThree;
    private Label wagerLabel;
    private Label totalWins;
    private Label spinWins;
    private double spinWinnings;
    private double totalWinnings;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //TODO: Write your Slot Machine GUI code here
        //Set the stage title
        primaryStage.setTitle("Slot Machine");

        //IMAGE ROTATOR SECTION OF SLOT MACHINE
        //Create three ImageViews for the three slots
        imageViewOne = new ImageView();
        imageViewTwo = new ImageView();
        imageViewThree = new ImageView();
        //Calls updateImage method for each ImageView
        updateImage(imageViewOne);
        updateImage(imageViewTwo);
        updateImage(imageViewThree);
        //Put the three ImageViews in an HBox with 10 pixels of spacing and center alignment.
        HBox fruit = new HBox(10, imageViewOne, imageViewTwo, imageViewThree);
        fruit.setAlignment(Pos.CENTER);

        //AMOUNT INSERTED SECTION OF SLOT MACHINE
        // Make a label control.
        wagerLabel = new Label("Amount Inserted: $");
        //Make a Text Field to enter text into.
        myTextField = new TextField();
        //Put the Label and Text Field in an HBox with 10 pixels of spacing and center alignment.
        HBox wagerBox = new HBox(10, wagerLabel, myTextField);
        wagerBox.setAlignment(Pos.CENTER);

        //AMOUNT WON SECTION OF SLOT MACHINE
        //Initializing value of variables
        spinWinnings = 0;
        totalWinnings = 0;
        //Make a label control.
        spinWins = new Label("Amount Won This Spin: $" + spinWinnings);
        //Make a label control.
        totalWins = new Label("Total Amount Won: $" + totalWinnings);
        //Put both Labels in a vbox with 10 pixels of spacing and center_right alignment.
        VBox winsBox = new VBox(10, spinWins, totalWins);
        winsBox.setAlignment(Pos.CENTER_RIGHT);

        //Put the wagerBox and winsBox in a HBox with 10 pixels of spacing and center alignment.
        HBox secondLayer = new HBox(10, wagerBox, winsBox);
        secondLayer.setAlignment(Pos.CENTER);

        //Make a button to "Spin" the Slot Machine.
        Button myButton = new Button("Spin");
        //Register an event handler.
        myButton.setOnAction(new ButtonClickHandler());

        //Put the fruit HBox, secondLayer HBox, and myButton in a VBox with 10 pixels of spacing and center alignment.
        VBox vbox = new VBox(10, fruit, secondLayer, myButton);
        vbox.setAlignment(Pos.CENTER);

        //Make the VBox the root node in the scene with width of 500 pixels and height of 300 pixels.
        Scene scene = new Scene(vbox, 500, 300);
        //Set the scene to the stage.
        primaryStage.setScene(scene);
        //Show the window.
        primaryStage.show();
    }

    public void updateImage(ImageView imageView){

        //Generate random imageIndex integers from 0-9
        Random random = new Random();
        int imageIndex = random.nextInt(10);

        //If-else statement assigning fruit images to individual imageIndex integers
        if (imageIndex == 0) {
            imageView.setImage(new Image("Apple.bmp"));
            imageView.setUserData(0);
        } else if (imageIndex == 1) {
            imageView.setImage(new Image("Banana.bmp"));
            imageView.setUserData(1);
        } else if (imageIndex == 2) {
            imageView.setImage(new Image("Cherries.bmp"));
            imageView.setUserData(2);
        } else if (imageIndex == 3) {
            imageView.setImage(new Image("Grapes.bmp"));
            imageView.setUserData(3);
        } else if (imageIndex == 4) {
            imageView.setImage(new Image("Lemon.bmp"));
            imageView.setUserData(4);
        } else if (imageIndex == 5) {
            imageView.setImage(new Image("Lime.bmp"));
            imageView.setUserData(5);
        } else if (imageIndex == 6) {
            imageView.setImage(new Image("Orange.bmp"));
            imageView.setUserData(6);
        } else if (imageIndex == 7) {
            imageView.setImage(new Image("Pear.bmp"));
            imageView.setUserData(7);
        } else if (imageIndex == 8) {
            imageView.setImage(new Image("Strawberry.bmp"));
            imageView.setUserData(8);
        } else if (imageIndex == 9) {
            imageView.setImage(new Image("Watermelon.bmp"));
            imageView.setUserData(9);
        } else { }
    }

    //Method to determine if ImageView images match after spin, and assigning value to winnings
    public void checkWinnings(double wager){
        int tempOne = (int) imageViewOne.getUserData();
        int tempTwo = (int) imageViewTwo.getUserData();
        int tempThree = (int) imageViewThree.getUserData();
        boolean matchTwo = false;

        if (tempOne == tempTwo){
            matchTwo = true;
        }
        if (tempOne == tempThree){
            matchTwo = true;
        }
        if (tempTwo == tempThree){
            matchTwo = true;
        }

        //If matchTwo is true, checks if all images match
        if (matchTwo){
            //All images match, winnings equal wager x3
            if (tempOne == tempTwo && tempTwo == tempThree){
                spinWinnings = wager * 3;
                //Only two images match, winnings equal wager x2
            }else{
                spinWinnings = wager * 2;
            }
            //No images match, winnings equal wager x0
        }else{
            spinWinnings = wager * 0;
        }
        //Aggregates total winnings after each spin
        totalWinnings += spinWinnings;

        //Refreshes spinWins and totalWins
        spinWins.setText("Amount Won This Spin: $" + spinWinnings);
        totalWins.setText("Total Amount Won: $" + totalWinnings);
    }



    class ButtonClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            try {
                try{
                    //Parses user input for wager amount
                    String input = myTextField.getText();
                    double number = Double.parseDouble(input);
                    //Throws negative number for wager
                    if(number < 0){
                        throw new NegativeValueEntered();
                    }

                    //Updates ImageViews after Spin button is pressed
                    updateImage(imageViewOne);
                    updateImage(imageViewTwo);
                    updateImage(imageViewThree);

                    //Calls checkWinnings method for user input
                    checkWinnings(number);

                    //Catches and throws non-numeric entries
                }catch(NumberFormatException e) {
                    throw new NegativeValueEntered(new String());
                }
                //Catches negative value entries
            } catch (NegativeValueEntered e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}
