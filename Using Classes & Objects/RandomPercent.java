import java.util.Random;

public class RandomPercent
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        double number;

        number = rand.nextDouble();

        number *= 100;

        System.out.printf("%.2f%%",number);
    }
}
