package at.practiceQuestions;

import java.util.Scanner;

public class MaximumOfThreeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter the Number 2 : ");
		int num2 = input.nextInt();
		System.out.print("Enter the Number 3 : ");
		int num3 = input.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println("Maximum Number is " +num1);
		else if(num1<num2 && num3<num2)
			System.out.println("Maximum Number is " +num2);
		else
			System.out.println("Maximum Number is " +num3);
	}

}
