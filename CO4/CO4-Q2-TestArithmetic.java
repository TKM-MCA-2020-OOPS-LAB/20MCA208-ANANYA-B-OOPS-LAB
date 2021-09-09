package myproject;
import mypackage.Arithmetic.Operations;

public class TestArithmetic {
public static void main(String[] args) {
		
		Operations o = new Operations();
		
		System.out.println("***** ARITHMETIC OPERATIONS*****");
    	System.out.println("ADDITION:");
    	o.addition();
    	
    	System.out.println("SUBTRACTION:");
    	o.subtraction();
    	
    	System.out.println("MULTIPLICATION:");
    	o.multiplication();
    	
    	System.out.println(" DIVISION:");
    	o.division();
 }
}
