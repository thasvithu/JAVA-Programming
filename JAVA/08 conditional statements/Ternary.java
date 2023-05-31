// Ternary operator in Java 2023.05.30

public class Ternary{
    public static void main(String args[]){
        int x = 5, y = 10, z;

        z = x > y ? x : y;
        
        System.out.println("The greatest Number is : " + z);
    }
}

/*

The ternary operator in Java is used to evaluate a condition and return a value based on the result of the condition. 
It is a shorter and more concise way to write an if-else statement. 

condition ? expression1 : expression2

condition is a boolean expression that is evaluated.
expression1 is the value that is returned if the condition is true.
expression2 is the value that is returned if the condition is false.

*/