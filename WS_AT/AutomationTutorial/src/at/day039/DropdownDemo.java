package at.day039;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		List<WebElement> menu_list = driver.findElements(By.cssSelector("div.top-card"));
		for(int i = 0; i < menu_list.size() ; i++) {
			boolean condition = menu_list.get(i).getText().equals("Widgets");
			if (condition) {
				menu_list.get(i).click();
				break;
			}
			else if(i == menu_list.size()-1) {
				System.out.println("Menu name is invalid!!");
			}
		}

		List<WebElement> elements_subMenu_list = driver.findElements(By.xpath("//div[text()='Widgets' and @class='header-text']/ancestor::div[@class='element-group']//ul/li"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for(int i = 0; i < elements_subMenu_list.size() ; i++) {
			boolean condition = elements_subMenu_list.get(i).getText().equals("Select Menu");
			if (condition) {
				js.executeScript("arguments[0].scrollIntoView();", elements_subMenu_list.get(i));
				elements_subMenu_list.get(i).click();
				break;
			}
			else if(i == elements_subMenu_list.size()-1) {
				System.out.println("Sub menu name is invalid!!");
			}
		}
		

		//		WebElement color_dd = driver.findElement(By.id("oldSelectMenu"));
		//		Select select = new Select(color_dd);
		//		select.selectByValue("3");
		//		
		//		
		//		WebElement title_dd = driver.findElement(By.id("selectOne"));
		//		
		//		title_dd.click();
		//		List<WebElement> title_option_list = driver.findElements(By.xpath("//div[text()='Pick one title']/following-sibling::div/div"));
		//		
		//		for (int i = 0; i < title_option_list.size(); i++) {
		//			boolean conditon = title_option_list.get(i).getText().equals("Ms.");
		//			if (conditon) {
		//				title_option_list.get(i).click();
		//				break;
		//			}
		//			else if ( i == title_option_list.size()-1 ) {
		//				System.out.println("Invalid title option");
		//			}
		//		}

		//		WebElement standard_dd_text = driver.findElement(By.xpath("//*[text()='Standard multi select']"));
		//		js.executeScript("arguments[0].scrollIntoView();", standard_dd_text);
		
		By mut = By.xpath("//b[text()='Multiselect drop down']/parent::p/following-sibling::div");
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(mut));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(mut));
		
		WebElement multiColor_dd = driver.findElement(mut);
		
		
		
		multiColor_dd.click();
		Thread.sleep(500);

		List<WebElement> multiColor_list = driver.findElements(By.xpath("//div[contains(@id, 'react-select')]"));
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfAllElements(multiColor_list));
		
		String[] options = {"Green", "Blue"};
		for (int j = 0; j < options.length; j++) {
			for (int i = 0; i < multiColor_list.size(); i++) {
				String optionText = multiColor_list.get(i).getText();
				boolean conditon = optionText.equals(options[j]);
				if (conditon) {
					multiColor_list.get(i).click();
					break;
				}
			}
			Thread.sleep(500);

			//			else if ( i == multiColor_list.size()-1 ) {
			//				System.out.println("Invalid title option");
			//			}
		}



	}

}
