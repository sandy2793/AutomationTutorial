package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[contains(@class, 'top-card')]")).click();
		
		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Buttons");
			if (condition) {
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		
		WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		clickMe.sendKeys("dsss",Keys.ENTER);
		
		action.keyDown(Keys.CONTROL + "C").keyUp(null);

	}

}
