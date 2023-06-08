// 2023.06.08

public class MathFunctions{
    public static void main(String args[]){
        // Built-in Math Function in Java
        System.out.println("Absolute value : " + Math.abs(-45)); // eturns the absolute (positive) value of -45:
        System.out.println("Round value : " + Math.round(2.554)); 
        System.out.println("Ceil value : " + Math.ceil(2.554));
        System.out.println("Floor value : " + Math.floor(2.554));

        int a = 2, 
            b = 3;
        System.out.println("Maximum number of a and b is : " + Math.max(a, b));
        System.out.println("Minimum number of a and b is : " + Math.min(a, b));
        System.out.println("Square root of b is : " + Math.sqrt(b));
        System.out.println("Power of a and b is : " + Math.pow(a, b));
    }
}