package com.testNg.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest_TestNg {
	
	@Test
	public void testGoogle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	
	@Test
	public void testFacebook()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("mohammed",Keys.ENTER);
		System.out.println(driver.getTitle());
	}
	// in test nf xml file  we will write hierarchy 
/*TESTNG XML FILE 
 * TEST SUITE --> TESTS --> TEST STEPS [SIMILAR WAY ] IN DOWN SAME STRUCTURE WE FOLLOW IN XML
 * PACKAGE  --> CLASSES ---> METHODS 
 * ==========================================
 * this is the scenario where we select from class what is the method 
 * <suite>
	<test>
		<classes>
			<class>
				<methods>

				</methods>
			</class>
		</classes>

	</test>
</suite>
=============================== IF WE DONT WANT METHODS WE CAN CHOOSE MULTIPLE CLASS ONCE WE CHOOSE 
MULTIPLE CLASS WHATEVER THE METHOD IS THERE IN RESPECT OF Each class it will be executed 

 * 
 *  * <suite>
	<test>
		<classes>
			<class name ="">
				
			</class name =""  > 
		</classes>

	</test>
</suite>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

}
