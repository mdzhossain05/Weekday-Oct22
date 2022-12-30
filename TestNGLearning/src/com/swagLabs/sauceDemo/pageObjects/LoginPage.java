package com.swagLabs.sauceDemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Page object model - is a concept to separate the web elements from the script.
// For each each and every page we create a class like for login page - LoginPage.java

public class LoginPage {
	WebDriver internalDriver;
	//Constructor 
	// no return type
	// constructor should be the same as class name
	public LoginPage(WebDriver driver) {
		internalDriver = driver;
	}
	
	public WebElement userNameTextbox() {
		WebElement usernameTextbox = internalDriver.findElement(By.name("user-name"));
		return usernameTextbox;
	}
	
	public WebElement passwordTextbox() {
		WebElement passwordTextbox = internalDriver.findElement(By.id("password"));
		return passwordTextbox;
	}
	
	public void loginButton() {
		WebElement loginButton = internalDriver.findElement(By.id("login-button"));
		loginButton.click();
	}

}
