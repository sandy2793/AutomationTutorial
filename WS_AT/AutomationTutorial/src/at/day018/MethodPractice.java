package at.day018;

public class MethodPractice {

	public static void main(String[] args) {
		
		CommonMethods cm = new CommonMethods();
		cm.isPrimeNumber(-11);
		int factorial = cm.getFactorial(5);
		System.out.println(factorial);
	}

}
