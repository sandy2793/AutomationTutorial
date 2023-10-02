package at.day014;

public class Animal extends Speices {
	
	String animalType;
	
	public void print() {
		printSpeices();
	}
	void eat() {
		System.out.println("eating");
	}
	
	
	
	public static void main(String[] args) {
//		printSpeices();
		Animal a = new Animal();
		a.printSpeices();
		a.speicesNo = 2;
		System.out.println(a.speicesNo);
		
		Speices s = new Speices();
		s.printSpeices();
//		s.speicesNo;
		
	}
	
	
}
