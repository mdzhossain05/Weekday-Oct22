package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		return driver;
	}

}
