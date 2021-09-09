package myproject;

import java.util.Scanner;

public class Person {

	String Name;
	String Gender;
	String Address;
	int Age;
	
	public Person(String nam,String g,String add,int age) {
		Name=nam;
		Gender=g;
		Address=add;
		Age=age;
		
		
	}
	
	static class Employees extends Person{
		 int Empid;
		 String c_name;
		int salary;
		 String Qual;
		 
		
		  	
	   public Employees(String nam,String g,String add,int age,int e,String n,int s,String q) {
	
	   super(nam,g,add,age);
	    	Empid=e;
	    	c_name=n;
	    	salary=s;
	    	Qual=q;
	    	  
	}
	   
	   



	  static class Teacher extends Employees{
		 int t_id;
		  String dept;
		 String sub;
		
	 public Teacher(String nam,String g,String add,int age,int e,String n,int s,String q, int id,String d,String su) {
		  super(nam,g,add,age,e,n,s,q);
		  t_id=id;
			dept=d;
			sub=su;
			
		} 
	 
	   void Display()
		{
			System.out.println("********Person Details********");
			System.out.println("Person Name: "+Name);
			System.out.println("Gender: "+Gender);
			System.out.println(" Person Address: "+Address);
			System.out.println("Person's Age : "+Age);
			System.out.println("Employee id: "+Empid);
			System.out.println(" Company Name: "+c_name);
			System.out.println("Salary: "+salary);
			System.out.println("Qualification: "+Qual);
			System.out.println("Teacher id: "+t_id);
			System.out.println("Department: "+dept);
			System.out.println("Subject: "+sub);
		}
	  }
	
	  
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of Person: ");
		int N=sc.nextInt();
        Teacher []t=new Teacher[N];
        int i;
   
        for(i=0;i<N;i++) 
		{   
        	
        	System.out.println("Enter the Person Name:");
 		   String nam= sc.next();
 		   System.out.println("Enter the Gender:");
 		    String gen = sc.next();
 		   System.out.println("Enter the Address:");
 		    String a= sc.next();
 		   System.out.println("Enter the age:");
 		    int age= sc.nextInt();
        	System.out.println("Enter the Employee ID:");
		   int id= sc.nextInt();
		   System.out.println("Enter the Company name:");
		    String na= sc.next();
		   System.out.println("Enter the salary:");
		    int sal= sc.nextInt();
		   System.out.println("Enter the Qualification:");
		    String qu= sc.next();
		    System.out.println("Enter the Teacher id:");
		    int tid= sc.nextInt();
		   System.out.println("Enter the department:");
		   String det= sc.next();
		   System.out.println("Enter the subject:");
		   String sb= sc.next();
		   System.out.println("\n");
		   
		   t[i]=new Teacher(nam,gen,a,age,id,na,sal,qu,tid,det,sb);
		}
        
        for( i=0;i<N;i++)
            t[i].Display();
		
		// TODO Auto-generated method stub

	}

}
	
}

