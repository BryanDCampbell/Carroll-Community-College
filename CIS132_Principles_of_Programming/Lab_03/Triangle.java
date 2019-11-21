package cis132;
/**
 * Question 1
 * Triangle Class (10 points)
 *
 * Write a class, in a separate file, called Triangle
 * The class should have 2 private fields: base, height
 *
 * The class should have appropriate mutators (setters) and accessors (getters) for the fields
 *
 * The class should have a method called calcArea() that calculates the area of a triangle
 * using its base and height fields, then return the value as a double.
 *
 * TRIANGLE AREA FORMULA: 0.5 * base * height
 *
 * @author BRYAN CAMPBELL
 */
public class Triangle {
    //Attributes
    private double base;
    private double height;

    //Mutators (Setters)
    public void setBase(double b) {
        base = b;
    }
    public void setHeight(double h) {
        height = h;
    }

    //Accessors (Getters)
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    //Methods
    public double calcArea() {
        return 0.5 * base * height;
    }
}
