package at.day005;

import java.util.Scanner;

public class LoopDemo {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n----------------------------------------------------\n");
		
		//Code example without loop
		System.out.println("Enter Number: ");
		int no = sc.nextInt();
		
		System.out.println(no*1);
		System.out.println(no*2);
		System.out.println(no*3);
		System.out.println(no*4);
		System.out.println(no*5);
		System.out.println(no*6);
		System.out.println(no*7);
		System.out.println(no*8);
		System.out.println(no*9);
		System.out.println(no*10);
		System.out.println("\n----------------------------------------------------\n");
		
		//code with simple for loop
		System.out.println("Enter Number: ");
		no = sc.nextInt();
		int i = 0;
		for(i = 1; i <= 10; i++) {
			System.out.println(no*i);
		}
		//i variable value after value
		System.out.println(i);
		
		System.out.println("\n----------------------------------------------------\n");
		
		//code with nested for loop
		for(i = 0; i < 5; i++) {
			System.out.print(i+": ");
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n----------------------------------------------------\n");
		
	}

}
