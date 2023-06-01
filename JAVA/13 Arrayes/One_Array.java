import java.util.Scanner;

public class One_Array{
    public static void main(String args[]){
        int num[];          // array declaration
        num = new int[10];  // allocating memory to array

        int []num2 = new int[5]; // combining Both Statement
        
        //fixed array 
        int number[] = {5, 2, 8, 9, 10, 45};

        // Access the array element
        System.out.println(number[0]); 

        //Accessing elements by for loop
        System.out.println("\nAccessing elements by for loop");
        for(int i=0; i<number.length; i++){ // number.length to find array size
            System.out.println(number[i]); 
        }

        //Accessing elements by for-each loop
        System.out.println("\nAccessing elements by for-each loop");
        for(int i:number){
            System.out.println(i);
        }
    }
}

/*

In Java, an array is a collection of elements of the same type. 
Arrays are declared using the [] syntax. 

For example, the following code declares an array of integers:
int[] myArray;

 
Negative index does not support in java
*/