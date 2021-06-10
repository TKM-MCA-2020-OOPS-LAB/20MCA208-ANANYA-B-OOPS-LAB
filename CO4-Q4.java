package myproject;
import java.util.Scanner;
class NegativeinputException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeinputException(String s){
		super(s);
	}

}
public class AverageException {

	public static void main(String[] args) {
		
	       int sum = 0,i;
	       float average;
	       Scanner sc=new Scanner(System.in);
	      System.out.println("Enter how many numbers to calulate  average:");
	      int n=sc.nextInt();
	      int[] numbers = new int[n];
	      System.out.println("Enter   "+n+"  Numbers");
	      for( i=0;i<numbers.length;i++)
			   numbers[i]=sc.nextInt();
	      sc.close();
	       for( i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       
	       average = sum / numbers.length;
	        
	        for( i=0; i < numbers.length ; i++) {
				try 
				{
					
					if(numbers[i] < 0)
					{
					    throw new NegativeinputException("Numbers must be Positive!!!!!!!");
					  
					}
				
				
					
				}
				
				catch (NegativeinputException e) 
				{

					System.out.println("Exception Occurred. . "+e);
				
				}		
				
	        }System.out.println("Average value of the array elements is : " + average);
   }
}