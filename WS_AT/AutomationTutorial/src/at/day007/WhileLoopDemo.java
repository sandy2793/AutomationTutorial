package at.day007;

public class WhileLoopDemo {

	public static void main(String[] args) {
		System.out.println("\n----------------------------------------------------\n");
		
		//Simple while loop example 1
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n----------------------------------------------------\n");
		
		//Simple while loop example 2
		i = 0;
		boolean check = true;
		while(check) {
			if (i == 1) {
				check = false;
			}
			else {
				System.out.println("While Loop");
			}
			i++;
		}
		System.out.println("\n----------------------------------------------------\n");
		
		
	}

}
