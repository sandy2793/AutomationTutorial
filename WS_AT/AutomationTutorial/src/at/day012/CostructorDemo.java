package at.day012;

public class CostructorDemo {
	
	int age;
	String name;
	
	public CostructorDemo() {
		System.out.println("Constructor called!!!!");
	}
	
	public CostructorDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	public static void main(String[] args) {
		CostructorDemo cd = new CostructorDemo("Sid", 29);
		CostructorDemo cd0 = new CostructorDemo();
		System.out.println(cd.name+ " " + cd.age);

	}

}
