package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		//i dont have alert but still i am trying to switch or i have alert but its not working 
		//using driver.swithTo.alert() In that Case i need to use isAlertPresent function which can only 
		// be access by Webdriver wait/explicit wait 
		driver.switchTo().alert();
		//Exception in thread "main" org.openqa.selenium.NoAlertPresentException: no such alert we r gting
	}
}
