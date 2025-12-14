package testNgPackage1.MavenTestNgProject1;

public class VariousSeleniumInterviewQuestionAndAnswer {
/*	Q1--4) How to switch contexts? What are different contexts available using Selenium webdriver?
 * ans:
 * 
 * Q-5  What are the latest Selenium WebDriver 4.0 Locator strategies?
 * -------------------------------------------------------------------------------
 *  ANS::
 *  Selenium WebDriver W3C Standardization
WebDriver W3C protocol is the largest architectural change in WebDriver for Selenium 4, and W3C compliance of 
Selenium WebDriver will reduce test flakiness and improve stability of tests.

Improved and Optimized Selenium Grid
The new Selenium Grid comes with Docker support. This will enable developers to spin up the containers instead of 
setting up heavy VMs
Testers can now deploy the grid in three modes:
➔ Standalone mode
➔ Hub and Node
➔ Fully distributed

Enhanced Selenium 4 IDE
The new Selenium 4 IDE features include:
➔ Improved GUI 
➔ Improved control flow mechanism 
➔ Enhanced element locators
➔ Ability to export code in popular programming languages

Relative Locators
Relative locators, also known as friendly locators, are an easy way of locating elements  Relative locator methods
 support use with TagName (for Selenium 4 Java) or with_tag_name (for Selenium 4 Python).
 The five relative locators  available in Selenium 4 are:
➔ To left of
➔ To right of
➔ Above
➔ Below

Support for Chrome Debugging Protocol
Chrome DevTools, a suite of web developer tools, provides an API that allows QA engineers and developers to edit pages on the fly to diagnose problems more quickly. 

Enhanced Documentation
The documentation section has been redesigned to add a clear user interface for navigating to the desired section or page. Selenium 4 documentation covers all the aspects of Selenium Grid 4, Selenium IDE, and WebDriver W3C protocol.
Simplification to open new browser Windows and Tabs
Selenium 4 offers new APIs to open pages in a new Tab or Window.
 * 
 * ------------------------------------------------------------------------------------------------------------------------
 * --------------------***************************************----------------------------------------------------
 * Q--]] HOW TO HANDLES DYNAMIC WEBELEMENTS IN SELENIUM?
 * ----------------------------------------------------------------------
 * ANS::dynamic web elements are web elements whos attribute values keep  changing 
 * lets we insepct one element in the application and the the attributes of the id keep on changing 
 * so how we can handle that...
 * we can use contains while using xpath  (facebook)
 *  1-// button[contains(@id,'u_0_5_')] // so techinally ill remove the certain value which is dynamically changing after 
 *  every refresh or we can say button[starts-with(@id...)]
 *  
 * 2-we can also use xpath axes (eg facebook login button check)
 * so this form of xpath will dynamically choose the full dialog box and filter it out in what we need
 *  //form[@data-testid='royal_login_form']/descendant::button 
 * 
 * 3-USING TEXT WITH XPATH anything starts with black is text
 *   //button[contains(text(),'Log in')] 
 *   
 *   4-USING INDEX WE CAN ALSO HANDLE THE DYNAMIC WEB ELEMENT 
 *   //button[1] we can refrence it with the tag proximity ...
 *   --------------------------------THIS IS WAY WE HANDLE DYNAMIC WEB ELEMENT IN SELENIUM---------------------------
 *  Q-5]] HOW TO HANDLE BROWSER NOTIFICATION IN SELENIUM??
 *  
 *  ANS:: TO HANDLE notification we have to create Chromeoptions class 
 *  ChromeOption options = new ChromeOptions();
 *                    List<String> op= options.addArguments("---disable-notifications");
 *                    and then we need tp pass the options into chromeDiver(options);
 *                      
 *   --------------------------------------------------------------------------------------------------
 *   Q-6) ) If webelement changes its id frequently then what are different ways to create locators for such an element?
 *   Ans::To handle the dynamically changing ids 
 *    we can use contains while using xpath
 *    1-starts-with ;contains // button[contains(@id,'u_0_5_')] //button[starts-with(@id,'u_0_5_')] 
 *    
 *    
 *    -------------------------------------------------------------------------------------------
 *    HANDLING MULTIPLE WINDOWS ??
 *    ANS::---->> in selenium webdriver we have getWindowHandles(),getWindowHandle and switchTo.window 
 *    we can handle multiple windows
 *    
 *   
 *   
 * 	
 */

}
