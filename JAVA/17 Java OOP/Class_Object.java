// Classes & Objects in Java

class Rectangle{
    int length, width;  // properties

    // behaviour
    void getDeatils(int x, int y){ // this is default methode so we can access outside of the class
        length = x;
        width = y;
    }

    int area(){
        int a = length * width;
        return a;
    }
}

public class Class_Object{
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.length = 20;
        rectangle.width = 10;
        System.out.println("Area of rectangle is : " + rectangle.area());

        // we can create multiple objects to one class
        Rectangle rectangle2 = new Rectangle();
        rectangle2.getDeatils(20, 30);
        System.out.println("Area of rectangle is : " + rectangle2.area());
    }
}



/*
Object Oriented Programming (OOP) is a programming paradigm that uses **objects** as the basic building blocks of a program. 
Objects are instances of **classes**, which are templates that define the **data** and **methods** that belong to an object. 
Data is stored in **fields** (also called variables or attributes) and methods are functions that perform operations on the data or the object itself.

OOP has several advantages over procedural programming, such as:

- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time

OOP is based on four main concepts: **abstraction**, **encapsulation**, **inheritance** and **polymorphism**.

- Abstraction is the process of hiding the implementation details from the user and only showing the essential features. Abstraction helps to reduce complexity and increase efficiency.
- Encapsulation is the mechanism of wrapping the data and methods together as a single unit and protecting them from outside access. Encapsulation ensures data integrity and security.
- Inheritance is the process of deriving new classes from existing ones, thereby reusing the common features and adding new ones. Inheritance supports hierarchical classification and code reuse.
- Polymorphism is the ability of an object to take different forms depending on the context. Polymorphism allows us to perform a single action in different ways.


- **Abstraction** is the process of hiding the implementation details from the user and only showing the essential features. Abstraction helps to reduce complexity and increase efficiency. For example, when you use a TV remote, you don't need to know how the TV works internally, you just press the buttons to change the channels or volume. In Java, abstraction is implemented through the use of **interface** and **abstract classes**. We can achieve complete abstraction with the use of interface whereas a partial or a complete abstraction can be achieved with the use of abstract classes².
- **Encapsulation** is the mechanism of wrapping the data and methods together as a single unit and protecting them from outside access. Encapsulation ensures data integrity and security. For example, when you use a bank account, you don't need to know how the bank processes your transactions, you just use the methods provided by the bank to deposit or withdraw money. In Java, encapsulation is achieved by using **private** fields and **public** methods (also known as getters and setters) to access or modify them¹².
- **Inheritance** is the process of deriving new classes from existing ones, thereby reusing the common features and adding new ones. Inheritance supports hierarchical classification and code reuse. For example, when you create a class called Animal, you can define some common attributes and methods for all animals, such as name, color, eat, sleep, etc. Then you can create subclasses of Animal, such as Dog, Cat, Bird, etc., and inherit these common features from Animal. You can also add some specific features for each subclass, such as bark for Dog, meow for Cat, fly for Bird, etc. In Java, inheritance is achieved by using the **extends** keyword¹².
- **Polymorphism** is the ability of an object to take different forms depending on the context. Polymorphism allows us to perform a single action in different ways. For example, when you create an object of Animal class and assign it to a variable of type Animal, you can call the eat method on that variable. However, depending on what subclass of Animal that object belongs to (Dog, Cat, Bird, etc.), the eat method will behave differently. This is because each subclass has overridden the eat method to provide its own implementation. In Java, polymorphism is achieved by using **method overriding** and **method overloading**¹².

I hope this clarifies these concepts for you.😊

Source: Conversation with Bing, 6/8/2023
(1) Understanding Encapsulation, Inheritance, Polymorphism, Abstraction in .... https://www.geeksforgeeks.org/understanding-encapsulation-inheritance-polymorphism-abstraction-in-oops/.
(2) What Are OOP Concepts in Java? 4 Primary Concepts - Stackify. https://stackify.com/oops-concepts-in-java/.
(3) Object-Oriented-Programming Concepts in Java | Baeldung. https://www.baeldung.com/java-oop.

(1) Java OOP (Object-Oriented Programming) - W3Schools. https://www.w3schools.com/java/java_oop.asp.
(2) Object Oriented Programming (OOPs) Concept in Java. https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/.
(3) What Are OOP Concepts in Java? 4 Primary Concepts - Stackify. https://stackify.com/oops-concepts-in-java/.
(4) Java OOPs Concept with Example | Object Oriented Programming - Edureka. https://www.edureka.co/blog/object-oriented-programming/.
(5) Four Main Object Oriented Programming Concepts of Java. https://www.geeksforgeeks.org/four-main-object-oriented-programming-concepts-of-java/.
*/