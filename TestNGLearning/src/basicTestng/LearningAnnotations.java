package basicTestng;

import org.testng.annotations.*;


public class LearningAnnotations {

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	
	
	
	
}
