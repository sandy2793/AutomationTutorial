package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import helper.ObjectFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains all methods related {@link WebDriver}.
 * All methods are static in nature and inherit {@link CommonMethods}.
 * @author Sandesh Lahoti
 */
public class WebdriverUtils extends CommonMethods {
	
	/**
	 * This method is launch browser as per passed browser name.
	 * @param browserName
	 */
	public static WebDriver launchBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			Assert.assertTrue(false, "'" + browserName + "' browser name is invalid!!!");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	/**
	 * This method is to launch application on browser.
	 * @param url
	 */
	public static void launchApplication(String url) {
		driver.get(url);
	}
	
	/**
	 * This method is to get title of current window/tab.
	 * @return
	 */
	public static String getTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method is to get url of current window/tab.
	 * @return
	 */
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * THis method is to add implicit wait for all steps related {@link WebDriver}.
	 * @param waitInSeconds
	 */
	public static void implicitWait(int waitInSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitInSeconds));
	}
	
	/**
	 * This method is to wait till visibility of {@link WebElement}.
	 * @param element
	 * @param waitInSeconds
	 */
	public static void visibilityOfElementWait(WebElement element, int waitInSeconds) {
		try {
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(waitInSeconds));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * This method is to close a tab/window which current focus by {@link WebDriver}.
	 */
	public static void closeTabOrWindow() {
		driver.close();
	}
	
	/**
	 * This method is to close all tab & window which release to {@link ObjectFactory#driver}.
	 */
	public static void closeBrowser() {
		driver.quit();
	}
	
	/**
	 * This method is to click on {@link WebElement}.
	 * @param element
	 */
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * This method is to clear a textbox {@link WebElement}.
	 * @param element
	 */
	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * This method is to enter value in textbox {@link WebElement}.
	 * @param element
	 * @param enterValue
	 */
	public static void enterValue(WebElement element, String enterValue) {
		try {
			element.sendKeys(enterValue);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * This method is to get text of {@link WebElement}.
	 * @param element
	 * @return
	 */
	public static String getText(WebElement element) {
		try {
			return element.getText();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * This method is to {@link WebElement} is present or not return true/false.
	 * @param element
	 * @return
	 */
	public static boolean isElementPresent(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	/**
	 * This method is to check current url match and return true/false.
	 * @param expectedUrl
	 * @return
	 */
	public static boolean isCurrentUrlMatch(String expectedUrl) {
		try {
			return getCurrentUrl().equals(expectedUrl);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	/**
	 * This method is to check current url contains and return true/false.
	 * @param expectedUrl
	 * @return
	 */
	public static boolean isCurrentUrlContains(String expectedUrl) {
		try {
			return getCurrentUrl().contains(expectedUrl);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	/**
	 * This method is to check title match and return true/false.
	 * @param expectedTitle
	 * @return
	 */
	public static boolean isTitleMatch(String expectedTitle) {
		try {
			return getTitle().equals(expectedTitle);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	/**
	 * This method is to check title contains and return true/false.
	 * @param expectedTitle
	 * @return
	 */
	public static boolean isTitleContains(String expectedTitle) {
		try {
			return getTitle().contains(expectedTitle);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	/**
	 * This method is to check {@link WebElement} text match and return true/false.
	 * @param element
	 * @param expectedText
	 * @return
	 */
	public static boolean isElementTextMatch(WebElement element, String expectedText) {
		try {
			return getText(element).equals(expectedText);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	/**
	 * This method is to check {@link WebElement} text contains and return true/false.
	 * @param element
	 * @param expectedText
	 * @return
	 */
	public static boolean isElementTextContains(WebElement element, String expectedText) {
		try {
			return getText(element).contains(expectedText);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	
	
	
}
