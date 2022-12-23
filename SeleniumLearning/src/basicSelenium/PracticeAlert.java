package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		WebElement alertButton = driver.findElement(By.name("alert"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		alert.accept();
		
		WebElement confirmationBox = driver.findElement(By.name("confirmation"));
		confirmationBox.click();
		
		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
		alert.dismiss();
		
		WebElement promptButton = driver.findElement(By.name("prompt"));
		promptButton.click();
		
		String alertText = alert.getText(); //driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		Thread.sleep(2000);
		
//		driver.switchTo().alert().sendKeys("My Name");
		alert.sendKeys("Any Name");
		
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		
		// Robot class to handle windows alert
		
		
	}

}
