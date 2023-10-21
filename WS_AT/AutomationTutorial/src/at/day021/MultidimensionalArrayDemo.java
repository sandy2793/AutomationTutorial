package at.day021;

import java.util.Arrays;

public class MultidimensionalArrayDemo {

	public static void main(String[] args) {
		MultidimensionalArrayDemo  mad = new MultidimensionalArrayDemo();
//		int[][] m = new int[2][3];
//		m[0][0] = 1;
//		m[0][1] = 2;
//		m[1][0] = 3;
//		m[1][1] = 4;
////		m[2][0] = 5;
//		
////		System.out.println(Arrays.toString(m[1]));
//		
//		System.out.println(m.length);
//		System.out.println(m[0].length);
//		for(int i = 0; i < m.length; i++) {
//			for(int j = 0; j < m[0].length; j++) {
//				System.out.print(m[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[][] m2 = {{1,2,3}, {4,5,6}};
//		mad.printArray(m2);
//		
//		System.out.println("-------------------------------------------");
//
//		int[][] m3 = {{1,2,4}, {3,4}, {5,6,6,7}};
//		mad.printArray(m3);
//		int[][] m4 = new int[2][];
//		m4[0] = new int[3];
//		m4[1] = new int[2];
//		m4[2] = new int[5];
//		
//		int[][][] m5 = { { {2,6}, {3,5} }, { {2,6}, {3,5} } };
		
		int a1[][] = {{1,2,3}, {5,6,7}};
		int a2[][] = {{8,9,0}, {1,2,3}};
		
		mad.printArray(mad.addition(a1, a2));
		
	}
	
	public void printArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public int[][] addition(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}

}
