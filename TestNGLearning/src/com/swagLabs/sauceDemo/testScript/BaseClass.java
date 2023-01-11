package com.swagLabs.sauceDemo.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.swagLabs.sauceDemo.pageObjects.LoginPage;

public class BaseClass {
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL - Unified Resource Locator
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
