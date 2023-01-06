package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;


public class StepDef {
	WebDriver driver;
	
	@Given("open the google chrome browser and Go to sauce demo app")
	public void open_the_google_chrome_browser_and_go_to_sauce_demo_app() {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@When("user enter {string} in username text box")
	public void user_enter_in_username_text_box(String userName) {
		WebElement usernameTextbox = driver.findElement(By.name("user-name"));
		usernameTextbox.sendKeys(userName);
	}

	@When("user enter standard_user in username text box")
	public void user_enter_standard_user_in_username_text_box() {
		WebElement usernameTextbox = driver.findElement(By.name("user-name"));
		usernameTextbox.sendKeys("standard_user");
	}
	
	@When("user enter locked_out_user in username text box")
	public void user_enter_locked_out_user_in_username_text_box() {
		WebElement usernameTextbox = driver.findElement(By.name("user-name"));
		usernameTextbox.sendKeys("locked_out_user");
	}
	
	@When("user enter performance_glitch_user in username text box")
	public void user_enter_performance_glitch_user_in_username_text_box() {
		WebElement usernameTextbox = driver.findElement(By.name("user-name"));
		usernameTextbox.sendKeys("performance_glitch_user");
	}
	
	@When("user enter {string} in password Text box")
	public void user_enter_in_password_text_box(String password) {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys(password);
	}

	@When("user enter secret_sauce in password Text box")
	public void user_enter_secret_sauce_in_password_text_box() {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@Then("user should be in Product page")
	public void user_should_be_in_product_page() {
		String actualUrl=driver.getCurrentUrl();
		  String expectedUrl="https://www.saucedemo.com/inventory.html";
		  
		  Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	

}
