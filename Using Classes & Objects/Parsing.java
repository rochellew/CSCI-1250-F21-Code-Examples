import javax.swing.JOptionPane;

public class Parsing
{
    public static void main(String[] args)
    {
        double price, tax, total;
        String input,output;

        input = JOptionPane.showInputDialog("Enter a retail price.");

        price = Double.parseDouble(input);

        tax = price * 0.095;

        total = tax + price;

        output = String.format("Total price: $%,.2f", total);

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }
}
