package at.day039;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day38 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[contains(@class, 'top-card')]")).click();
		
		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));
		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Radio Button");
			if (condition) {
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		boolean result = false;
		try {
			WebElement radioBtnHeader = driver.findElement(By.xpath("//div[text()='Do you like the site?']"));
			result = radioBtnHeader.isDisplayed();
		} catch (Exception e) {
			result = false;
			System.out.println(e.getMessage());
		}
		System.out.println(result);
		
		List<WebElement> radioBtn_list = driver.findElements(By.cssSelector("div.custom-radio"));
		
		for(int i = 0; i < radioBtn_list.size(); i++) {
			boolean condition = radioBtn_list.get(i).getText().equals("Impressive");
			if(condition) {
				radioBtn_list.get(i).click();
				break;
			}
			else if(i == radioBtn_list.size()-1) {
				System.out.println("Radio button name is invalid!!!");
			}
		}
		
		WebElement sucessMsg = driver.findElement(By.xpath("//span[@class='text-success']/parent::p"));
		System.out.println(sucessMsg.getText());
		boolean isDisabled = false;
		for(int i = 0; i < radioBtn_list.size(); i++) {
			boolean condition = radioBtn_list.get(i).getText().equals("No");
			if(condition) {
				isDisabled = radioBtn_list.get(i).getAttribute("class").contains("disabled");
				break;
			}
			else if(i == radioBtn_list.size()-1) {
				isDisabled = false;
				System.out.println("Radio button name is invalid!!!");
			}
		}
		
		System.out.println("No Radio button is disabled: "+isDisabled);
		
	}

}
