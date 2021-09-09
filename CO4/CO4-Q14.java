package myproject;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EnqDqe {

	public static void main(String[] args) {
		 Deque<String> dq = new ArrayDeque<String>();

		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number Of elements ");
			int n=sc.nextInt();
			System.out.println("Enter Elements ");
			for(int i =0;i<n;i++)
			{
				String st=sc.next();
				dq.add(st);
		 
			}
			System.out.println("\nInitial Queue After Adding Elements: " + dq);
			System.out.println("\nAfter Removing All Elements using Poll() method..");
			
			
			for(int i =0;i<n;i++)
			{
				
				dq.pop();
		 
			}
			System.out.println("\nFinal Queue Is: " + dq);
		// TODO Auto-generated method stub

	}

}
