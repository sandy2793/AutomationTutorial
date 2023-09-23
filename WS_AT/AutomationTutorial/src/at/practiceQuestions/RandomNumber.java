package at.practiceQuestions;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	
	public static void main(String[] args) {
		Random random = new Random();
		int randomNo = random.nextInt(100) + 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the random number: ");
		boolean hasGuessed = false;
		int attempts = 0;
		while(!hasGuessed) {
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
				hasGuessed = true;
			}
		}
	}

}
