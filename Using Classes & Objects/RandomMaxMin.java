import java.util.Random;

public class RandomMaxMin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;

        // Get a number from 15 - 60
        // ((max - min) + 1) + min
        // ((60 - 15) + 1) + 15
        // (46) + 15
        number = rand.nextInt(46) + 15;

        System.out.println(number);
    }
}
