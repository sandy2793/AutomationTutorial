package at.day004;

import java.util.Scanner;

public class IfElseDemo {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------------------------------------------\n");
		
		//Simple if-else example
		System.out.println("Enter x value: ");
		int x = sc.nextInt();
		if (x%2 == 0) {
			System.out.println(x+" no is even!!!");
		}
		else {
			System.out.println(x+" no is odd!!!");
		}
		System.out.println("\n----------------------------------------------------\n");
		
		//if-else if example
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		if (c=='a') {
			System.out.println("Character is vowel!!!");
		}
		else if (c=='e') {
			System.out.println("Character is vowel!!!");
		}
		else if (c=='i') {
			System.out.println("Character is vowel!!!");
		}
		else if (c=='o') {
			System.out.println("Character is vowel!!!");
		}
		else if (c=='u') {
			System.out.println("Character is vowel!!!");
		}
		else {
			System.out.println("Character is not vowel!!!");
		}
		System.out.println("\n----------------------------------------------------\n");
		
		//Alternative way to write above code
		System.out.println("Enter a character: ");
		c = sc.next().charAt(0);
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') System.out.println("Character is vowel!!!");
		else System.out.println("Character is not vowel!!!");
		System.out.println("\n----------------------------------------------------\n");
		
		//Nested if-else example
		String address ="Mumbai, India";
		if (address.contains("India")) {
			if(address.contains("Delhi")) {
				System.out.println("Delhi City");
			}
			else if (address.contains("Mumbai")) {
				System.out.println("Mumbai City");
			}
		}
		System.out.println("\n----------------------------------------------------\n");
		
	}

}
