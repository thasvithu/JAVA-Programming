//Java Operators    2023.05.29 

public class Assignment{
    public static void main(String args[]){
        int a = 15;
        System.out.println(a);
        a += 10;
        System.out.println(a);
        a -= 10;    // a = a - 10
        System.out.println(a);
        a *= 10; 
        System.out.println(a);
        a /= 10;  
        System.out.println(a);
        a %= 10;  
        System.out.println(a);
        a &= 10;  
        System.out.println(a);
        a |= 5;  
        System.out.println(a);
        a ^= 20;  
        System.out.println(a);
        a >>= 8;  
        System.out.println(a);
        a <<= 6;  
        System.out.println(a);
    }  
}



/*

Assignment operators are used to assign values to variables.

Operator	 Example	Same As
    =	      x = 5	    x = 5	
    +=	x     += 3	    x = x + 3	
    -=	x     -= 3	    x = x - 3	
    *=	x     *= 3	    x = x * 3	
    /=	x     /= 3	    x = x / 3	
    %=	x     %= 3	    x = x % 3	
    &=	x     &= 3	    x = x & 3	
    |=	x     |= 3	    x = x | 3	
    ^=	x     ^= 3	    x = x ^ 3	
    >>=	x     >>= 3	    x = x >> 3	
    <<=	x     <<= 3	    x = x << 3

*/