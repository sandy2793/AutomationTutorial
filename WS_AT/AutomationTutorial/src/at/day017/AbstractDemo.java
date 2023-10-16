package at.day017;

public class AbstractDemo {

	public static void main(String[] args) {
//		Bike b = new Bike();
//		b.print();
//		b.run();
		Vehicle v = new Bike();
		v.run();
		Vehicle.print();
//		v.a = 15;
	}

}


abstract class Vehicle {
	abstract void run();
	static void print() {
		System.out.println("Vehicle class");
	}
	Vehicle() {
		System.out.println("Vehicle Constructor");
	}
	final int a = 10;
	String vehicleName;
}

class Bike extends Vehicle {
	
	void run() {
		System.out.println("Bike Running.....");
	}
}
