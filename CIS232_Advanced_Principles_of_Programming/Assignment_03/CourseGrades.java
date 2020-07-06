/**
 * Write a class named CourseGrades that implements the Analyzable Interface. The class should have an array of
 * GradedActivity objects as a field. The array should be named grades. The grades array should have 4 elements, one for
 * each of the assignments previously described. The class should have the following methods:
 *
 *  - setLab: This method should accept a GradedActivity object as its argument. This object should already hold the
 *  student's score for the lab activity. Element 0 of the grades field should reference this object.
 *
 *  - setPassFailExam: This method should accept a PassFailExam object as its argument. This object should already hold
 *  the student's score for the pass/fail exam. Element 1 of the grades field should reference this object.
 *
 *  - setEssay: This method should accept an Essay object as its argument. This object should already hold the student's
 *  score for the essay. Element 2 of the grades field should reference this object.
 *
 * - setFinalExam: This method should accept a FinalExam object as its argument. This object should already hold the
 * student's score for the final exam. Element 3 of the grades field should reference this object.
 *
 * - toString: This method should return a string that contains the numeric scores and grades for each element in the
 * grades array. (loop through the array, adding the information to a string) page 644, Code Listing 9-25
 * (Polymorphic.java) will help.
 *
 * @AUTHOR BRYAN CAMPBELL
 */

public class CourseGrades implements Analyzable {

    GradedActivity[] grades = new GradedActivity[4];

    public void setLab(GradedActivity gradedActivity){grades[0] = gradedActivity;}
    public void setPassFailExam(PassFailExam passFailExam){grades[1] = passFailExam;}
    public void setEssay(Essay essay){grades[2] = essay;}
    public void setFinalExam(FinalExam finalExam){grades[3] = finalExam;}
    public String toString(){
        String returnVariable = new String();
        for (int index = 0; index < grades.length; index++){
            returnVariable += "Assignment " + (index+ 1) + " Score: " + grades[index].getScore() +
                    ", Grade: " + grades[index].getGrade() + "\n";
        }
        return returnVariable;
    }


    @Override
    public double getAverage() {
        return 0;
    }

    @Override
    public GradedActivity getHighest() {
        return null;
    }

    @Override
    public GradedActivity getLowest() {
        return null;
    }
}
