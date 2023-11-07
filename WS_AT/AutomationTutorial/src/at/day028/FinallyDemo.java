package at.day028;

public class FinallyDemo {

	public static void main(String[] args) {
		String name = "hj";
		try {
			System.out.println(name.charAt(3));
		} 
//		catch (NullPointerException e) {
//			System.out.println("Variable is null");
//			e.printStackTrace();
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Variable length is less than index value!!!");
//			e.printStackTrace();
//		} 
		finally {
			System.out.println(name);
		}

	}

}
