/**
 * This program defines and calls a simple method in a for loop
 */

public class LoopCall
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Hello from the main method.");

        // each time we iterate, call displayMessage()
        for(int i = 0; i < 5; i++)
        {
            displayMessage();
        }

        System.out.println("Back in the main method.");
    }

    /**
     * Displays a simple message
     */
    public static void displayMessage()
    {
        System.out.println("Hello from the displayMessage method.");
    }
}