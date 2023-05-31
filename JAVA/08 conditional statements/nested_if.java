// nested if lader in Java 2023.05.30

import java.util.Scanner;

public class nested_if{
    public static void main(String args[]){
        /*
            Nested if Statement
            A company insures its drivers in the following cases:
                a. If the driver is married
                b. If the driver is unmarried, male & above 30 years of age.
                c. If the driver is unmarried, female & above 25 years of age
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marital Status M/U : ");
        char marital = scanner.next().charAt(0);

        if(marital == 'm' || marital == 'M')
            System.out.println("You are Eligible for Insurance");
        else if(marital == 'u' || marital == 'U'){
            System.out.println("Enter The gender M/F: ");
            char gender = scanner.next().charAt(0);
            System.out.println("Enter The Age : ");
            int age = scanner.nextInt();

            if((gender == 'm' || gender == 'M') && age >= 30)
                System.out.println("You are Eligible for Insurance");
            else if((gender == 'f' || gender == 'F') && age >= 25)
                System.out.println("You are Eligible for Insurance");
            else
                System.out.println("Not Eligible for Insurance");
        }
        else
        System.out.println("Invalid input!");
    }
}


// A nested if statement is an if-else statement with another if statement as the if body or the else body. 