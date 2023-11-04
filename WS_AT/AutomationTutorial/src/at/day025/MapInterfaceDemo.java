package at.day025;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceDemo {

	public static void main(String[] args) {

		Map<Integer, String> months = new HashMap<Integer, String>();
		months.put(1, "Jan");
		months.put(2, "Feb");
		months.put(3, "Apr");
		//		months.put(3, "Mar");
		months.put(4, null);	
		months.remove(4);	
		months.replace(3, "Mar");
		months.forEach((k,v)-> {
			System.out.println(k+"="+v);
		});
		System.out.println(months.toString());
		System.out.println(months.get(6));
		System.out.println(months.size());
		System.out.println("---------------------------------");

		Map<String, Integer> md = new HashMap<>();

		md.put("Sid", 90);
		md.put("Sandy", 75);
		md.put("Ajay", 97);
		md.put("Madan", 89);
		md.put(null, 89);
		md.put(null, 81);

		System.out.println(md.toString());


		System.out.println("---------------------------------");

		Map<String, Integer> mdl = new LinkedHashMap<>();

		mdl.put("Sid", 90);
		mdl.put("Sandy", 75);
		mdl.put("Ajay", 97);
		mdl.put("Madan", 89);
		mdl.put(null, 89);
		mdl.put(null, 81);

		System.out.println(mdl.toString());


		System.out.println("---------------------------------");

		Map<String, Integer> mdt = new TreeMap<>();

		mdt.put("Sid", 90);
		mdt.put("Sandy", 75);
		mdt.put("Ajay", 97);
		mdt.put("Madan", 89);

		System.out.println(mdt.toString());



	}

}
