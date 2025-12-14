package testNgPackage1.MavenTestNgProject1;

public class VariousSeleniumPart2 {
	
/* Q1-)How to handle no element found exception without using try catch or throws?
 * 
 * ANS:: there can be three most reasone to get No such element found
 * 1-Incorrect locators is provide for required UI element
 * 
 * 2-Required UI element is renderring on the page with delay (if it is not immediately avaialable
 * selenium will not and the exception will be thrown No such element) ..so for this option 
 * we have to explicitly wait  give some time so that it can wait and then load the particular element and 
 * display ..we can use webdriver wait just need to provide the time and driver (driver,3)seconds
 * [wait.until(ExpectedConditions.visibiltyofElementLocated(By.linkText("Flipkart")));--->>
 * willl return webelement
 * 
 * 3-When the required UI element is inside an iframe,and we are performing operation 
 * on it without [switch to iframe]
 * 
 * 
 * 
 * 	
 */

}
