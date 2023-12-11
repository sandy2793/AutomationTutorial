package at.day035;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateELementDemo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement country_textbox = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		List<WebElement> checkbox_option_list = driver.findElements(By.cssSelector("#checkbox-example label"));
		
		String pageHerder = driver.findElement(By.tagName("h1")).getText();
		System.out.println(pageHerder);
		
		
//		driver.findElement(By.xpath("//button[text()='Home']")).click();
		country_textbox.sendKeys("India");
		Thread.sleep(5000);
		country_textbox.clear();
		
		String homeLink = driver.findElement(By.xpath("//button[text()='Home']/parent::a")).getAttribute("href");
		System.out.println(homeLink);
		
		String tagname = driver.findElement(By.xpath("//button[text()='Home']/parent::a")).getTagName();

		driver.findElement(By.xpath("//button[text()='Home']")).submit();

	}

}
