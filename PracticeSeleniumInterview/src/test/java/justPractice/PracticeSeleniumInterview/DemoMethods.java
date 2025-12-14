package justPractice.PracticeSeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().fullscreen();

	driver.findElement(By.xpath("//abc[text()'jajaj']"));
	
	 // "//abc[text()'jajaj']" expression of xpath from xpath language 
	
	
	  
	
	}
}
	 
	  
	   
	   /* we need to find difference between webelement and web driver 
	    * 2) tell me only webdriver methods 
	    * 3) tell me only webelement method 
	    * 
	    * 
	    * 
	    */
/* Webdriver Methods ::====>
 * 
 * 1- void get(String url); // helps to open the website 
   2-  String getCurrentUrl(); // helps to find current url 
 * 3- String getTitle(); // helps me to get title 
 * 4-  List<WebElement> findElements(By by); // helps me to find the list of all element //available in webdriver && webEle interface , return type
 *                                                                             //list of webelement 
 *                                                                             
 * 5-)        WebElement findElement(By by);         //helps me to find the single element //avaialble n webriver and webelement interface
 *                                               // return type is 	WebElement                                                             
 * 
 * 6-) String getPageSource(); // Get the source of the last loaded page.
 * 7-) void close(); // close the driver instance and only the window 
 * 8) void quit() - // quit all the session
 * 
 * 9)Set<String> getWindowHandles(); // return the unique id of window( parent and child)
 * 
 * 10)  String getWindowHandle(); // return single window 
 * 
 * 11) TargetLocator switchTo(); using switch to we can perform frame operation ,popup operation ,alert 
 * 
 * [[[ 12) Navigation ==> is an interface which is located in Webdriver interface using navigate method.
 * and inside navigation interface :::  we 
 * have 
 * 
 * 1)  back();// we can use the driver to go back to page or url 
 * 2)  forward(); // Move a single "item" forward in the browser's history.
 *  // This is also  an example of Polymorphysim method overloading 
 *  
 * 3)  to(String url); // Load a new web page in the current browser window.
 * 4)   to(URL url); // Overloaded version of {@link #to(String)} that makes it easy to pass in a URL.
 * 5)   refresh // refresh the page  ]]]
 * 
 * 
 * [[ 13  interface Options  with the help of manage using driver i can manage 
 * 1-addCookie(Cookie cookie);
 * 2-deleteCookieNamed(String name);
 * 3-deleteCookie(Cookie cookie);
 * 
 * 4- deleteAllCookies();
 * 5- Set<Cookie> getCookies();
   6- timeoute
   7- frame(int index); frame(String nameOrId);  frame(WebElement frameElement); parentFrame();
   8-window(String nameOrHandle);
   9-defaultContent();
   10-activeElement();
 * 11 switchTo()
 * 12-maximize();
 * 13- minimize();
 * ==========================================================================================================================
 * =================================================******************========================================
 * 
 * 
 * 
 * 
 *
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   */
  

		