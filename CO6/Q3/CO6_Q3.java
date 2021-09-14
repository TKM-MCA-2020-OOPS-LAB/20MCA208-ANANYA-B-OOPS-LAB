
import java.io.*;  
import java.util.*;  
 public class CO6_Q3 {  
 public static void main(String arg[]) throws Exception {  
  Scanner sc = new Scanner(System.in);  
  System.out.print("Enter File Name 1 :");  
  String file1 = sc.next();  
  System.out.print("Enter File Name 2 :");  
  String file2 = sc.next();  
  sc.close();
  FileReader fin = new FileReader(file1);  
  FileWriter fout = new FileWriter(file2, true);  
  int c;  
  while ((c = fin.read()) != -1) {  
   fout.write(c);  
  }  
  System.out.println("Copy Of File_1 to File_2 Finished...."); 
  fin.close();  
  fout.close();  
 }  
}   