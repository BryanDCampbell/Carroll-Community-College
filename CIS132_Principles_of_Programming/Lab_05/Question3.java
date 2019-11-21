import java.io.IOException;
import java.util.Scanner;

/**
 * Question 3 [25 Points]
 * FileMaker Class.
 * <p>
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
 * <p>
 * Demonstrate the class in the Question3 main method by asking the user to choose from a menu
 * of the three output options. If the user enters an invalid option, the menu should be displayed over again until they
 * enter a valid option. Then, ask the user for the name of a file to read input from.
 * Then ask for the name of a file to write output to.
 * <p>
 * Be sure to close your files!
 * Be sure to add throws IOException clause to your methods that need them!
 * Construct a FileMaker object and generate the type of file chosen by the user.
 * Create your own input files to test the program. I have included one for testing: "src\\SampleTestFile.txt".
 * <p>
 * <p>
 * Comments and style are worth up to 2 points.
 * <p>
 * Example output 1:
 * Welcome to the File Maker!
 * <p>
 * Type an input file name[ex. test.txt]:
 * src/SampleTestFile.txt  //user input
 * Where would you like the file written?
 * src/Random.txt  //user input
 * <p>
 * Choose an option:
 * 1. Lowercase file
 * 2. Line Count file
 * 3. Random Lines file
 * 4. Exit the program
 * <p>
 * 5  //user input
 * That is not a valid option, please choose an option:
 * 1. Lowercase file
 * 2. Line Count file
 * 3. Random Lines file
 * 4. Exit the program
 * <p>
 * 3  //user input
 * <p>
 * Your file has been reduced to Random lines! Enjoy!
 * <p>
 * Example output 2:
 * Welcome to the File Maker!
 * Type an input file name[ex. test.txt]:
 * src/SampleTestFile.txt  //user input
 * Where would you like the file written?
 * src/Random.txt  //user input
 * <p>
 * Choose an option:
 * 1. Lowercase file
 * 2. Line Count file
 * 3. Random Lines file
 * 4. Exit the program
 * <p>
 * 4  //user input
 * Goodbye!
 * <p>
 * src/SampleTestFile.txt has more lines than the following examples.
 * <p>
 * Example input file contents:
 * No more rhyming now, and I mean it.
 * Anybody want a peanut?
 * HAVE FUN STORMING THE CASTLE.
 * You are in the Pit Of Despair.
 * <p>
 * Example output file contents: (Lowercase file)
 * no more rhyming now, and i mean it.
 * anybody want a peanut?
 * have fun storming the castle.
 * you are in the pit of despair.
 * <p>
 * Example output file contents: (Line Count file)
 * Your file: src/SampleTestFile.txt has 4 lines.
 * <p>
 * Example output file contents: (Random Lines file)
 * First 2 lines from file: src/SampleTestFile.txt
 * No more rhyming now, and I mean it!
 * Anybody want a peanut?
 * <p>
 * Comments and style are worth up to 2 points.
 *
 * @author BRYAN CAMPBELL
 */
public class Question3 {

    public static void main(String[] args) throws IOException {

        String inputFile;
        String outputFile;

        FileMaker fM = new FileMaker();

        System.out.println("Welcome to File Maker!");

        Scanner scan = new Scanner(System.in);
        int input = 0;

        while (input != 4) {

            System.out.println("Choose an option:\n" +
                    "1. Lowercase file\n" +
                    "2. Line Count file\n" +
                    "3. Random Lines file\n" +
                    "4. Exit the program");
            input = scan.nextInt();

            switch (input) {
                case 1:

                    System.out.println("Type an input file name[ex. test.txt]:");
                    inputFile = scan.next();

                    System.out.println("Where would you like the file written?");
                    outputFile = scan.next();

                    fM.lowerCaseFile(inputFile, outputFile);

                    break;
                case 2:

                    System.out.println("Type an input file name[ex. test.txt]:");
                    inputFile = scan.next();

                    System.out.println("Where would you like the file written?");
                    outputFile = scan.next();

                    fM.lineCountFile(inputFile, outputFile);

                    break;
                case 3:

                    System.out.println("Type an input file name[ex. test.txt]:");
                    inputFile = scan.next();

                    System.out.println("Where would you like the file written?");
                    outputFile = scan.next();

                    System.out.println(fM.randomLinesFile(inputFile, outputFile));

                    break;
                case 4:

                    System.out.println("Goodbye!");

                    break;
                default:
                    System.out.print("That is not a valid option, ");
                    break;
            }
        }
    }
}