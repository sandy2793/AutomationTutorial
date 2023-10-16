package at.day018;

public class CommonMethods {
	
	
	public void isPrimeNumber(int num) {
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime numb");
	}
	
	
	public int getFactorial(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	
	
	

}
