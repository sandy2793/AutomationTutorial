package at.day008;

public class ContinueDemo {

	public static void main(String[] args) {
		
		System.out.println("\n----------------------------------------------------\n");
		
		//for loop continue example
		for(int i = 0; i < 10; i++) {
			if (i == 5) continue;
			System.out.println(i);
		}
		
		System.out.println("\n----------------------------------------------------\n");
		
		//while loop continue example
		int i = 0;
		while(i < 10) {
			i++;
			if (i == 5) continue;
			System.out.println(i);
		}
		
		System.out.println("\n----------------------------------------------------\n");
		
		//do while loop continue example
		do {
			i++;
			if (i == 5) continue;
			System.out.println(i);
		}while(i < 10);
		
		System.out.println("\n----------------------------------------------------\n");
		
		//Labeled nested for loop continue example
		outer:
		for(i = 0; i < 5; i++) {
//			if(i == 2) continue;
			System.out.println(i);
			inner:
			for(int j = 0; j < 5; j++) {
				if(i == 3) continue outer;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n----------------------------------------------------\n");
		
	}

}
