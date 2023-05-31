// Java break and continue 2023.05.31

public class break_continue{
    public static void main(String args[]){
        for(int i = 0; i <= 10; i++){
            if(i == 5) // skip value 5 and loop will iterate continues
                continue;
            System.out.println(i);
            if(i == 8) // loop will breake when i take 8
                break;
        }
    }
}

/* 
The break and continue statements are used to control the flow of a loop in Java.

The break statement terminates the loop immediately.
The continue statement skips the current iteration of the loop and continues with the next iteration.
*/