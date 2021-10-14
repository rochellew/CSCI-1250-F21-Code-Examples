import java.util.Random;

public class RandomBasics
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int number;

        // nextInt range is ~-2B -- ~2B
        number = rand.nextInt();

        System.out.println(number);
    }
}
