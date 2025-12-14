package com.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constants.Browser;



public abstract class BrowserUtility {
// this browser utility will help me to remove the hardcoding in terms of ill launch the browser 
	private  WebDriver driver;

	
	
	// generate getter

	// initilize constructor with enum //multiple constructor

	

	public  WebDriver getDriver() {
		return driver;
	}
	
	public BrowserUtility(WebDriver driver) {
		super();
		this.driver=driver;
	}


	
	public BrowserUtility(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser Name .....");
		}

		
           
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public BrowserUtility(Browser browserName) {

		if (browserName==Browser.CHROME) {
			driver = new ChromeDriver();
		
		} else if (browserName ==Browser.FIREFOX) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid Browser Name .....");
		}

		
           
	}

	
	

//==================================================================================


  public void goToWebSite(String url) {
	  driver.get(url);
	  maximizeWindow();
  }

		
		public void maximizeWindow() {
			 driver.manage().window().maximize();
		}

		public void clickOn(By clickOnlocator) {
			WebElement signInClick =driver.findElement(clickOnlocator);
			signInClick.click();
		}

		public void enterText(By locator, String texToEnter) {
			WebElement element = driver.findElement(locator);
			element.sendKeys(texToEnter);
		}

		public void quitSession() {
			driver.quit();
		}

	}


