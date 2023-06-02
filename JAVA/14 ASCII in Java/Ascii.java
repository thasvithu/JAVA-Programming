public class Ascii{
    public static void main(String args[]){
        /*
            65-90 A-Z
            97-122 a-z
            48-57 0-9
            Space 32
        */

        //print ASCII values using for loop
        for(int i=0; i<=255; i++){
            System.out.println(i + " : " + (char)i);
        }
    }
}

/*
ASCII stands for American Standard Code for Information Interchange. 
It is a 7-bit character set that contains 128 characters, each with a numerical value1. 
In Java, you can use the int data type to store and print the ASCII value of a character. 

For example:

char c = 'a';
int ascii = c; // or int ascii = (int) c;
System.out.println("The ASCII value of " + c + " is: " + ascii);

Output:
The ASCII value of a is: 97
*/