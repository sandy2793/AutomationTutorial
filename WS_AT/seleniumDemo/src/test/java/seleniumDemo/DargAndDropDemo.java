package seleniumDemo;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DargAndDropDemo {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> menu_list = driver.findElements(By.cssSelector("div.top-card"));
		for(int i = 0; i < menu_list.size() ; i++) {
			boolean condition = menu_list.get(i).getText().equals("Interactions");
			if (condition) {
				menu_list.get(i).click();
				break;
			}
			else if(i == menu_list.size()-1) {
				System.out.println("Menu name is invalid!!");
			}
		}
		
		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Interactions' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Droppable");
			if (condition) {
				js.executeScript("arguments[0].scrollIntoView();", elements_subMenu_list.get(i));
//				action.scrollToElement(elements_subMenu_list.get(i)).build().perform();
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		
		WebElement drag_el = driver.findElement(By.id("draggable"));
		WebElement drop_el = driver.findElement(By.cssSelector("div#simpleDropContainer div#droppable"));
		
		Action act;
//		act = action.clickAndHold(drag_el).moveToElement(drop_el).release(drop_el).build();
		act = action.dragAndDrop(drag_el, drop_el).build();
		act.perform();
		
		

	}

}
