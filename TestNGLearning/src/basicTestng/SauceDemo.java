package basicTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SauceDemo {
	LoginPage loginPage;
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		loginPage = new LoginPage(driver);
	}
	
	
	@Test
	public void userName() {
		loginPage.userNameTextbox().sendKeys("standard_user");
		}
		@Test
		public void password() {
		loginPage.passwordTextbox();
		}
		
		@Test
		public void login() {
		loginPage.loginButton();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
