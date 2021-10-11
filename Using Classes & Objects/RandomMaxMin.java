// this class demonstrates generating random numbers
// in a specified range using the formula 
// nextInt(MAX - MIN + 1) + MIN

import java.util.Random;

public class RandomMaxMin 
{
    public static void main(String[] args) 
    {
        // variables
        int number; //holds random value

        // create Random class object  
        Random rand = new Random(); 

        // generate a random value in a range 30 - 35
        //              FORMULA
        //   nextInt((max - min) + 1) + min     <-- inclusive of max
        //   nextInt((35 - 30) + 1) + 30
        //   nextInt(6) + 30
        number = rand.nextInt(6) + 30;
        System.out.println(number);
    }
}
