/**
 * The Class BookList represents an ArrayList of Book objects.
 */

import javafx.collections.ObservableList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BookList {
    //Attribute
    private ArrayList<Book> bookList;

    /**
     * Constructor
     * Takes an ObservableList as a parameter and should copy each element into the attribute ArrayList called bookList
     *
     * @param oList - an ObservableList that needs to be copied into a BookList object
     */
    public BookList(ObservableList<Book> oList){
        //Instantiate the bookList attribute
        bookList = new ArrayList<Book>();
        //if the parameter oList is not null, then loop through it and create a new Book object from each element,
        //using the getters. The enhanced for-loop works great here See Chapter 7.13. Add the new Book to the attribute
        //called bookList
        if(oList != null){
            for(Book bk: oList){
                bookList.add(new Book(bk.getTitle(), bk.getPrice()));
            }
        }

    }

    /**
     * Constructor, loads the attribute bookList from a file indicated by the parameter filename
     * Make sure the file exists, if not, send a message to the console
     * @param filename - a file of books that contains on each line: title, price where title is a String and price
     *                 is a double
     * @throws IOException - throws an IOException if the file has an issue
     */
    public BookList(String filename) throws IOException {
        bookList = new ArrayList<Book>();
        //use Chapter 5 in the book to create a File object and then a Scanner object with the File object.
        //Check if the file exists, if not, post a message to the console output.
        //Loop through the lines in the file and use a StringTokenizer (chapter 8) to tokenize the string on the comma.
        //Create a Book object with the title and price as parameters and add that Book object to the bookList attribute
        //in this class
        File file = new File(filename);
        if (file.exists()){
            Scanner fileScan = new Scanner(file);
            while(fileScan.hasNext()){
                StringTokenizer strTok = new StringTokenizer(fileScan.nextLine(), ",");
                Book book = new Book(strTok.nextToken().trim(), Double.parseDouble(strTok.nextToken().trim()));
                bookList.add(book);
            }
        }else{
            System.out.println("File not found: " + filename);
        }


    }

    /**
     * getBookList returns a copy of the ArrayList attribute called bookList
     * @return
     */
    public ArrayList<Book> getBookList()
    {
        ArrayList<Book> bookCopy = new ArrayList<Book>();
        //Add code here to copy the bookList ArrayList elements into the local variable bookCopy and return bookCopy
        //Hint: You will use the 2-arg Book constructor and the getters or you can add a copy constructor to the Book
        //Class
        for(Book book: bookList){
            Book bk = new Book(book.getTitle(), book.getPrice());
            bookCopy.add(bk);
        }
        return bookCopy;
    }

    /**
     * totalPrices loops through the bookList attribute and totals the prices for each Book object.
     * @return a double representing the total of prices
     */
    public double totalPrices()
    {
        double total = 0;
        //Write a loop here to total the book prices. Each object in the ArrayList bookList is a Book, so you can
        //use the getter as you loop through and add the price to total
        if(bookList != null){
            for(Book book: bookList){
                total += book.getPrice();
            }
        }
        return total;
    }


}
