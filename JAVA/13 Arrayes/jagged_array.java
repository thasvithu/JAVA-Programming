// jagged array 2023.05.01

public class jagged_array {
    public static void main(String args[]){
        int number[][] = {
            {1, 2, 3, 5},
            {4, 5, 6},
            {7, 8, 9, 8}
        };

        for(int i=0; i<number.length; i++){
            for(int j=0; j<number[i].length; j++){
                System.out.print(number[i][j] + "  ");
            }
            System.out.println();
        }

        // using for-each loop to jagged array
        System.out.println("----------------");
        for(int k[]:number){
            for(int n:k){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

/* 

A jagged array is an array of arrays. In other words, it is an array whose elements are themselves arrays. 
The elements of a jagged array can be of different sizes.

Jagged arrays are often used to represent data that iFor example, a jagged array could be used to represent a list of students, where each student has a different number of grades.
s naturally irregular. 

Jagged arrays can be declared and initialized in the same way as regular arrays. 
For example, the following code declares a jagged array of integers:

Code snippet
int[][] jaggedArray = new int[3][];
*/