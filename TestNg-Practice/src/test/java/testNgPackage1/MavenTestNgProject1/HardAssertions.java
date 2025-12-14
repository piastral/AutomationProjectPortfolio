package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertions {
	
/*Assertions we are using just to check the validations in our script 
 * syntax we use for validations purpose are::
 * Assert.assertEquals(actual result :: expected result)
 * till 7 version we have one drawback with hard assertion that is once any 
 * line of code gets failed it will not execute another line of code in same
 * method after it failed.
 * thats why in newer versions we are use soft assertions to overcome 
 * the problem
 * in real time we are using soft assertions 
 * 
 * HARD ASSERTION ::are such where exception will be thrown immediately if the assertion is failed. 
 * And the statement writted after the assertion will ne be executed 
 * ....whatever comes from assertion assert package static its hard 
 * 	
 * SOFT ASSERTION :: are such where  exception are thrown at the end of the line or at specified location
 * typically it is controlled assertion .it is on our hand 
 * for this type we need to create an object 
 */
	public static WebDriver driver;
	
	@BeforeMethod
	public static  void launchWebApp()  throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
	}
	
	@AfterMethod
	public static void closeApp() {
		driver.close();
	}
	
	//we will use assertions for validations purpose
	
	@Test
	public static void m1() {
		boolean loginDisplay = driver.findElement(By.name("login")).isDisplayed();
		Assert.assertEquals(loginDisplay, true);
		System.out.println("The Tile is :: "+driver.getTitle());
	}
	
	@Test
	public static void m2() {
		boolean loginEnable =driver.findElement(By.name("login")).isEnabled();
		Assert.assertEquals(loginEnable, true);
		System.out.println("The url is :: "+ driver.getCurrentUrl());
	}
	
	@Test
	public static void m3() {
	String	txt=driver.findElement(By.name("login")).getText();
	System.out.println("The text is:: " + txt);
	}

}
