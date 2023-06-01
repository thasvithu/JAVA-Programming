import java.util.Scanner;

public class Store_userInput {
    public static void main(String args[]){
        int[] number = new int[5];

        // get user input using array
        for(int i=0; i<number.length; i++){
            System.out.print("Enter the " + i + " Element : ");
            Scanner scanner = new Scanner(System.in);
            number[i] = scanner.nextInt();
        }

        System.out.println("Size of number array : " + number.length); // to find array length

        // print stored array values
        for(int i=0; i<number.length; i++){
            System.out.println("Element " + i + " is : " + number[i]);

        }
    }
}
