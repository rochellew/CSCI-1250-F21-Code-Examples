// This class demonstrates an accumulator with a 'for' loop

import java.util.Scanner;

public class TotalSales 
{
    public static void main(String[] args) 
    {
        // variables
        int days;
        double sales;
        double totalSales; // accumulator = holds (accumulate) a running total value

        // Create scanner object
        Scanner kb = new Scanner(System.in);

        // initialize the accumulator
        totalSales = 0.0;

        // get the number of days from the user
        System.out.print("For how many days do you have sales figures: ");
        days = kb.nextInt();

        for(int count = 1; count <= days; count++)
        {
            System.out.print("Please enter the sales for day " + count + ": ");
            sales = kb.nextDouble();

            // add to accumulator
            totalSales += sales;
        }

        // display the total sales
        System.out.printf("\nTotal sales: $%,.2f", totalSales);

        // close Scanner
        kb.close();
    }
}
