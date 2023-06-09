// Data Hiding Getter and Setter in Java   2023.06.08

class ShapeRectangle{
    private int length, width;

    // setter methode to assign value
    void setLength(int l){
        if(l > 0)
            length = l;
        else    
            length = 0;
    }
    void setWidth(int w){
        if(w > 0)
            width = w;
        else    
            width = 0;
    }

    // getter methode to acccess variable out side of the class
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }

    int area(){
        int a = length * width;
        return a;
    }
}

public class get_set{
    public static void main(String args[]){
        ShapeRectangle shapeRectangle = new ShapeRectangle();
        shapeRectangle.setLength(10);
        shapeRectangle.setWidth(-5);
        System.out.println("Length : " + shapeRectangle.getLength());
        System.out.println("Width  : " + shapeRectangle.getWidth());
        System.out.println("Area of Rectangle : " + shapeRectangle.area());
    }
}

/*
Data hiding is a principle of object-oriented programming that aims to protect the internal state of an object from external access or modification. 
Data hiding helps to achieve encapsulation, abstraction, and security in Java1.

Getter and setter are methods in Java that are used to retrieve and update the value of a data member respectively. 
Getters are also called accessors and setters are also called mutators. 
Getter and setter in Java help in providing data hiding by preventing direct unauthorized access to the variables
*/