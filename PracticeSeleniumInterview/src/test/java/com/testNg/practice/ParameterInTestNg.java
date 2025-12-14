package com.testNg.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterInTestNg {
	/*
	 * why we need parameter in test ng and how to use parameter in test ng
	 * 
	 * 1) use of Testng paramter we can pass the parmeter value thru testng xml file
	 * using <parameter tag > with two atribute name,value after sute in testng xml
	 * we can mention parameter syntax :: <parameter name=" " value=""></parameter>
	 * it can be passed to suite level which will work for all tet under the
	 * particular suite or can be passed to individual test on test so here the
	 * scope of parmeter will be limitied to test only
	 * 
	 */
	WebDriver driver;
	

	@Parameters("browserName")
	@BeforeTest
	public void intiliazeBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("Opening the Browser");

	}

	@Parameters("url")
	@Test()
	public void launchApp(String url) {
		driver.get(url);
		System.out.println("Launching the Website ORANGEHRM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Parameters({"userName" , "password"})
	@Test
	public void enterLoginDetails(String userName ,String Password) {
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Performing the task");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}

	@AfterTest
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement clickOption = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//p"));
		clickOption.click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//following-sibling::ul//a[text()='Logout']"))
				.click();
		System.out.println("Closing the webpage");
		driver.quit();
	}

}
