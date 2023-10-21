package at.day022;

public class TwoDArray {

	public static void main(String[] args) {
		TwoDArray t = new TwoDArray();
		int[][] a = {{1,1,1},{2,2,2}, {3,3,3}};
		int[][] b = {{1,1,1},{2,2,2}, {3,3,3}};
		t.multiplyMatrix(a, b);
		
	}


	public int[][] multiplyMatrix(int[][] a1, int[][] a2) {
		int[][] m = new int[a1.length][a1[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 0;
				for(int k=0;k< m[i].length;k++)      
				{
					m[i][j]+=a1[i][k]*a2[k][j];      
				}
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		return m;
	}

}
