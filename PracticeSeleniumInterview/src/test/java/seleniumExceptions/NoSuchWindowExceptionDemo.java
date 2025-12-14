package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchWindowExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		// we will close  driver.close because my drive current at blank window 
		// after that we will try to get titile from close window then it will throw no such window exception
		driver.close();
	System.out.println(	driver.getTitle());
	//target window already closed " org.openqa.selenium.NoSuchWindowException:
	
	

	}

}
