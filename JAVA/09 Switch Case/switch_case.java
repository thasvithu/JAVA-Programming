// Java Switch Statements 2023.05.31

import java.util.Scanner;

public class switch_case{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Grade to find Grade point value : ");
        char mark = scanner.next().charAt(0);

        switch(mark){
            case 'A':
                System.out.println("Grade point value : 4");
                break;
            case 'B':
                System.out.println("Grade point value : 3.7");
                break;
            case 'C':
                System.out.println("Grade point value : 3.3");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

}

/*
explanation about Java switch statements:

Imagine you are a teacher and you want to give your students a test. You have a list of questions, and you want to give each student a different question based on their grade level. You could write a long if-else statement to do this, but there is a better way. You can use a switch statement!

A switch statement is a way to execute different blocks of code based on the value of a variable. In this case, the variable is the student's grade level. Here is an example of how you would use a switch statement to give your students a test:

switch (student.gradeLevel) {
  case 1:
    question = "What is your name?";
    break;
  case 2:
    question = "What is your favorite color?";
    break;
  case 3:
    question = "What is your favorite animal?";
    break;
  default:
    question = "I don't know your grade level.";
    break;
}

This code will first check the value of the student.gradeLevel variable. If the value is 1, the question variable will be set to "What is your name?". If the value is 2, the question variable will be set to "What is your favorite color?". 
And so on. If the value of the student.gradeLevel variable is not one of the values listed in the switch statement, the question variable will be set to "I don't know your grade level.".

Switch statements are a great way to make your code more concise and easier to read. 
They can also help you to avoid writing long, complex if-else statements. 
So next time you need to execute different blocks of code based on the value of a variable, try using a switch statement!

*/