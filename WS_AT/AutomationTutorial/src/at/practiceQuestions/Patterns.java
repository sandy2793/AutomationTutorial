package at.practiceQuestions;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		System.out.println("\n----------------------------------------------------\n");

		/*
		 Pattern #01

		 **********
		 **********
		 **********
		 **********

		 */

		int rows = 5;
		int column = 10;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n----------------------------------------------------\n");

		/*
		 Pattern #02

		 *
		 **
		 ***
		 ****
		 *****

		 */

		for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  
				System.out.print("*");  
			}  
			System.out.println();//new line  
		}  

		System.out.println("\n----------------------------------------------------\n");


		/*
		 Pattern #03

		 *
		 **
		 ***
		 ****
		 *****

		 */

		for(int i=1;i<=5;i++){  
			for(int j=1;j<=5-i;j++){  
				System.out.print(" ");  
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();//new line  
		}

		System.out.println("\n----------------------------------------------------\n");

		/*
		 Pattern #04

		 *
		 ***
		 *****
		 *******
		 *********

		 */

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

		System.out.println("\n----------------------------------------------------\n");

		/*
		 Pattern #05

		   1
          222
         33333
        4444444
       555555555

		 */

		rows = 5;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= rows - i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("\n----------------------------------------------------\n");

		/*
		 Pattern #06

		    1
           212
          32123
         4321234
        543212345

		 */

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

		System.out.println("\n----------------------------------------------------\n");




	}

}
