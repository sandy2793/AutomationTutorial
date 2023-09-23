package at.day010;

public class ASCIIDemo {

	public static void main(String[] args) {
		
		char c = 'a';
		int a = c;
		int b = 99;
		System.out.println(c);
		System.out.println(a);
		System.out.println((char)b);
		char d = (char) b;
		System.out.println(d);
		
		
		for(int i = 0; i <= 255; i++) {
			System.out.println((char)i+" = "+i); 
		}
	}

}
