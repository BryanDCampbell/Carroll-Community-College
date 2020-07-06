/**
 * No-arg constructor
 * @AUTHOR Bryan Campbell
 */

public class NegativeValueEntered extends Exception {

    public NegativeValueEntered(){
        super ("Error: Negative Value Entered");
    }
    public NegativeValueEntered(double d){
        super ("Error: Negative Value Entered");
    }
    public NegativeValueEntered(String s){
        super ("Error: String Entered");
    }
}
