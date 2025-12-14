package seleniumSynchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebAlert {
	
	@Test
	public void test() throws InterruptedException
	{
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//ul[contains(@style,'list-style')]//li//button[text()='Click for JS Alert']")).click();
		  Alert alert =driver.switchTo().alert();
		  alert.accept();
		  Thread.sleep(1000);
		  // i need to very using assertion 
		 String actualValue  = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		 String expectedValue = "You successfully clicked an alert";
		 
		 Assert.assertEquals(actualValue, expectedValue );
	}
	
	
	// we can only use test method from testng inside  src/test/java we cannot use inside 
	//src.test/main
	
	// imp ::: we can run assertion inside main method but we cannot get the result that pass or fail 
	// because to get the assertion result we need to use testNg method and also 
	//it is not best practice  to use assertion inside main method 
	


}
