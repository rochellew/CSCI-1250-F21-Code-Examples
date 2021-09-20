import java.util.Scanner;

public class TestResults
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int testScore;  // numeric test score

        System.out.print("Please enter your test score: ");
        testScore = keyboard.nextInt();

        // Display the letter grade based on the  value of the
        // testScore variable
        if(testScore < 60)
        {
            System.out.println("Your grade is F");
        }
        else if (testScore < 70)
        {
            System.out.println("Your grade is D");
        }
        else if (testScore < 80)
        {
            System.out.println("Your grade is C");
        }
        else if (testScore < 90)
        {
            System.out.println("Your grade is B");
        }
        else
        {
            System.out.println("Your grade is A");
        }

        keyboard.close();
    }
}
