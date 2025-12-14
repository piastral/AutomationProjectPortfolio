package seleniumExceptions;


public class SeleniumExceptionHierarchy_1 {
/*==HIERARCHY OF THE WEBDRIVER EXCEPTION WITH THE JAVA OBJECT SUPER CLASS
 * java.lang.object --> java.lang.Throwable --> java.lang.Exception --> java.lang.runtimeException 
 * --> org.openqa.selenium.webdriverException
 * ============================================
 * 
 * selenium.webdriverException is a class it is a parent exception of all SELENIUM EXCEPTION
 * whatever webdriver exception get thrown it happens in runtime its unchecked excetion
 * will not happend in compile time
 * 
 * Notfoundexception is child class of webdriver exception 
 * =>> there are many important exception under the NotFoundException
 *   we can see the official docs inside 
 *   https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriverException.html 
 * 
 * Understanding Common Occurence of exception in selenium::>>
 * 
 * 1)NoSuchElementException
 * =============================
 * =>> Multiple reason ,1 reason if there is change in locator due to development ,if developer has updated
 * the id or name example lets say befor it was id="test123";after developer changed it become id="test456"
 * The Locator is fully changed so we need to update in our framework with the current value
 * ===> 2-reason Due to synchronisation issues we need to use implict or explict wait in project
 * meaning script is running fast ,but application is getting time to load then we need to sync
 * ===============================================================================================
 * 2)NoAlertPresentException
 * ============================
 * ==>>This will happen whenevr the alert is not available 
 * lets say we are trying to switch to alert ...and unfortunately there is no alert so ot will throws exception
 * ======================================================================================================
 * 
   3)NoSuchFrameException
   ========================
   if i dont have aNy frame wavaialble it will throw no such frame exception
   
   * 4)NoSuchShadowRootException
   * ===============================
  Whenever the shadow root is not available 
  
   * 5)NoSuchWindowException
   * =========================
 Closed one of the window and then we are tr ying to retrieve getTitle of the window ..
 But what happends window is already close it will throw this exception
 More than one window 
 -------------------------------------------------------------------------------
 * 6)NoSuchSessionException
 * One or more window --but i quit the browser then session will become null 
 * then i am calling getTitle Method()
 *==========================

 * 7)InvalidSelectorException
 ===============================
 Will happen when mistake happend by automation enginnerr remove bracket 
 mostly syntax error
 * 8)TimeoutException
 ====================
  will happen with explpicit wait only if there is no element it will throw timeout exception
  
 * 9)NoSuchDriverException
 * ===============================
 In new version of selenium 4 we dont need tos et chromedriver exe file in case we are using old version 
 system.setProperty("wEBDRIVER.CHROME.driver","invalid/path/to/chromedriver.exe") no longer required 
 
 currenlty this taken care by selenium manager in latest selenium version
 
 
 * 10)StaleElementRefrenceException
  ============================================
 * Important exception::
 stale means not fresh lets say about food if it become old it become stale 
 WebPage is loaded and some elements is available what we did lets say we use driver.findelement();
 Webelement element stored here now what happends every element has address refrence 
 No sometiems page gets refreshed this element addrss will be changed DOM IS REFRESHED WHY 
 maybe because i am click some submit button and maybe its refreshing page 
 and again we are trying to use the old address  using driver.findElement but dom is refreshed
 so we will get Stale Element Refrence Exception
 =====================================
 To solve this again we need to use driver.findelement 
 
 
 * what kind of selenium exception you face in your framework and how did you resolve ??
 * ====================================================================================================
 * SELENIUM EXCEPTION PART ==2>
 * 1) UnexpectedTagNameException
 Lts say we have input tage in dropdown but we are trying to use slect tag which is not available in dom
 it will throw this exception
 * 
 * 2)UnhandledAlertException
  suppose i have webpage inside webpage i have js alert so we have to switch to alert 
  without doing i m doing some different options Js alert not closed this exception will be thrown 
 * 3) InvalidArgumentException
 * ========================
if we miss the https:// or http://
driver.get(www.facebook.com)


 * 
 * 4)JavascriptException 
 if we are missing any string or text inside js.execute script it will throw this exception 
 * 5)ElementNotInteractableException
 * 
 * 
 * 6)ElmentClickInterceptedException
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
 */
}
