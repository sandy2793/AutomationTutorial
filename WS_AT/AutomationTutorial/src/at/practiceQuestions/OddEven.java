package at.practiceQuestions;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.printf("Enter the Number : ");
		num = input.nextInt();
		switch (num % 2)
		{
			case 0:
				System.out.printf("This is a Even Number");
				break;
 
			case 1:
				System.out.printf("This is a Odd Number");
				break;
		}
	}

}
