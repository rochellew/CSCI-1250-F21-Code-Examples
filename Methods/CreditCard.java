/**
 * This program uses 2 void methods
 */

import java.util.Scanner;

public class CreditCard
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        // variable
        double salary;
        double creditRating;

        // Scanner object
        Scanner kb = new Scanner(System.in);

        // get the user's annual salary
        System.out.print("Please enter your salary: ");
        salary = kb.nextDouble();

        // get the user's credit rating
        System.out.print("Please enter your credit rating: ");
        creditRating = kb.nextDouble();

        // determine if the user qualifies for the credit card
        if(salary >= 20000 && creditRating >= 7)
        {
            qualify();
        }
        else
        {
            noQualify();
        }
    }// end main

    /**
     * Displays a qualification message
     */
    public static void qualify()
    {
        System.out.println("Congratulations! You qualify for the credit card.");
    }

    /**
     * Displays a non-qualification message
     */
    public static void noQualify()
    {
        System.out.println("Sorry. You do not qualify for the credit card.");
    }
}
