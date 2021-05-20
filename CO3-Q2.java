package myproject;

import java.util.Scanner;

public class Employees {
	 int Empid;
	 String name;
	int salary;
	 String address;
	 
	
	  	
   public Employees(int e,String n,int s,String a) {
    	Empid=e;
    	name=n;
    	salary=s;
    	address=a;
    	  
}
   
   



  static class Teacher extends Employees{
	 String dept;
	 String sub;
	
 public Teacher(int e,String n,int s,String a,String d,String su) {
	  super(e,n,s,a);
		dept=d;
		su=sub;
		
	}  
  
	
 public  void display()
	{
		System.out.println("********Employee Details********");
		System.out.println("Employee id: "+Empid);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);
		System.out.println("Department: "+dept);
		System.out.println("Subject: "+sub);
	}
	
 }

	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int N=sc.nextInt();
        Teacher T[] = new Teacher[N];
        int i;
   
        for(i=0;i<N;i++) 
		{   
        	
        	System.out.println("Enter the ID:");
		   int id= sc.nextInt();
		   System.out.println("Enter the name:");
		    String nam= sc.next();
		   System.out.println("Enter the salary:");
		    int sal= sc.nextInt();
		   System.out.println("Enter the address:");
		    String add= sc.next();
		   System.out.println("Enter the department:");
		   String det= sc.next();
		   System.out.println("Enter the subject:");
		   String sb= sc.next();
		   System.out.println("\n");
		   T[i]=new Teacher(id,nam,sal,add,det,sb);
		}
        
        System.out.println("***Employee Details***");
        for( i=0;i<N;i++)
            T[i].display();
		
		// TODO Auto-generated method stub

	}

	}
