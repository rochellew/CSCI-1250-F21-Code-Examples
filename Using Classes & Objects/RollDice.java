// this program demonstrates the rolling of two 6-sided die

import java.util.Scanner;
import java.util.Random;

public class RollDice 
{
    public static void main(String[] args) 
    {
        // variables
        String again = "y";     // for controlling the while loop
        int die1, die2;         // two die

        // Create a Scanner object
        Scanner kb = new Scanner(System.in);

        // Create a Random object
        Random rand = new Random();

        // Simulate rollling the dice.
        while(again.equalsIgnoreCase("Y"))
        {
            System.out.println("Rolling the dice....");
            die1 = rand.nextInt(6) + 1;     // random range is (0-5) + 1 ---> 1 -6
            die2 = rand.nextInt(6) + 1;     // random range is (0-5) + 1 ---> 1 -6
            System.out.println("Their values are:");
            System.out.println(die1 + " " + die2);

            System.out.println("Roll again (y = yes)? ");
            again = kb.nextLine();
        }

        // close Scanner object
        kb.close();
    }
}
