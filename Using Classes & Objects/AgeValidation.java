import javax.swing.JOptionPane;

public class AgeValidation
{
    public static void main(String[] args)
    {
        int age = 0;
        String ageInput;

        try
        {
            ageInput = JOptionPane.showInputDialog("How old are you?");
            age = Integer.parseInt(ageInput);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "PARSING ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        System.exit(0);
    }
}
