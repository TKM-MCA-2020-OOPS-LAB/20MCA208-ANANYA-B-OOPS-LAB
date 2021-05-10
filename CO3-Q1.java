package myproject;

import java.util.Scanner;

public class Shapes {
	int a1,a2;
	double a3;
	double a4;
	
	void area(int s){
		a1=s*s;
		System.out.println("Area of Square is:"+a1);
		
	}

	void area(int l, int b) {
		a2=l*b;
		
		System.out.println("Area of Rectangle is:"+a2);
		
	}
	
	void area(float x) {
		
		double pi = 3.14 ;
		a3=pi* x * x;
		System.out.println("Area of Circle is:"+a3);
		
	}
	
	void area(float b1,float h){
		a4=0.5 * b1 *h;
	System.out.println("Area of Triangle is:"+a4);
	}
	
	public static void main(String[] args) {
		
		Shapes obj =new Shapes();
		System.out.print("Enter the side of square : ");
		Scanner in = new Scanner(System.in);
		int s=in.nextInt();
		obj.area(s);
		
		System.out.print("\n ");
		
		System.out.print("Enter the length of rectangle : ");
		int l=in.nextInt();
		System.out.print("\n ");
		System.out.print("Enter the breadth of rectangle: ");
		int b=in.nextInt();
		obj.area(l, b);
		
		System.out.print("\n ");
		
		System.out.print("Enter the radius of circle : ");
		float x=in.nextFloat();
		obj.area(x);
		
		System.out.print("\n ");
		
		System.out.print("Enter the breadth of triangle : ");
		float b1 =in.nextFloat();
		System.out.print("\n ");
		System.out.print(" Enter the height of triangle : ");
		float h=in.nextFloat();
		obj.area(b1, h);
		
			
		
		// TODO Auto-generated method stub

	}

}
