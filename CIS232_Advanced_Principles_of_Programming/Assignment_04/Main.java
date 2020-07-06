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

private TextField myTextField;
private Label capitalText;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        //TODO: Write your Slot Machine GUI code here

        //Set the stage title
        primaryStage.setTitle("Slot Machine");

        //AMOUNT INSERTED SECTION OF SLOT MACHINE
        // Make a label control.
        Label wagerLabel = new Label("Amount Inserted: $");
        //Make a Text Field to enter text into.
        myTextField = new TextField();
        //Put the Label and Text Field in an HBox with 10 pixels of spacing and center alignment.
        HBox wagerBox = new HBox(10, wagerLabel, myTextField);
        wagerBox.setAlignment(Pos.CENTER);

        //SPACETAKER
        //Make a label control.
        Label spaceTaker = new Label("                                   ");

        //AMOUNT WON SECTION OF SLOT MACHINE
        //Make a label control.
        Label spinWins = new Label("Amount Won This Spin: $");  //NEED TO DO MORE
        //Make a labe control.
        Label totalWins = new Label("Total Amount Won: $");     //NEED TO DO MORE
        //Put both Labels in a vbox with 10 pixels of spacing and center_right alignment.
        VBox winsBox = new VBox(10, spinWins, totalWins);
        winsBox.setAlignment(Pos.CENTER_RIGHT);

        //COMBINATION OF AMOUNT INSERTED AND AMOUNT WON SECTIONS
        HBox secondLayer = new HBox(10, wagerBox, spaceTaker, winsBox);


        //Make a button to "Spin" the Slot Machine.
        Button myButton = new Button("Spin");
        //Register an event handler.
        myButton.setOnAction(new ButtonClickHandler());
        //Make a label that shows altered images (should be blank until button pushed).
        capitalText = new Label();

        //FRUIT WHEELS SECTION OF SLOT MACHINE
        //image1
        //image2
        //image3
        //HBox firstLayer = new HBox(10, image1, image2, image3);


        //Put the HBox, Button, and Label in a VBox with 20 pixels of spacing and center alignment.
        VBox vbox = new VBox(10, secondLayer, myButton, capitalText);
        vbox.setAlignment(Pos.CENTER);

        //Make the VBox the root node in the scene with width of 600 pixels and height of 200 pixels.
        Scene scene = new Scene(vbox, 600, 200);
        //Set the scene to the stage.
        primaryStage.setScene(scene);
        //Show the window.
        primaryStage.show();
    }

    class ButtonClickHandler implements EventHandler<ActionEvent> {
        @Override
        p public void handle(ActionEvent event) {
            //Get the string to capitalize.
            String input = myTextField.getText();
            //Convert user input to double
            double userAmountEntered = Double.parseDouble(input);

            int imageIndex;
            Random random = new Random();
            imageIndex = random.nextInt(6);

            if(imageIndex == 0){
                //apple
            } else if(imageIndex == 1){
                //banana
            } else if(imageIndex == 2){
                //cherries
            } else if(imageIndex == 3){
                //grapes
            } else if(imageIndex == 4){
                //lemon
            } else if(imageIndex == 5){
                //lime
            } else if(imageIndex == 6){
                //orange
            }else if(imageIndex == 7){
                //pear
            }else if(imageIndex == 8){
                //strawberry
            }else (imageIndex == 9){
                //watermelon
            }

            //Display the results.
            capitalText.setText(String.format(input.toUpperCase()));
        }

    public static void main(String[] args) {
        launch(args);
    }
}
