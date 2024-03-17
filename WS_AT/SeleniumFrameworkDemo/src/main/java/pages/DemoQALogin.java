package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoQALogin {
	WebDriver driver;
	
	public DemoQALogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(css = "div.login-wrapper h1")
	WebElement login_hdr;
	
	@FindBy(id = "userName")
	WebElement username_tb;
	
	@FindBy(id = "password")
	WebElement password_tb;
	
	@FindBy(id = "login")
	WebElement login_btn;
	
	
	public void verifyLoginPageIsOpen() {
		WebdriverMethods.visibilityOfElementWait(driver, login_hdr, 5);
//		Assert.assertTrue(WebdriverMethods.isElementPresent(login_hdr), 
//				"Login page is not opened!!!");
		Assert.assertEquals(WebdriverMethods.getText(login_hdr), "Login", "Login header text is not as expected!!!");
	}
	
	
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
