import java.util.Locale;

/*
    This class showcases some of the different methods the  String class provides,
    including charAt, length, toUpperCase, and toLowerCase
 */
public class StringExamples
{
    public static void main(String[] args)
    {
        String firstName = "ALeXanDEr"; // declaring a String variable, and initializing the String object

        //////////////////////////////////////////////////////////////////
        // charAt methods -- pay close attention to the index positions //
        //////////////////////////////////////////////////////////////////

        // get the first letter in firstName
        char firstLetter = firstName.charAt(0); // '0' because the first position is always 0
        System.out.println("The first letter in " + firstName + " is " + firstLetter);

        // get the second letter in firstName
        char secondLetter = firstName.charAt(1); // '1' because the first position is always 0, making 2nd position 1
        System.out.println("The second letter in " + firstName + " is " + secondLetter);

        // get the last letter in firstName
        int lastIndex = firstName.length() - 1;
        char lastLetter = firstName.charAt(lastIndex);
        System.out.println("The last letter in " + firstName + " is " + lastLetter);

        // prints a blank line (for visual spacing in the output)
        System.out.println("");

        /////////////////////////////
        // other String methods    //
        /////////////////////////////

        // get the number of characters in firstName
        int nameLength = firstName.length();
        System.out.println("There are " + nameLength + " characters in " + firstName);

        // firstName to all lowercase
        String lowerCaseName = firstName.toLowerCase();
        System.out.println(firstName + " in all lowercase letters is " + lowerCaseName);

        // firstName to all uppercase
        String upperCaseName = firstName.toUpperCase();
        System.out.println(firstName + " in all uppercase letters is " + upperCaseName);
    }
}
