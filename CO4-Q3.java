package myproject;
import java.util.Scanner;
class AuException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AuException(String s){
		super(s);
	}

}


public class Authentication {

	public static void main(String[] args) {
		String username, password;
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Username and Password. . ");
        System.out.print("\nENTER USERNAME:");
        username = sc.nextLine();
        System.out.print("ENTER PASSWORD:");
        password = sc.nextLine();
              
        sc.close();
        try
        {
           Authenticate(username,password);
		    }catch(Exception e)
		      {
			       System.out.println("Exception Occurred. . "+e);
		      }
	// TODO Auto-generated method stub

}

public static void Authenticate(String uname, String pwd) throws AuException{
	
	 if((uname=="") || (pwd=="")) {
		 throw new AuException("Fields cannot be empty!!!");
	 }
	 else if (uname.length()<6) {
		 throw new AuException("Username must be atmost 6 characters!");
	 }
	 else if (pwd.length()<8) {
		 throw new AuException("Please enter a strong password");
	 }
	 else {
		 System.out.print("\nYou are successfully registered!!");
		 System.out.println("Authentication Successful!!!");
	 
		 System.exit(0);
	 }
		// TODO Auto-generated method stub

	}

}