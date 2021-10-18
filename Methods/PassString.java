/**
 * This program demonstrates that String arguments
 * cannot be changed
 */

public class PassString
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        // Create a String object containing "Shakespeare"
        // The name variable references this object
        String name = "Shakespeare";

        // Display the String referenced by the name variable
        System.out.println("In the main method, the name is " + name);

        // Call the changeName method, passing the
        // contents of the name variable as an argument
        changeName(name);

        // Display the String referenced by the name variable
        System.out.println("Back in the main method, the name is " + name);
    }

    /**
     * Attempts to change value of name reference variable in main
     * @param str stores address to a string
     */
    public static void changeName(String str)
    {
        // Create a String object containing "Dickens"
        // Assign its address to the parameter variable str
        str = "Dickens";

        // Display the string reference by str
        System.out.println("In the changeName method, the name is " + str);
    }

}
