package at.day009;

import java.util.Scanner;

public class PracticeQuestions2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isExit = false;
		do {
			System.out.println("Enter two number: ");
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println("Enter + for addition, - for subtraction, * for mutiplication & / for division: ");
			char c = sc.next().charAt(0);
			switch (c) {
			case '+':
				System.out.println("Addition = "+(a+b));
				break;
			case '-':
				System.out.println("Subtraction = "+(a-b));
				break;
			case '*':
				System.out.println("Multplicatin = "+(a*b));
				break;
			case '/':
				System.out.println("Division = "+(a/b));
				break;
			default:
				System.out.println("Invalid operator: "+c);
				break;
			}
			System.out.println("Do you want to exit?y/n: ");
			char exit = sc.next().charAt(0);
			while (true) {
				if(exit=='y') {
					isExit = true;
					break;
				}
				else if (exit == 'n') {
					isExit = false;
					break;
				}
				else {
					System.out.println("Invalid answer, please enter y or n: ");
					exit = sc.next().charAt(0);
				}
			}
		} while(!isExit);
		System.out.println("End");
		
	}

}
