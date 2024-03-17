package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProveiderDemo {
	
	
	@DataProvider(name="dp")
	public Object[][] dataProvider() {
		return new Object[][] {{1, "d2", "d5"}, 
			                   {2, "d4", "d6"},
		                       {2, "d4", "d6"},
		                       {2, "d4", "d6"}}; 
	}
	
	@Test(dataProvider = "dp", description = "Sample Test"
			, priority = 1)
	public void sampleTest(int di, String ds, String ds2) {
		System.out.println(di + " " + ds + " " + ds2);
		System.out.println("Writing test case");
	}

}
