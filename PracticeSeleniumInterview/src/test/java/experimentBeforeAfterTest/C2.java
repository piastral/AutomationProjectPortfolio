package experimentBeforeAfterTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is 	AFTER suite C2 CLASS");
	}
	
	
	@Test
	public void actualTest()
	{
		System.out.println("This is actual test C2 CLASS");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test C2 CLASS");
	}

}

