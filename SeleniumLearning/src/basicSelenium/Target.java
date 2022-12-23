package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Target {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// URL - Unified Resource Locator
		driver.get("https://www.target.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement topGifts = driver.findElement(
				By.xpath("(//h3[@class='Heading__StyledHeading-sc-1ihrzmk-0 jmSnUp h-margin-b-none'])[3]"));
		topGifts.click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement throwBlanket = driver.findElement(By.xpath("//*[@class ='Heading__StyledHeading-sc-1ihrzmk-0 jmSnUp storycard--headline'])[2]"));
//		js.executeScript("arguments[0].setAttribute('display', 'none')", throwBlanket);
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement throwBlanket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class ='Heading__StyledHeading-sc-1ihrzmk-0 jmSnUp storycard--headline'])[2]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", throwBlanket);

		WebElement throwBlanket = driver.findElement(
				By.xpath("(//*[@class ='Heading__StyledHeading-sc-1ihrzmk-0 jmSnUp storycard--headline'])[2]"));
		js.executeScript("arguments[0].click();", throwBlanket);

//		throwBlanket.click();
		Thread.sleep(5000);

		WebElement redBlanket = driver.findElement(By.xpath("(//*[@data-test = '@web/ProductCard/ProductCardVariantDefault'])[2]/div[2]/div/div/button"));

//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", redBlanket);
		Thread.sleep(2000);
		redBlanket.click();

		
	}

}
