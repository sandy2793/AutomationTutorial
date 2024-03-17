package helper;

import java.util.Properties;
import org.openqa.selenium.WebDriver;

/**
 * This class contains all object and variables which use in all over the project.
 * All objects & variables are static in nature.
 * @author Sandesh Lahoti
 */
public class ObjectFactory {
	
	//Constant Variable
	public static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/config.properties";
	
	//Selenium Webdriver object to interact with browser
	public static WebDriver driver;
	
	//Properties object to read configuration file
	public static Properties prop;
	
	//Configuration variables
	public static String browser;
	
	
	

}
