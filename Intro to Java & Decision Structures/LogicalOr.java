// This class demonstrates the concept of 
// the logical 'OR' operator ( || )

import java.util.Scanner;

public class LogicalOr
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double salary, yearsOnJob;

        System.out.print("Please enter your salary: ");
        salary = keyboard.nextDouble();

        System.out.print("Please enter your total number of years experience: ");
        yearsOnJob = keyboard.nextDouble();

        // Determine if the user qualifies for the loan
        // (must have either 30k salary OR 2 years exp.)
        if(salary >= 30000 || yearsOnJob >= 2)
            System.out.println("You qualify for the loan.");
        else
            System.out.println("You do not qualify for the loan.");

        keyboard.close();
    }
}
