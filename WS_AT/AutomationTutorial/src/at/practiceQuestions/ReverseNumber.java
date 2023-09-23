package at.practiceQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int reverseNumber = 0;
		while(number != 0) {
			int reminder = number % 10;
			reverseNumber = reverseNumber*10 + reminder;
			number = number/10;
		}
		System.out.println(reverseNumber);
		
	}

}
