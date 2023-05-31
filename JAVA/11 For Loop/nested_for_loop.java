// Jav Nested for loop 2023.05.31

public class nested_for_loop{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); // print new line
        }
    }
}


/*
Nested Loops
It is also possible to place a loop inside another loop. This is called a nested loop.

The "inner loop" will be executed one time for each iteration of the "outer loop"
*/