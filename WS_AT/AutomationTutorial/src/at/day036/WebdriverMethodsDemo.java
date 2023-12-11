package at.day036;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebdriverMethodsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		//		driver.findElement(By.xpath("//button[text()='Home']")).click();
		//		System.out.println(driver.getCurrentUrl());
		//		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		//		System.out.println(driver.switchTo());
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//		dropdown.click();
//		List<WebElement> option_list = driver.findElements(By.cssSelector("#dropdown-class-example option"));
//		for (int i = 0; i < option_list.size(); i++) {
//			if (option_list.get(i).getText().equals("Option2")) {
//				option_list.get(i).click();
//				break;
//			}
//			else if (i == option_list.size()-1 && !option_list.get(i).getText().equals("Option2")){
//				System.out.println("Invalid option");
//			}
//		}
		
		Select select = new Select(dropdown);
		select.selectByIndex(3);

		//		driver.quit();

	}

}
