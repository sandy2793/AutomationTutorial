package at.day015;

public class SuperDemo {

	public static void main(String[] args) {
		Emp e = new Emp(1, "Sid", 500000);
		e.print();
		
	}

}

class Person {
	
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
}

class Emp extends Person {
	
	float salary;
	
	Emp(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}
	
	void print() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	
}
