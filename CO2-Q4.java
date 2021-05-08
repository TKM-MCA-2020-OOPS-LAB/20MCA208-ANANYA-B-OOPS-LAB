package myproject;

import java.util.Scanner;

public class Employee {
	int eNO;
	String eName;
	int eSalary;
	
	 
	 public void GetEmployeeData()
	 
     {
		 
	     
		 Scanner in = new Scanner(System.in);
		 
	     System.out.println("Enter Employee id:"); 
	     eNO=in.nextInt();
		
	     System.out.println("Enter name of Employee:"); 
		 eName=in.next();
		 
		 System.out.println("Enter salary of Employee:"); 
		 eSalary=in.nextInt();
		 System.out.println("\n"); 
		 
     }

	 void display() {
		 System.out.println("Employee id = " + eNO);
		  System.out.println("Employee name = " + eName);
		  System.out.println("Employee salary = " + eSalary);
		  System.out.println("\n"); 
		  
	 }
	
	
	public static void main(String[] args) {
		int num;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter No of employees :"); 
	     num=sc.nextInt();
	     System.out.println("\n"); 
		Employee e[]= new Employee[num];
		
		for(int i=0;i<num;i++) {
			e[i]= new Employee();
			e[i].GetEmployeeData();
			
		}
		System.out.println("Details of Employees\n");
		for(int i =0;i<num;i++) {
		e[i].display();
		}
		
		
		
		// TODO Auto-generated method stub

	}
