package at.day022;

import java.util.Arrays;

import at.day019.ArrayDemo;

public class ArrayOption {

	public static void main(String[] args) {
		int a = 10;
		String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		String[] weekdays = new String[5];
		String[] weekends = new String[2];
		
		System.arraycopy(days, 0, weekdays, 0, 5);
		System.arraycopy(days, 5, weekends, 0, 2);
		
//		ArrayDemo a = new ArrayDemo();
//		a.printArray(weekdays);
//		System.out.println("-----------------------------");
//		a.printArray(weekends);
		
//		String[] daysInWeek = days.clone();
//		a.printArray(daysInWeek);
//		System.out.println(days);
//		System.out.println(daysInWeek);
//		System.out.println(days == daysInWeek);
//		System.out.println(Arrays.equals(days,daysInWeek));
		
		
		String x = "Hello World!!!";
		String y = "";
		String z = "    Good Morning!!!    ";
//		System.out.println(x.charAt(0));
//		System.out.println(x.length());
//		System.out.println(x.substring(6));
//		System.out.println(x.substring(6, 8));
//		System.out.println(x.contains("world"));
//		System.out.println(x.equals("Hello world!!!"));
//		System.out.println(y.isEmpty());
//		System.out.println(x.concat(z));
//		System.out.println(x+z);
//		System.out.println(z.replace("!", "?"));
//		System.out.println(x.equalsIgnoreCase("Hello world!!!"));
//		String[] split = x.split(" ");
//		System.out.println(Arrays.toString(split));
//		System.out.println(x.toLowerCase());
//		System.out.println(x.toUpperCase());
		System.out.println(z);
		System.out.println(z.trim());
		System.out.println(String.valueOf(false));
		int c = 10;
		String s = ""+a+"";
		System.out.println(""+s+"");
		
	}

}
