package basicTestng;

import org.testng.annotations.Test;

public class BasicTestngLearning {
	
	// 11 Annotation
	//@Test
	//@BeforeTest
	//@AfterTest
	//@BeforeMethod
	//@AfterMethod
	//@BeforeClass
	//@AfterClass
	//@BeforeSuite
	//@AfterSuite
	//@BeforeGroups
	//@AfterGroups
	
	
	
	@Test
	public void testC() {
		System.out.println("Test C");
	}
	
	@Test
	public void testA() {
		System.out.println("Test A");
	}
	
	@Test// Annotation
	public void testB() {
		System.out.println("Test B");
	}
	
	
	
	
	
}
