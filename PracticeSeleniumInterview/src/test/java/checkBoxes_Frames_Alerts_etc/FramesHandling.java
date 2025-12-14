package checkBoxes_Frames_Alerts_etc;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesHandling {
	
	public static ChromeOptions option;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static Alert alert;
	
	public static void handlingFrame1() throws InterruptedException
	{
		option = new ChromeOptions();
		option.addArguments("--start-maximized").addArguments("--incognito");
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://ui.vision/demo/webtest/frames/");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	   
   By frameLocator = By.xpath("//input[@type='text' and  @name='mytext1']");
      WebElement elementFrameButton =	 driver.findElement(frameLocator);
       elementFrameButton.sendKeys("hello");
	     Thread.sleep(3000);
	}
	
	
	
	public static void handlingFrame2() throws InterruptedException
	{
		option = new ChromeOptions();
		option.addArguments("--start-maximized").addArguments("--incognito");
		driver = new ChromeDriver(option);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://ui.vision/demo/webtest/frames/");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	   
   By frameLocator = By.xpath("//input[@type='text' and  @name='mytext2']");
      WebElement elementFrameButton =	 driver.findElement(frameLocator);
       elementFrameButton.sendKeys("My name is Mohammed");
	     Thread.sleep(3000);
	}
	


	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		handlingFrame2();
		
	}

}
