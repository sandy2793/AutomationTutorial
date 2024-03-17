package tests;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.BooksPage;
import pages.DemoQALogin;
import pages.ElementsPage;
import pages.FileRead;
import pages.HomePage;
import pages.WebdriverMethods;

public class DataProviderWIthExcelDemo {



	WebDriver driver;

	//	@Parameters({"browser"})
	@BeforeMethod
	public void init() {//(String browser) {
		String browserName;
		//		if (browser != "IamOptional") {
		//			browserName = browser;
		//		}
		//		else {
		browserName = FileRead.getKeyValue("browser");
		//		}
		driver = WebdriverMethods.launchBrowser(browserName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}

	@DataProvider(name = "dp")
	public Object[][] getData() {
		int noOfRows = FileRead.getNoOfRows("Login");
		int noOfColumns = FileRead.getNoOfColumn("Login");
		Object[][] o2 = new Object[noOfRows][noOfColumns];
		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				o2[i][j] = FileRead.getCellValue("Login", i+1, j);
			}
		}
		return o2;
	}

	@Test(dataProvider = "dp")
	public void loginWithValid(String username, String password, String email) {	
		System.out.println(username + " " + password + " " + email);
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
	public void tearDown() throws Exception {
		takeSnapShot(driver, System.getProperty("user.dir")+"/Screenshots/test"+RandomStringUtils.random(5)+".png");
		Thread.sleep(5000);
		driver.quit();
	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
