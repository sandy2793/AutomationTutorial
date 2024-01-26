package seleniumDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day43Frame {

	public static void main(String[] args) {
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
			boolean condition = elements_subMenu_list.get(i).getText().equals("Nested Frames");
			if (condition) {
				js.executeScript("arguments[0].scrollIntoView();", elements_subMenu_list.get(i));
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		
//		WebElement frame2 = driver.findElement(By.id("frame2"));
//		
//		driver.switchTo().frame(frame2);
//		//
//		WebElement frame_hdr = driver.findElement(By.id("sampleHeading"));
//		System.out.println(frame_hdr.getText());
//		
//		driver.switchTo().defaultContent();
		WebElement header = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println(header.isDisplayed());
		
		driver.switchTo().frame("frame1");

		WebElement parentFrame = driver.findElement(By.xpath("//*[text()='Parent frame']"));
		System.out.println(parentFrame.isDisplayed());
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("[srcdoc='<p>Child Iframe</p>']")));
		
		WebElement childFrame = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
		System.out.println(childFrame.isDisplayed());
		
		driver.switchTo().parentFrame();
		System.out.println(parentFrame.isDisplayed());
		
		driver.switchTo().defaultContent();
		System.out.println(header.isDisplayed());
//		System.out.println(parentFrame.isDisplayed());
		
		

	}

}
