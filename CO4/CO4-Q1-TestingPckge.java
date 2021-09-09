package myproject;
import 	myproject.Graphics.Shapes;

public class TestingPckge {

	public static void main(String[] args) {
		
		Shapes S = new Shapes();
		System.out.println("***** AREA OF  FIGURES*****");
    	System.out.println("\n AREA  OF RECTANGLE:");
    	S.rectangle();
    	
    	System.out.println("\n AREA OF TRIANGLE:");
    	S.triangle();
    	
    	System.out.println("\n AREA OF SQUARE:");
    	S.square();
    	
    	System.out.println("\n AREA OF CIRCLE:");
    	S.circle();
      
		// TODO Auto-generated method stub

	}

}
