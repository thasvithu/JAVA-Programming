// 2023.06.01

public class MultidimensionalArray{
    public static void main(String args[]){
        // tow dimension array in java
        int number[][] = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        }; // when you declare like this you can not give array size

        // accessing values
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(number[i][j] + "  ");
            }
            System.out.println();
        }

        // declaring  2D array
        int num[][] = new int[3][3];

        // initializing 2D array
        num[0] = new int[]{1, 2, 3};
        num[1] = new int[]{4, 5, 6};
        num[2] = new int[]{7, 8, 3};        
    }
}

/* 
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

*/