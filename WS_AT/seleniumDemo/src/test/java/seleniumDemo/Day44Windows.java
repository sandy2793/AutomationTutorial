package seleniumDemo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day44Windows {

	public static void main(String[] args) throws Exception {
		
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
			boolean condition = elements_subMenu_list.get(i).getText().equals("Browser Windows");
			if (condition) {
				js.executeScript("arguments[0].scrollIntoView();", elements_subMenu_list.get(i));
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		
//		System.out.println(driver.getWindowHandle());
		Set<String> windowIds = driver.getWindowHandles();
//		System.out.println(windowIds.size());
//		System.out.println(windowIds);
		
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		windowIds = driver.getWindowHandles();
//		System.out.println(windowIds.size());
//		System.out.println(windowIds);
		
		String[] windows = new String[windowIds.size()];
		int i = 0;
		for(String win : windowIds) {
			windows[i] = win;
			i++;
	    }
		
//		System.out.println(Arrays.toString(windows));
		
		driver.switchTo().window(windows[1]);
//		Thread.sleep(3000);
//		System.out.println(driver.getWindowHandle());
		
		WebElement newTabHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(newTabHeader.isDisplayed());
		
		driver.close();
		
		driver.switchTo().window(windows[0]);
		
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		windowIds = driver.getWindowHandles();
		windows = new String[windowIds.size()];
		i = 0;
		for(String win : windowIds) {
			windows[i] = win;
			i++;
	    }
		
		driver.switchTo().window(windows[1]);
		WebElement newWindowHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(newWindowHeader.getText());

		driver.close();
		
		driver.switchTo().window(windows[0]);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		

		Thread.sleep(10000);
		driver.quit();

	}

}
