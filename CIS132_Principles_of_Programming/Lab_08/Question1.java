import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/** Contact List [25 points]
 * Write a program that reads in a file that contains "lastname, firstname, phonenumber"
 * one on each line. The filename is "src/contacts.txt".
 * Print, to the console, a contact list that is in the following format:
 * firstname lastname
 * phonenumber
 * Be sure to remove leading and trailing spaces!
 * You do not need to create a separate class.
 *
 * For instance, if the input file looks like this:
 * Daniels, Stephanie,      555-123-4567
 * Evans,      Jane, 111-567-9876
 * Goode, Johnny, 345-765-6666
 *
 * It will print:
 * ******************
 * CONTACTS
 * ******************
 *
 * Stephanie Daniels
 * 555-123-4567
 *
 * Jane Evans
 * 111-567-9876
 *
 * Johnny Goode
 * 345-765-6666
 * ******************
 *
 * @author BRYAN CAMPBELL
 */
public class Question1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/contacts.txt");
        System.out.println("******************\n" + "CONTACTS\n" + "******************\n");

        Scanner inputFile = new Scanner(file);

            while (inputFile.hasNextLine())
            {
                String str = inputFile.nextLine();
                StringTokenizer strTokenizer = new StringTokenizer(str, ",");
                while (strTokenizer.hasMoreTokens())
                {
                    String lastName = strTokenizer.nextToken().trim();
                    String firstName = strTokenizer.nextToken().trim();
                    System.out.println(firstName + ' ' + lastName);
                    System.out.println("\n"  + strTokenizer.nextToken().trim() + "\n\n");
                }
            }
        inputFile.close();
        System.out.println("******************");
    }
}
