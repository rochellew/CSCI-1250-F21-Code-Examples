////////////////////////////////
// Simulates 100 coin flips
////////////////////////////////

import java.util.Random;

public class CoinFlip
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int headsCount = 0,
            tailsCount = 0,
            coinValue = 0;

        for(int i = 1; i <= 100; i++)
        {
            coinValue = rand.nextInt(2);

            if(coinValue == 0)
            {
                System.out.println("Coin flip #" + i +": TAILS");
                tailsCount++;
            }
            else
            {
                System.out.println("Coin flip #" + i +": HEADS");
                headsCount++;
            }
        } // end for

        System.out.println();
        System.out.println("Number of tails: " + tailsCount);
        System.out.println("Number of heads: " + headsCount);
    }
}
