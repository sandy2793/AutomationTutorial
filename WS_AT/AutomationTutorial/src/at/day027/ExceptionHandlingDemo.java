package at.day027;

import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws Exception {
		String name = "hj";
		//		try {
		//			System.out.lprintln(name.charAt(3));
		//			System.out.println(name);
		//		} catch (NullPointerException e) {
		//			System.out.println("Variable is null");
		//			e.printStackTrace();
		//		} catch (StringIndexOutOfBoundsException e) {
		//			System.out.println("Variable length is less than index value!!!");
		////			e.printStackTrace();
		//		}


//		System.out.println(name.charAt(3));
//		System.out.println(name);
//
//		System.out.println("-------------------------------------------");
		ExceptionHandlingDemo en = new ExceptionHandlingDemo();
		en.m();
	}

	void m()throws Exception{  
		throw new NullPointerException("device error");//checked exception  
	}
	
	void n() throws Exception{  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handled");}  
	}  

}
