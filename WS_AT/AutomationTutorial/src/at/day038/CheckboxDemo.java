package at.day038;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[contains(@class, 'top-card')]")).click();
		
		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Check Box");
			if (condition) {
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		By toggle = By.cssSelector(";[title='Toggle']");
		List<WebElement> toggle_list = driver.findElements(toggle);
		List<WebElement> checkbox_list = driver.findElements(By.cssSelector("span.rct-checkbox"));
		List<WebElement> text_list = driver.findElements(By.cssSelector("span.rct-title"));
		
		for(int i = 0; i < toggle_list.size() ; i++) {
			boolean condition = text_list.get(i).getText().equals("Home");
			if (condition) {
				toggle_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Folder name is invalid!!");
			}
		}
		
//		toggle_list = driver.findElements(toggle);
		checkbox_list = driver.findElements(By.cssSelector("span.rct-checkbox"));
		text_list = driver.findElements(By.cssSelector("span.rct-title"));
		for(int i = 0; i < toggle_list.size() ; i++) {
			boolean condition = text_list.get(i).getText().equals("Downloads");
			if (condition) {
				toggle_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Folder name is invalid!!");
			}
		}
		
		checkbox_list = driver.findElements(By.cssSelector("span.rct-checkbox"));
		text_list = driver.findElements(By.cssSelector("span.rct-title"));
		
		for(int i = 0; i < checkbox_list.size() ; i++) {
			boolean condition = text_list.get(i).getText().equals("Excel File.doc");
			if (condition) {
				checkbox_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Folder name is invalid!!");
			}
		}
		
		for(int i = 0; i < checkbox_list.size() ; i++) {
			boolean condition = text_list.get(i).getText().equals("Excel File.doc");
			if (condition) {
				System.out.println(checkbox_list.get(i).isSelected());
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Folder name is invalid!!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
