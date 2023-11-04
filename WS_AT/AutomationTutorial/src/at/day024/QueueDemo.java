package at.day024;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> q = new PriorityQueue<String>();
		q.add("Vijay");
		q.add("Ravi");
		q.add("Amar");
//		q.add(null);
		q.add("Sid");
		q.add("sandy");
		q.forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("head:"+q.element());  
		System.out.println("head:"+q.peek());  
		System.err.println("-------------------------");
		q.remove();
		q.forEach(a -> {
			System.out.println(a);
		});
		

		System.err.println("-------------------------");
		Queue<Integer> number = new PriorityQueue<Integer>();
		number.add(10);
		number.add(7);
		number.add(90);
		number.add(67);
		
		number.forEach(a -> {
			System.out.println(a);
		});
		System.err.println("-------------------------");  
		System.out.println("head:"+number.peek());  
		number.remove();
		number.poll();
		number.forEach(a -> {
			System.out.println(a);
		});
	}

}
