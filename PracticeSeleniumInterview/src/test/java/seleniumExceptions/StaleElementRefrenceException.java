package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefrenceException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.tagName("h1"));
		System.out.println(element.getText());
		// lets reproduce stale element refrence
		// page refresh ...
		driver.navigate().refresh();
		//System.out.println(element.getText());
		// Stale element reference: stale element not found
		// to solve this again we need to use driver.findElement
		// ReInitilize the webelement using driver.findElement("")
		element = driver.findElement(By.tagName("h1"));
		System.out.println(element.getText());
	}

}
