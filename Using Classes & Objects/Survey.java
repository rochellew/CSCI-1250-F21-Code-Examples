import java.util.Random;
import javax.swing.JOptionPane;

public class Survey
{
    public static void main(String[] args) {
        Random rand = new Random();
        int randomValue = rand.nextInt(100) + 1;
        String firstName, lastName;
        char firstInitial, lastInitial;
        int age = 0;
        String message = "";
        boolean isCorrectInput;

        // get first and last name
        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");

        // get first and last initials
        firstInitial = firstName.charAt(0);
        lastInitial = lastName.charAt(0);
        do
        {
            try
            {
                age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
                isCorrectInput = true;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "PARSING ERROR", JOptionPane.ERROR_MESSAGE);
                isCorrectInput = false;
            }
        } while (isCorrectInput == false);

        message += "Hello, " + firstName + " " + lastName + "!\n";
        message += "Your initials are " + firstInitial + "." + lastInitial + ".\n";
        message += "You are " + age + " years old.";

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
