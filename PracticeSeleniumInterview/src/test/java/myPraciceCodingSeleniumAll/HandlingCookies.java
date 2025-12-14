package myPraciceCodingSeleniumAll;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
	/*
	 * what is cookie --temporary internet files -text content
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		//retreive all the cookies that is saved in browser 
		//Set<Cookie> cookies=  driver.manage().getCookies();
		//System.out.println(cookies);
		//System.out.println(cookies.size());
		
		// i want to print all the cookie using for loop
		/*
		 * for(Cookie c : cookies) { System.out.println(c.getName() +" : "
		 * +c.getValue()); }
		 */	Cookie nid=	driver .manage().getCookieNamed("NID");
	//System.out.println(nid);
	
	// add cookie object to the browser session 
	Cookie cooke_1 = new Cookie("TestCookie1" ,"CookieValue1");
	
	driver.manage().addCookie(cooke_1);
	
	Cookie name =driver.manage().getCookieNamed("TestCookie1");
	System.out.println(name.getName() + ": " + name.getValue());
	
	driver.manage().deleteCookie(cooke_1);
Cookie cook=	driver.manage().getCookieNamed("TestCookie1");
System.out.println(cook);

	
	


Cookie cookie=driver.manage().getCookieNamed("NID");
System.out.println(cookie.getName() + ": " + cookie.getValue());

driver.manage().deleteCookieNamed("NID");

Set<Cookie> allCookies=	driver.manage().getCookies();
System.out.println(allCookies);
	

}
	
}
