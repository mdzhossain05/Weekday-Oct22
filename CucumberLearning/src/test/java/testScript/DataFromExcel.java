package testScript;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromExcel {

	public static void main(String[] args) throws IOException {
			
		File file = new File("D:\\IT Surface\\Oct_batch-Soft\\testData-userName.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		//Ms office - doc, xls, ppt - HSSF
		//MS office - docx, xlsx, pptx - XSSF
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		XSSFRow row = sheet1.getRow(3);
		XSSFCell cell = row.getCell(0);
		String userName = cell.toString();
		System.out.println(userName);
		
		WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
			driver = new ChromeDriver();
			
			Properties prop = new Properties();
			prop.load(new FileInputStream("src\\test\\resources\\config.properties"));
			
			driver.get(prop.getProperty("url"));
			
//			driver.get("https://www.saucedemo.com/");
		
			WebElement userNameTextbox = driver.findElement(By.id("user-name"));
			userNameTextbox.sendKeys(userName);
			
			WebElement passwordTextbox = driver.findElement(By.id("password"));
			passwordTextbox.sendKeys("secret_sauce");
			
			WebElement loginButton = driver.findElement(By.id("login-button"));
			loginButton.click();
			
		
	}

}
