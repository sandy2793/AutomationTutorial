package at.day003;

public class OperatorDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//Arithmetic Operators
		int sum = a + b;
		int subtraction = a - b;
		int mutiplication = a * b;
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("Addition: "+sum);
		System.out.println("Subtraction: "+subtraction);
		System.out.println("Mutiplcation: "+mutiplication);
		System.out.println("Quotient: "+quotient);
		System.out.println("Remainder: "+remainder);
		
		
		//Unary Operators
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		
		//Assignment Operator
		a = 10;
		b = 20;
		a+=3;
		b-=5;
		System.out.println(a);
		System.out.println(b);
		a = 10;
		b = 20;
		a*=2;
		b/=2;
		System.out.println(a);
		System.out.println(b);
		a = 10;
		b = 20;
		b%=a;
		System.out.println(b);
		
		
		
		//Relational Operators
		a = 10;
		b = 20;
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		//Logical Operators
		boolean x = true, y = false;
		System.out.println(x==true && y==true);
		System.out.println(x==true || y==true);
		System.out.println(!(a == b));
		
		//Ternary Operator
		int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
		
        //Question 1
		float j = 20, k = 10, c = 0, d = 20, e = 40, f = 30;
		 
        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        // prints a+(b/d)
        System.out.println("a+b/d = " + (j + k / d));
 
        // if same precedence then associative
        // rules are followed.
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "+ (j + k * d - e / f));
		
        //Question 2
		System.out.println("First: "+(a+b)); 
		System.out.println("Second: "+a+b); 
	}
	
	

}
