package at.day015;

public class OverridingDemo {

	public static void main(String[] args) {
		Bike b = new Bike();
//		b.run();
		b.bike();
//		
//		Vehicle v = new Vehicle();
//		v.run();
//		
//		Vehicle vb = new Bike();
//		vb.run();
//		
//		Vehicle.run();
//		Bike.run();
		
	}

}


class Vehicle {
	
	Vehicle() {
		System.out.println("Vehicle constructor");
	}
	
	
	String color = "white";
	
	void run() {
		System.out.println("Running.....");
	}
	
	
}

class Bike extends Vehicle {
	
//	Bike() {
//		super();
//		System.out.println("Bike constructor");
//	}
	
	String color = "red";
	
	void run() {
		System.out.println(super.color+" Bike Running......");
	}
	
	void bike() {
		super.run();
		System.out.println("Bike");
	}
	
}