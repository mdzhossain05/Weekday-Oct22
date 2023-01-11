package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Utility;

public class LoginStepDef {
WebDriver driver;
	
// picocontainer
	public LoginStepDef() {
		driver = Utility.getDriver();
	}
	//Hook
	//@Before
	//@After

	@Then("user should be in Product page")
	public void user_should_be_in_product_page() {
		String actualUrl=driver.getCurrentUrl();
		  String expectedUrl="https://www.saucedemo.com/inventory.html";
		  
		  Assert.assertEquals(expectedUrl, actualUrl);
	}
	
}
