package Mechanics;

public class Tip {
    public static String GameTip(int guessNumber, int userNumber){
        String tip;
        
        if(userNumber>guessNumber){
            tip = "menor";
        }
        else {
            tip = "mayor";
        }
        return tip;
    }
}
