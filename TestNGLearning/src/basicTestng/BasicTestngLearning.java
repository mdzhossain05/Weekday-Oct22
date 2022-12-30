package basicTestng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BasicTestngLearning {
	
	// 11 Annotation
	//@BeforeSuite
	//@BeforeTest
	//@BeforeClass
	//@BeforeMethod
	//@Test
	//@AfterMethod
	//@AfterClass
	//@AfterTest
	//@AfterSuite
	
	//@BeforeGroups
	//@AfterGroups
	
	@BeforeGroups(alwaysRun = true)
	public void beforeGroup() {
		System.out.println("before group");
	}
	
	@AfterGroups(alwaysRun = true)
	public void afterGroup() {
		System.out.println("after group");
	}
	
	@Test(groups = "smoke")
	public void testC() {
		System.out.println("Test C");
	}
	
	@Test(groups = "sanity")
	public void testA() {
		System.out.println("Test A");
	}
	
	@Test(groups = {"smoke", "sanity"}) // Annotation
	public void testB() {
		System.out.println("Test B");
	}
	
	
	
	
	
}
