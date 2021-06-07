package mypackage.Arithmetic;
import java.util.Scanner;


interface arithoperations{
	void addition();
	void subtraction();
	void multiplication();
	void division();
	
}
public class Operations implements arithoperations {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addition() {
		System.out.println("\nEnter the first num:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second num:");
		int b = sc.nextInt();
		
		System.out.println("Sum is :"+(a+b));
		
				
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraction() {
		
		System.out.println("\nEnter the first num:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second num:");
		int b = sc.nextInt();
		
		System.out.println("Difference is :"+(a-b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication() {
		System.out.println("\nEnter the first num:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second num:");
		int b = sc.nextInt();
		
		System.out.println(" Product is :"+(a*b));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		System.out.println("\nEnter the first num:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second num:");
		int b = sc.nextInt();
		
		System.out.println("Quotient  is :"+(a/b));
		// TODO Auto-generated method stub
		
	}

	