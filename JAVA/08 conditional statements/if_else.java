// if else statement in Java 2023.05.30

import java.util.Scanner;

public class if_else {
    public static void main(String args[]){
        int age;
        System.out.println("Enter your Age : ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if(age >= 18)
            System.out.println("You can take licence");
        else    
            System.out.println("You can not take licence");
    }
}

/*
An if-else statement is a control flow statement that allows you to execute different blocks of code depending on the value of a Boolean expression.
*/
