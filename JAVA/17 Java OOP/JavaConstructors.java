// Constructors in Java

class RectangleShape{
    int length, width;

    RectangleShape(){ // default constructor
        System.out.println("Constructor Called");
        length = 20;
        width = 10;
    }

    public int area(){
        int a = length * width;
        return a;
    }
}

public class JavaConstructors{
    public static void main(String args[]){
        RectangleShape rect = new RectangleShape();
        System.out.println("Area of Rectangle : " + rect.area());
    }
}


/*
A constructor is a special method that is used to initialize objects of a class. 
A constructor has the same name as the class and does not have a return type. 
A constructor is called when an object of a class is created using the new keyword.

The purpose of a constructor is to set initial values for the object attributes or perform some actions when the object is created. 
For example, if you have a class called Person that has attributes like name, age, and gender, you can use a constructor to assign values to these attributes when you create a Person object.

There are different types of constructors in Java, such as:

**Default constructor: This is a constructor that has no parameters and no explicit code. 
It is provided by Java automatically if you do not define any other constructor in your class. 
It assigns default values to the object attributes, such as 0 for numeric types, null for reference types, and false for boolean types.

**Parameterized constructor: This is a constructor that has one or more parameters and some code to initialize the object attributes with the given values. You can define multiple parameterized constructors with different numbers and types of parameters, as long as they are not ambiguous. 
This is called constructor overloading.

**Copy constructor: This is a constructor that takes another object of the same class as a parameter and copies its attribute values to the new object. 
This is useful when you want to create a duplicate object with the same state as another object.
*/