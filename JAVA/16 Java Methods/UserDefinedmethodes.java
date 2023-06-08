// 2023.06.08

class Methods{
    // No return without argument
    public void add(){
        int a = 10;
        int b = 20;
        System.out.println("Addition : " + (a + b));
    }

    // No return with argument
    public void sub(int x, int y){
        System.out.println("Subtraction : " + (x - y));
    }

    // return without arguments
    public int mul(){
        int a = 10;
        int b = 20;
        return a * b;
    }

    // return with arguments
    public float div(int a, int b){
        return a / b;
    }

    // Recursion Function
    public int factorial(int n){    // 5! = 1 * 2 * 3 *5 = 120
        if(n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}

/*
    5 * 4 = 20
    4 * 
*/


public class UserDefinedmethodes{
    public static void main(String args[]){
        Methods methods = new Methods();
        methods.add();
        methods.sub(25,20);
        System.out.println("Mul : " + methods.mul());
        System.out.println("Division : " + methods.div(20,2));
        System.out.println("Recursion : " + methods.factorial(5));
    }
}


/*
A method is a block of code that performs a specific task and can be reused multiple times. 
Methods are also known as functions¹. Methods can have parameters, which are values that are passed to the method when it is called¹. 
Methods can also return a value to the caller, or be void if they do not return anything².

A method must be declared within a class, and it has six components: access specifier, return type, method name, parameter list, method body and method signature². 
The access specifier determines the visibility of the method, such as public, private, protected or default². 
The return type specifies the data type of the value that the method returns, such as int, String, void, etc². 
The method name is a unique identifier for the method that describes its functionality². 
The parameter list contains the data type and variable name of each parameter that the method accepts, separated by commas and enclosed in parentheses². 
The method body contains the statements that define the logic of the method, enclosed in curly braces². 
The method signature is a part of the method declaration that includes the method name and the parameter list².

Here is an example of a method declaration in Java:

```java
public static int add(int a, int b) { //method declaration
  int sum = a + b; //method body
  return sum; //return statement
}
```

In this example, public is the access specifier, static is a keyword that means the method belongs to the class and not an object of the class, int is the return type, add is the method name, (int a, int b) is the parameter list, and add(int a, int b) is the method signature.

To call a method in Java, we write the method name followed by parentheses and a semicolon. 
If the method has parameters, we pass the values for each parameter inside the parentheses. 
If the method returns a value, we can assign it to a variable or use it in an expression. For example:

```java
int result = add(5, 10); //call the add method and assign its return value to result
System.out.println(result); //print result
```

This will output 15.

I hope this explanation helps you understand methods in Java better. 
if you have any questions or want to learn more about methods in Java, you can visit some of these websites:

- [Java Methods - W3Schools](https://www.w3schools.com/java/java_methods.asp) ¹
- [Method in Java - Javatpoint](https://www.javatpoint.com/method-in-java) ²
- [An Introduction to Methods in Java with Examples | Simplilearn](https://www.simplilearn.com/tutorials/java-tutorial/methods-in-java)
- [Java Methods - GeeksforGeeks](https://www.geeksforgeeks.org/methods-in-java/)
- [Java - Methods - Online Tutorials Library](https://www.tutorialspoint.com/java/java_methods.htm)

Source: Conversation with Bing, 6/8/2023
(1) Java Methods - W3Schools. https://www.w3schools.com/java/java_methods.asp.
(2) Method in Java - Javatpoint. https://www.javatpoint.com/method-in-java.
(3) An Introduction to Methods in Java with Examples | Simplilearn. https://www.simplilearn.com/tutorials/java-tutorial/methods-in-java.
(4) Java Methods - GeeksforGeeks. https://www.geeksforgeeks.org/methods-in-java/.
(5) Java - Methods - Online Tutorials Library. https://www.tutorialspoint.com/java/java_methods.htm.
*/