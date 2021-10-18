/**
 * This program demonstrates a value-returning method
 */

public class ValueReturn
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        // variables
        int     value1 = 20,
                value2 = 40,
                total;

        // Call the sum method, passing the contents of value1 and value2
        // as arguments. Assign the returned value to the total variable.
        total = sum(value1, value2);

        // Display the value of the variables
        System.out.println(value1 + " + " + value2 + " = " + total);
    }

    /**
     * The sum method returns the sum of its two parameters
     * @param num1 - first value to be added
     * @param num2 - second value to be added
     * @return the sum of num1 and num2
     */
    public static int sum(int num1, int num2)
    {
        return num1 + num2;
    }
}
