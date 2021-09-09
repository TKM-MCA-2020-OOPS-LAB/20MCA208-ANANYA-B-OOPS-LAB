package myproject;

import java.util.Scanner;

class thread1 implements Runnable{
	
	
	public void run() {
		System.out.println("\n....Fibonacci Series of limit 20....");
		int n =20;
		int n1=0,n2=1,n3,i;
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<n;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } System.out.println("\n");      
	}
	
	
	
}
 class thread2 implements Runnable{
	
	public void run() {
		
		System.out.println("\n....Even numbers...."); 
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n Please Enter any Number : ");
		number = sc.nextInt();	
		System.out.print("List of even numbers from 1 to "+number+": ");  
		for (int i=1; i<=number; i++)   
		{  
		
		if (i%2==0)   
		{  
		System.out.print(i + " ");  
		}  
		}  
		
	}
	
}
public class Multithread2 {

	public static void main(String[] args)throws InterruptedException {
				 thread1 d1 = new thread1();
		Thread a = new Thread(d1);
		thread2 d2 = new thread2();
		Thread b = new Thread(d2);
		System.out.println("......Multithreading Using Runnable Interface.......");
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);
		
		// TODO Auto-generated method stub

	}

}
