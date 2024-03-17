package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.BooksPage;
import pages.DemoQALogin;
import pages.ElementsPage;
import pages.FileRead;
import pages.HomePage;
import pages.WebdriverMethods;

public class LoginTestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
	    driver = WebdriverMethods.launchBrowser(FileRead.getKeyValue("browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
 	
	@Test
	public void loginWithValid() {		
		HomePage home = new HomePage(driver);
		ElementsPage elements = new ElementsPage(driver);
		BooksPage books = new BooksPage(driver);
		DemoQALogin login = new DemoQALogin(driver);
		Assert.assertEquals(true, true);
		SoftAssert verify = new SoftAssert();
		home.clickOnMenu("Book Store Application");
		books.waitTillLoginButtonVisible();
		elements.clickOnBookStoreSubMenu("Login");
		login.verifyLoginPageIsOpen();
		login.enterUsername("sid72");
		login.enterPassword("Sandy@123");
		login.clickOnLoginButton();
		books.verifybooksPageIsOpen();
	}
	
//	@Test
//	public void loginWithValid() {		
//		HomePage home = new HomePage(driver);
//		ElementsPage elements = new ElementsPage(driver);
//		BooksPage books = new BooksPage(driver);
//		DemoQALogin login = new DemoQALogin(driver);
//		Assert.assertEquals(true, true);
//		SoftAssert verify = new SoftAssert();
//		verify.assertEquals(true, false);
//		home.clickOnMenu("Book Store Application");
//		verify.assertEquals(true, false);
//		books.waitTillLoginButtonVisible();
//		verify.assertEquals(true, false);
//		verify.assertAll();
//		elements.clickOnBookStoreSubMenu("Login");
//		login.verifyLoginPageIsOpen();
//		login.enterUsername("sid72");
//		login.enterPassword("Sandy@123");
//		login.clickOnLoginButton();
//		books.verifybooksPageIsOpen();
//	}
	
//	@Test
	public void loginWithInvalid() {		
		HomePage home = new HomePage(driver);
		ElementsPage elements = new ElementsPage(driver);
		DemoQALogin login = new DemoQALogin(driver);
		home.clickOnMenu("Book Store Application");
		elements.clickOnBookStoreSubMenu("Login");
		login.enterUsername("xyz");
		login.enterPassword("abc");
		login.clickOnLoginButton();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	

}
