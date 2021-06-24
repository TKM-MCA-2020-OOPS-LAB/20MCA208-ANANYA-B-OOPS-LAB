package myproject;
import java.util.ArrayList;
import java.util.Collections;
public class Mainclass {

	public static void main(String[] args) {
		ArrayList<String> F = new ArrayList<String>();
	    F.add("Rose");
	    F.add("Lilly");
	    F.add("Hibiscus");
	    F.add("Jasmine");
	    System.out.println("Original items in arraylist are:\n");
	    for(String flowers:F) {
	    	System.out.println(flowers);
	    	    }
			
		
		System.out.println("\nThe item at index 3 is: "+F.get(3));
		F.set(3,"Blossom");
		System.out.println("\nThe item at index 3 after altering is: "+F.get(3));
		  System.out.println("\nAfter altering.. items in arraylist are:\n");
		    for(String flowers:F) {
		    	System.out.println(flowers);
		    	    }
		
		System.out.println("\n....Sorting.....");
		Collections.sort(F);
		System.out.println("\nAfter sorting.. items in arraylist are:\n");
	    for(String flowers:F) {
	    	System.out.println(flowers);
	    	    }
		
		System.out.println("\n..... Removing element at 1.....");
		F.remove(1);
		System.out.println("\nAfter removing.. items in arraylist are:\n");
	    for(String flowers:F) {
	    	System.out.println(flowers);
	    	    }
		
		System.out.println("\nSize of arraylist is:"+F.size());
		
		System.out.println("\n...........Clearing all elements.......");
		System.out.println("\nAfter clearing.. items in arraylist are:");
		F.clear();
		System.out.println(F);
		// TODO Auto-generated method stub

	}

}
