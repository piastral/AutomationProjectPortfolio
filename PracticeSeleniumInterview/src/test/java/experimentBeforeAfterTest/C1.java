package experimentBeforeAfterTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite C1 CLASS");
	}
	
	
	@BeforeTest
	public void beforeTests()
	{
		System.out.println("This is before test C1 CLASS");
	}
	
	@Test
	public void actualTest()
	{
		System.out.println("This is actual test C1 CLASS");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite C1 CLASS");
	}
	
	
	
	
	
}
