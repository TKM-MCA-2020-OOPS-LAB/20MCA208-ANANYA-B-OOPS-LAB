package myproject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;  


public class LinkedlistEx {
	public static void main(String[] args) {  
		 LinkedList<String> ll=new LinkedList<String>();  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number Of Books: ");
		 int num=sc.nextInt();
		 for(int i =0;i<num;i++)
		 {
			 System.out.println("Add Book Name : ");
			 String str=sc.next();
			 ll.add(str);
			 
		 }
		 System.out.println();
		  System.out.println("\nInitial List of Books: \n");  
		  Iterator<String> itr=ll.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		   ll.clear();
		   System.out.println("\nAfter Removing All Books From The Above List.. "+ll);
    }  
}  

