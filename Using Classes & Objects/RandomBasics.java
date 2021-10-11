// this class demonstrates the basics of the Random class

import java.util.Random;    // necessary for Random class

public class RandomBasics 
{
    public static void main(String[] args) 
    {
        // Create an object of the Random class
        Random randomNumbers = new Random();

        // declare an integer variable
        int number;

        // generate 10 random numbers from 
        // -2,147,483,648 to +2,147,483,647
        // if no argument in parentheses of nextInt
        for(int i = 1; i <= 10; i++)
        {
            number = randomNumbers.nextInt();
            System.out.println(number);
        }

        // nextDouble --> returns a random value from 0.0 to 1.0
        // nextLong   --> returns a random value in a MASSIVE range
    }
}
