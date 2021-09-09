package myproject;

import java.util.Scanner;

interface Academics{
	void input_details();
	void display_details();

}

class Student implements Academics{
	
	String Sname,Course;
	int Std_id;
	Scanner sc= new Scanner(System.in);
	public void input_details() {
		
		
		System.out.println("Enter Student name:");
		Sname=sc.next();
		System.out.println("Enter Student id:");
		Std_id=sc.nextInt();
		System.out.println("Enter Student Course Name:");
		Course=sc.next();
		
		
	}
	
	@Override
	public void display_details() {
		
		System.out.println(" Student name:"+Sname);
		System.out.println(" Student id:"+Std_id);
		System.out.println(" Student Course Name:"+Course);
		
		
	}
	
}

class Sports extends Student
{
	String sp_name,level;
		Scanner in=new Scanner(System.in);
	


	public void input_details() {
		
		super.input_details();
		
		System.out.println("Enter Sports Name the Student was in(Football/Cricket)");
		sp_name=in.next();
		System.out.println("Enter Student Participated Level:");
		level=in.next();
		
		
		
	}

	@Override
	public void display_details() {
		super.display_details();
		System.out.println(" Sports Name the Student was in(Football/Cricket):"+sp_name);
		System.out.println(" Student Participated Level:"+level);
		
		
	}


	
	
		public void tsum() {
	
		Scanner s=new Scanner(System.in);
		int sum;
		int m1,m2,m3,m4,m5;
		System.out.println("Enter Subject 1 Mark:");
		m1=s.nextInt();
		System.out.println("Enter Subject 2 Mark:");
		m2=s.nextInt();
		System.out.println("Enter Subject 3 Mark:");
		m3=s.nextInt();
		System.out.println("Enter Subject 4 Mark:");
		m4=s.nextInt();
		System.out.println("Enter Subject 5 Mark:");
		m5=s.nextInt();
		//Display
		System.out.println(" Subject 1 Mark:"+m1);
		System.out.println(" Subject 2 Mark:"+m2);
		System.out.println(" Subject 3 Mark:"+m3);
		System.out.println(" Subject 4 Mark:"+m4);
		System.out.println(" Subject 5 Mark:"+m5);
		sum=m1+m2+m3+m4+m5;   //sum of subjects marks
		
		
		
		
		int sp_m1,sp_m2,sp_m3,Score;  //input
		System.out.println("Enter District Level Grace Mark:");
		sp_m1=s.nextInt();
		System.out.println("Enter State Level Grace Mark:");
		sp_m2=s.nextInt();
		System.out.println("Enter Indian Level Grace Mark:");
		sp_m3=s.nextInt();
		
		//Display
		super.display_details();
		System.out.println(" Total Subjects Marks:"+sum);
		Score=sp_m1+sp_m2+sp_m3;
		System.out.println(" Total Grace Mark Obtained is :"+Score);
		
		int TotalMarks=sum+Score;
		System.out.println(" Total Marks Obtained in Students Academics :"+TotalMarks);
		s.close();
		
	}
	
}
public class Result {

	public static void main(String[] args) {
		
	Sports obj=new Sports();
	obj.input_details();
	obj.display_details();
	obj.tsum();
		// TODO Auto-generated method stub

	}

}
