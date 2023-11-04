package at.day024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("vijay");
		list.add("Amar");
		list.add(null);
		list.add("dgjk");
		list.add(0, "fjghdj");
		
		list.forEach(b->{
			System.out.println(b);
		});

		System.out.println("-----------------------------");
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(7);
		number.add(90);
		number.add(67);
		
		number.forEach(num-> {
			System.out.println(num);
		});
		
		System.out.println("-----------------------------");
		
		Collections.sort(number);
		
		number.forEach(num-> {
			System.out.println(num);
		});
		
	}

}
