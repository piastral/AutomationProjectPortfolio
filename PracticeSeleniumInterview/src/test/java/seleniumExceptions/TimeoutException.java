package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mohammed")));
		//Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: mohammed 
		//(tried for 5 second(s) with 500 milliseconds interval)
	}

}
