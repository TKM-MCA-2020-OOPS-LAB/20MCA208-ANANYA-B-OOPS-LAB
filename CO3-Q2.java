package myproject;

import java.util.Scanner;

 class Employees {
	 int Empid;
	 String name;
	int salary;
	 String address;
	 
	
	  	
    Employees(int e,String n,int s,String a) {
    	Empid=e;
    	name=n;
    	salary=s;
    	address=a;
    	  
}
   
   

}

 class Teacher extends Employees{
	 String dept;
	 String sub;
	
  Teacher(int e,String n,int s,String a,String d,String su) {
	  super(e,n,s,a);
		dept=d;
		su=sub;
		
	}
  void input() {
	  Scanner ip =new Scanner(System.in);
	  System.out.println("Enter Employee id: ");
     Empid=ip.nextInt();
		System.out.println("Enter Employee Name: ");
  		name=ip.next();
  		System.out.println("Enter Salary: ");
  		salary=ip.nextInt();
  		System.out.println("Enter Address: ");
  		address=ip.next();
  		System.out.println("Enter department: ");
  		dept=ip.next();
  		System.out.println("Enter Subject: ");
  	    sub=ip.next();
  		ip.close();
						
		
		}
	  
  
	
   void display()
	{
		System.out.println("********Employee Details********");
		System.out.println("Employee id: "+Empid);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Address: "+address);
		System.out.println("Department: "+dept);
		System.out.println("Subject: "+sub);
	}
	


	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int N=in.nextInt();
        Teacher T[] = new Teacher[N];
        in.close();
		
        int i;
        for(i=0;i<N;i++) 
		{   T[i].input();
			T[i].display();
		}
        
	
		
		// TODO Auto-generated method stub

	}

	}

