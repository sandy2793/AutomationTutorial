package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ElementsPage;
import pages.HomePage;

public class ToolsqaTests {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		HomePage home = new HomePage(driver);
		ElementsPage elements = new ElementsPage(driver);
		
		
		home.clickOnMenu("Elements");
		
		elements.clickOnElementsSubMenu("Text Box");
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
