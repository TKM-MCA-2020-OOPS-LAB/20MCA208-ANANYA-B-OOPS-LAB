package myproject;


class demo extends Thread{
	
	public void run() {
		System.out.println("\n>>>>>>>>>>>>HELLO WORLD<<<<<<<<<<<<<<<<\n");
	}
	
}
public class Testthread {

	public static void main(String args[]) throws InterruptedException {
		demo d = new demo();
		d.start();
		System.out.println("getstate1: "+d.getState());
		System.out.println("getstate2: "+d.getState());
		System.out.println("getstate3: "+d.getState());
		System.out.println("getstate4: "+d.getState());
		System.out.println("thread Name: "+d.getName());
		System.out.println("thread Priority: "+d.getPriority());
		System.out.println("getstate5: "+d.getState());
		d.sleep(100);
		
	}
}
