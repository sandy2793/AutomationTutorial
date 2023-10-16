package at.day016;

public class FinalDemo {
	
	static final int ABC_DEF;
	static {
		ABC_DEF = 10;
	}
	
	

	public static void main(String[] args) {
		Honda h = new Honda();
//		h.run();
		System.out.println(h.PAN_CARD);
//		h.PAN_CARD = "AKDKL8758L";
		System.out.println(ABC_DEF);
		System.out.println(h.cube(10));
	}

}

class Bike {
	
	final String PAN_CARD;
	
//	Bike(String PAN_CARD) {
//		this.PAN_CARD = PAN_CARD;
//	}
	
	{
		PAN_CARD = "Agkd";
		System.out.println("Running....");
	}
	
	int cube(final int n) {
		return n*n*n;
	}
}

class Honda extends Bike {
	
//	Honda(String PAN_CARD) {
//		super(PAN_CARD);
//	}
	
//	void run() {
//		System.out.println("Running honda...");
//	}
	
}