package at.day025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		
		
		Set<String> s = new HashSet<String>();
		s.add("vijay");
		s.add("ajay");
		s.add("vijay");
		s.add(null);
		s.add("ravi");
		s.add(null);
		
		System.out.println(s.toString());
		System.out.println(s.size());
		
		System.out.println("------------------------------------");
		

		HashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("vijay");
		lhs.add("ajay");
		lhs.add("vijay ");
		lhs.add(null);
		lhs.add("ravi");
		lhs.add(null);
		

		System.out.println(lhs.toString());
		System.out.println(lhs.size());

		System.out.println("------------------------------------");
		Set<String> ts = new TreeSet<String>();
		ts.add("vijay");
		ts.add("ajay");
		ts.add("vijay");
		ts.add("ravi");
		ts.remove("vijay");
		System.out.println(ts.toString());
		System.out.println(ts.size());
		
		
	}

}
