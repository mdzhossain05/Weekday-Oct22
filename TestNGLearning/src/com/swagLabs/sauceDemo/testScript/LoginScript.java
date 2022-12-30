package com.swagLabs.sauceDemo.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.swagLabs.sauceDemo.pageObjects.LoginPage;


public class LoginScript {
	LoginPage loginPage;
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("safari")) {
			System.setProperty("webdriver.safari.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
			driver = new SafariDriver();
		}
		
		// URL - Unified Resource Locator
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}
	
	@Parameters("userName")
	@Test(priority = 1)
	public void userName(String userN) {
		loginPage.userNameTextbox().sendKeys(userN);
	}

	@Parameters("password")
	@Test(priority = 2)
	public void password(String pwd) {
		loginPage.passwordTextbox().sendKeys(pwd);
	}

	@Test(priority = 3)
	public void login() {
		loginPage.loginButton();
	}

	@AfterTest
	public void closeBrowser() {
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		Assert.assertTrue(true);
//		driver.quit();
	}
	
}
