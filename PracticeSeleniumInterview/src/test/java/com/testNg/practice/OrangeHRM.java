package com.testNg.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

// so here we will run the test with xml
public class OrangeHRM {
	WebDriver driver;
	Alert alert;

	@Test
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void enterLoginDetails() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

	@Test
	public void clickPim() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']//ul//li//span[text()='PIM']")).click();
		
		
	}
	
	
	@Test
	public void tearDown ()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	WebElement clickOption=	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//p"));
	  clickOption.click();
	  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//following-sibling::ul//a[text()='Logout']")).click();
		 System.out.println("Closing the webpage");
		driver.quit();
	}


}
