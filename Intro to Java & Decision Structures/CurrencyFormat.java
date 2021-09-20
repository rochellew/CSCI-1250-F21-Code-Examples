// This class demonstrates the printf method

import java.util.Scanner;

public class CurrencyFormat
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double monthlyPay, annualPay;

        System.out.println("Please enter your monthly pay: ");
        monthlyPay = keyboard.nextDouble();

        annualPay = monthlyPay * 12;

        // formatting the output
        System.out.printf("Your annual pay is: $%,.2f", annualPay);

        keyboard.close();
    }
}
