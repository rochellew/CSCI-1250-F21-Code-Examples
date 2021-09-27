// This program demonstrates a user controlled loop
// using a do-while loop

import java.util.Scanner;

public class TestAverage 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        int score1, score2, score3;
        double average;
        char repeat;
        String input;

        System.out.println("This program calculates the average of three test scores.");

        // get as many sets of test scores as the user wants
        do
        {
            // get the first test score
            System.out.print("Enter score #1: ");
            score1 = kb.nextInt();

            // get the second test score
            System.out.print("Enter score #2: ");
            score2 = kb.nextInt();

            // get the third test score
            System.out.print("Enter score #3: ");
            score3 = kb.nextInt();

            // consume the newline
            kb.nextLine();

            // calculate average
            average = (score1 + score2 + score3) / 3.0;
            System.out.println("The average test score is " + average);

            // print a new line
            System.out.println();

            System.out.println("Would you like to average another set of test scores?");
            System.out.print("Enter Y for yes or N for no: ");
            input = kb.nextLine();
            repeat = input.charAt(0);   // gets the first character in the input string

        } while(repeat == 'y' || repeat == 'Y');
    }
}
