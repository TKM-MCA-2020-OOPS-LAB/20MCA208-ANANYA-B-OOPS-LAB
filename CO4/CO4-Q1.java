package myproject.Graphics;

import java.util.Scanner;

	
interface geometry{
	void rectangle();
	void square();
	void circle();
	void triangle();
	
}
public class Shapes implements geometry{
Scanner sc = new Scanner(System.in);
	
	public void rectangle() {
		System.out.println("\nEnter the Length:");
		int l = sc.nextInt();
		
		System.out.println("\nEnter the Breadth:");
		int b = sc.nextInt();
		
		System.out.println("\nArea of the Rectangle:"+(l*b));
	}
	
	public void triangle() {
		System.out.println("\nEnter the Base:");
		int base = sc.nextInt();
		
		System.out.println("\nEnter the Height:");
		int height = sc.nextInt();
		
		System.out.println("\nArea of the Triangle:"+(0.5*base*height));
		
	}
	
	public void square() {
		System.out.println("\nEnter the Side:");
		int side = sc.nextInt();
		
		System.out.println("\nArea of the Square:"+(side*side));
		
	}
	
	public void circle() {
		System.out.println("\nEnter the Radius:");
		float r = sc.nextFloat();
		
		System.out.println("\nArea of the Circle:"+(Math.PI*r*r));
	}

}