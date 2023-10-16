package at.day015;

public class SuperDemo {

	public static void main(String[] args) {
//		Emp e = new Emp(1, "Sid", 500000);
//		e.print();
		


		//declaration and initialization of array  
		int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  

		
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
