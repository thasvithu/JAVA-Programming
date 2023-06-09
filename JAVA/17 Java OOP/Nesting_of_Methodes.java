// Nesting of Methodes java

class demo{
    private int m, n;
    demo(int x, int y){
        m = x;
        n = y;
    }

    int largest(){
        if(m > n)
            return m;
        else    
            return n;
    }

    void display(){
        int large = largest(); // nesting methode
        System.out.println("The Largest Number is : " + large);
    }
}

public class Nesting_of_Methodes{
    public static void main(String args []){
        demo dem = new demo(20, 5);
        dem.display();
    }
}






/*
Nesting of methods in Java means that a method can call another method within the same class. 
This can help to organize the code and simplify the method calls within a class. 
For example, if you have a class that performs some calculations, you can have one method that calls other methods to perform different steps of the calculation.

However, nesting of methods in Java does not mean that you can define a method inside another method. 
This is not allowed in Java. 
You can only define a method inside a class or an inner class. 
An inner class is a class that is defined inside another class. 
You can use an inner class to access the methods and variables of the outer class or to provide some functionality that is related to the outer class.
*/