package myprojects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CO6_Q2 {
	 public static void main(String[] args) {

	  try {
          FileWriter writer = new FileWriter("H:\\Sem-2\\OOPS-LAB\\javafiles\\fileslist\\Sample.txt",true);
          writer.write("Sample file is Created...\n");
          writer.close();
          FileReader reader = new FileReader("H:\\Sem-2\\OOPS-LAB\\javafiles\\fileslist\\Sample.txt");
          BufferedReader br= new BufferedReader(reader);
          String line;
          System.out.println("\n Data Read From The Sample File \n");
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          reader.close();

      } catch (IOException e) {
          System.out.println("\n Error Occured...");
      }

  }


}
