package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "swag labs";
		
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}
		
		
		// 8 locators are used to locate any web element
		WebElement usernameTextbox = driver.findElement(By.name("user-name"));
		usernameTextbox.sendKeys("standard_user");
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement pageTitle = driver.findElement(By.className("title"));
		String pageTitleText = pageTitle.getText();
		
		System.out.println(pageTitleText);
		
		boolean isPageTitleDisplaying = pageTitle.isDisplayed();
		System.out.println(isPageTitleDisplaying);
//		driver.close();
		
		
	}

}
