import java.util.Scanner;

public class group_switch {
    public static void main(String args[]){
        char c;
        System.out.print("Enter a character : ");
        Scanner scanner = new Scanner(System.in);

        c = scanner.next().charAt(0);

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a vowel");
                break;
            default:
                System.out.println(c + " is not a vowel");
                break;

        }
    }
}


/*

In Java, a group switch is a switch statement that has multiple cases that are grouped together.
This is done by separating the cases with a comma. 
For example, the following is a group switch statement:

switch (variable) {
  case 1, 2, 3:
    System.out.println("The value is 1, 2, or 3");
    break;
  case 4:
    System.out.println("The value is 4");
    break;
  default:
    System.out.println("The value is not 1, 2, 3, or 4");
    break;
}
*/