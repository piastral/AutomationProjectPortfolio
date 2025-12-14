package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
	String text=	driver.findElement(By.xpath("//div[@class='display'")).getText();
	System.out.println(text);
	//now ill make xpath wrong intentionally or by mistake can happend enginner
/*org.openqa.selenium.InvalidSelectorException: invalid selector:
 *  Unable to locate an element with the xpath expression //div[@class='display' 
 * because of the following error:
SyntaxError: Failed to execute 'evaluate' on 'Document':
 The string '//div[@class='display'' is not a valid XPath expression.
 * 
 * 
 * 
 * 	
 */


	}

}
