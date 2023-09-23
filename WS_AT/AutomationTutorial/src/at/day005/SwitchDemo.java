package at.day005;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		//simple switch case example
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		switch(c) {
		case 'a':
			System.out.println("Entered character is vowels");
			break;
		case 'e':
			System.out.println("Entered character is vowels");
			break;
		case 'i':
			System.out.println("Entered character is vowels");
			break;
		case 'o':
			System.out.println("Entered character is vowels");
			break;
		case 'u':
			System.out.println("Entered character is vowels");
			break;
		default:
			System.out.println("Entered character is not vowel");	
		}
		

	}

}
