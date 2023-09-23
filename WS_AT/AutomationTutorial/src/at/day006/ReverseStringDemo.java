package at.day006;

import java.util.Scanner;

public class ReverseStringDemo {
	
	static String reverseName;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		String reverseName = Character.toString(name.charAt(name.length()-1));
		for (int i = name.length()-2; i >= 0; --i) {
			reverseName += Character.toString(name.charAt(i));
		}
		System.out.println(reverseName);
		
		
	}

}
