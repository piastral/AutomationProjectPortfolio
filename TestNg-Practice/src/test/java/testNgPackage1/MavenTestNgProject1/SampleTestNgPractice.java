package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestNgPractice {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("shahidmasood666@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("masood123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(15000);
        driver.quit();
		
		//ill check in orangehrm 
		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * driver.findElement(By.name("password")).sendKeys("admin123");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * Thread.sleep(10000); driver.quit();
		 */
	}

}
