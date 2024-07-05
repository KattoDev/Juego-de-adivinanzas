package Mechanics;

/**
 * @author Kris
 */
import java.util.Random;

public class Random_Number {
    public static int GenerateNumber(int limit){
        
        Random rand = new Random();
        int GeneratedNumber = rand.nextInt(limit) +1;
        return GeneratedNumber;
    }
}
