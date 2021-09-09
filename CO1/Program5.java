package myproject;

public class Cpu {
	int price;
	
	Cpu(int p){
		this.price=p;
		}
	
    class Processor{
    	int cores;
    	String manufact;
    	
    	Processor(int c,String m){
    		this.cores=c;
    		this.manufact=m;
    	}
    	
    	void display() {
    		System.out.println("Number of Cores :"+this.cores);
    		System.out.println("Processor Manufactures : " + this.manufact);
    	}
    }
    
     static class Ram {
        int memory;
        String manufact;

        Ram(int n, String m) {
            this.memory = n;
            this.manufact = m;
        }

        void display() {
            System.out.println("Memory Size : " + this.memory);
            System.out.println("Memory Manufactures : " + this.manufact);
        }
    }
     void display() {
         System.out.println("Price of CPU : " + this.price);
     }
    
	public static void main(String[] args) {
		Cpu intel = new Cpu(35000);
        Cpu.Processor i_processor = intel.new Processor(4, "intel");
        Cpu.Ram i_ram = new Ram(6, "HP");
        intel.display();
        i_processor.display();
        i_ram.display();
		// TODO Auto-generated method stub

	}

}
