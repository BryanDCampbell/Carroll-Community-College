/** Shopping Cart System [100 Points]
Create an application that works like a shopping cart system for an online book store.
You will be provided with 4 genre files that contain the names and prices of various books, formatted in the following
fashion:
//Romance.txt may contain
    The Princess Bride, 5.99
    Louisiana Bound, 9.99
    A Dangerous Collaboration, 15.60
    Griffin & Sabine, 15.60
    Before We Were Wicked, 27.56
Their titles are: History.txt, Mystery.txt, Romance.txt, SciFi.txt

Each line in the file contains the name of a book, followed by a comma, followed by the book's retail price.

When your application begins execution, it should read the contents of the files and store the Books in a BookList object
for each genre.
In the BookList class:
Chapter 5 will tell you how to create a Scanner using the File object and read each line of the file.
Chapter 7 has more information on ArrayLists and the enhanced for-loop
Chapter 8 will tell you how to use a StringTokenizer to separate the data on each line based on the comma token.
   You will have a title and a price as tokens

The Book class will be a great way to store each book. Fill in the code as documented in the Book.java class
- It should have a String field for title and a double field for price
- It should have a 2 arg constructor that accepts a String title and a double price
- It should have a toString method that displays the Book and the price with a $ and formatted to 2 decimal places


Then the BookList class should have a list of books. Fill in the code as documented in the BookList.java class

You may add any methods you find necessary to these classes.

When loading each list of books in a genre into the ListView, you will find help in the following section:
page 847 section 12.4 Initializing a ListView with an Array or an ArrayList


There should be a ComboBox that has the following options: History, Mystery, Romance, Sci-Fi.
Its initial selection should be History and book titles and prices
should be loaded from the History.txt file and displayed in the ListView.

When the user selects a different option in the ComboBox, an event should fire and only
that file should be loaded into the ListView, showing that genre of books.
The user should be able to select a single title from the list and add it to a "shopping cart," which is simply another
ListView control.
The application should have buttons that allow the user to remove a selected item from the shopping cart,
clear the shopping cart of all selections, and total the cost of shopping cart.
When the user clicks total, it should display the total in a Label.
When the user clicks remove item, it should remove the currently selected item
When the user clicks clear cart, it should remove all the items from the ListView (setAll() without any parameters works)

 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        //TODO: Write your code here
        //File names for the book input
        String sciFile = "SciFi.txt";
        String romFile = "Romance.txt";
        String mysFile = "Mystery.txt";
        String hisFile = "History.txt";

        //Sst up the BookList objects calling the constructor that accepts a filename
        BookList sciBooks = new BookList(sciFile);
        BookList romBooks = new BookList(romFile);
        BookList mysBooks = new BookList(mysFile);
        BookList hisBooks = new BookList(hisFile);

        //Create some Buttons
        Button addBtn = new Button("Add to Cart");
        Button totBtn = new Button("Total Cost");
        Button rmvBtn = new Button("Remove Item");
        Button clearBtn = new Button("Clear Cart");

        //Create some Labels
        Label lblTotal = new Label("Total: ");
        Label lblTotalAmt = new Label("          ");

        //Add Labels to an HBox and align to the right
        HBox lblBox = new HBox(10, lblTotal, lblTotalAmt);

        //Add the Buttons to an HBox
        HBox cartBtnBox = new HBox(10, totBtn, rmvBtn, clearBtn);

        //Create a ComboBox to hold Strings for genre
        ComboBox<String> genre = new ComboBox<String>();
        //Add the genres to the ComboBox
        genre.getItems().addAll("History", "Mystery", "Romance", "Sci-Fi");
        //Default to the History genre
        genre.setValue("History");

        //Create ListView for all the books to select from
        ListView<Book> bookView = new ListView<Book>();
        bookView.setPrefSize(250, 150);
        //Add the ListView to a VBox with the add button
        VBox storeBox = new VBox(10, bookView, addBtn);

        //Create a ListView for the Shopping Cart
        ListView<Book> shoppingView = new ListView<Book>();
        shoppingView.setPrefSize(250, 150);
        //Add the ListView to a VBox with the HBox containing buttons and the HBox containing the total labels
        VBox shoppingBox = new VBox(10, shoppingView, cartBtnBox, lblBox);

        //This code will help you at some point. How to convert an ArrayList to an ObservableList Ch. 12.4
        //Initializing a ListView with an Array or an ArrayList
        bookView.getItems().setAll(FXCollections.observableArrayList(hisBooks.getBookList()));

        //Register an event handler for the ComboBox
        genre.setOnAction(event -> {
            //Create an ObservableList reference object
            ObservableList<Book> bkList;

            //Switch on the genre that is selected in the ComboBox
            switch (genre.getValue()) {
                case "Mystery":
                    bkList = FXCollections.observableArrayList(mysBooks.getBookList());
                    break;
                case "Romance":
                    bkList = FXCollections.observableArrayList(romBooks.getBookList());
                    break;
                case "Sci-Fi":
                    bkList = FXCollections.observableArrayList(sciBooks.getBookList());
                    break;
                default:
                    //Default sets to History books
                    bkList = FXCollections.observableArrayList(hisBooks.getBookList());
                    break;
            }
            bookView.getItems().setAll(bkList);
        });

        //Lambda expression event handler for the add functionality
        addBtn.setOnAction(event ->{
            if(bookView.getSelectionModel().getSelectedItems() != null){
                //get the selected item if one is selected and add to the shopping cart ListView
                shoppingView.getItems().add(bookView.getSelectionModel().getSelectedItem());
            }
        });

        //Lambda expression event handler for the total button
        totBtn.setOnAction(event->{
            BookList bkList = new BookList(shoppingView.getItems());
            lblTotalAmt.setText(String.format("$%.2f", bkList.totalPrices()));
        });

        //Lambda expression event handler to remove items from the shoppingView of items
        rmvBtn.setOnAction(event->{
            //Get the index for the selected item in shopping cart
            int selected = shoppingView.getSelectionModel().getSelectedIndex();
            if(selected != -1){
                shoppingView.getItems().remove(selected);
            }
        });

        //Lambda expression event handler to clear the shoppingView of all items
        clearBtn.setOnAction(event->{
            //Get the ObservableList of Books from the shopping cart
            shoppingView.getItems().setAll();
        });

        //Put the ComboBox in an HBox
        HBox hbox = new HBox(10, genre);
        HBox siteBox = new HBox(20, hbox, storeBox, shoppingBox);
        siteBox.setPadding(new Insets(20));
        Scene scene = new Scene(siteBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Turn the Page Bookstore");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}