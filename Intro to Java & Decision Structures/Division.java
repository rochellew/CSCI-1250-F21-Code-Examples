// This class demonstrates the 'if-else' statement

import java.util.Scanner;

public class Division
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2;      // division operands
        double quotient;        // result of division

        System.out.println("Please enter the first number: ");
        num1 = keyboard.nextDouble();

        System.out.println("Please enter the second number: ");
        num2 = keyboard.nextDouble();

        // num2 cannot be zero
        if(num2 == 0)
        {
            System.out.println("Cannot divide by zero. Please try again.");
        }
        else
        {
            quotient = num1 / num2;
            System.out.println("The quotient is: " + quotient);
        }
        keyboard.close();
    }
}
