package cis132;

/**
 * Question 4 [10 points].
 * There are 12 inches in a foot and 3 feet in a yard.  Write a program
 * that calculates the number of inches in 4,835,072 yards (distance from
 * Westminster, MD to Seattle, WA).
 *
 * Use final variables (constants) to represent inches in a foot and feet in a yard.
 *
 * Print the result with an informative message to the console.
 * Make sure to use printf to comma-separate the number output with format specifiers!
 *
 * Use good programming style!
 *
 * @author BRYAN CAMPBELL
 */
public class Question4 {
    public static void main(String[] args)
    {
        //TODO Write your code here
        int yards = 4835072;
        final int feet = 3;
        final int inches = 12;

        System.out.printf("There are %,d inches in %,d yards between Westminster, MD and Seattle, WA.",
                (yards*feet*inches), yards);

    }
}
