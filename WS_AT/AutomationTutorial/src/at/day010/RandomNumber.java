package at.day010;

import java.util.Random;
import java.util.Scanner;

/**
 * This class contains Random Number code.
 * @author Sandesh Lahoti
 *
 */
public class RandomNumber {
	
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNo = random.nextInt(100) + 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the random number: ");
		int attempts = 0;
		while(true) {
			attempts++;
			int guessNo = sc.nextInt();
			if (randomNo > guessNo) {
				System.out.println("Incorrect - Random number is greater than guess number: ");
			}
			else if (randomNo < guessNo) {
				System.out.println("Incorrect - Random number is less than guess number: ");
			}
			else {
				System.out.println("You have guess the random number in "+attempts+" attempts!!!");
				break;
			}
		}
		
		
	}

}
