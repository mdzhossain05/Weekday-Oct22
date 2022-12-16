package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterNewUser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement registerLink = driver.findElement(By.className("ico-register"));
		registerLink.click();
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		
		WebElement firstnameTextbox = driver.findElement(By.id("FirstName"));
		firstnameTextbox.clear();
		firstnameTextbox.sendKeys("Zakir");
		
		WebElement lastnameTextbox = driver.findElement(By.id("LastName"));
		lastnameTextbox.clear();
		lastnameTextbox.sendKeys("Hossain");
		
		WebElement emailTextbox = driver.findElement(By.id("Email"));
		emailTextbox.clear();
		emailTextbox.sendKeys("zakir.hossain10@gmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.name("Password"));
		passwordTextbox.clear();
		passwordTextbox.sendKeys("Abcd1234");
		
		WebElement confirmPasswordTextbox = driver.findElement(By.name("ConfirmPassword"));
		confirmPasswordTextbox.clear();
		confirmPasswordTextbox.sendKeys("Abcd1234");
		
		WebElement registerButton = driver.findElement(By.id("register-button"));
		boolean registerButtonDisplayed = registerButton.isDisplayed();
		
		if(registerButtonDisplayed) {
			System.out.println("Register button displayed");
		}else {
			System.out.println("Register button not displayed");
		}
		
		boolean registerButtonEnabled = registerButton.isEnabled();
		
		if(registerButtonEnabled) {
			System.out.println("Register button enabled");
		}else {
			System.out.println("Register button not enabled");
		}
		
		registerButton.click();
		
//		Thread.sleep(5000);
		
//		WebElement continueButton = driver.findElement(By.className("button-1 register"));
//		continueButton.click();
		
		//Xpath - Absolute xpath & Relative xpath
		
		//Absolute xpath
//		WebElement continueButtonAXpath = driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input"));
//		continueButtonAXpath.click();
		
		//Relative xpath - //tag name[@attribute name = "value"]
		WebElement continueButtonRXpath = driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
		continueButtonRXpath.click();
		
		
		//8 locators - class name, name, id, link Text, partial link text, tag name
		//css selector
		//xpath - absolute xpath & relative xpath
	}

}
