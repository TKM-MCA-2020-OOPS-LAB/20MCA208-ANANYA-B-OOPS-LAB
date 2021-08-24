package myproject;
import java.util.*;

public class Mapinterface {
	 public static void main(String args[])
	    {
	       
	        Map<Integer, String> hm1 = new HashMap<>();
	  
	   //Inserting elements..   
	        hm1.put(1, "Arun");
	        hm1.put(2, "Bibin");
	        hm1.put(3, "Deepak");
	        System.out.println("Initial Map: "+ hm1);
	        
	        hm1.put( (2), "Abhishek");
	        hm1.put((4), "Hari");
	        //Updating..
	        System.out.println("Updated Map " + hm1);
	  
	        //Removing..
	        hm1.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing 4th entry, Final Map  is : "+hm1);
	    
	    }
}
