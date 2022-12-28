package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IT Surface\\Oct_batch-Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// URL - Unified Resource Locator
//		driver.get("https://www.amazon.com/");
//		
//		driver.manage().window().maximize();
//		
//		WebElement holidayGiftGuideLink = driver.findElement(By.partialLinkText("Gift Guide"));
//		
//		holidayGiftGuideLink.click();
		
		
		    // unified resource locator
		   driver.get("http://sampleapp.tricentis.com/101/index.php");
		   driver.manage().window().maximize();
		   
		   //implicit wait
		   driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		   WebDriverWait wait = new WebDriverWait(driver, 25);
		   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='get_automobile']"))));
		    WebElement getAQuitForAutomobile = driver.findElement(By.xpath("//a[@title='Get Quote Automobile']"));
		   getAQuitForAutomobile.click();
//		    WebDriverWait wait = new WebDriverWait(driver, 25);
//		    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='get_motorcycle']"))));
//		    WebElement getAQuitForMotorbike = driver.findElement(By.xpath("//a[@title='Get Quote Motorcycle']"));
//		    getAQuitForMotorbike.click();
//		    WebElement automobileSlideButton = driver.findElement(By.xpath("//a[@class='flex-active']"));
//		    automobileSlideButton.click();
		   System.out.println(driver.getTitle());
		   //System.out.println(automobileSlideButton.getText());
		  WebElement automobileMenuButton = driver.findElement(By.xpath("//div[@class='main-navigation']/ul/li/a[@name='Navigation Automobile']"));
		   automobileMenuButton.click();
		   
		   WebElement automoblePageHeader = driver.findElement(By.id("selectedinsurance"));
		   String actualPageHeader =automoblePageHeader.getText();
		   String expectedPageHeader = "Automobile Insurance";
		   System.out.println(actualPageHeader);
		   System.out.println(expectedPageHeader);
		   if(actualPageHeader.equals(expectedPageHeader)){
		    System.out.println("test passed");
		   }else {
		    System.out.println("test failed");
		   }
		   WebElement MakeDropdown = driver.findElement(By.xpath("//select[@id='make']"));
		    Select select = new Select(MakeDropdown);
		    select.selectByVisibleText("Honda");
		   
		    WebElement enginePerformance = driver.findElement(By.xpath("//input[@id='engineperformance']"));
		    enginePerformance.sendKeys("1000");
		   
		    WebElement dateOfManufactureTextBox = driver.findElement(By.xpath("//input[@id='dateofmanufacture']"));
		    dateOfManufactureTextBox.sendKeys("01/02/2022");
		    WebElement numberOfSeatDropdown = driver.findElement(By.id("numberofseats"));
		    Select select1 = new Select(numberOfSeatDropdown);
		   select1.selectByVisibleText("8");
		   WebElement fuelTypeTextBox = driver.findElement(By.xpath("//select[@id='fuel']"));
		   Select select2 = new Select(fuelTypeTextBox);
		   select2.selectByVisibleText("Gas");
		   WebElement listPriceText = driver.findElement(By.name("List Price"));
		   listPriceText.sendKeys("44000");
		   WebElement licensePlateNumber = driver.findElement(By.id("licenseplatenumber"));
		   licensePlateNumber.sendKeys("TYr2376");
		   WebElement annualMileageTextBox = driver.findElement(By.id("annualmileage"));
		   annualMileageTextBox.sendKeys("30000");
		   Thread.sleep (1500);
		   WebElement nextButton = driver.findElement(By.id("nextenterinsurantdata"));
		   nextButton.click();
		   System.out.println(driver.getTitle());
		   WebElement firstName = driver.findElement(By.id("firstname"));
		   firstName.sendKeys("My");
		   WebElement lastName = driver.findElement(By.id("lastname"));
		   lastName.sendKeys("Name");
		   WebElement dateOfBirth = driver.findElement(By.id("birthdate"));
		   dateOfBirth.sendKeys("02/03/1998");
		   Thread.sleep (1500);

		   
		   WebElement gender = driver.findElement(By.xpath("(//span[@class='ideal-radio'])[2]"));
		   
		   
		   gender.click();
		   
		  // Thread.sleep (15000)
		   //WebElement streetAddress = driver.findElement(By.xpath("//div[@class='idealsteps-wrap']/section[@class='idealsteps-step']/div[@class='field idealforms-field idealforms-field-text']/input[@id='streetaddress']"));
		   WebElement streetAddress = driver.findElement(By.xpath("//input[@id='streetaddress']"));
		   streetAddress.sendKeys("69 village stream rd");
		   WebElement countryDropdown = driver.findElement(By.id("country"));
		   Select select3 = new Select(countryDropdown);
		   select3.selectByVisibleText("United States");
		   WebElement zipCode = driver.findElement(By.name("Zip Code"));
		   zipCode.sendKeys("20155");
		   WebElement city = driver.findElement(By.xpath("//input[@name='City']"));
		   city.sendKeys("Gainesville");
		   WebElement occupationDropdownBox = driver.findElement(By.xpath("//select[@id='occupation']"));
		   Select select4 = new Select(occupationDropdownBox);
		   select4.selectByVisibleText("Employee");
		   
		   WebElement hobbiesCheckBox = driver.findElement(By.xpath("(//span[@class='ideal-check'])[5]"));
		   hobbiesCheckBox.click();
		   WebElement websiteTextBox = driver.findElement(By.id("website"));
		  websiteTextBox.sendKeys("www.google.com");
		   WebElement pictureTextBox = driver.findElement(By.xpath("//input[@name='Picture']"));
		   WebElement openButton = driver.findElement(By.xpath("//button[@name='Go Search Support']"));
		   Thread.sleep (1500);
		   WebElement nextButton1 = driver.findElement(By.xpath("//button[@id='nextenterproductdata']"));
		   nextButton1.click();
		   System.out.println(driver.getTitle());
		   WebElement StartDate = driver.findElement(By.id("startdate"));
		   StartDate.sendKeys("03/03/2023");
		   WebElement InsuranceSumDropdownBox = driver.findElement(By.name("Insurance Sum"));
		   Select select5 = new Select(InsuranceSumDropdownBox);
		   select5.selectByVisibleText("15.000.000,00");
		   WebElement MeritRatingDropdown = driver.findElement(By.xpath("//select[@name='Merit Rating']"));
		   Select select6 = new Select(MeritRatingDropdown);
		   select6.selectByValue("Bonus 6");
		  WebElement damageInsuranceDropdown = driver.findElement(By.xpath("//select[@id='damageinsurance']"));
		    Select select7 = new Select(damageInsuranceDropdown);
		   select7.selectByVisibleText("Partial Coverage");
		   // explicit wait
		   WebDriverWait wait1 = new WebDriverWait(driver, 25);
		   wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[@class='ideal-check'])[6]"))));
		   
		   WebElement optionalProduct = driver.findElement(By.xpath("(//span[@class='ideal-check'])[6]"));
		   //WebElement optionalProduct = driver.findElement(By.xpath("(//span[@class='ideal-check'])[7]"));
		   optionalProduct.click();
		   
		   
		   
		   WebElement CourtesyCarDropdown = driver.findElement(By.xpath("//select[@name='Courtesy Car']"));
		   Select select8 = new Select(CourtesyCarDropdown);
		   select8.selectByVisibleText("Yes");
		   Thread.sleep (5000);
		   WebElement nextButton2 = driver.findElement(By.xpath("//button[@name='Next (Select Price Option)']"));
		   nextButton2.click();
		   System.out.println(driver.getTitle());
		    WebElement SilverButton = driver.findElement(By.xpath("//*[contains(text(),'Silver')]"));
		    String silverbutton =SilverButton.getText();
		    System.out.println(silverbutton);
		    WebElement GoldText = driver.findElement(By.xpath("//*[contains(text(),'Gold')]"));
		    String goldText =GoldText.getText();
		    System.out.println(goldText);
		    WebElement PlatinumText = driver.findElement(By.xpath("//*[contains(text(),'Platinum')]"));
		    String platinumText =PlatinumText.getText();
		    System.out.println(platinumText);
		    WebElement UltimateText = driver.findElement(By.xpath("//*[contains(text(),'Ultimate')]"));
		    String ultimateText =UltimateText.getText();
		    System.out.println(ultimateText);
		    WebElement PricePerYearText = driver.findElement(By.xpath("//*[contains(text(),'Price per Year ($)')]"));
		    String pricePerYearText = PricePerYearText.getText();
		    System.out.println(pricePerYearText);
		    WebElement SilverPrice = driver.findElement(By.xpath("//*[contains(text(),'394.00')]"));
		    String silverPriceText =SilverPrice.getText();
		    System.out.println(silverPriceText);
		    WebElement GoldPrice = driver.findElement(By.xpath("//*[contains(text(),'1,162.00')]"));
		    String goldPriceText =GoldPrice.getText();
		    System.out.println(goldPriceText);
		    WebElement PlatinumPrice= driver.findElement(By.xpath("//*[contains(text(),'2,282.00')]"));
		    String platinumPriceText =PlatinumPrice.getText();
		    System.out.println(platinumPriceText);
		    WebElement UltimatePrice = driver.findElement(By.xpath("//*[contains(text(),'4,347.00')]"));
		    String ultimatePriceText = UltimatePrice.getText();
		    System.out.println(ultimatePriceText);
		    WebElement OnlineClaimText = driver.findElement(By.xpath("//*[contains(text(),'Online Claim')]"));
		    String onlineClaimText = OnlineClaimText.getText();
		    System.out.println(onlineClaimText);
		    WebElement ClaimsDiscountText = driver.findElement(By.xpath("//*[contains(text(),'Claims Discount (%)')]"));
		    String claimsDiscountText = ClaimsDiscountText.getText();
		    System.out.println(claimsDiscountText);
		    WebElement WorldwideCoverText = driver.findElement(By.xpath("//*[contains(text(),'Worldwide Cover')]"));
		    String worldwideCoverText = WorldwideCoverText.getText();
		    System.out.println(worldwideCoverText);
		    WebElement SelectOptionText = driver.findElement(By.xpath("//*[contains(text(),'Select Option')]"));
		    String selectOptionText = SelectOptionText.getText();
		    System.out.println(selectOptionText);
		    WebElement SilverRadioButton = driver.findElement(By.xpath("(//span[@class='ideal-radio'])[2]"));
		    SilverRadioButton.click();
		   
		    WebElement downloadQuoteButton  = driver.findElement(By.xpath("//a[@id='downloadquote']/span[1]/i[@class='fa fa-file-pdf-o']"));
		    downloadQuoteButton.click();
		    Thread.sleep(10000);
		   
		    WebElement selectPriceOptionTab = driver.findElement(By.id("selectpriceoption"));
		    selectPriceOptionTab.click();
		   
		     WebElement nextButton3  = driver.findElement(By.id("nextsendquote"));
		     nextButton3.click();
		   System.out.println(driver.getTitle());
		   
		   WebElement emailTextBox  = driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		    emailTextBox.sendKeys("nashita@gmail.com");
		   
		    WebElement phoneTextbBox  = driver.findElement(By.xpath("//input[@id='phone']"));
		   phoneTextbBox.sendKeys("2027203456");
		    WebElement userNameTextBox  = driver.findElement(By.xpath("(//input[@id='username'])[1]"));
		    userNameTextBox.sendKeys("username1");
		    WebElement passwordTextBox  = driver.findElement(By.xpath("//input[@id='password']"));
		    passwordTextBox.sendKeys("Abcd1234");
		    WebElement confirmPasswordTextBox  = driver.findElement(By.id("confirmpassword"));
		    confirmPasswordTextBox.sendKeys("Abcd1234");
		    WebElement commentTextBox = driver.findElement(By.xpath("//textarea[@id='Comments']"));
		    commentTextBox.sendKeys("Something");
		    WebElement sendButton = driver.findElement(By.id("sendemail"));
		     
	}

}
