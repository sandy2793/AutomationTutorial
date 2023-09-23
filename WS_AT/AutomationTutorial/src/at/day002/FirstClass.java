package at.day002;

public class FirstClass {
	//instance variable
	int instanceVariable = 7;
	
	//static variable
	static int staticVariable = 10;
	
	public static void main(String[] args) {
		FirstClass class11 = new FirstClass();
		class11.print();
		
		//printing instance variable of second class after change the value with first object
		SecondClass class21 = new SecondClass();
		class21.instanceVariable2 = 6;
		System.out.println(class21.instanceVariable2);
		
		//printing instance variable of second class with 2nd object
		SecondClass class22 = new SecondClass();
		System.out.println(class22.instanceVariable2);
//		System.out.println(c);
		

		//Primitive data type
		char charVariable = 'c';
		boolean booleanVariable = true;
		int intVariable = -1;
		float floatVariable = 2.5f;
		double doubleVariable = 5.012343;
		
		//non-Primitive data type
		String stringVariable = "Hello World!!!";
		String StringVariable = "Hello";
		
	}
	
	public void print() {
		//local variables
		int localVariable = -1;
		System.out.println("Local Variables: "+localVariable);
		System.out.println("Instance Variables: "+instanceVariable);
		System.out.println("Static Variables: "+staticVariable);
	}

}
