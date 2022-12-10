package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLearning {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
		driver.get("https://www.saucedemo.com/");
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.getTitle();
		
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		//class will start again at 8:40
	}

}
