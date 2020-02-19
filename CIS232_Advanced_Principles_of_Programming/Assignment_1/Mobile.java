/*Subclass
|--------------------------------------|
|             Mobile                   |
|--------------------------------------|
| - receiveText : boolean              |
|--------------------------------------|
| + getReceiveText(): boolean          |
| + setReceiveText(b : boolean) : void |
|--------------------------------------|

@author BRYAN CAMPBELL
 */

public class Mobile extends PhoneNumber{

    private boolean receiveText;

    //getter
    public boolean getReceiveText(){
        return receiveText;
    }

    //setter
    public void setReceiveText(boolean receiveText){
        this.receiveText = receiveText;
    }
}
