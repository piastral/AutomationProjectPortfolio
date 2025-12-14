package seleniumException2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNotInteractableException {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		//ElementNotInteractableException
		// Element is  present in the dom ,but now allowed to interact with the element 
		 
	}

}
