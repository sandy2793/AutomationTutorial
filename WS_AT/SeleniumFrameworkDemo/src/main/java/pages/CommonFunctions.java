package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class CommonFunctions {
	
	
	public static void main(String[] args) throws Throwable {
		
//		System.out.println(RandomStringUtils.random(10, true, true));
		
		// 15/03/2024  15.03.2024   15-03-2024  03-15-2024 15-Mar-2024 15-March-2024
//		System.out.println(getCurrentDate("ddMMyyyyHHmmss"));
		System.out.println(getSpecificDate("dd-MMM-yyyy HH:mm:ss", -12));
	}
	
	public static String getSpecificDate(int days) throws Throwable {
		SimpleDateFormat simple_date_format = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calender = Calendar.getInstance();
		calender.add(Calendar.DAY_OF_MONTH, days);
		return simple_date_format.format(calender.getTime());
	}
	
	public static String getSpecificDate(String format, int days) throws Throwable {
		SimpleDateFormat simple_date_format = new SimpleDateFormat(format);
		Calendar calender = Calendar.getInstance();
		calender.add(Calendar.HOUR, days);
		return simple_date_format.format(calender.getTime());
	}
	
	// dd - date
	// MM / MMM, Month - month
	// yyyy - year
	// HH - hours
	// mm - minute
	// ss - seconds
	public static String getCurrentDate() {
		SimpleDateFormat simple_date_format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Calendar calender = Calendar.getInstance();
		return simple_date_format.format(calender.getTime());
	}
	
	public static String getCurrentDate(String format) {
		SimpleDateFormat simple_date_format = new SimpleDateFormat(format);
		Calendar calender = Calendar.getInstance();
		return simple_date_format.format(calender.getTime());
	}
	
	public static String getRandomNumber(int length) {
		return RandomStringUtils.random(length, false, true);
	}
	
	public static String getRandomCharacters(int length) {
		return RandomStringUtils.random(length, true, false);
	}
	
	
	public static String getRandomValue(int length) {
		return RandomStringUtils.random(length, true, true);
	}
	
	/**
	 * This method for generate a random number with give length and return in string.
	 * This method is static and pass how many digit in between 1 to 10;
	 * @param {int} how_many_digit - digit to generate deserver length of random number
	 * @return {String} random_number - return generated random no in string
	 */
	public static String getRandomN0(int how_many_digit) {
		Random random = new Random();
		String random_number = null;
		switch (how_many_digit) {
		case 1:
			random_number = Integer.toString(1 + (int)(random.nextFloat() * 8));
			break;

		case 2:
			random_number = Integer.toString(10 + (int)(random.nextFloat() * 89));
			break;

		case 3:
			random_number = Integer.toString(100 + (int)(random.nextFloat() * 899));
			break;

		case 4:
			random_number = Integer.toString(1000 + (int)(random.nextFloat() * 8999));
			break;

		case 5:
			random_number = Integer.toString(10000 + (int)(random.nextFloat() * 89990));
			break;

		case 6:
			random_number = Integer.toString(100000 + (int)(random.nextFloat() * 899900));
			break;

		case 7:
			random_number = Integer.toString(1000000 + (int)(random.nextFloat() * 8999000));
			break;

		case 8:
			random_number = Integer.toString(10000000 + (int)(random.nextFloat() * 89990000));
			break;

		case 9:
			random_number = Integer.toString(100000000 + (int)(random.nextFloat() * 899900000));
			break;

		case 10:
			random_number = Integer.toString(1000000000 + (int)(random.nextFloat() * 1147483600));
			break;

		default:
			int q = how_many_digit/10, r = how_many_digit%10;
			random_number = getRandomNumber(10);
			for (int i = 1; i < q; i++) {
				random_number = random_number + getRandomNumber(10);
			}
			random_number = random_number + getRandomNumber(r);
			break;
		}
		return random_number;
	}
	
	
	
	

}
