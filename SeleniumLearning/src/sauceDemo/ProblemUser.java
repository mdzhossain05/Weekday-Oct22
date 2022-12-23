package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemUser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		
//		WebElement usernameTextbox = driver.findElement(By.name("user-name"));
//		usernameTextbox.sendKeys("problem_user");
		
		loginPage.userNameTextbox().sendKeys( "problem_user");
		
//		WebElement passwordTextbox = driver.findElement(By.id("password"));
//		passwordTextbox.sendKeys("secret_sauce");
		
		loginPage.passwordTextbox();
		
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		loginButton.click();
		
		loginPage.loginButton();
		
	}

}
