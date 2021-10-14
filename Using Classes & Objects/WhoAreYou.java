import javax.swing.JOptionPane;

public class WhoAreYou
{
    public static void main(String[] args)
    {
        String name;
        name = JOptionPane.showInputDialog("What is your name?");

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

        System.exit(0);
    }
}
