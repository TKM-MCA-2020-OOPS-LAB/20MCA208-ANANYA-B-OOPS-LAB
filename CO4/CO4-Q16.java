package myproject;
import java.util.*;

public class CompHashSet {

	public static void main(String[] args) {
		Set<String> h1 = new HashSet<String>();
		Set<String> h2 = new HashSet<String>();
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements in h1: ");
		int n=sc.nextInt();
		System.out.println("\nEnter Elements of h1: ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			h1.add(st);
	 
		}
		
		System.out.println("\nEnter Number Of elements in h2: ");
		int n1=sc.nextInt();
		System.out.println("\nEnter Elements of h1: ");
		for(int i =0;i<n1;i++)
		{
			String st=sc.next();
			h2.add(st);
	 
		}
		System.out.println("\nHash Set 1: " + h1);
		System.out.println("\nHash Set 2: " + h2);
		
		 Set<String> union = new HashSet<String>(h1);
	        union.addAll(h2);
	        System.out.print("\nUnion of the two Set");
	        System.out.println(union);
	  
	        // To find intersection
	        Set<String> intersection = new HashSet<String>(h1);
	        intersection.retainAll(h2);
	        System.out.print("\nIntersection of the two Set");
	        System.out.println(intersection);
	  
	        // To find the symmetric difference
	        Set<String> difference = new HashSet<String>(h1);
	        difference.removeAll(h2);
	        System.out.print("\nDifference of the two Set");
	        System.out.println(difference);	
		// TODO Auto-generated method stub

	}

}
