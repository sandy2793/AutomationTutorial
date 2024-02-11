package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQALogin {
	
	public DemoQALogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userName")
	WebElement username_tb;
	
	@FindBy(id = "password")
	WebElement password_tb;
	
	@FindBy(id = "login")
	WebElement login_btn;
	
	public void enterUsername(String username) {
		username_tb.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		password_tb.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		login_btn.click();
	}

}
