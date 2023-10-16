package at.day017;

public class InterfaceDemo implements Printable, Showable {
	
	public void print() {
		System.out.println("Print");
	}
	
	public void show() {
		System.out.println("Show");
	}
	
	@Override
	public void msg() {
		System.out.println("Inteface override");
	}
	
	public static void main(String[] args) {
		Vehicle2 v = new Bike2();
		System.out.println("Maximum Speed: "+v.maxSpeed);
		v.run();
//		v.maxSpeed = 80;
		
		Showable p = new InterfaceDemo();
		p.print();
		p.msg();
		System.out.println(Printable.cube(3));
		
	}

}

interface Printable {
	void print();
	default void msg() {
		System.out.println("Default messageS");
	}
	static int cube(int number) {
		return number*number*number;
	}
}

interface Showable extends Printable {
	void show();
}


interface Vehicle2 {
	default void maximumSpeed() {
		System.out.println("Maximum Speed: "+maxSpeed);
	}
	int maxSpeed = 60;
	void run();
}

class Bike2 implements Vehicle2 {
	
	public void run() {
		System.out.println("Bike Running....");
	}
	
	
}