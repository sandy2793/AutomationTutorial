package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BooksPage {
	WebDriver driver;
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id = "userName-value")
	WebElement username_text;
	
	@FindBy(id = "login")
	WebElement login_btn;
	
	
	
	public void verifybooksPageIsOpen() {
		WebdriverMethods.visibilityOfElementWait(driver, username_text, 5);
		Assert.assertTrue(WebdriverMethods.isElementPresent(username_text), 
				"Books page is not opened!!!");
	}
	
	public void waitTillLoginButtonVisible() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(login_btn));
	}
	

}
