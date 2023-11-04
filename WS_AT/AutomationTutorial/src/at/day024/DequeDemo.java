package at.day024;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeDemo {

	public static void main(String[] args) {
		
		Deque<String> q = new ArrayDeque<String>();
		q.add("Vijay");
		q.add("Ravi");
		q.add("Amar");
		q.add("Sid");
		q.add("sandy");
		q.addFirst("Hema");
		q.addLast("Pradnya");
		q.forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("-------------------------");
//		q.pollFirst();
		
		q.forEach(a -> {
			System.out.println(a);
		});
	}

}
