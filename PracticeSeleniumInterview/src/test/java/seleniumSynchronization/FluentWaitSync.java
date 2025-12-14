package seleniumSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitSync {
	// polling every seconds meaning it will send heartbeat to time that i am alive  every 5 second it
	// will say that i receive the element or not if within 30 second of duration time 
	
	
	public static WebDriver driver;
	public static FluentWait<WebDriver> fluentWaits ;
	public static By desktopLocator;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
	    fluentWaits = new FluentWait<WebDriver>(driver);
		fluentWaits.pollingEvery(Duration.ofSeconds(5)).withTimeout(Duration.ofSeconds(30)).
		ignoring(NoSuchElementException.class);
		
		
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		   desktopLocator =	By.xpath("//ul[contains(@class,' navbar')]//a[text()='Desktops']");
	         WebElement desktopButton =    fluentWaits.until(ExpectedConditions.elementToBeClickable(desktopLocator));
	            desktopButton.click();
		   
		   
	        
	}

}
