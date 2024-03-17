package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {
	
	
	public static WebDriver launchBrowser(String browserName) {
		WebDriver driver = null;
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			driver = null;
			System.out.println(browserName + " browser name is invalid!!!");
		}
		return driver;
	}
	
	
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void enterValue(WebElement element, String enterValue) {
		try {
			element.sendKeys(enterValue);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void visibilityOfElementWait(WebDriver driver, WebElement element, 
			int waitInSec) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitInSec));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String getText(WebElement element) {
		try {
			return element.getText();
		} catch (Exception e) {
			return null;
		}
	}
	
	public static boolean isElementPresent(WebElement element) {
		boolean isPresent = false;
		try {
			isPresent = element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			isPresent = false;
		}
		return isPresent;
	}
	
	//Actions
	public static void scrollUsingActions(WebDriver driver, WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.scrollToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Javascriptexecutor
	public static void clickUsingJavascriptExecutor(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void scrollUsingJavascriptexecutor(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
