// 05 Type Casting in Java  2023.05.28 

class Typecast{
    public static void main(String[] args){
        int a = 9;
        double b = a; // Automatic casting: int to double
        
        System.out.println("---Widening Casting---");
        System.out.println("before casting : " + a);     
        System.out.println("after casting  : " + b);   

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println("\n---Narrowing Casting---");
        System.out.println("before casting : " + myDouble);
        System.out.println("after casting  : " + myInt);
    }
}

/*
Type casting in Java is like a chameleon changing its color to blend in with its surroundings. 
Just like how a chameleon can change its color, type casting allows you to convert a value from one data type to another data type.

There are two types of type casting: 
Widening Type Casting and Narrowing Type Casting
. 
Widening Type Casting is like a small fish being swallowed by a bigger fish. 
It converts a lower data type into a higher one and is done automatically. 

Narrowing Type Casting, on the other hand, is like trying to fit a big fish into a small fishbowl. 
It converts a higher data type into a lower one and must be done manually by the programmer.   


    Widening Casting
        byte -> short -> char -> int -> long -> float -> double
    
    Narrowing Casting
        double -> float -> long -> int -> char -> byte
*/