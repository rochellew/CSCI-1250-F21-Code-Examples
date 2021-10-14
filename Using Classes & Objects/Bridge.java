import java.util.Scanner;

public class Bridge
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String faceCard;
        int faceCardValue = 0;

        System.out.print("Enter a face card (king, queen, jack, or ace): ");
        faceCard = kb.nextLine().trim().toLowerCase();

        switch(faceCard)
        {
            case "ace":
                faceCardValue = 14;
                break;
            case "king":
                faceCardValue = 13;
                break;
            case "queen":
                faceCardValue = 12;
                break;
            case "jack":
                faceCardValue = 11;
                break;
            default:
                faceCardValue = 0;
        }

        if(faceCardValue == 0)
            System.out.println("Invalid face card.");
        else
            System.out.println("The " + faceCard + " card has a value of " + faceCardValue);

        kb.close();
    }
}
