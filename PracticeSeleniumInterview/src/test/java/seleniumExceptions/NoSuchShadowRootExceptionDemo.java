package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchShadowRootExceptionDemo {
/*	How to handle shadow dom elements 
 * shadow host --> is terminology 
 * shadow root element --> (open) we can only automate using open status 
 * ---under shadow root we are having actul elements 
 * 
 * to traverse we cannpt use xpath or other locators inside shadow host 
 * Only Css selector locator will work in case of Shadow DomElements 
 * we can use https://books-pwakit.appspot.com/ here we will find shadow dom
 * in thos page <book-app apptitles="Books" ==> is shadow host 
 * inside we have shadow dom and then inside we need to find the element 
 * =>> USing css selector ..use getShadowRoot(); introduced in selenium 4 older verison not available 
 * book-app[apptitle="Books"] tagname[attribute='value'] syntax css selector 
 * 
 * 
 * 
 */

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
//	/no such shadow root: shadow root not found	
	driver.findElement(By.cssSelector("div.display")).getShadowRoot();
	

	}

}
