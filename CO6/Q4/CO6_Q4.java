package myproject;
import java.io.*;

public class OddEvenfiles
{
 public static void main(String args[]) throws IOException
	{ 
    FileInputStream fr = new FileInputStream("Integers.txt");
    FileOutputStream fw1 = new FileOutputStream("Even.txt");
    FileOutputStream fw2 = new FileOutputStream("Odd.txt");
    System.out.println("Odd numbers and Even numbers are copied to separate files"); 
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
