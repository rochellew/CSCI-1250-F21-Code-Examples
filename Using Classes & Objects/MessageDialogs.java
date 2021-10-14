import javax.swing.JOptionPane;

public class MessageDialogs
{
    public static void main(String[] args)
    {
        String message = "";

        // default message
        JOptionPane.showMessageDialog(null,"Default Message");

        // warning message
        JOptionPane.showMessageDialog(null,"Warning Message", "WARNING", JOptionPane.WARNING_MESSAGE);

        // error message
        JOptionPane.showMessageDialog(null,"Error Message", "ERROR", JOptionPane.ERROR_MESSAGE);

        // plain message
        JOptionPane.showMessageDialog(null,"Plain Message", "Plain", JOptionPane.PLAIN_MESSAGE);


        // using a String
        message += "This is line one of my message.\n";
        message += "This is line two of my message.\n";
        message += "This is line three of my message.";

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
