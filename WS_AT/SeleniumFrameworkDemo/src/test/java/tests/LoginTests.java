package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DemoQALogin;
import pages.ElementsPage;
import pages.FileRead;
import pages.HomePage;
import pages.WebdriverMethods;

public class LoginTests {

	public static void main(String[] args) throws Exception {
		
		
		for (int i = 1; i <= FileRead.getNoOfRows("Login"); i++) {
			WebDriver driver = WebdriverMethods.launchBrowser(FileRead.getKeyValue("browser"));
//			System.setProperty("webdriver.chrome.driver",
//			System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/");
			HomePage home = new HomePage(driver);
			ElementsPage elements = new ElementsPage(driver);
			DemoQALogin login = new DemoQALogin(driver);
			home.clickOnMenu("Book Store Application");
			elements.clickOnBookStoreSubMenu("Login");
			login.enterUsername(FileRead.getCellValue("Login", "Username", i));
			login.enterPassword(FileRead.getCellValue("Login", "Password", i));
			login.clickOnLoginButton();
			Thread.sleep(1000);
			driver.quit();
		}

	}

}
