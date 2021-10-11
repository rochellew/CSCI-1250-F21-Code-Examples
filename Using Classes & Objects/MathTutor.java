// this program demonstrates the Random class

import java.util.Random;
import java.util.Scanner;

public class MathTutor 
{
    public static void main(String[] args) 
    {
        // variables
        int number1, number2;   // numbers to be added
        int sum;                // sum of the numbers
        int userAnswer;         // the user's answer

        // Create a Scanner object
        Scanner kb = new Scanner(System.in);

        // Create a Random object
        Random rand = new Random();

        // get 2 random numbers
        number1 = rand.nextInt(100);    // 0-99
        number2 = rand.nextInt(100);    // 0-99

        // display the addition problem
        System.out.println("What is the answer to the following problem?");
        System.out.print(number1 + " + " + number2 + " = ? ");

        // calculate sum
        sum = number1 + number2;

        // get the user's answer
        userAnswer = kb.nextInt();

        // compare answer to sum
        if(userAnswer == sum)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Sorry, wrong answer. The correct answer is " + sum);
        }

        // close Scanner
        kb.close();
    }    
}
