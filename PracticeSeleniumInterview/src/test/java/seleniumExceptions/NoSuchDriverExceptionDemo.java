package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchDriverExceptionDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","invalid/path/to/chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
/*Unable to obtain: chromedriver, error chromedriver must exist: invalid\path\to\chromedriver.exe
 * " org.openqa.selenium.remote.NoSuchDriverException:
 * 		
 */

	}

}
