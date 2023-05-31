// if statement in Java 2023.05.30

import java.util.Scanner;

public class if_statement{
    public static void main(String args[]){
        int age;
        System.out.println("Enter your Age : ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if(age >= 18)
            System.out.println("You can take licence");
    }
}

/*
 if statement is a control flow statement that allows you to execute a block of code only if a certain condition is met. 
*/