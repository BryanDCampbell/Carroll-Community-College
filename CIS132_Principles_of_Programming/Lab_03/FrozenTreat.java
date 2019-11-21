package cis132;

/**Design a class for a FrozenTreat Ice Cream manufacturing plant (in a separate file).
 * The class should have 2 fields:
 * 1. Number of ice cream bars that can be made in an hour
 * 2. Number of hours the plant is operating per day
 * The fields should be doubles.
 *
 * Write accessors (getters) and mutators (setters) for these fields.
 *
 * The class should have a method with one parameter. The parameter is the number of ice cream bars
 * the user wants the ice cream plant to make. The method should return the number of days it will take to produce them.
 *
 * Method Formula:
 * (number ice cream bars desired)/(number ice cream bars made in an hour * number hours the plant is open each day)
 * @author BRYAN CAMPBELL
 */




public class FrozenTreat {

    //Attributes
    private double bars;
    private double hours;

    //Mutators (Setters)
    public void setBars(double bars) {
        this.bars = bars;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    //Accessors (Getters)
    public double getBars() {
        return bars;
    }
    public double getHours() {
        return hours;
    }

    //Methods
    public double calcDays(double desired) {
        return (desired)/(bars * hours);
    }
}