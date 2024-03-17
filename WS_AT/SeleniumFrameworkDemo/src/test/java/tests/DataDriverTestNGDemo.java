package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BooksPage;
import pages.DemoQALogin;
import pages.ElementsPage;
import pages.FileRead;
import pages.HomePage;
import pages.WebdriverMethods;

public class DataDriverTestNGDemo {
	
WebDriver driver;
	
	@BeforeMethod
	public void init() {
	    driver = WebdriverMethods.launchBrowser(FileRead.getKeyValue("browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
	
	@DataProvider(name = "dp")
	public Object[][] getData() {
		
		return new Object[][] {
			{"sid72", "Sandy@123"},
			{"abc", "Xyz@123"} ,
			{"", "Xyz@123"} ,
			{"abc", ""} ,
			{"", ""} ,
			{"abc", "Xyz@123"} ,
			{"abc", "Xyz@123"} ,
			{"abc", "Xyz@123"} ,
			{"abc", "Xyz@123"} 
			};
	}
	
 	
	@Test(dataProvider = "dp")
	public void loginWithValid(String username, String password) {		
		HomePage home = new HomePage(driver);
		ElementsPage elements = new ElementsPage(driver);
		BooksPage books = new BooksPage(driver);
		DemoQALogin login = new DemoQALogin(driver);
		home.clickOnMenu("Book Store Application");
		books.waitTillLoginButtonVisible();
		elements.clickOnBookStoreSubMenu("Login");
		login.verifyLoginPageIsOpen();
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLoginButton();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
