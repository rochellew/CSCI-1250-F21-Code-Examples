/**
 * This program demonstrates that two methods
 * may have local variables with the same name
 */

public class LocalVars
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        texas();
        california();
    }

    /**
     * The texas method has a local variable named birds
     */
    public static void texas()
    {
        int birds = 5000;
        System.out.println("In the texas method there are " + birds + " birds.");
    }

    /**
     * The california method has a local variable named birds
     */
    public static void california()
    {
        int birds = 3500;
        System.out.println("In the california method there are " + birds + " birds.");
    }

}
