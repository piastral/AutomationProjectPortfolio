package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://academy.swaroopnadella.com/");
			driver.manage().window().maximize();
			//why in this webpage there is no h2 tag lets say before it was h2 now they changed to h1 
			//here we will get NoSuchElementException
			WebElement element =driver.findElement(By.tagName("h2"));
			System.out.println(element.getText());
			
		} catch (Exception e) {
			System.out.println(e.getClass().toString());
		}
		finally {
			driver.quit();
		}
	}

}
