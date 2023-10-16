package at.day020;

import java.util.Arrays;

import at.day019.ArrayDemo;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] numbers = {10, 58, 28, 5, 48};
//		int[] reverseNumbers = new int[numbers.length];
//		for(int i = numbers.length; i > 0; i--) {
//			reverseNumbers[numbers.length-i] = numbers[i-1]; 
//		}
		ArrayDemo a= new ArrayDemo();
//		a.printArray(reverseNumbers);
		
		ArrayPractice p = new ArrayPractice();
		a.printArray(p.getSort(numbers));
//		a.printArray();

//		a.printArray(numbers);
//		System.out.println("------------------------------");
//		Arrays.sort(numbers);
//		a.printArray(numbers);
	}
	
	
	public int[] getSort(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = i+1; j < numbers.length; j++) {
				int tmp = 0;
				if(numbers[i] < numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		
		return numbers;
	}

}
