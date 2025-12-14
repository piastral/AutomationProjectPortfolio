package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.olacabs.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// to scrool down and up we will use java script execyur
		// pressing f12 we can easiy start inspecting the elements the developer tool
		// will open
		//getLocation we will get the location of the element get location return type is point 
		//we can also store getLocation in point it will give the element x axis and y axis location 
	    WebElement	locate=driver.findElement(By.xpath("//section[@class=\"desktop-only\"]"));
		System.out.println(locate.getLocation());
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver ; 
		
		
		
		
		
		
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(245,2037)");
		
		
		
		Thread.sleep(13000);

		driver.close();
    
	}

}
