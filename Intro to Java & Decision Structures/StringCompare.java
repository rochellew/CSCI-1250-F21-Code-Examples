// This class demonstrates comparing two String
// objects with the .equals and .equalsIgnoreCase methods

import java.util.Scanner;

public class StringCompare
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String name1, name2;

        System.out.print("Please enter the first name you would like to compare: ");
        name1 = keyboard.nextLine();

        System.out.print("Please enter the second name you would like to compare: ");
        name2 = keyboard.nextLine();

        if(name1.equals(name2))
        {
            System.out.println("The names are the same.");
        }
        else
        {
            System.out.println("The names are not the same.");
        }

        // IGNORE any letter cases
        if(name1.equalsIgnoreCase(name2))
        {
            System.out.println("The names are the same.");
        }
        else
        {
            System.out.println("The names are not the same.");
        }
    }
}
