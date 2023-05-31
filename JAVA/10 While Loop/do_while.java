//Java do while 2023.05.31

import java.util.Scanner;

public class do_while{
    public static void main(String args[]){
        System.out.print("Enter a Limit : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= n);
    }
}


/*
do{
  // block of code to be executed repeatedly
} while (condition);
*/
