// This program displays squares using the 'for' loop

import java.util.Scanner;

public class UserSquares
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int maxValue;

        // get the max value to display
        System.out.print("How high should I go: ");
        maxValue = kb.nextInt();

        // add a header to the display
        System.out.println("Number\t\tNumber Squared");
        System.out.println("--------------------------------");

        // display the squares 1-maxValue
        // declaring 'number' in the header restricts its scope to ONLY the for loop in which it is declared
        for(int number = 1; number <= maxValue; number++)
        {
            System.out.println(number + "\t\t\t" + (number * number));
        }
    }
}

