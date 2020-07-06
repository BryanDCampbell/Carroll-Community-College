import java.util.Scanner;

/**
 * 3. Demonstrate the class (CourseGrades) in a program. You will need to use keyboard input to get the appropriate
 * grades for each element. Ask the user to enter grades for each of the 4 graded assignments and store them in a
 * CourseGrades object.
 *
 * @AUTHOR BRYAN CAMPBELL
 */
public class Assignment3Question3 {

    public static int eGrammar, eSpelling, eContent, eCorrectLength;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradedActivity lab = new GradedActivity();
        PassFailExam passFailExam;
        Essay essay;
        FinalExam finalExam;

//---------------------------------LAB-------------------------------------------------------------------------------
//---------------------------------LAB-------------------------------------------------------------------------------
//---------------------------------LAB-------------------------------------------------------------------------------
//---------------------------------LAB-------------------------------------------------------------------------------

        //Program prompts User to enter value for grade received on lab
        System.out.println("Please enter the grade for the Lab:");
        double lGrade = scanner.nextDouble();
        lab.setScore(lGrade);

//---------------------------------PASSFAILEXAM----------------------------------------------------------------------
//---------------------------------PASSFAILEXAM----------------------------------------------------------------------
//---------------------------------PASSFAILEXAM----------------------------------------------------------------------
//---------------------------------PASSFAILEXAM----------------------------------------------------------------------

        //Program prompts User to enter values for number of total questions, missed questions and minimum
        //passing score on Pass/Fail Exam
        System.out.println("Please enter the number of questions on the Pass/Fail Exam:");
        int pfeNumQuestions = scanner.nextInt();
        System.out.println("Please enter the number of missed questions on the Pass/Fail Exam: ");
        int pfeNumMissed = scanner.nextInt();
        System.out.println("Please enter the minimum passing score for the Pass/Fail Exam: ");
        double pfeMinPassing = scanner.nextDouble();

        //Calls PassFailExam constructor with User entered values for parameters
        passFailExam = new PassFailExam(pfeNumQuestions, pfeNumMissed, pfeMinPassing);

//---------------------------------ESSAY-----------------------------------------------------------------------------
//---------------------------------ESSAY-----------------------------------------------------------------------------
//---------------------------------ESSAY-----------------------------------------------------------------------------
//---------------------------------ESSAY-----------------------------------------------------------------------------

        //Program prompts User to enter values for different components of the Essay grade
        System.out.println("Please enter Essay scores for");

        //Prompts User to enter a value for Grammar grade
        System.out.println("Grammar: ");
        //Calls the returnValue constructor
        eGrammar = returnValue(Essay.GRAMMAR);

        //Prompts User to enter a value for Spelling grade
        System.out.println("Spelling: ");
        //Calls the returnValue constructor
        eSpelling = returnValue(Essay.SPELLING);

        //Prompts User to enter a value for Correct Length grade
        System.out.println("Correct Length: ");
        //Calls the returnValue constructor
        eCorrectLength = returnValue(Essay.CORRECT_LENGTH);

        //Prompts User to enter a value for Content grade
        System.out.println("Content: ");
        //Calls the returnValue constructor
        eContent = returnValue(Essay.CONTENT);

        //Calls Essay constructor with User entered values for parameters
        essay = new Essay(eGrammar, eSpelling, eCorrectLength, eContent);

//---------------------------------FINALEXAM-------------------------------------------------------------------------
//---------------------------------FINALEXAM-------------------------------------------------------------------------
//---------------------------------FINALEXAM-------------------------------------------------------------------------
//---------------------------------FINALEXAM-------------------------------------------------------------------------

        //Program prompts User to enter values for number of total questions and missed questions on Final Exam
        System.out.println("Please enter the number of questions on the Final Exam:");
        int feNumQuestions = scanner.nextInt();
        System.out.println("Please enter the number of missed questions on the Final Exam: ");
        int feNumMissed = scanner.nextInt();

        //Calls FinalExam constructor with User entered values for parameters
        finalExam = new FinalExam(feNumQuestions, feNumMissed);

//---------------------------------COURSEGRADES----------------------------------------------------------------------
//---------------------------------COURSEGRADES----------------------------------------------------------------------
//---------------------------------COURSEGRADES----------------------------------------------------------------------
//---------------------------------COURSEGRADES----------------------------------------------------------------------
        CourseGrades courseGrades = new CourseGrades();

        courseGrades.setLab(lab);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);
        courseGrades.setPassFailExam(passFailExam);

        System.out.println(courseGrades.toString());
    }

    //Constructor to reduce repetitive code with upper limit set by selected max constant
    public static int returnValue(int max) {
        Scanner keyboard = new Scanner(System.in);
        //Stores user input as integer input
        int input = keyboard.nextInt();
        //If input does not meet the following requirements, enters a loop
        if (input > max || input < 0) {
            do {
                //Prompts the user to enter a valid value
                System.out.println("Invalid input. Please enter a value between 0 - " + max + ":");
                //If user does not enter an integer, catches the exception
                try {
                    input = keyboard.nextInt();
                } catch (Exception e) {
                    keyboard.nextLine();
                }
            } while (input > max || input < 0);
        }
        return input;
    }
}


