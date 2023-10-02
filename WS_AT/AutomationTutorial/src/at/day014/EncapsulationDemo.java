package at.day014;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
//		EncpasulationVariables ev = new EncpasulationVariables();
//		ev.setName("Sid");
//		ev.setJobProfile("Devloper");
//		ev.setSalary(500000);
//		System.out.println(ev.getName()+" "+ev.getJobProfile()+" "+ev.getSalary());
		
		Cat c = new Cat();
		c.printSpeices();
		c.eat();
		c.meow();
//		c.bark();
		
		Animal a = new Dog();
		a.eat();
		a.print();
		
	}

}
