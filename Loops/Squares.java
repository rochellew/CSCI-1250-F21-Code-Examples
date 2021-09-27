// This program displays squares using the 'for' loop

public class Squares 
{
    public static void main(String[] args) 
    {
        // add a header to the display
        System.out.println("Number\t\tNumber Squared");
        System.out.println("--------------------------------");

        // display the squares 1-10
        // declaring 'number' in the header restricts its scope to ONLY the for loop in which it is declared
        for(int number = 1; number <= 10; number++)
        {
            System.out.println(number + "\t\t\t" + (number * number));
        }
    }
}
