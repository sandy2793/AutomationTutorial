package at.day026;

import java.util.HashMap;

public class ObjectDemo {

	public static void main(String[] args) {
		ObjectDemo obj = new ObjectDemo();
		Object o = obj.getDetails(true);
		System.out.println(o);
		
		Object oo = obj.getObject(0);
		
		HashMap<String, Object> hs = new HashMap<>();
		hs.put("Sid", 60);
		hs.put("Sandy", "Bane");
		hs.put("Ss", new HashMap<>());
		
		obj.toString();
	}
	
	
	public Object getObject(Object value) {
		if ((int) value == 0) {
			return new Emp();
		}
		else {
			return new Student();
		}
	}
	
	public Object getDetails(boolean value) {
		if (value) {
			return "Hello World";
		}
		else {
			return 0;
		}
	}

}

class Emp {
	
}
class Student {
	
}
