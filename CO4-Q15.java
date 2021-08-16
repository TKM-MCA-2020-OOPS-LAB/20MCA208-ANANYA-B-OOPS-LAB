package myproject;
import java.util.*;
public class LkdHash_Sets {

	public static void main(String[] args) {
		LinkedHashSet<String> l_hashset =  new LinkedHashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Vowels : ");
		int n=sc.nextInt();
		System.out.println("\nEnter Vowel: ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			l_hashset.add(st);
	 
		}
		System.out.println("\nOriginal LinkedHashSet:" + l_hashset);  
		 System.out.println("\nRemoving 'O' from LinkedHashSet: " + l_hashset.remove("O"));
		 System.out.println("\nSize Of LinkedHashSet: " + l_hashset.size());
		 System.out.println("\nChecking if 'A' is present=" + l_hashset.contains("A"));
		 System.out.println("\nAfter Performing Operations, Final LinkedHashSet: " + l_hashset);
		 
		 System.out.println("\nAfter Iterating.. ");
	        for (String s : l_hashset)
	            System.out.print(s + ", ");
	        System.out.println();
	        
		 
		// TODO Auto-generated method stub

	}

}
