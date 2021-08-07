package myproject;
import java.util.*;

public class StackRemove {

	public static void main(String[] args) {

		
				Stack<String> stack1 = new Stack<String>();
				Scanner sc=new Scanner(System.in);
				 System.out.println("Enter Number Of items: ");
				 int num=sc.nextInt();
				 for(int i =0;i<num;i++)
				 {
					 System.out.println("Add item : ");
					 String str=sc.next();
					 stack1.add(str);
					 
				 }
				 System.out.println();

				System.out.println("Initial Stack: " + stack1);
				
				 System.out.println("Enter the position of items in stack to be removed: ");
				 int pos=sc.nextInt();
			
				String rem = stack1.remove(pos);

				System.out.println("\nRemoved element: "+ rem);

				
				System.out.println("\nFinal Stack: " + stack1);
		 
		// TODO Auto-generated method stub

	}

}
