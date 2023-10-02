package at.day012;

public class MethodDemo {
	
	int x = 23;
	
	public void print() {
		System.out.println("x = "+x);
	}
	
	public void printAddition(int a , int b) {
		System.out.println("Sum: "+a+b);
	}
	
	public int get() {
		return x;
	}
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	

	public static void main(String[] args) {
		
//		MethodDemo  md = new MethodDemo();
//		md.print();
//		int sum = md.addition(10, 20);
//		md.printAddition(10, 20);
//		System.out.println("x="+md.get());
//		
//		
//		
//		String line = "Hello";
//		
//		int length = line.length();
//		char c = line.charAt(3);
		
		Math m = new Math();
		System.out.println(m.additionN(10, 20, 25, 15, 45));
		
	}

}


class Math {
	
	public int factorial(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact *= i;
		}
		return fact;
	}
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int reminder(int a, int b) {
		return a%b;
	}
	
	public int additionN(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		return sum;
	}
	
	
}
