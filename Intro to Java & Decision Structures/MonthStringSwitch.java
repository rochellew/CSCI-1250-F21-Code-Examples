// this class demonstrates the 'switch' statement

import java.util.Locale;
import java.util.Scanner;

public class MonthStringSwitch
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String month;   // stores user's input

        System.out.print("Please enter the name of a month: ");
        month = keyboard.nextLine().toUpperCase();

        switch(month)
        {
            case "JANUARY":
                System.out.println(1);
                break;
            case "FEBRUARY":
                System.out.println(2);
                break;
            case "MARCH":
                System.out.println(3);
                break;
            case "APRIL":
                System.out.println(4);
                break;
            case "MAY":
                System.out.println(5);
                break;
            case "JUNE":
                System.out.println(6);
                break;
            case "JULY":
                System.out.println(7);
                break;
            case "AUGUST":
                System.out.println(8);
                break;
            case "SEPTEMBER":
                System.out.println(9);
                break;
            case "OCTOBER":
                System.out.println(10);
                break;
            case "NOVEMBER":
                System.out.println(11);
                break;
            case "DECEMBER":
                System.out.println(12);
                break;
            default:
                System.out.println("Please enter a valid month name.");
        }

        keyboard.close();
    }
}
