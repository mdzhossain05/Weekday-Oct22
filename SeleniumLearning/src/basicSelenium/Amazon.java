package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement holidayGiftGuideLink = driver.findElement(By.partialLinkText("Gift Guide"));
		
		holidayGiftGuideLink.click();
	}

}
