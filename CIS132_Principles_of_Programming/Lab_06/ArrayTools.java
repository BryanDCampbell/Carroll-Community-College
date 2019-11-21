/**Layout for ArrayTools Class
 * @author BRYAN CAMPBELL
 */


public class ArrayTools
{
    static MonthRain[] selectionSort(MonthRain[] array)
    {
    /**Write a static method called selectionSort that sorts an array of
     *MonthRain objects based on their rainfall amounts.
     *The array is passed in as a parameter. page 499 in book has method for integer array
     *use your compareTo (from MonthRain Class) method to compare
     */
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (array[j].compareTo(array[j + 1]) == 1)
                {
                    // swap arr[j+1] and arr[i]
                    MonthRain temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**Write a static method called sequentialSearch that finds a month name
     *in the array of MonthRain objects. The method has 2 parameters, an array
     *of MonthRain objects and a String that represents the month name you are searching
     *for. It returns the integer index of the month's location if it is found in the array.
     *It returns -1 if not found. Page 495 has a searchArray method for reference.
     *Use your equals method (from MonthRain Class) to compare objects.
     */
    static int sequentialSearch(MonthRain[] array, String monthSearch)
    {
        MonthRain somethingElse = new MonthRain();
        somethingElse.setMonthName(monthSearch);

        int match = -1;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(somethingElse))
            {
                match = i;
                return match;
            }
        }
        return match;
    }

}