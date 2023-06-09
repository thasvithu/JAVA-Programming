// Copy Constructor in Java

class complex{
    private int real, img;

    public complex(){
        this.real = 5;
        this.img = 2;
    }

    public complex(int r, int i){
        this.real = r;
        this.img = i;
    }

    public complex(complex o2){ // this keyword refer currecnt class
        this.real = o2.real;
        this.img = o2.img;
    }                     

    public String toString(){
        return "(" + real + " + " + img + "i)";
    }
}

public class CopyConstructor{
    public static void main(String args[]){
        complex o1 = new complex();
        System.out.println("Object 1 : " + o1);

        complex o2 = new complex(3,5);
        System.out.println("Object 2 : " + o2);

        complex o3 = new complex(o2);
        System.out.println("Object 3 : " + o3);
    }
}
