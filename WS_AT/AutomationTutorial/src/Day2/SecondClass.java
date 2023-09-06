package Day2;

public class SecondClass {
	//instance variable
	int instanceVariable2 = 5;
	
	
	public static void main(String[] args) {
		//printing static variable
		System.out.println(FirstClass.staticVariable);
		//printing static variable after change value
		SecondClass class21 = new SecondClass();
		class21.change();
		System.out.println(FirstClass.staticVariable);
	}
	
	public void change() {
		FirstClass.staticVariable = 15;
	}

}
