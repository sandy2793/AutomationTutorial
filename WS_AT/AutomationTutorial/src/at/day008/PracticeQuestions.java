package at.day008;

import java.util.Scanner;

public class PracticeQuestions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter no of columns: ");
		int column = sc.nextInt();

		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		rows = 5;
		for(int i = 1; i <= rows; i++) {

			for(int j = 1; j <= rows - i ; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i = 1; i <= rows; i++) {

			for(int j = 1; j <= rows - i ; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print(i);
			}

			System.out.println();
		}

		for(int i = 1; i <= rows; i++) {

			for(int j = 1; j <= rows - i ; j++) {
				System.out.print(" ");
			}

			for (int k = i; k >= 1 ; k--) {
				System.out.print(k);
			}

			for (int l = 2; l <= i ; l++) {
				System.out.print(l);
			}

			System.out.println();
		}
	}

}
