// This class demonstrates the String.format method

import java.util.Scanner;

public class CurrencyFormatString
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double monthlyPay, annualPay;

        System.out.println("Please enter your monthly pay: ");
        monthlyPay = keyboard.nextDouble();

        annualPay = monthlyPay * 12;

        // formatting the output
        String formattedOutput; // declare a string to store formatted output
        formattedOutput = String.format("Your annual pay is: $%,.2f", annualPay);
        System.out.println(formattedOutput);

        keyboard.close();
    }
}
