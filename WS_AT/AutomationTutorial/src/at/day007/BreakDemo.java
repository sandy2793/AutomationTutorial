package at.day007;

import java.util.Iterator;

public class BreakDemo {
	
	public static void main(String[] args) {
		System.out.println("\n----------------------------------------------------\n");
		
		//for loop break example
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		System.out.println("\n----------------------------------------------------\n");
		
		//while loop break example
		int i = 0;
		while (i < 10) {
			if( i == 2) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		System.out.println("\n----------------------------------------------------\n");
		
		//do while loop break example
		do {
			if( i == 2) {
				break;
			}
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("\n----------------------------------------------------\n");
		
		//nested for loop break example
		for (i = 0; i < 5 ; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i+" "+j);
				if (j == 2) {
					break;
				}
			}
			if(i == 2) {
				break;
			}
		}
		System.out.println("\n----------------------------------------------------\n");
		
		
		
		
		
		
	}

}
