package at.practiceQuestions;

import java.util.Scanner;

public class MultipleFive {
	
	public static void main(String[] args) {
		System.out.print("Enter The Number : ");
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();    
		if(num%5==0)
		{
			System.out.println(num+" is a Multiple of 5");
		}
		else
		{
			System.out.println(num+" is not a Multiple of 5");
		}
	}
	
	
}
