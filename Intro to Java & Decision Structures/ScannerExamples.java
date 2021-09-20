/*
    This class demonstrates using the Scanner class
 */

import java.util.Scanner;   // required to use a Scanner object

public class ScannerExamples
{
    public static void main(String[] args)
    {
        // declared a reference to a new Scanner object
        // and linked it to the keyboard (System.in)
        Scanner keyboard = new Scanner(System.in);

        int age; // declare an int to store the user's age
        System.out.print("Hello, please enter your age: ");
        age = keyboard.nextInt();

        double gpa; // declare a double to store the user's GPA
        System.out.print("Please enter your GPA: ");
        gpa = keyboard.nextDouble();

        // consume the newline character from the buffer
        keyboard.nextLine();

        String firstName;   // declare a String to store the user's first name
        System.out.print("Please enter your first name: ");
        firstName = keyboard.nextLine();

        // output statements
        System.out.println(""); // blank line
        System.out.println("Hello, " + firstName + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is " + gpa + ".");
    }
}
