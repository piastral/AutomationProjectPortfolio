package seleniumSynchronization;

import java.sql.Time;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandless {
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;
	public static String url="https://tutorialsninja.com/demo/";
	public static String parentWindowHandle ;
	public static By TabletLocator;
	public static WebElement TableButton;
	public static Set<String> windowHandles;
	
	
	
	
	
	
	public static void switchingWindow(String url) throws InterruptedException 
	

	{
		driver = new ChromeDriver();
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.ignoring(NoSuchElementException.class);
		driver.get(url);
		driver.manage().window().maximize();
		
		 parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window HANDLE " + parentWindowHandle);
		
		 TabletLocator = By.xpath("//ul[contains(@class,' navbar')]//li//a[text()='Tablets']");
            TableButton = wait.until(ExpectedConditions.elementToBeClickable(TabletLocator));
		       action.keyDown(Keys.CONTROL).click(TableButton).keyUp(Keys.CONTROL).perform();
		          windowHandles = driver.getWindowHandles();
		          
		          
		          for (String windowId : windowHandles) {
		  			

		  			if (!windowId.equals(parentWindowHandle)) {

		  				driver.switchTo().window(windowId);
		  				By addToCartTab = By.xpath("//span[text()='Add to Cart'][1] ");
		  				WebElement addToCartTabButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartTab));
		  			  addToCartTabButton.click();
		  				Thread.sleep(8000);
		  				System.out.println(addToCartTabButton.getText());
		  				
		  			
		  				
		  			}

		  		}
		  		
		  		driver.switchTo().window(parentWindowHandle);
		  		driver.quit();

	}
	
	
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		switchingWindow(url);
				

}
	
}
