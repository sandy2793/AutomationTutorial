package at.day037;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[contains(@class, 'top-card')]")).click();
		
		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Text Box");
			if (condition) {
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		
		WebElement fullName_tb = driver.findElement(By.id("userName"));
		fullName_tb.sendKeys("Sandy Bane");
		System.out.println(fullName_tb.getAttribute("value"));
		
		WebElement submit_btn = driver.findElement(By.id("submit"));
		submit_btn.click();
		
		WebElement result_text = driver.findElement(By.id("name"));
		System.out.println(result_text.getText());

	}

}
