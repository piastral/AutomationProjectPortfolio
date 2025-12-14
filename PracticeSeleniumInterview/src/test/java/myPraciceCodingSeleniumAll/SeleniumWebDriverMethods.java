package myPraciceCodingSeleniumAll;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverMethods {
	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		// what are directly accesible webdrive method ??
		/*1-get(String Url )// it loads the webpage into the browser // return type void 
		 * 2- getCurrentUrl// returns the url of the page which is currenlty loaded into browser
		 * 3- getTtitle // it returns the title of your webpage and return type is string used for validation
		 * 4- getPageSource // will help me to get page source of the webpage which is currently loaded //return typse string
		 * 5-close()// will close the current window and also quit the browser if it is the last window currently open
		 * 6-quit() // will close the driver and close every associated window
		 * 7-getWindowHandle() //return type is string //and helps me to find the unique id of window // return curretn window handle
		 * 8-getWindowHandle //return type set of string return set of window handles which can be used to itearte over all open windows
		 * =============================================================================================================================
		 * THE METHOD WHICH WE ARE GETTING AS INHERITANCE 
		 * 1) findElement /// returns webelement 
		 * 2) find Elements // returns List<WebElement>
		 * ==================================================================
		 * THE METHOD IS AVAILABLE INSIDE WEBDRIVER CAN BE ACCESS USING DRIVER REFRENCE OF WEBDRIVER TYPE 
		 * =======================================================================================================
		 * 1) switchTo() --> is an abstract method --> it return an interface TargerLocator
		 *  which can be used to select a frame or window
		 * 
		 * 2)navigate() is an abastract method --> it returns the Navigation interface  that allows the selection of what to
   *     do next USING INTERNAL NAVIGATION METHOD
   *       
		 * 3)manage() returns the Options interface --> it manages the thing we can do in browser Menu
		 * now manage method is within the scope of webdriver interface since it returns Options Interface and Option Interface 
		 * has it own scope within the webdriver interface (its like sperate body within class ...
		 * ======================================================================================================
		 * To Acess The METHOD tHAT IS DECLARED WITH THE SCOPE OF Option interface we have to use MANAGE() 
		 * ===========================================================================================================
		 * AND THE METHOD THAT IS DECLARED WITHIN THE OPTION INTERFACE IS 
		 * 
		 * 1) addCookie(Cookie cookie); IT NEEDS A PARAMETER OF COOKIE CLASS INTERNALLY ITS CALLING COOKIE CLASS WITHIN ITS PARAMETER 
		 * add cookie to the browser session then we can check using getCookies method 
		 * 2)  deleteCookieNamed(String name) DOESNT RETURN ANYTHING 
		 *
		 * 3)deleteCookie(Cookie cookie);
		 * 
		 * 
		 * 4) Set<Cookie> getCookies(); :: retrieve all the cookies in the browser session 
		 * then we can use for loop and call Cookie class and then we can all cookie method to print 
		 * Techically when we want to retreive we get 2 or 3 cookies it depends upon the website 
		 *  
		 * 
		 * 5) Cookie getCookieNamed(String name);
		 * 
		 * 
		 * 6) get CookieNamed(Striing name)  // we can pass the cookie name what we got after retreving all cookies 
		 * retreive specific cookie by named by passing the name of cookie it will give the value 
		 * ==================================================================================================
		 * NOW WITHIN AN SCOPE OF OPTION INTERFACE THERE TWO MORE INTERFACE HAS BEEN ADDED 
		 * 1 Timeouts timeouts(); // MANAGE THE DRIVER TIMEOUTS //RETURN tIMEoUT iNTERFACE 
		 * 2)  Window window(); //MANAGE THE CURRENT WINDOW --RETURN TYPE Window Interface 
		 * ===========================================================================================
		 * 
		 * Then outsid the scope of Option Interface within the scope of webdriver interface body 
		 * there is TimeOut Interface within itws body it also has its properties which can be only accesedd by manage method of Options
		 * Interface cause technically TimeOut interface along with its called within Option interface 
		 * 
		 * 1)    Timeouts implicitlyWait(Duration duration);Specifies the amount of time the driver should wait 
		 * when searching for an element if it is    * not immediately present. //takes Duration Class as a parameter since it si able to
		 * access Duration class it can also access Duration class static method 
		 * 
		 * 2) Duration getImplicitWaitTimeout() //Gets the amount of time the driver should wait when searching for an element if it is not
     * immediately present.
           
		 * 3) Timeouts scriptTimeout(Duration duration); ets the amount of time to wait for an asynchronous script to finish execution before
     * throwing an error. If the timeout is negative, not null, or greater than 2e16 - 1, an error
     * code with invalid argument will be returned. 
  
		 * 4)  Timeouts pageLoadTimeout(Duration duration); // Sets the amount of time to wait for a page load to complete before throwing an error
		 * 
		 * 5) Duration getPageLoadTimeout()  // gets the amount of time to wait for page load to complete 
		 * 
		 * =========================================================****===================================================
		 * THEN WE HAVE INTERFACE TARGET LOCATOR WHICH HAS ITS OWN SCOPE AND CONTAINE THE METHODS ..TO ACCESS THIS METHOD 
		 * WE NEED USE SWITCHTO() METHOD WIHCIH IS LOCATED OUTSIDE OF TARGET LOCATOR INTERFACE AND WITHIN WEBDRIVER INTERFACE SCOPE
		 *   // FRAME IS ALSO AN EXAMPLE OF METHOD OVEROADING POLYMORPHISM 
		 * 1)  WebDriver frame(int index); //Select a frame by its (zero-based) index. Selecting a frame by index
		 * RETURNS //This driver focused on the given frame Throws:NoSuchFrameException - If the frame cannot be found
		 * 
		 * 2)  WebDriver frame(String nameOrId); //elect a frame by its name or ID. Frames located by matching name attributes are always given
     * precedence over those matched by ID. //return This driver focused on the given frame
     * @throws NoSuchFrameException If the frame cannot be found
         * 
		 * 3) WebDriver frame(WebElement frameElement);//Select a frame using its previously located WEBELEMENT
		 * RETURNS This driver focused on the given frame. //Throws:NoSuchFrameException -
		 *  If the given element is neither an IFRAME nor a FRAME element.StaleElementReferenceException
		 *  - If the WebElement has gone stale THAT MEANS ITS NOT FRESH WHEN WE GET THIS EXCEPTION WHEN WE REFRESH THE WEBPAGE AND THE
		 *  ADDRESS GETS CHANGED SO THE ELEMENT PREVOIUS LOCATION BECOME STALE .
		 * 
		  
		 * 4) WebDriver parentFrame(); 

Change focus to the parent context. If the current context is the top level browsing context,the context remains unchanged. 

		 * This driver focused on the parent frame
		 * 
		 * 5) WebDriver window(String nameOrHandle);

Switch the focus of future commands for this driver to the window with the given name/handle. 

		 * This driver focused on the given window  Throws:NoSuchWindowException - If the window cannot be found
		 * 
		 * 6)   WebDriver newWindow(WindowType typeHint); 
		 * //Creates a new browser window and switches the focus for future commands
		 *  of this driver to the new window. typeHint The type of new browser window to be created. The created window is not
     *     guaranteed to be of the requested type; if the driver does not support the requested
     *     type, a new browser window will be created of whatever type the driver does support.
     * @return This driver focused on the given window
     * 
     * 
		 * 7)   WebDriver defaultContent();//Selects either the first frame on the page, or the main document when a page containsiframes
		 *  Returns:This driver focused on the top window/first frame.
		 *  
		 *  8)   WebElement activeElement(); // Switches to the element that currently has focus within the document currently "switched to"
		 *  ,or the body element if this cannot be detected.This matches the semantics of calling"document.activeElement" in Javascript
		 *  Returns:The WebElement with focus, or the body element if no element with focus can bedetected.
		 *  
		 *  9) THIS INTERFACE HOLDS ANOTHER INTERFACE CALLED     Alert alert();
		 *  To handle Alert nterface first we need to find the element and the click on element once the popup alert appears 
		 *  we can use alert method like accept the popup or decline or getText or sendsome data 
		 *  
		 *  // Switches to the currently active modal dialog for this particular driver instance.
                           Returns:A handle to the dialog.Throws:NoAlertPresentException - If the dialog cannot be found
		 *    void dismiss(); void accept(); String getText(); void sendKeys(String keysToSend);
		 * =============================================================================================================================
		 * THEN WE HAVE INTERFACE NAVIGATION WHICH HAS ITS OWN SCOPE AND AND ITs own method TO ACCESS THE METHOD THAT IS DECLARED 
		 * INSIDE NAVIAGTION METHOD I NEED TO DO METHOD METHOD CHAINIING FOR THAT USING DRIVER REFRENCE AND CALL NAVIAGATE METHOD 
		 * SINCE NAVIGATE METHOD RETURN NAVIGATION INTERFACE AND NAVIGATION INTERFACE HAVE ITS OWN METHOD THATS HOW WE CAN HANDLE 
		 * 
		 * NAVIGATION METHOD 
		 * 1) void back();Move back a single "item" in the browser's history.
		 * 2) void forward(); Move a single "item" forward in the browser's history. Does nothing if we are on the latestpage viewed
		 * 3)  void to(String url); .. TAKES STRING PARAMETER  Load a new web page in the current browser window
		 * 4)    void to(URL url); //TAKES DIRECT URL
		 * 5) void refresh();//Refresh the current page
		 * 
		 * =================================================================================================================
		 * Then we have interface WINDOW() IT HAS ALSO HAV E ITS SCOPE AND RELATED METHOD 
		 * THEN HOW WE CAN CHAIN USIN DRIVER REFRENCE AND MANAGE METHOD BECAUSE MANAGE METHOD RETURNS OPTIONS INTERFACE AND 
		 * OPTION ITERFACE INTERNALLY CALLED WINDOW INTERFACE 
		 * WINDOW window {
		 * 1) Dimension getSize(); //Get the size of the current window. This will return the outer window dimension, not just theview port. 
		 * Returns:The current window size.// ALSO IT CAN BE STORED IN DIMENSION CLASS WE CAN HANDLE USING 
		 * driver.manage.window.getSize(); //a dn get size returns Dimension class we can then use dimension class method to get 
		 * required data 
		 * 
		 * 2) void setSize(Dimension targetSize);Set the size of the current window. This will change the outer window dimension,
		 *  not just theview port,synonymous to window.resizeTo() in JS.
		 *  
		 *   3) Point getPosition();Get the position of the current window, relative to the upper left corner of the screen. 
		 *   Returns:The current window position.
		 *   
		 *   4) void setPosition(Point targetPosition);Set the position of the current window. 
		 *   This is relative to the upper left corner of thescreen, 
		 *   synonymous to window.moveTo() in JS. 
		 *   
		 *   5) void maximize();//void maximize();
		 *  6)    void minimize();Minimizes the current window if it is not already minimized
		 *  7) void fullscreen(); //
             }
Fullscreen the current window if it is not already fullscreen

======================================END OF ALL THE METHOD THAT IS RELATED WITH SELENIUM WEBDRIVER =========================================







 
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * jkjkj
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	

}