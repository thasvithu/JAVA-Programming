// Java while loop 2023.05.31

import java.util.Scanner;

public class while_loop{
    public static void main(String args[]){
        System.out.print("Enter a Limit : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}

/*
A while loop in Java is a control flow statement that executes a block of code repeatedly as long as a given Boolean condition is true. The syntax for a while loop is as follows:


while (condition) {
  // block of code to be executed repeatedly
}
*/