/**
 * Write a class named FileMaker.
 * The class's constructor should accept an input file name String as an argument and an output file name String as an
 * argument. So, there are 2 fields in the class.
 * <p>
 * The class should have at least the following 4 methods:
 * <p>
 * 1. lowerCaseFile - Creates or overwrites the output file with a lowercase version of the input
 * file contents.
 * <p>
 * 2. lineCount - Returns the number of lines in the input file as an integer.
 * <p>
 * 3. lineCountFile - Counts the lines in the input file (user your lineCount method).
 * Creates or overwrites the output file with a sentence that tells the input file's name and
 * how many lines it contains.
 * <p>
 * 4. randomLinesFile - Counts the lines in the input file (use your lineCount method).
 * Generates a random number between 1 and up to and including the number of lines in the input file.
 * Print the random number (amount of lines) and that many lines from the input file to the output file.
 *
 * @author BRYAN CAMPBELL
 */

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class FileMaker {

    private String inputFile;

    public FileMaker(){}

    /**
     * method to create Lowercase version of the input file
     *
     * @param inputFile String representing the input file
     * @throws IOException
     */
    public void lowerCaseFile(String inputFile, String outputFile) throws IOException {
        //input the file
        File iFile = new File(inputFile);
        File oFile = new File(outputFile);
        //create Scanner object to scan the input file
        PrintWriter lower = new PrintWriter(oFile);
        Scanner scanFile = new Scanner(iFile);
        //use the while loop to print the file in lower case
        while (scanFile.hasNext()) {
            String line = scanFile.nextLine();
            lower.println(line.toLowerCase());
        }
        lower.close();

    }

    /**
     * method to count the number of lines in the input file
     *
     * @param inputFile String representing the input file
     * @throws IOException
     */

    public int lineCount(String inputFile) throws IOException {
        File iFile = new File(inputFile);
        Scanner scanFile = new Scanner(iFile);
        int count = 0;
        while (scanFile.hasNext()) {
            String line = scanFile.nextLine();
            count++;
        }
        return count;
    }

    /**
     * method to create lineCountFile version of the input file
     *
     * @param inputFile String representing the input file
     * @throws IOException
     */

    public void lineCountFile(String inputFile, String outputFile) throws IOException {
        File iFile = new File(inputFile);
        File oFile = new File(outputFile);

        int numLines = lineCount(inputFile);
        String fileName = iFile.getName();

        PrintWriter pW = new PrintWriter(oFile);
        pW.println("The file name is: " + fileName + " and it has " + numLines + " lines.");
        pW.close();
    }

    /**
     * method to create randomLinesFile version of the input file
     *
     * @param inputFile String representing the input file
     * @throws IOException
     */

    public int randomLinesFile(String inputFile, String outputFile) throws IOException {
        File iFile = new File(inputFile);
        File oFile = new File(outputFile);

        int randLines = lineCount(inputFile);

        PrintWriter pW = new PrintWriter(oFile);
        Scanner scanFile = new Scanner(iFile);

        Random number = new Random();
        int bingo = number.nextInt(randLines + 1);

        for(int i = 0; i < bingo ;i++){
            pW.println(scanFile.nextLine());
        }
        pW.close();
        return bingo;
    }
}