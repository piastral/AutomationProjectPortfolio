package testNgPackage1.MavenTestNgProject1;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	/*
	 * soft asserts are the asserts which continue the execution even after the
	 * Assert conditions fails soft asserts are mainly used to verify certain test
	 * conditions in the code it is used when the passing of one test condition is
	 * not necessary to excetue the upcoming test
	 * 
	 * for wworkig with SoftASSert we need to create object of softAsswert class
	 * SYNTAX::SoftAssert obj = new SoftAssert();
	 * 
	 * like exceptions handling::
	 * 
	 * 
	 */

	public static WebDriver driver;
//creating soft assertions

	@BeforeTest
	public static void startUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("i will open the application facebook ");
	}

	@Test
	public static void testMethod1() {
		boolean loginDisplay = driver.findElement(By.name("login")).isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(loginDisplay, true);

		System.out.println("The Title is :: " + driver.getTitle());
		s.assertAll(); // it will close
	}

	// lets start soft assertions lets create an object of the class

	@Test
	public static void testMethod2() {
		boolean loginEnable = driver.findElement(By.name("login")).isEnabled();
		assertEquals(loginEnable, true);
		System.out.println("The url is :: " + driver.getCurrentUrl());
	}

	@Test
	public static void testMethod3() {
		String expectedTitle = "Facebook - log in or sign up";
		String actualTile = driver.getTitle();

		// assert error message is thrown only if the condition is FALSE IF NOT PLEASE
		// DONT SEND ANY MESSG.
		// all the method that have assertion is static if we import static we dont need
		// to use Assert.assert
		assertEquals(actualTile, expectedTitle);

	}

	@Test
	public static void testMethod4() {
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "0.8px solid rgb(8, 102, 255)";
		assertEquals(actualBorder, expectedBorder);
		// when giving css value in border format in rgb we must give space between the numbers but the comma
		// will be attached with the numbers.
	}


	@AfterTest
	public static void tearDown() {
		driver.close();
		System.out.println("i will close the application ,once the work finished ");
	}

}
