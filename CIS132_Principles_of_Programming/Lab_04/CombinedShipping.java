/**
 * Design and implement a class that has fields for the number of items, miles shipped, and has a method that
 * returns the shipping charge as a double or float. You can use a 2-arg constructor OR use setters to set your fields.
 *
 Number of Items                          Flat Rate per 500 miles shipped
 *  * 1 item                                   $3.50
 *  * 2 - 5 items                              $4.50
 *  * 6 -10 items                              $7.50
 *  * 11 or more items                         $9.50
 *
 * @AUTHOR BRYAN CAMPBELL
 */

public class CombinedShipping
{

    private double items;
    private double miles;
    private double flatRate;


    public void setItems(double i)
    {
        items = i;
    }
    public void setMiles(double m)
    {
        miles = m;
    }

    public double getItems()
    {
        return items;
    }
    public double getMiles()
    {
        return miles;
    }

    /**
     * Constructor for determining flatRate
     * "return flatRate" returns the flat rate fee
     */
    public double getFlatRate()
    {
        if (items == 1)
        {
            flatRate = 3.5;
        }
        else if (items <= 5)
        {
            flatRate = 4.5;
        }
        else if (items <= 10)
        {
            flatRate = 7.5;
        }
        else
            {
            flatRate = 9.5;
        }
        return flatRate;
    }

    /**
     * Method to calculate the total shipping charge
     * "return fee" returns the shipping charge
     */
    public double fee()
    {
        double num = Math.ceil(miles / 500);
        double fee = num * getFlatRate();
        return fee;
    }

}
