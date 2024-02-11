package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//	WebDriver driver;
	
	public HomePage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//1st way
	By menu_list = By.cssSelector("div.top-card");
	
	//2nd way
	String menu_list_locator = "div.top-card";
	
	//3rd way
	@FindBy(css = "div.top-card") 
	List<WebElement> menuList;
	
	@FindBy(how = How.CSS, using = "div.top-card")
	WebElement userElement;
	
	
//	public List<WebElement> getMenuListElement() {
//		return driver.findElements(By.cssSelector(menu_list_locator));
//	}
//	
//	public List<WebElement> getMenuListElements() {
//		return driver.findElements(menu_list);
//	}
	
	public void clickOnMenu(String menuName) {
//		List<WebElement> menu_list = getMenuListElements();
		for(int i = 0; i < menuList.size() ; i++) {
			boolean condition = menuList.get(i).getText().equals(menuName);
			if (condition) {
				menuList.get(i).click();
				break;
			}
			else if(i == menuList.size()-1) {
				System.out.println(menuName+" menu name is invalid!!");
			}
		}
	}
	
	

}
