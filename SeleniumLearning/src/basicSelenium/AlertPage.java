package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
	WebDriver internalDriver;
	public  AlertPage(WebDriver driver) {
		internalDriver=driver;
	}
	
	public WebElement   alertClick() {
WebElement alertClick= internalDriver.findElement(By.id("alertButton"));
		 return   alertClick;	
	}
	
	public WebElement alertClick2() {
	WebElement alertClick2= internalDriver.findElement(By.id("timerAlertButton"));
    return alertClick2;
	}
	
	public WebElement alertClick3() {
 WebElement alertClick3= internalDriver.findElement(By.id("confirmButton"));
    return alertClick3;
	}
	public WebElement confirmResult() {
  WebElement confirmResult= internalDriver.findElement(By.className("text-success"));
  return confirmResult;
	}
	public WebElement alertClick4() throws InterruptedException {
		 WebElement alertClick4= internalDriver.findElement(By.id("promtButton"));
		//You need to scroll to the element
		 ((JavascriptExecutor) internalDriver).executeScript("arguments[0].scrollIntoView(true);", alertClick4);
		Thread.sleep(500); 

	 return alertClick4;
	}
	
}
