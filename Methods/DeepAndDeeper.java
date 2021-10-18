/**
 * This program demonstrates hierarchical (layered) method calls
 */

public class DeepAndDeeper
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("I am starting in the main method.");
        deep();
        System.out.println("I am back in the main method.");
    }

    /**
     * This method displays a message and calls the deeper method
     */
    public static void deep()
    {
        System.out.println("I am now in the deep method.");
        deeper();
        System.out.println("I am back in the deep method.");
    }

    /**
     * This method simply displays a message
     */
    public static void deeper()
    {
        System.out.println("I am now in the deeper method.");
    }
}
