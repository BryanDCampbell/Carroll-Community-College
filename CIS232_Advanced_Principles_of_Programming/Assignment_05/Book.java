/**
 * The Class Book represents one book by its title and price.
 */
public class Book {
    //attributes for title and price
    public String title;
    public double price;

    //getters
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //constructor that accepts 2 arguments(title and price) and sets the fields to those arguments
    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    //toString method, returns a String. Should display book as Title and price, formatted with $ and 2 decimal places
    public String toString(){
        return String.format("%s $%.2f", title, price);
    }
}
