package seleniumDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement iframeText = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		action.scrollToElement(iframeText).build().perform();
		Thread.sleep(500);
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		action.moveToElement(mouseHover).build().perform();
	}

}
