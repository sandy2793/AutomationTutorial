package at.day023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionsDemo1 {

	public static void main(String[] args) {

//		List<String> list=new ArrayList<String>();
//		list.add("Ravi");  
//		list.add("Vijay");  
//		list.add("Ravi");  
//		list.add("Ajay"); 
//		list.add(0, "Amar");
//		System.out.println("List size: "+list.size());
//		System.out.println(list.get(2));
//		System.out.println("---------------------------------");
//		list.remove(3);
//		Iterator itr = list.iterator();  
//		while(itr.hasNext()){ 
//			System.out.println(itr.next());  
//		} 
//		System.out.println("---------------------------------");
//		list.add("New");
//		System.out.println("List size: "+list.size());
////		for(int i = 0; i < list.size(); i++) {
////			System.out.println(list.get(i));
////		}
//		for(String a: list) {
//			System.out.println(a);
//		}
		
//		Vector<String> v= new Vector<String>();
//		v.add("Ravi");  
//		v.add("Vijay");  
//		v.add("Ravi");  
//		v.add("Ajay"); 
//		v.set(2, "Amar");
////		System.out.println();
//		Iterator itr = v.iterator();  
//		while(itr.hasNext()){ 
//			System.out.println(itr.next());  
//		} 
		
		
		
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

		
	}

}
