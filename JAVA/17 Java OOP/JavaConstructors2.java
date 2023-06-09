// parameterized Constructor & Constructor Overloading

class Box{
    float   length,breadth;

    public Box(){ // The constructor is automatically called when an object is created.
        length = 10;
        breadth = 15;
    }

    public Box(float x, float y){ // parameterized Constructor
        length = x;
        breadth = y;
    }

    public Box(float n){ // parameterized Constructor
        length = breadth = n;
    }

    float area(){
        return length * breadth;
    }
}

public class JavaConstructors2{
    public static void main(String args[]){
        Box BoxO = new Box();
        System.out.println("Area : " + BoxO.area());

        Box BoxO1 = new Box(20,10);
        System.out.println("Area : " + BoxO1.area());

        Box BoxO2 = new Box(20);
        System.out.println("Area : " + BoxO2.area());
    }
}
