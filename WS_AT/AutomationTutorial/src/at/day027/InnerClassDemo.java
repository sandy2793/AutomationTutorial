package at.day027;

public class InnerClassDemo {
	static int a = 10;
	
	class InnerClass {
		
		public void printA() {
			print(a);
		}
		
	}
	
	static class InnerClass2 {
		public void printA() {
			print(a);
		}
	}
	
	public void something() {
		class InnerClass3 {
			public void printA() {
				print(a);
			}
			
		}
		
		InnerClass3 in = new InnerClass3();
		in.printA();
		
		
	}
	
	public static void print(int b) {
		System.out.println(b);
	}
	
	public void doSomething() {
		InnerClass2 in = new InnerClass2();
		in.printA();
		
	}
	
	

	public static void main(String[] args) {
		
//		InnerClassDemo in = new InnerClassDemo();
//		in.doSomething();

//		in.something();

//		InnerClass2 in2 = new InnerClass2();
//		in2.printA();
		
		some2 reference = new some2() {
			public void printA() {
				print(a);
			}
			
		};
		reference.printA();
		
		
	}

}

abstract class some {
	abstract void printA();
}

interface some2 {
	void printA();
}
