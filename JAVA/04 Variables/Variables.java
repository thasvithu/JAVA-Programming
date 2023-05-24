//04 Variables in Java 2023.05.24

class Variables{
    public static void main(String args[]){      //in String S should be capital letter
        String name = "Vithusan";   //declaring string variable
        int age = 21;    //declaring integer variable
        float percent = 25.25f; //if you didn't put f it will take it as double value
        char gender = 'M'; //character variable
        boolean married = false;
        double pi = 3.14195;

        //The println() method is often used to display variables.
        //To combine both text and a variable, use the + character:

        System.out.println("Name        : " + name);   
        System.out.println("Age         : " + age);  
        System.out.println("Percentage  : " + percent);
        System.out.println("Gender      : " + gender);
        System.out.println("Married     : " + married);
        System.out.println("Value of pi : " + pi);

        //To declare more than one variable of the same type, you can use a comma-separated list:
        int x = 5, y = 6, z = 50;
        System.out.println("Value of x+y+z : " + (x + y + z)); //if you didn;t put brackets it will print as text values

        //You can also assign the same value to multiple variables in one line:
        int a, b, c;
        a = b = c = 25;
        System.out.println("Value of x+y+z : " + (a + b + c));
    }
}


/*
--Java Variables--
Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

To combine both text and a variable, use the + character:
*/

/*---------------------------------------------------------------------------------------------------------------------*/

/*
--Identifiers--
All Java variables must be identified with unique names.

These unique names are called identifiers.

Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
*/

/*---------------------------------------------------------------------------------------------------------------------*/

/*
--The general rules for naming variables are:--

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/