// Array of Objects in Java

class Student{
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    void print(){
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + roll_no);
        System.out.println("----------------------------");
    }
}

public class Array_of_Objects{
    public static void main(String args[]){
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(10, "Vithu");
        arr[1] = new Student(20, "Nila");
        arr[2] = new Student(30, "Thivi");
        arr[3] = new Student(40, "Vino");
        arr[4] = new Student(50, "Daya");

        for(int i = 0; i < arr.length; i++){
            arr[i].print();
        }
    }
}
