package testNgPackage1.MavenTestNgProject1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		
	//1-	//Retreive all the cookies get dropped by the ebay to chrome browser;
		Set<Cookie> cookies = driver.manage().getCookies();
	
		
		Iterator<Cookie> itr = cookies.iterator();
		
		 while(itr.hasNext()) // will return true if there is so many elements available and will return the ele
		 {
			 System.out.println(itr.next()); // returns the next element in iterater
		 }
		 driver.quit();
		 // in real time there might be requorement to run script and to check some cookies is getting dropped 
		 //or not
		 //lets say the requirement that we need to sign up and login the application and delete the cookies
		 //we can do that with the help of driver.manage.deleteCookies();
		 //so we have three ways cookies can be deleted
		 /*1-deleteAllCookie(); the user will be automatically sign out session will be ended 
		  * In selenium there is predefined class of cookie 
		  * predefined api of selenium
		  * 
		  */
		
	}

}
