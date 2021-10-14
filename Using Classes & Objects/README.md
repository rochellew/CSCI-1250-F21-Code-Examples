# Using Classes & Objects and Error Handling

## Have We Seen Classes and Objects?
We have used some classes and objects of those classes up to this point (e.g., the `String`, `Math`, and `Scanner` classes). 

Remember that in order to use an object, we need to do two things.

1. Declare the reference variable
2. Create the object in memory, and assign its memory address to the reference variable

After these steps have been performed,  we  can use the reference variable to work with the object.

Here's an example of how we can create an object from the `Scanner` class. 

```java 
Scanner kb = new Scanner(System.in);
```

## Some New Classes and How to Use Their Objects
This week, we'll learn how to use two more classes, specifically those classes listed below.
* The `Random` class
* The `JOptionPane` class
* Various parsing methods

### The `Random` Class
This class allows us to generate random numbers. We can either generate a random number based on data type, or in a given range. 

#### Generating a random value based on data type
See the table below for more details on generating numbers based on data type.

`Random` method | Numeric Range
--------------- | ---------------
`nextInt()`     | -2,147,483,648 &ndash; 2,147,483,647
`nextDouble()`  | 0.0 &ndash; 1.0
`nextLong()`    | MASSIVE range &ndash; MASSIVE range

By using the `Random` class methods shown above with no argument values (values inside the parentheses), the number generated will be at random within that range.

In order for us to use these methods, we first need to import the `Random` class, just like we do the `Scanner` class. The `import` statement to do this is shown below.

```java
import java.util.Random;
```

After we  import the `Random` class, we need to create an object of that  class to access the class's methods. The declaration and initialization of a reference variable for a  `Random` object is shown  below.

```java
Random rand = new Random();
```

Let's say we wanted to generate a random percentage from 0% &ndash; 100%. How would we go about doing that? Well, looking at the table above, we can see that the `nextDouble` method generates a value from 0.0 &ndash; 1.0. If we multiply that by 100, we'd have a random percentage! Below is a code example of how we would do that.

```java
// import the Random class
import java.util.Random;

public class RandomPercent
{
    public static void main(String[] args)
    {
        // declare and initialize the Random object's reference variable
        Random rand = new Random();
    
        // declare an integer variable to store the random double
        double number;
    
        // obtain a random value from 0.0 &ndash; 1.0
        number = rand.nextDouble();
    
        // multiply by 100 to convert to a percentage
        number = number * 100;
    
        // display the percentage to the user
        System.out.print("Your random percent is " + number + "%");
    }
}
```

#### Generating a random value in a given range
It is often the case that we want to generate a random value in a given range (e.g., I want a random number between 1 and 10). 

To do this, we need to use a formula (more math stuff, yay 😅). The formula to generate a random number in a range has a few variables we need to keep track of.

* Max - the maximum value in the range
* Min - the minimum value in the range

The formula to generate a random number in a range is shown below. 

`((max - min) + 1) + min`

**Note** : This formula is _INCLUSIVE_ of the maximum value.

Let's do a specific example.  I want a random number in the range of 50 &ndash; 75. The code to generate this number is shown below. Assume I have created a class and `main` method header as well as imported & created a `Random` object reference variable.

```java
// Formula
// nextInt((max - min) + 1) +  min
// nextInt((75 - 50) + 1) + 50
// nextInt(26) + 50
int number = rand.nextInt(26) + 50;
```

### Dialog Boxes using the `JOptionPane` Class
So far, we have only handled input & output in the console / terminal window inside IntelliJ. We can use a dialog box to handle input and output in a small graphical window. We can do this by using the `JOptionPane` class. 

We will be using two types of dialog boxes in this class:
* Message Dialog: A dialog box that displays a message; an OK button is also displayed
* Input Dialog:   A dialog box that prompts the user for input and provides a text field where input is typed; an OK button and a Cancel button are also displayed

![image](https://user-images.githubusercontent.com/32746298/136833491-c7a74f3e-6c55-4e20-a61b-73f701f0da70.png)

In order for us to use the dialog boxes and the `JOptionPane` class, we must first import it. The import statement is shown below.

```java
import javax.swing.JOptionPane;
```

Fortunately, we do not need to declare and initialize a reference variable to a JOptionPane object in CSCI 1250 -- we can just access the methods as required. Neat! 

#### Message dialogs
The `showMessageDialog` method is used to display a message dialog. Below is a statement that calls the method.

```java
JOptionPane.showMessageDialog(null, "Hello World!");
```

The first argument is only important in programs that display other graphical windows. You will learn more about these kinds of programs in CSCI 1260. Until then, we will always  pass the `null` keyword as the first argument. This causes the dialog box to be displayed in the center of the screen. The second argument is the message that we wish to display in the dialog box. 

The dialog box genereated by the statement above will look something like this. When the user clicks the OK button, the dialog box will close.

![image](https://user-images.githubusercontent.com/32746298/136833992-99915445-1b55-4eaf-b4e3-8651bb5167bb.png)

There are some **optional** arguments we can use in message dialogs if we choose. We can give the dialog box a title and a type. The code below shows how to generate a message dialog for an error.

```java
JOptionPane.showMessageDialog(null, "Here's an error message.", "Error", JOptionPane.ERROR_MESSAGE);
```

The dialog box generated by the statement above will look something like this. 

![image](https://user-images.githubusercontent.com/32746298/137190170-5dbd62ec-d33d-46f9-b295-82ff8412d741.png)

You can use these optional arguments, if you like. You may need to research the different types of messages `JOptionPane` provides (the last argument in the above code.)

#### Input dialogs
An input dialog is a quick and simple way to ask the user to enter data. We can use the `JOptionPane` class's `showInputDialog` method to display an input dialog. The following statements show how to use the method.

```java
String name;
name = JOptionPane.showInputDialog("Enter your name.");
```

The argument passed to the method is a message to display in the dialog box. This statement will cause the following dialog box to be displayed in the center of the screen. If the user clicks the OK button, `name` will reference the string value entered by the user into the text field. If the user clicks the Cancel button, `name` will reference the special value `null`. 

![image](https://user-images.githubusercontent.com/32746298/136834469-f03790cd-de45-4678-870a-5f6cf208e6ec.png)

The following program asks the user for their name and will display it to the screen. It uses both an input and message dialog box.

```java
import javax.swing.JOptionPane;

public class WhoAreYou
{
    public static void main(String[] args)
    {
        String name;
        name = JOptionPane.showInputDialog("What is your name?");
        
        JOptionPane.showMessageDialog(null,"Hello, " + name + "!");
        
        System.exit(0);
    }
}
```

Notice  the last statement in the `main` method:

```java
System.exit(0);
```

This statement causes the program to end, and is **required** if you use the `JOptionPane` class to display dialog boxes. Unlike a console program, a program that uses `JOptionPane` does not automatically stop executing when the end of the main method is reached, because the `JOptionPane` class causes an additional task to run in the JVM. If the `System.exit` method is not called, this task, also known as a _thread_, will continue to execute, even after the end of the `main` method has been reached

### Converting string input to numbers
Unlike the `Scanner` class, the `JOptionPane` class does not have different methods for reading values of different types as input. The `showInputDialog` method always returns the user's input as a `String`, even if the user enters numeric data. 

For example, if the user enters the number 72 into an input dialog, the `showInputDialog` method will return the string `"72"`. This can be a problem if you want to  use the user's input in numeric operations because, as you know, you cannot perform numeric operations on strings.

In such a case, you **must** convert the input to a numeric value. To convert a string value to a numeric value, you use one of the methods listed below.

Method               | Use This Method To... 
-------------------- | ---------------------------- 
`Byte.parseByte`     | Convert a string to a `byte`
`Double.parseDouble` | Convert a string to a `double`
`Float.parseFloat`   | Convert a string to a `float`
`Integer.parseInt`   | Convert a string to an `int`
`Long.parseLong`     | Convert a string to a `long`
`Short.parseShort`   | Convert a string to a `short`

The code example below shows how you would convert the value returned from the `JOptionPane.showInputDialog` method to an `int` using the `Integer.parseInt` method.

```java
double price;
String str;
str = JOptionPane.showInputDialog("Enter the retail price.");
price = Double.parseDouble(str);
```

The last line uses a parsing method to convert the string value into an integer value. Remember we **must do this** any time we want to gather numeric input from a user using the `JOptionPane.showInputDialog` method.

## Error Handling Using the `try/catch` Statement

We can handle code-breaking errors in Java by using a new type of code statement known as the `try/catch` statement. The format for this statement is shown below.

```java
try
{
    // the stuff you want to try
}
catch (Exception e)
{
    // the stuff that will happen if it fails
}
```

Each class that we have discussed has its own `Exception` format. For example, let's say we try to use the `Integer.parseInt` method to parse a `String` value to an `int` value. If this fails, the Integer class will return a `NumberFormatException` which we can use as our specific `Exception` format. The `e` after the exception format is a name we can give the `Exception` to gather some information about it such as a pre-written error message by the author of the class. 

Let's do a specific example -- let's say we want to ask a user their age using `JOptionPane`. We will `try` to parse their input to an `int` and, if that would fail, write a `catch` statement to alert the user as to _why_ it failed. We can get more information about the exception by using the `getMessage` method of the `Exception` class.

```java
int age = 0;

try
{
    age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?");
}
catch (NumberFormatException e)
{
    JOptionPane.showMessageDialog(null, e.getMessage());
}
```

The `try/catch` statement can be a very powerful tool for input validation, especially when combined with a validation loop (see the _Loops_ material for more information on validation loops.

The code examples in this repository will reinforce these topics and will be generated in the lab session on Thursday, 10/14/2021. 
