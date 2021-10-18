/**
 * This program demonstrates a method with a parameter
 */

public class PassArg
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        int x = 10;

        System.out.println("I am passing values to displayValue.");
        displayValue(5);
        displayValue(x);
        displayValue(x * 4);
        displayValue(Integer.parseInt("700"));

        showSum(x, x*2);
    }

    /**
     * Displays the value of its parameter
     * @param num - the value to be displayed
     */
    public static void displayValue(int num)
    {
        System.out.println("The value is " + num);
    }

    /**
     * Displays the sum of its two parameters
     * @param num1 - the first value to add
     * @param num2 - the second value to add
     */
    public static void showSum(int num1, int num2)
    {
        int sum;
        sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

}