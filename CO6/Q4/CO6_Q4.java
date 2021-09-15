package myprojects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CO6_Q4 {

	public static void main(String args[]) throws IOException
	{ 
    FileInputStream fr = new FileInputStream("H:\\Sem-2\\OOPS-LAB\\COURSE OUTCOMES\\CO6\\Q4\\Integers.txt");
    FileOutputStream fw1 = new FileOutputStream("H:\\Sem-2\\OOPS-LAB\\COURSE OUTCOMES\\CO6\\Q4\\Even.txt");
    FileOutputStream fw2 = new FileOutputStream("H:\\Sem-2\\OOPS-LAB\\COURSE OUTCOMES\\CO6\\Q4\\Odd.txt");
    System.out.println("\nOdd Numbers & Even Numbers Are Copied To Separate Files......\n"); 
    int i;
    while((i=fr.read()) != -1) 
   	  
    {
     if(i%2==0)
     fw1.write(i);
     else
     fw2.write(i);
    }
    
    fr.close();
    fw1.close();
    fw2.close();
    
}
}

