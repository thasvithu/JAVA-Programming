public class Logical{
    public static void main(String args[]){
        int mark1 = 10, mark2 = 55;

        System.out.println("And && : " + (mark1 >= 35 && mark2 >= 35));
        System.out.println("Or ||  : " + (mark1 >= 85 || mark2 >= 35));
    }
}

/*
Logical operators are used to determine the logic between variables or values:

 Operator	Name	        Description	                                                Example
    && 	    Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10	
    || 	    Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4	
    !	    Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
*/