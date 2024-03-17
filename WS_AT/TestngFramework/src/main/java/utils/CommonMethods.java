package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;
import helper.ObjectFactory;

/**
 * This class contains common methods like read properties file, get random value, etc.
 * All methods of this class is static in nature and it's inherit {@link ObjectFactory} class.
 * @author Sandesh Lahoti
 */
public class CommonMethods extends ObjectFactory {
	
	/**
	 * This method is to get key value from {@link Properties} file.
	 * @param keyName
	 * @return
	 */
	public static String getKeyValueFromPropertyFile(String keyName) {
		try {
			prop = new Properties();
			prop.load(new FileInputStream(new File(CONFIG_FILE_PATH)));
			return prop.getProperty(keyName);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * This method is get random value as per passed length.
	 * @param length
	 * @return
	 */
	public static String getRandomValue(int length) {
		return RandomStringUtils.random(length, true, true);
	}
	
	/**
	 * This method is get random number as per passed length.
	 * @param length
	 * @return
	 */
	public static String getRandomNo(int length) {
		return RandomStringUtils.random(length, false, true);
	}
	
	/**
	 * This method is get random characters as per passed length.
	 * @param length
	 * @return
	 */
	public static String getRandomCharacters(int length) {
		return RandomStringUtils.random(length, true, false);
	}

}
