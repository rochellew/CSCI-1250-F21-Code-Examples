/**
 * This program defines and calls a simple method
 */

public class SimpleMethod
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Hello from the main method.");
        displayMessage();
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