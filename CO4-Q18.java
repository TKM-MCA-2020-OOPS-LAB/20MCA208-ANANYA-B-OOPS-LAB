package myproject;
import java.util.HashMap;
import java.util.TreeMap;
public class Convert_To_TreeMap {

	public static void main(String[] args) {
		 HashMap<Integer, String> hMap = new HashMap<Integer, String>();
   	  hMap.put( 76, "Student1" );
         hMap.put( 57, "Student2" );
         hMap.put( 88, "Student3" );
         hMap.put( 65, "Student4");
         hMap.put( 46, "Student5");
         System.out.println("HashMap Keys and Values: "+hMap);
         System.out.println("\n");
         TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(hMap);
         System.out.println("TreeMap Keys and Values: " +tMap);
		// TODO Auto-generated method stub

	}

}
