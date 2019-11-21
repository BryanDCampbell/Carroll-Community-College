/**
 * MonthRain Class should have 2 attributes:
 * String monthName
 * double totalRain
 *
 * It should have the following methods:
 * 1. A no-arg constructor that sets the monthName to "" and totalRain to 0.0
 *
 * 2. A 2-arg constructor that accepts the monthName and totalRain as parameters
 *
 * 3. A copy constructor that accepts a MonthRain object as an argument. It should assign the
 *  argument's monthName field to this.monthName and the argument's totalRain to this.totalRain
 *
 * 4. Setters and Getters for the attributes
 *
 * 5. A toString method that returns a String with the month name and total rainfall:
 *      ex)
 *      January  18.5
 *
 * 6. A compareTo method that accepts a MonthRain object as an argument and returns:
 *    -1 if the totalRain for the calling object is less than the argument object totalRain
 *    0 if the totalRain for the calling object is less than the argument object totalRain
 *    1 if the totalRain for the calling object is less than the argument object totalRain
 *
 * 7. An equals method that accepts a MonthRain object as an argument and returns:
 *      true if the monthName equals the argument object's monthName
 *      false if the monthName does not equal the argument object's monthName
 *      **REMEMBER to use equals method comparison for Strings
 *
 * @author BRYAN CAMPBELL
 */
public class MonthRain
{
    /**2 attributes for class MonthRain
     */
    private String monthName;
    private double totalRain;


    /**1. a no-arg constructor setting values for attributes
     */
    public MonthRain()
    {
        this.monthName = "";
        this.totalRain = 0.0;
    }

    /**2. 2-arg constructor that accepts totalRain and monthName as parameters
     * @param mN
     * @param tR
     */
    public MonthRain(String mN, double tR)
    {
        this.monthName = mN;
        this.totalRain = tR;
    }

    /**3.constructor that accepts MonthRain object as an argument. assign the argument's monthName field to
     *this.monthName and the argument's totalRain to this.totalRain
     */
    public MonthRain(MonthRain c)
    {
        this.monthName = c.getMonthName();
        this.totalRain = c.getTotalRain();
    }

    /**4. setters and getters for attributes
     */
    public void setMonthName(String month)
    {
        this.monthName = month;
    }
    public String getMonthName()
    {
        return monthName;
    }

    public void setTotalRain(double rain)
    {
        this.totalRain = rain;
    }
    public double getTotalRain()
    {
        return totalRain;
    }
    /**5. A toString method that returns a String with the month name and total rainfall:
     *ex) January  18.5
     */
    public String toString()
    {
        return "The month is: " + this.monthName + " and the amount of rain for this month is: " + this.totalRain;
    }

    /**6. A compareTo method that accepts a MonthRain object as an argument and returns:
     *-1 if the totalRain for the calling object is less than the argument object totalRain
     *0 if the totalRain for the calling object is equal to the argument object totalRain
     *1 if the totalRain for the calling object is greater than the argument object totalRain
     */
    public int compareTo(MonthRain c)
    {
        if (this.totalRain < c.getTotalRain())
        {
            return -1;
        }
        else if (this.totalRain == c.getTotalRain())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    /**7. An equals method that accepts a MonthRain object as an argument and returns:
     *true if the monthName equals the argument object's monthName
     *false if the monthName does not equal the argument object's monthName
     *REMEMBER to use equals method comparison for Strings
     */
    public boolean equals(MonthRain c)
    {
        if (this.monthName.equals(c.getMonthName()))
        {
            return true;
        }
        return false;
    }
}