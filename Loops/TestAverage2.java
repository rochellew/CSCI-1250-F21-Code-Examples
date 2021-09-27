// This class demonstrates nested for loops

import java.util.Scanner;

public class TestAverage2 
{
    public static void main(String[] args) 
    {
        // variables
        int numStudents;
        int numTests;
        int score;
        int total;  // accumulator for test scores
        double average;

        Scanner kb = new Scanner(System.in);

        // get the number of students
        System.out.print("Enter the number of students: ");
        numStudents = kb.nextInt();

        // get the number of tests per student
        System.out.print("Enter the number of tests per student: ");
        numTests = kb.nextInt();

        // process all students and their scores
        for(int student = 1; student <= numStudents; student++)
        {
            total = 0;
            // get the test scores for a student
            System.out.println("Student number " + student);
            System.out.println("-----------------------------------");
            for(int test = 1; test <= numTests; test++)
            {
                System.out.print("Please enter the score for test " + test + ": ");
                score = kb.nextInt();

                total += score;
            }
            // calculate the student's average and display it
            average = total / numTests;
            System.out.printf("The average for student %d is %.1f.\n\n", student, average);
        }
        kb.close();
    }
}
