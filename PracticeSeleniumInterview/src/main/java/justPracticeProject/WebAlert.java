package justPracticeProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlert {
	

	public void m1()
	{
		
	}

 public static void main(String[] args) throws InterruptedException {
	
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
	 
	 
	  
	  
}

}
