package myproject;

import java.util.Scanner;

class publisher {
	String pname;
	int year;
	Scanner sc=new Scanner(System.in);
	
	publisher()
	{
		System.out.println("Enter publisher name");
		pname=sc.next();
		System.out.println("Enter the year of publication");
		year=sc.nextInt();
	}
}

class book extends publisher {
	String bname,author;
	int price;
	Scanner sc=new Scanner(System.in);
	
	book() {
		System.out.println("Enter Book name");
		bname=sc.next();
		System.out.println("Enter author");
		author=sc.next();
		System.out.println("Enter price");
		price=sc.nextInt();
	}
}

class literature extends book {
	int page;
	Scanner sc=new Scanner(System.in);
	
	literature() {
		System.out.println("Enter number of pages");
		page=sc.nextInt();
	}
	void display()
	{
		System.out.println("................LITERATURE BOOKS ARE..............");
		System.out.println("Publisher name is "+pname);
		System.out.println("Published year is "+year);
		System.out.println("Book name is "+bname);
		System.out.println("Autho name is "+author);
		System.out.println("Price is "+price);
		
	}
}

public class Fiction extends book {
	int page;
	Scanner sc=new Scanner(System.in);
	
	Fiction() {
		System.out.println("Enter number of pages");
		page=sc.nextInt();
	}
	void display()
	{
		System.out.println("................FICTION BOOKS ARE..............");
		System.out.println("Publisher name is "+pname);
		System.out.println("Published year is "+year);
		System.out.println("Book name is "+bname);
		System.out.println("Autho name is "+author);
		System.out.println("Price is "+price);
		
	}

	public static void main(String[] args) {
		
		int n,m,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of literatures books");
		n=sc.nextInt();
		literature l[]=new literature[n];
		for(int i=0;i<n;i++) {
			l[i]=new literature();
		}
		System.out.println("Enter number of fictions books");
		m=sc.nextInt();
		Fiction f[]=new Fiction[m];
		for(int i=0;i<m;i++) {
			f[i]=new Fiction();
		}
		System.out.println("Enter your Choice \n1:LITERATURE\n2:FICTION");
		c=sc.nextInt();
		if(c==1) {
			for(int i=0;i<n;i++) {
				l[i].display();
			}
		}
		else if(c==2) {
			for(int i=0;i<n;i++) {
				f[i].display();
		}
	}
		else
			System.out.println("Wrong choice");
	sc.close();
	}
}
	
	