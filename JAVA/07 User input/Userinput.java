import java.util.Scanner;

public class Userinput{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter a value of a : ");
        a = scanner.nextInt();
        System.out.print("Enter a value of b : ");
        b = scanner.nextInt();
        c = a * b;

        System.out.println("Result = " + c);
    }
}


/*
Here are the steps on how to get user input in Java:

Import the java.util.Scanner class.
Create a new Scanner object.
Use the next() method to get the user input.
Store the user input in a variable.
Use the user input in your program.

There are 11 mobjects that have the Scanner class. These are:

    you check by using this command on CMD // javap java.util.Scanner

Scanner
Scanner.next()
Scanner.nextInt()
Scanner.nextLong()
Scanner.nextDouble()
Scanner.nextLine()
Scanner.hasNext()
Scanner.hasNextInt()
Scanner.hasNextLong()
Scanner.hasNextDouble()
Scanner.hasNextLine()

The Scanner class is used to read input from a stream. 
The next() method of the Scanner class is used to read the next line of input from the stream. 
The nextInt() method of the Scanner class is used to read the next integer from the stream. 
The nextLong() method of the Scanner class is used to read the next long from the stream. 
The nextDouble() method of the Scanner class is used to read the next double from the stream.
 The nextLine() method of the Scanner class is used to read the next line from the stream. 
The hasNext() method of the Scanner class is used to check if there is more input available. 
The hasNextInt() method of the Scanner class is used to check if there is more integer input available. 
The hasNextLong() method of the Scanner class is used to check if there is more long input available. 
The hasNextDouble() method of the Scanner class is used to check if there is more double input available. 
The hasNextLine() method of the Scanner class is used to check if there is more line input available.
*/