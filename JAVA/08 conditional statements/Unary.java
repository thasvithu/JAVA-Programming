// Unary operator in Java 2023.05.30

public class Unary {
    public static void main(String args[]){
        int a = 10;

        System.out.println(a);
        a++; // a = a + 1 
        
        System.out.println(a++); // post increment
        System.out.println(a++); // post increment

        System.out.println(a--); // pre decrement
        System.out.println(--a); // pre decrement
    }
}


/*
Unary operators are operators that take only one operand. 
They are used to perform various operations such as incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean.

There are five unary operators in Java:

Unary Plus
Unary Minus
Increment Operator
Decrement Operator
Logical Complement Operator

The unary plus operator (+) is used to make the value of its operand positive. For example, the expression +10 evaluates to 10.

The unary minus operator (-) is used to make the value of its operand negative. For example, the expression -10 evaluates to -10.

The increment operator (++) is used to increment the value of its operand by one. For example, the expression ++x increments the value of the variable x by one.

The decrement operator (--) is used to decrement the value of its operand by one. For example, the expression --x decrements the value of the variable x by one.

The logical complement operator (!) is used to invert the value of its operand. For example, the expression !true evaluates to false.

Unary operators can be used to make code more concise and efficient. However, it is important to use them sparingly, as they can make code more difficult to read and understand.
*/
