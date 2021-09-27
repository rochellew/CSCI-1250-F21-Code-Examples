// This class demonstrates simple input validation using 
// the 'while' loop

import java.util.Scanner;

public class SimpleValidation 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int input;

        System.out.print("Please enter a number in the range 1-100: ");
        input = kb.nextInt();

        // Validate the input
        while(input < 1 || input > 100)
        {
            System.out.print("Invalid input. Enter a number in the range 1-100: ");
            input = kb.nextInt();
        }

        System.out.println("Your number is " + input);

        kb.close();
    }
}
