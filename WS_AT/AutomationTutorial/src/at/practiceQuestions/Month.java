package at.practiceQuestions;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Month Number(1-12) :");
		int num = input.nextInt();	
		switch(num) {
		case 1:
			System.out.println("This is a January");
			break;
		case 2:
			System.out.println("This is a February");
			break;
		case 3:
			System.out.println("This is a March");
			break;
		case 4:
			System.out.println("This is a April");
			break;
		case 5:
			System.out.println("This is a May");
			break;
		case 6:
			System.out.println("This is a June");
			break;
		case 7:
			System.out.println("This is a July");
			break;
		case 8:
			System.out.println("This is a August");
			break;
		case 9:
			System.out.println("This is a September");
			break;
		case 10:
			System.out.println("This is a October");
			break;
		case 11:
			System.out.println("This is a November");
			break;
		case 12:
			System.out.println("This is a December");
			break;
		default:
			System.out.println("Enter 1 to 12...");
		}
	}

}
