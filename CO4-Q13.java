package myproject;
import java.util.*;


public class PQueue {

	public static void main(String[] args) {
		 PriorityQueue<String> PQ = new PriorityQueue<>();
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number Of elements ");
			int n=sc.nextInt();
			System.out.println("Enter Elements ");
			for(int i =0;i<n;i++)
			{
				String st=sc.next();
				PQ.add(st);
		 
			}
			System.out.println("Initial PriorityQueue " + PQ);
			System.out.println("\nAfter Peek Method:"+PQ.peek());
	        System.out.println("\nAfter Poll Method: "+ PQ.poll());
	        Iterator iterator = PQ.iterator();
	        System.out.println("\nFinal PriorityQueue");
	        while (iterator.hasNext()) {
	        	System.out.print(iterator.next() + " ");
	        }
		// TODO Auto-generated method stub

	}

}
