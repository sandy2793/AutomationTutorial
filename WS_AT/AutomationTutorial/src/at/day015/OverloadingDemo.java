package at.day015;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Math m = new Math();
		
		System.out.println(m.addition(10, 20));
		System.out.println(m.addition(10.1, 20.9));
		
	}

}

class Math {
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	public double addition(double a, double b) {
		return a+b;
	}
	
//	public double addition(int a, int b) {
//		return a+b;
//	}
	
	
	
}
