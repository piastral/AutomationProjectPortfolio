package seleniumSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
/* // this statement says wait until the element is clickable maximum wait time is 20 seconds if the element is clickable
		//within 2 seconds execute ..this statement make EXPLICIT WAIT MORE SYNCHRONIZED WITH OUR APPLICATION 
		 * based on the condition my explicit wait will work 
		 * THE REASON WE GET FLAKY TEST BECAUSE OF SYNCHRONIZATION ISSUE CAN BE SOLVED WITH FLUENT WAIT/EXPLICIT WAIT
 * 
 * WEBDRIVER WAIT IS CLASS and it extends fluent wait ..fluent wait implement wait 
 * and inside fluent wait we have method which is public is until and inside until we can access the function 
 * or class called Expectedconsitions.now this class has static method which can be paired with with class and resolves the 
 * synchronixzation problem 
 * =====================================================
 * METHOD BASED ON CONDITION WITH EXPLICIT WAIT  WE CAN USE 
 * 
 * alertIsPresent()
 * elementSelectionStateToBe(desktopLocator, false)
 * elementToBeClickable(desktopLocator)
 * elementToBeSelected(desktopLocator)
 * visibilityOf(desktopLoactorButton)
 * frameToBeAvailableAndSwitchToIt()
 * invisibilityOfElementLocated()
 * 
 * 
 * 
 * 
 * 
 * 	
 */
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static By desktopLocator;
	public static WebElement desktopLoactorButton;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
// explicit wait webdriver wait is contrcutor it which requires two parmater webdriver refrence and duration of time 
	        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	         
	        
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		   desktopLocator =	By.xpath("//ul[contains(@class,' navbar')]//a[text()='Desktops']");
      // this statement says wait until the element is clickable maximum wait time is 20 seconds if the element is clickable
		//within 2 seconds execute ..this statement make EXPLICIT WAIT MORE SYNCHRONIZED WITH OUR APPLICATION 
	           desktopLoactorButton =	wait.until(ExpectedConditions.elementToBeClickable(desktopLocator));
	          desktopLoactorButton.click();
	          System.out.println(desktopLoactorButton.getText());
	          
	          
	        
	}

}
