// this class demonstrates the basics of the 'for' loop

public class ForLoop
{
    public static void main(String[] args) 
    {
        /*
            For loops are 'count-controlled' loops

            Count controlled loops need 3 things

            1.  Initialize a control variable to a starting value
            2.  Test the control variable by comparing it to a maximum value
                - when the control variable reaches the maximum value, the loop terminates
            3.  Update the control variable each iteration
                - usually done by incrementing the control variable ( ++ )

            SYNTAX OF A FOR LOOP - semicolons are included

            for(Initialization; Test; Update)
            {
                statement(s);
            }
        */

        // declare control variable
        int number;
        // print 'hello' three times
        for(number = 1; number <= 3; number++)
        {
            System.out.println(number + ". Hello!");
        }
    }
}