package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {

	static String excelFilePath = System.getProperty("user.dir") + "/TestData/TestData.xlsx";
	static String configPath = System.getProperty("user.dir") + "/config.properties";
	
	static Workbook workbook;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File(System.getProperty("user.dir") + "/TestData/TestData.xlsx");
		InputStream is = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load( new FileInputStream( new File(configPath) ) );
		
		System.out.println(getKeyValue("env"));
		
//		
//		Workbook workbook = new XSSFWorkbook(is);
//		Sheet sheet = workbook.getSheet("Login");
////		Row row = sheet.getRow(0);
////		Cell cell = row.getCell(0);
//		int noOfRows = sheet.getLastRowNum();
//		int noOfColumn = sheet.getRow(0).getLastCellNum();
//		for (int i = 1; i <= noOfRows; i++) {
//			for (int j = 0; j < noOfColumn; j++) {
//				System.out.print(getCellValue("Login", i, j)+"    ");
//			}
//			System.out.println();
//		}
//		System.out.println(getCellValue("Login", 0, 0));
		
		
//		OutputStream os = new FileOutputStream(file);
		
		
		
//		System.out.println(getCellValue("Login", "Email", 1));
		
		
	}
	
	public static void initWorkbook() throws Exception {
		File file = new File(System.getProperty("user.dir") + "/TestData/TestData.xlsx");
		InputStream is = new FileInputStream(file);
		workbook = new XSSFWorkbook(is);
	}
	
	public static int getNoOfRows(String sheetName) {
		try {
			initWorkbook();
			return workbook.getSheet(sheetName).getLastRowNum();
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static String getCellValue(String sheetName, int rowNum, int cellNum) {
		try {
			initWorkbook();
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			
			return cell.getStringCellValue();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getCellValue(String sheetName, String columnName, int rowNum) {
		try {
			initWorkbook();
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(0);
			int noOfColumns = row.getLastCellNum();
			int columnNo = -1;
			for (int i = 0; i < noOfColumns; i++) {
				if (getCellValue(sheetName, 0, i).equals(columnName)) {
					columnNo = i;
					break;
				}
				else if(i == noOfColumns-1) {
					columnNo = -1;
				}
			}
			
			return getCellValue(sheetName, rowNum, columnNo);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String getKeyValue(String keyName) {
		try {
			Properties prop = new Properties();
			prop.load( new FileInputStream( new File(configPath) ) );
			return prop.getProperty(keyName);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	

}
