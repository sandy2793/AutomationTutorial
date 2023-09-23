package at.practiceQuestions;

import java.util.Scanner;

public class ReverseName {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		String reverseName = "";
		for (int i = name.length()-1; i >= 0; --i) {
			reverseName += Character.toString(name.charAt(i));
		}
		System.out.println(reverseName);
		
	}

}
