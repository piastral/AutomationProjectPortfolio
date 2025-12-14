package testNgPackage1.MavenTestNgProject1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Cookie2 {
	
			public static void main(String[] args) {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.ebay.com");
				Cookie cokie = new Cookie("MOHAMMED", "hAJAR");
			    
			
				driver.manage().addCookie(cokie);
				driver.manage().deleteCookie(cokie);
				System.out.println("Sucessfully deleted");
				System.out.println("--------------------------------------------");
				
				
				//we have predefined cookie class api in selenium which we will use now 
			Set<Cookie> ck = driver.manage().getCookies();
			
			Iterator<Cookie> itr = ck.iterator();
			
			while(itr.hasNext()) // will return true if there is so many elements available and will return the ele
			 {
				Cookie cookie = itr.next();  // returns the next element in iterater
				System.out.println("name of the cookies ::" + cookie.getName());
				System.out.println("Value of the cookie is :"+ cookie.getValue());
				 boolean cookieSecurity = cookie.isSecure();
				 System.out.println("Is cookie is Secured::" +cookieSecurity );
				 System.out.println("The Path of the cookies :" +cookie.getPath() );
				 
				  System.out.println("--------------------------------------------------");
				  
				  
				
				  
			
			 }
			 driver.quit();
				
				
				
				
				
				
			}

}
