//02 Command Line Argumant in Java 2023.05.20


class Command{
    public static void main(String args[]){
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}

/*
A command-line argument in Java is an argument that is passed at the time of running the Java program. 
The arguments passed from the console can be received in the Java program and used as input. 
The users can pass the arguments during execution by passing the command-line arguments inside the main() method1.

For example, if we run a Java Program by writing the command java Hello Geeks At GeeksForGeeks where the name of the class is Hello, then it will run up to Hello. 
It is a command up to Hello and after that i.e Geeks At GeeksForGeeks, these are command-line arguments1.
*/