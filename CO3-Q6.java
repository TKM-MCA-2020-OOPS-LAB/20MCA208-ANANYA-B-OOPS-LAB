package myproject;

import java.util.Scanner;

interface geometry{
	void input();
	void area();
	void perimeter();
}

class Circle implements geometry{
	double A,R,P;
	
	
	@Override
	public void area() {
		 
		A=3.14 * R *R;
		System.out.println("Area of Circle:"+A);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perimeter() {
		
		P=2*3.14*R;
		System.out.println("Perimeter of Circle:"+P);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		 System.out.println(" Enter Radius:");
	        R =sc.nextDouble();
		
		// TODO Auto-generated method stub
		
	}
	
}

class Rectangle extends Circle{
	int L,B,a,p;
	Scanner sc=new Scanner(System.in);
	
	public void input() {
		super.input();
		System.out.println("Enter length of Rectangle:");
	       L =sc.nextInt();
	      System.out.println("Enter Breadth of Rectangle:");
	       B=sc.nextInt();
	}
	
	public void area() {
		super.area();
		a=L*B;
		System.out.println("Area of Rectangle:"+a);
		
	}
public void perimeter() {
		super.perimeter();
		p=2*(L+B);
		System.out.println("Perimeter of Rectangle:"+p);
		
		
	}
}

public class ShapesA_P {
    int choice;
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		Rectangle obj=new Rectangle();
		System.out.println("***Area and Perimeter****");
		
		while(true) {
			System.out.println("\n **MENU** \n 1.Take all inputs \n 2.Find Area of Shapes \n 3.Find perimeter of Shapes\n 4. Exit \n");
			System.out.println("Enter your Choice\n");
			 choice =sc.nextInt();
			 
             System.out.println("");
             
		 switch (choice)
		{
		
		   case 1:obj.input();
			      
		   break;
			    
		   case 2:obj.area();
		   break;
		   
		   case 3:obj.perimeter();
		   break;
		   case 4:return;
		   default:System.out.println("Wrong Choice....");
		}		
		
		}
		// TODO Auto-generated method stub

	}

}
