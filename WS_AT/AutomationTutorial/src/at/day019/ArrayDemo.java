package at.day019;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayDemo a = new ArrayDemo();
//		int[] numbers;
//		numbers = new int[6];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter "+numbers.length+" numbers: ");
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = sc.nextInt();
//		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
//		int[] nums = {6,7,8,9,5,6};
////		nums[4] = 1;
////		for (int i = 0; i < nums.length; i++) {
////			System.out.println(nums[i]);
////		}
//		a.printArray(nums);
//		for (int  no: nums) {
//			System.out.println(no);
//		}
//		numbers[0] = 5;
//		numbers[1] = 6;
//		numbers[2] = 3;
//		numbers[3] = 4;
//		numbers[4] = 9;
//		numbers[5] = 8;
		
//		int[] nums = a.getArray(2);
//		a.printArray(a.getArray(2));
		a.printArray(a.getStringArray());
		
	}
	
	public int[] getArray(int size) {
		int[] numbers = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+numbers.length+" numbers: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		return numbers;
	}
	
	public String[] getStringArray() {
		return new String[] {"Monday", "Tuesday"};
	}
	
	public void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public void printArray(String[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
