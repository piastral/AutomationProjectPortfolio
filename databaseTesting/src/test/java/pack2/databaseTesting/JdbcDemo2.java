package pack2.databaseTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JdbcDemo2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	driver.findElement(By.xpath("//a[text()='Register']")).click();
		
	   
		
		 driver.findElement(By.name("firstname")).sendKeys("mohammed");
		driver.findElement(By.xpath("//input[@type='checkbox']"));
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(12000);
		 
		driver.close();

	}

}
