# Using Classes & Objects

## Have We Seen Classes & Objects?
We have used some classes and objects of those classes up to this point (e.g., the `String`, `Math`, and `Scanner` classes). 

Remember that in order to use an object, we need to do two things.

1. Declare the reference variable
2. Create the object in memory, and assign its memory address to the reference variable

After these steps have been performed,  we  can use t he reference variable to work with the object.

Here's an example of how we can create an object from the `Scanner` class. 

```java 
Scanner kb = new Scanner(System.in);
```

## Some New Classes & How to Use Their Objects
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
`nextInt()`     | -2,147,483,648 - 2,147,483,647
`nextDouble()`  | 0.0 - 1.0
`nextLong()`    | MASSIVE range

By using the `Random` class methods show above with no argument values (values inside the parentheses), the number generated will be at random within that range.

In order for us to use these methods, we first need to import the `Random` class, just like we do the `Scanner` class. The `import` statement to do this is shown below.

```java
import java.util.Random;
```

After we  import the `Random` class, we need to create an object of that  class to access the class's methods. The declaration and initialization of a reference variable for a  `Random` object is shown  below.

```java
Random rand = new Random();
```

Let's say we wanted to generate a random percentage from 0 - 100%. How would we go about doing that? Well, looking at the table above, we can see that the `nextDouble` method generates a value from 0.0 - 1.0. If we multiply that by 100, we'd have a random percentage! Below is a code example of how we would do that.

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
    
        // obtain a random value from 0.0 - 1.0
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

To do this, need to use a formula (more math stuff, yay 😅). The formula to generate a random number in a range has a few variables we need to keep track of.

* Max - the maximum value in the range
* Min - the minimum value in the range

The formula to generate a random number in a range is shown below. 

`((max - min) + 1) + min`

**Note** : This formula is INCLUSIVE of the maximum value.

Let's do a specific example.  I want a random number in the range of 50 - 75. The code to generate this number is shown below. Assume I have created a class and `main` method header as well as imported & created a `Random` object reference variable.

```java
// Formula
// nextInt((max - min) + 1) +  min
// nextInt((75 - 50) + 1) + min
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

#### Input dialogs
An input dialog is a quick and simple way to ask the user to enter data. We can use the `JOptionPane` class's `showInputDialog` method to display an input dialog. The following statements show how to use the method.

```java
String name;
name = JOptionPane.showInputDialog("Enter your name.");
```

The argument passed to the method is a message to display in the dialog box. This statement will cause the following dialog box to be displayed in the center of the screen. If the user clicks the OK button, `name` will reference the string value entered by the user into the text field. If the user clicks the Cancel button, `name` will reference the special value `null`. 

![image](https://user-images.githubusercontent.com/32746298/136834469-f03790cd-de45-4678-870a-5f6cf208e6ec.png)




