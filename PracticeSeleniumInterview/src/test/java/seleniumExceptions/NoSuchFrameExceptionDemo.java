package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchFrameExceptionDemo {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("mohammed");
// org.openqa.selenium.NoSuchFrameException: No frame element found by name or id 	
// again in real time if driver.switch to not working but the frame is av ailabe we should handle 
//using explicit wait 		
	}
}
