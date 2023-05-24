//2023.05.19

class Hello{

  public static void main(String[] args){
    System.out.println("Hello World");     //in println p should be small letter
    System.out.println("Hello, Java.");
  }
}

/*
--import java.lang.*;--
is a statement in Java that imports all the classes and interfaces from the java.lang package into the current file. 
This package provides classes that are fundamental to the design of the Java programming language. 
However, it is not necessary to include this statement in your code because the java.lang package is automatically imported by the Java compiler.
*/

/*
--what is class--
In Java, a class is a blueprint for creating objects. 
It defines the characteristics and behaviors of the objects that are created from it. 
The characteristics are represented by fields (also called instance variables), while the behaviors are represented by methods.

In your code, Hello is the name of the class. 
This class has one method named main, which is the entry point of the program. 
When you run the program, the code inside the main method is executed.

*/

/*
--what is public--
public is an access modifier in Java. 
It is used to specify the visibility of a class, method, or field. 
When a class, method, or field is declared as public, it means that it can be accessed from anywhere in the program.

In your code, the main method is declared as public. 
This means that it can be accessed and called from anywhere in the program, including from outside the Hello class.
*/

/*
--what is static--
static is a keyword in Java that is used to indicate that a method or field belongs to the class itself, rather than to any specific instance of the class. 
This means that you can access a static method or field without creating an object of the class.

In your code, the main method is declared as static. 
This means that it can be called without creating an object of the Hello class. 
When you run the program, the Java runtime system calls the main method directly, without creating an instance of the Hello class.
*/


/*
--what is void--
void is a keyword in Java that is used to indicate that a method does not return any value. 
When a method is declared as void, it means that it performs some action but does not produce any result that can be used by the caller.

In your code, the main method is declared as void. 
This means that it does not return any value when it is called. Instead, it simply performs the actions specified in its body, which in this case is to print two messages to the standard output stream.
*/


/*
--what is main--
main is the name of a method in your code. 
It is a special method that serves as the entry point of the program. 
When you run a Java program, the Java runtime system starts executing the code by calling the main method.

The main method must have a specific signature in order to be recognized by the Java runtime system. 
It must be public, static, and void, and it must accept a single parameter of type String[]. 
This parameter represents the command-line arguments that are passed to the program when it is run.

In your code, the main method has the correct signature and is therefore recognized as the entry point of the program. 
When you run the program, the code inside the main method is executed.
*/

/*
--what is String[] args--
String[] args is the parameter of the main method in your code. 
It is an array of String values that represents the command-line arguments that are passed to the program when it is run.

When you run a Java program from the command line, you can specify additional arguments after the name of the class that contains the main method. 
These arguments are passed to the main method as an array of String values, which you can access and use in your code.

For example, if you run your program with the command java Hello arg1 arg2, then the args array in the main method will contain two elements: "arg1" and "arg2".
*/

/*
--what is System--
System is a class in the java.lang package that provides several useful methods and fields for performing system-related tasks. Some of the most commonly used methods and fields in the System class include out, in, err, currentTimeMillis(), arraycopy(), and others.

In your code, the System.out.println() method is used to print messages to the standard output stream. 
The out field of the System class is a reference to an object of type PrintStream that represents the standard output stream. 
The println() method is a method of the PrintStream class that prints a message followed by a newline character.
*/

/*
--what is out--
out is a static field of the System class that represents the standard output stream. 
It is an object of type PrintStream that provides methods for printing various types of data to the standard output stream.

In your code, the System.out.println() method is used to print messages to the standard output stream. 
The println() method is a method of the PrintStream class that prints a message followed by a newline character. 
You can use this method to print any type of data that can be converted to a string, including primitive values, objects, and arrays.
*/

/*
--what is System.out.println()--
System.out.println() is a method call that prints a message to the standard output stream. 
The System class has a static field named out that represents the standard output stream. 
This field is an object of type PrintStream that provides several methods for printing data to the standard output stream.

The println() method is one of the methods provided by the PrintStream class. 
It prints a message followed by a newline character. You can pass any type of data that can be converted to a string as an argument to this method, including primitive values, objects, and arrays.

In your code, the System.out.println() method is called twice to print two messages to the standard output stream: “Hello, World.” and “Hello, Java.”.
*/
