// else if lader in Java 2023.05.30


/*
90 - 100 Grade - A
80 - 89  Grade - B
70 - 79  Grade - C
< 70     Grade - D
*/

import java.util.Scanner;

public class else_if_lader{
    public static void main(String args[]){
        float avg;
        System.out.println("Enter the Average Mark : ");
        Scanner scanner = new Scanner(System.in);
        avg = scanner.nextFloat();

        if(avg >= 90 && avg <= 100)
            System.out.println("Grafe : A");
        else if(avg >= 80 && avg <= 89)
            System.out.println("Grafe : B");
        else if(avg >= 70 && avg <= 79)
            System.out.println("Grafe : C");
        else
        System.out.println("Grafe : D");
    }
}
