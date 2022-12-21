package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuaranceCompany {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// URL - Unified Resource Locator
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		
		WebElement automobile = driver.findElement(By.xpath("(//*[@name = 'Navigation Automobile'])[1]"));
		automobile.click();
		
		WebElement automobilePageHeader = driver.findElement(By.id("selectedinsurance"));
		String pageHeader = automobilePageHeader.getText();
		System.out.println(pageHeader);
		
		WebElement makeDropdown = driver.findElement(By.id("make"));
//		makeDropdown.sendKeys("BMW");
		
		Select selectMake = new Select(makeDropdown);
//		selectMake.selectByVisibleText("12/20/2022");
		
//		selectMake.selectByValue("BMW");
		
		selectMake.selectByIndex(2);
	}

}
