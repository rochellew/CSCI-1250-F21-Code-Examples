// This class demonstrates the concept of
// nested 'if' statements

import java.util.Scanner;

public class LoanQualifier
{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double salary, yearsOnJob;

        System.out.print("Please enter your salary: ");
        salary = keyboard.nextDouble();

        System.out.print("Please enter your total number of years experience: ");
        yearsOnJob = keyboard.nextDouble();

        // Determine if the user qualifies for the loan
        // (must have 30k salary and 2 years exp.)
        if(salary >= 30000)
        {
            if(yearsOnJob >=2)
            {
                System.out.println("You qualify for the loan. CONGRATS!");
            }
            else
            {
                System.out.println("You must have at least 2 years on the job to qualify.");
            }
        }
        else
        {
            System.out.println("Your salary must be a minimum of $30k to qualify.");
        }

        keyboard.close();
    }
}
