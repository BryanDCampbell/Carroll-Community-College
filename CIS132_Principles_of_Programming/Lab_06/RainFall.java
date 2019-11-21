/**
 * RainFall class stores the total rainfall for each of the 12 months into an array of MonthRain objects
 * The program should have 1 attribute that is an array of MonthRain objects.
 * The program should have methods that do the following:
 * 1. A constructor that accepts an array as an argument and creates objects for each element and copies
 * the argument array contents into the attribute array.
 * (HINT: Remember to instantiate your array with a max size(12) and use the MonthRain copy constructor!)
 * 2. Total rainfall for the year
 * 3. The average monthly rainfall
 * 4. Month with the most rain
 * 5. Month with the least rain
 * 6. toString method that returns a String representing all the elements of the array
 * (HINT: use the MonthRain toString method)
 *
 * @author BRYAN CAMPBELL
 */
public class RainFall
{

    /** The program should have 1 attribute that is an array of MonthRain objects.
     */
    private MonthRain[] mR;

    /** The program should have methods that do the following:
     *1. A constructor that accepts an array as an argument and creates objects for each element and copies
     *the argument array contents into the attribute array.
     *(HINT: Remember to instantiate your array with a max size(12) and use the MonthRain copy constructor!)
     */
    public RainFall(MonthRain[] x)
    {
        mR = new MonthRain[12];
        for (int i = 0; i < x.length; i++)
        {
            MonthRain t = new MonthRain(x[i]);
            mR[i] = t;
        }
    }

    /** 2. Total rainfall for the year
     * @return
     */
    public double total()
    {
        double y = 0;
        for (int i = 0; i < mR.length; i++)
        {
            y += mR[i].getTotalRain();
        }
        return y;
    }

    /** 3. The average monthly rainfall
     * @return
     */
    public double averageMonthly()
    {
        return total() / mR.length;
    }

    /** 4. Month with the most rain
     * @return
     */
    public String mostRain()
    {
        MonthRain highest = new MonthRain();
        for (int i = 0; i < mR.length; i++)
        {
            if (mR[i].compareTo(highest) == 1)
            {
                highest = mR[i];
            }
        }
        return highest.getMonthName();
    }

    /** 5. Month with the least rain
     * @return
     */
    public String leastRain()
    {
        MonthRain lowest = new MonthRain();
        lowest.setTotalRain(total());
        for (int i = 0; i < mR.length; i++)
        {
            if (mR[i].compareTo(lowest) == -1)
            {
                lowest = mR[i];
            }
        }
        return lowest.getMonthName();
    }

    /**6. toString method that returns a String representing all the elements of the array
     *(HINT: use the MonthRain toString method)
     */
    public String toString()
    {
        String allElements = "";
        for (int i = 0; i < mR.length; i++)
        {
            allElements += mR[i].toString() + "\n";
        }
        return allElements;
    }
}
