package com.swagLabs.sauceDemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// Page object model - is a concept to separate the web elements from the script.
// For each each and every page we create a class like for login page - LoginPage.java

public class LoginPage {
	WebDriver driver;
	//Constructor 
	// no return type
	// constructor should be the same as class name
	//super, this
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "user-name")
	private WebElement usernameTextbox;
	
	public WebElement userNameTextbox() {
		return usernameTextbox;
	}
	
	public WebElement passwordTextbox() {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		return passwordTextbox;
	}
	
	public void loginButton() {
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

}
