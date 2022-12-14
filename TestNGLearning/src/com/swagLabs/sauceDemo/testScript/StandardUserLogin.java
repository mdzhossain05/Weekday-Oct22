package com.swagLabs.sauceDemo.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.swagLabs.sauceDemo.pageObjects.LoginPage;


public class StandardUserLogin extends BaseClass{
//	LoginPage loginPage;
//	WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
//		driver = new ChromeDriver();
//		// URL - Unified Resource Locator
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		loginPage = new LoginPage(driver);
//	}
	
//	@Parameters("userName")
	@Test(priority = 1)
	public void userName() {
		loginPage.userNameTextbox().sendKeys("standard_user");
	}

	@Test(priority = 2)
	public void password() {
		loginPage.passwordTextbox().sendKeys("secret_sauce");;
	}

	@Test(priority = 3)
	public void login() {
		loginPage.loginButton();
	}

	@AfterTest
	public void closeBrowser() {
//		driver.quit();
	}
	
}
