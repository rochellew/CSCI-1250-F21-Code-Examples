// This class demonstrates verifying if a number is
// inside a range and outside a range using logical operators

public class NumericRange
{
    public static void main(String[] args)
    {
        // declare 2 variables
        int x = 30;
        int y = 95;

        // check if x is IN the range 20 through 40
        //              20 <= x <= 40
        if(x >= 20 && x <= 40)
        {
            System.out.println("x is in the range.");
        }

        // check if y is OUTSIDE the range 20 through 40
        //       y >= 40 OR y <= 20
        if(y <= 20 || y >= 40)
        {
            System.out.println("y is outside the range.");
        }
    }

}
