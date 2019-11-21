/**
* Question 2 [15 Points]
        *
        * Write a Rectangle Class with three fields and has a constructor with three parameters,
        *   - integers: width and height
        *   - character: drawChar
        * The class will have a method called printOutline that prints a rectangle to the
 * console that is the outline based on the dimensions width and height.
         * The method will use the character drawChar as its outline character. The method
         * should use nested for loops to print the output.
         * (HINT: Try to get the output to print a full rectangle without the spaces in the middle,
         * then alter your code to just print the character on the outline - think about your nested for-loops and what
         * values should have a character print or a space print.)
 *
 * @author BRYAN CAMPBELL
*/

public class Rectangle {

    private int width;
    private int length;
    private char drawChar;

    /**
     * @param w is an integer representing width
     * @param l is an integer representing length
     * @param dC is an character representing drawChar
     */

    public Rectangle(int w,int l,char dC){
        width = w;
        length = l;
        drawChar = dC;
    }

    /**
     * Method to print the rectangle
     */

    public void printOutline(){
        for(int a = 0; a<length; a++){
            System.out.print(drawChar);
        }
        System.out.println();

        /**
         * loop to determine how many rows
         */

        for(int b = 2; b < width; b++){
            System.out.print(drawChar);

            /**
             * nested for-loop to print the amount of the character
             */

            for(int e = 2; e<length; e++){
                System.out.print(" ");
            }
            System.out.print(drawChar);
            System.out.println();
        }

        for(int f = 0; f < length; f++){
            System.out.print(drawChar);
        }
    }



}
