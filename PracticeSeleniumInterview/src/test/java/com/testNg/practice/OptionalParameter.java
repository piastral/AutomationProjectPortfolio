package com.testNg.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {
/* lets say we hav multiple classes and within the classes we have n number of test methods available
 * what we can do is group the method in respective manner based on different testing technique 
 * like sanity,regression ,smoke or functional thru xml only it is possible 
 *  
 *  
 *  *** IMPORTANT** ONLY TEST METHODS WILL COME UNDER GROUPING 
 * BASED ON MY REQUIREMENT ILL CAATEGORIZE THE GROUPING CONCEPT
 * LET SAY ENTER LOGIN DETATILS ===> { SANITY}
 * LAUNCH APP--{REGRESSION}
 * CLICKPIM { SANITY ,REGRESSION } ==> COMBINELY WE CAN CALL THEM AS FUNCTIONAL
 * ============================================
 * Optional paramter 
 * in the method 
 * public void initilizeBrowser(@Optional("chrome") String browserName) // default value if we are not 
 * passing parameter 
 * ===================================================
 * how to enable or disable test ng 
 * so inside 1 xml we have one suite think like as project 
 * inside suite we have multiple test inide test we have classes and classes contain respectiove class where testMethods RE Allocated
 * now NOT ALL THE TIME ILL EXEUCTE ALL TEST SOMETIME ILL EXECUTE ONE TEST WHHICH MAY CONTAIN N NUMBER OF TEST CASES 
 * IN ORDER TO ACHIEVE THAT I CAN USE ENABLE OR DISAble my testCase 
 * <test name "orangehrmLogibn " enabled = "false" or "true"> depenidng upon my requirement 
 * 	
 */
	 
		WebDriver driver;
		

		@Parameters("browserName")
		@BeforeTest(groups= {"sanity"})
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
		@Test(priority =1 , groups= {"sanity"})
		public void launchApp(String url) {
			driver.get(url);
			System.out.println("Launching the Website ORANGEHRM");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}

		@Parameters({"userName" , "password"})
		@Test( priority =2 ,groups = {"sanity"})
		public void enterLoginDetails(String userName ,String Password) {
			
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("Performing the task");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		}
		
		@Test(priority =3,groups = {"sanity" ,"regression"})
		public void clickPim() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']//ul//li//span[text()='PIM']")).click();
			
			
		}

		@AfterTest(groups = {"sanity"})
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
