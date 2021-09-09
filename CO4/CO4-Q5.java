package myproject;

import java.util.Scanner;

class demo1 extends Thread{
	
	public void run() {
		System.out.println("....THREAD 1....");
		System.out.println("\n....Multiplication Table of 5....\n");
		int num =5;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d \n" , num, i , num *i);
		}
	}
	
}
class demo2 extends Thread{
	
	public void run() {
		System.out.println("\n....THREAD 2.....\n");
		System.out.println("\n....N Prime Numbers....\n");
		int n;
	      int status = 1;
	      int num = 3;
	    
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of n:");
	      
	      n = sc.nextInt();
	      if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	      
	         System.out.println(2);
	      }

	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
		}sc.close();
	}
	
}


public class Multithreading1 {

	public static void main(String[] args)throws InterruptedException {
		
		demo1 d1 = new demo1();
		
		d1.start();
		d1.sleep(200);
		demo2 d2 = new demo2();
		d2.start();
		d2.sleep(200);
	
		// TODO Auto-generated method stub

	}

}
