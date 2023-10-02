package at.day011;

import java.util.*;
import static java.lang.Math.*;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand;
		
//		System.out.println(max(10, 20));
//
//		System.out.println(addExact(10, 20));
		
		Math m1 = new Math();
		Math m2;
		m2 = new Math();
		System.out.println(m1.num);
		System.out.println(m2.pi);
		
		System.out.println(new Math().num);
	}

}



class Math {
	
	float pi = 3.14f;
	int num = 10;
	
}
