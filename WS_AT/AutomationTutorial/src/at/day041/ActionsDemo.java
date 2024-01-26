package at.day041;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/");
//		WebElement elements_card = driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card']"));
		Actions action = new Actions(driver);
////		action.contextClick(elements_card).build().perform();
////		action.moveToElement(elements_card).contextClick().build().perform();
//		
//		elements_card.click();
//		
//		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
//		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
//			boolean condition = elements_subMenu_list.get(i).getText().equals("Buttons");
//			if (condition) {
//				elements_subMenu_list.get(i).click();
//				break;
//			}
//			else if(i == elements_subMenu_list.size()-1) {
//				System.out.println("Sub menu name is invalid!!");
//			}
//		}
//		
//		WebElement right_click = driver.findElement(By.id("rightClickBtn"));
////		action.contextClick(right_click).build().perform();
//		
//		WebElement double_click = driver.findElement(By.id("doubleClickBtn"));
////		action.doubleClick(double_click).build().perform();
//		
//		action.moveToElement(double_click).build().perform();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		action.moveToElement(mouseHover).build().perform();
		

	}

}
