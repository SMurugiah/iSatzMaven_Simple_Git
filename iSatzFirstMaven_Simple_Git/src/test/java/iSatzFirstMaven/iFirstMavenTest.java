package iSatzFirstMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class iFirstMavenTest {

	@Test (priority = 0)
	public void SampleTestScript7() {
		System.out.println("Test Case Number 7");
	}
  
	@Test (priority = 1)
	public void SampleTestScript5() {
		System.out.println("Test Case Number 5");
		Assert.assertEquals("TestCase5", "TestCase5");
	}
	
	@Test (priority = 2)
	public void SampleTestScript1 () {
		System.out.println("Test Case Number 1");
		Assert.assertEquals("TestCase1", "TestCase1");
	}
	
	@Test (priority = 3)
	public void SampleTestScript3 () {
		System.out.println("Test Case Number 3");
		Assert.assertEquals("Google", "Hello");
	}
}
