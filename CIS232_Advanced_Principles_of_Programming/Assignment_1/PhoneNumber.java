/*Superclass
|----------------------------------|
|          PhoneNumber             |
|----------------------------------|
| - number : String                |
|----------------------------------|
| + getNumber() : String           |
| + setNumber(num : String) : void |
|----------------------------------|

@author BRYAN CAMPBELL
 */

public class PhoneNumber {

    private String number;

    //getter
    public String getNumber(){
        return number;
    }

    //setter
    public void setNumber(String number){
        this.number = number;
    }
}
