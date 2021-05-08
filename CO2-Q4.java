package myproject;

import java.util.Scanner;

public class Employee {
	int eNO;
	String eName;
	int eSalary;
	
	 
	 public void GetEmployeeData()
	 
     {
		 
	     
		 Scanner in = new Scanner(System.in);
		 
	     System.out.print("Enter Employee id:"); 
	     eNO=in.nextInt();
		
	     System.out.print("Enter name of Employee:"); 
		 eName=in.next();
		 
		 System.out.print("Enter salary of Employee:"); 
		 eSalary=in.nextInt();
		 System.out.println("\n"); 
		 
		 
		 
     }

	 void display() {
		 System.out.println("Employee id =  " + eNO);
		  System.out.println("Employee name = " + eName);
		  System.out.println("Employee salary = " + eSalary);
		  System.out.println("\n"); 
		  
	 }

	
	public static void main(String[] args) {
		int num;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("Enter No of employees :"); 
	     num=sc.nextInt(); 
		Employee e[]= new Employee[num];
		
		for( int i=0;i<num;i++) {
			e[i]= new Employee();
			e[i].GetEmployeeData();
			
		}
		System.out.println("****Details of Employees****");
		for(int i =0;i<num;i++) {
		e[i].display();
		}

		
		 System.out.print("Enter the Employee ID to search :");
			int id = sc.nextInt();
			int i;
			for(i =0;i<num;i++)
			{
				if(id == e[i].eNO)
				{
					e[i].display();
				}
			}
			if(i == 0)
			{
				System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
			} 
			sc.close();
		
	// TODO Auto-generated method stub
	}

}
