package myproject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface calbill{
	 void calculate();
}


class id1 implements calbill{
	int id=101,quantity=2,unitprice=25,total1;
	String n="A";
	@Override
	public void calculate() {
		total1 = quantity * unitprice;
		
		// TODO Auto-generated method stub
		
	}
	
}

class id2 extends id1 implements calbill{
	int pid=102,qty=1,upr=100,total2;
	String name="B";
	DateFormat df=new SimpleDateFormat("dd/MM/yy");
	Date d= new Date();
	public void calculate() {
		super.calculate();
		total2 =qty*upr;
	}
	public void display()
	{
		System.out.println("Order No.5765\n");
		System.out.println("Date: "+df.format(d));
		System.out.println("\nProduct Id\t\tName\t\t\tQuantity
\t\t\tunit price\t\t\tTotal");
		System.out.println(".................................
....................................
..............................................");
		System.out.println(id+"\t\t\t"+n+"\t\t\t"+quantity+
"\t\t\t\t"+unitprice+"\t\t\t\t"+total1);
		System.out.println(pid+"\t\t\t"+name+"\t\t\t"+qty+
"\t\t\t\t"+upr+"\t\t\t\t"+total2);
		System.out.println(".......................
...................................................
.........................................");
		System.out.println("\t\t\t\t\t\t\t\t\tNet.
 Amount"+"\t\t\t\t"+(total1+total2));
		
	}
	
}
public class Bill {

	public static void main(String[] args) {
		id1 obj=new id1();
		id2 obj1=new id2();
		obj.calculate();
		obj1.calculate();
		obj1.display();
		// TODO Auto-generated method stub

	}

}
