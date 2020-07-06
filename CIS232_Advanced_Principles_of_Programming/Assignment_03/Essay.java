/**
 *  1. Design an Essay class that extends the GradedActivity class presented in Chapter 9.
 *  The files are included in this lab. You will only use GradedActivity for Lab2
 *  The Essay class should determine the grade that a student receives on an essay.
 *  The student's essay score can be up to 100 and is determined in the following manner:
 *  Grammar: up to 30 points
 *  Spelling: up to 20 points
 *  Correct Length: up to 20 points
 *  Content: up to 30 points
 *  Create final static constants for those max values in Essay class.
 *
 *  Your class should also have fields for each of those scores.
 *  Write appropriate constructor, mutators and accessors. Constructor should accept 4 arguments to set those scores.
 *  It should also have a method for summing the total points that returns a double.
 *  It will use the GradedActivity setScore method to set the score.
 *
 * @author BRYAN CAMPBELL
 */

public class Essay extends GradedActivity {

    //Created final static constants for max values
    protected final static int GRAMMAR = 30;
    protected final static int SPELLING = 20;
    protected final static int CORRECT_LENGTH = 20;
    protected final static int CONTENT = 30;

    protected final static int maxTotal = (GRAMMAR + SPELLING + CORRECT_LENGTH + CONTENT);

    private int eGrammar;
    private int eSpelling;
    private int eCorrectLength;
    private int eContent;

    //constructor with fields for each of the essay component values
    public Essay(int eGrammar, int eSpelling, int eCorrectLength, int eContent){
        this.eGrammar = eGrammar;
        this.eSpelling = eSpelling;
        this.eCorrectLength = eCorrectLength;
        this.eContent = eContent;

        //method for summing the total points that returns a double
        double totalPoints = ((eGrammar + eSpelling + eCorrectLength + eContent) /
                (double)(GRAMMAR + SPELLING + CORRECT_LENGTH + CONTENT) * 100);
        //use the GradedActivity setScore method to set the score
        Essay.super.setScore(totalPoints);
    }

    //accessors
    public int geteGrammar() {
        return eGrammar;
    }
    public int geteSpelling() {
        return eSpelling;
    }
    public int geteCorrectLength() {
        return eCorrectLength;
    }
    public int geteContent() {
        return eContent;
    }

    //mutators
    public void seteGrammar(int eGrammar) {
        this.eGrammar = eGrammar;
    }
    public void seteSpelling(int eSpelling) {
        this.eSpelling = eSpelling;
    }
    public void seteCorrectLength(int eCorrectLength) {
        this.eCorrectLength = eCorrectLength;
    }
    public void seteContent(int eContent) {
        this.eContent = eContent;
    }
}
