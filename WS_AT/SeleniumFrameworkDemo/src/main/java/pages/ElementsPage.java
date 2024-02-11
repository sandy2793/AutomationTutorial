package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
//	WebDriver driver;
	
	public ElementsPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By elements_subMenu_list = By.xpath("//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li");
	
	@FindBy(xpath = "//div[text()='Elements' and @class='header-text']/ancestor::div[@class='element-group']//ul/li")
	List<WebElement> elementsSubMenu_list;
	
	@FindBy(xpath = "//div[text()='Book Store Application' and @class='header-text']/ancestor::div[@class='element-group']//ul/li")
	List<WebElement> bookStoreSubMenu_list;
	
//	public List<WebElement> getElementsSubMenuList() {
//		return driver.findElements(elements_subMenu_list);
//	}
	
	public void clickOnElementsSubMenu(String subMenuName) {
//		List<WebElement> elements_subMenu_list = getElementsSubMenuList();
		for(int i = 0; i < elementsSubMenu_list.size() ; i++) {
			boolean condition = elementsSubMenu_list.get(i).getText().equals(subMenuName);
			if (condition) {
				elementsSubMenu_list.get(i).click();
				break;
			}
			else if(i == elementsSubMenu_list.size()-1) {
				System.out.println(subMenuName+" sub menu name is invalid!!");
			}
		}
	}
	
	public void clickOnBookStoreSubMenu(String subMenuName) {
//		List<WebElement> elements_subMenu_list = getElementsSubMenuList();
		for(int i = 0; i < bookStoreSubMenu_list.size() ; i++) {
			boolean condition = bookStoreSubMenu_list.get(i).getText().equals(subMenuName);
			if (condition) {
				bookStoreSubMenu_list.get(i).click();
				break;
			}
			else if(i == bookStoreSubMenu_list.size()-1) {
				System.out.println(subMenuName+" sub menu name is invalid!!");
			}
		}
	}
	
	

}
