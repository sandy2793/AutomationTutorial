package at.day013;

public class Variables {
	
	private Variables() {
		
	}
	
	public static char character = 'c';
	
	int a = 10;
	private static int b = 20;
	protected int c = 30;
	public int d = 40;
	
	
	public static void print() {
		System.out.println(b);
	}
	
	void printI() {
		System.out.println(a);
	}
	
	protected void printP() {
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		System.out.println(character);

	}
	
	static {
		System.out.println("First block");
	}
	
	public static Variables returnInstane() {
		return new Variables();
	}

}
