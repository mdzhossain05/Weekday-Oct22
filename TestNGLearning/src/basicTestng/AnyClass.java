package basicTestng;

import org.testng.annotations.Test;

public class AnyClass {

	@Test(priority = 2)
	public void testC() {
		System.out.println("Test C");
	}
	
	@Test(priority = 1)
	public void testA() {
		System.out.println("Test A");
	}
	
	@Test (priority = 1, enabled = false)// Annotation
	public void testB() {
		System.out.println("Test B");
	}
	
	@Test (priority = 1)// Annotation
	public void testD() {
		System.out.println("Test D");
	}
	
}
