package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.uhaul.com/");;
		
		WebElement trailersTowing = driver.findElement(By.xpath("//*[@id=\"mainHeaderMenu\"]/li[6]/a[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(trailersTowing).build().perform();
		
		
	}

}
