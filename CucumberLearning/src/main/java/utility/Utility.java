package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		return driver;
	}

}
