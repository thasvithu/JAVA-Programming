// Jva for loop 2023.05.31

import java.util.Scanner;

public class for_loop{
    public static void main(String args[]){
        System.out.println("Enter The Limit : ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }
}

/*
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.
*/