package seleniumDemo;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day43 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> menu_list = driver.findElements(By.cssSelector("div.top-card"));
		for(int i = 0; i < menu_list.size() ; i++) {
			boolean condition = menu_list.get(i).getText().equals("Alerts, Frame & Windows");
			if (condition) {
				menu_list.get(i).click();
				break;
			}
			else if(i == menu_list.size()-1) {
				System.out.println("Menu name is invalid!!");
			}
		}

		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Alerts, Frame & Windows' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Alerts");
			if (condition) {
				js.executeScript("arguments[0].scrollIntoView();", elements_subMenu_list.get(i));
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		
		WebElement alert_btn = driver.findElement(By.id("timerAlertButton"));
		alert_btn.click();
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
//		al.sendKeys("Sandy");
		al.accept();
		
		Thread.sleep(10000);
		driver.quit();
		

	}

}
