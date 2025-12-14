package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class HybridFramework {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
	}
	}
	
			 
/*combination of more than multiple things ::
 * we wiil create our own framework 
 * -------------------
 * Folder Structure ::-  the folder structure will be in windwos 
 * 1-) Eclipse
 * 2-) Jars/Dependecies 
 * 3-)TestData eg : test data from excel sheet
 * 4-)Test Result /Test Output Folder :: Like ScreenShot
 * 5-) Test Script we will store in one common folder
 * 6-) Test Cases :: based on the requirement 
 * 
 * --------------------------------------------------
 * Packages and Classes ::
 * 1-page Object Classs(where we are mainiating all the locators 
 * 2-Resuable Method class (Base class)
 * 3-TestDATA CLASS :: TestData 
 * 4-Test Scenario Package :: user story ,
 * 
 * 5-Regression .xml ,Smoke.XML 
 * Interview questtion
 * can you please explain about your framewoork ??
 * what are the scripting format your following
 * answer::
 * 
 * 1- provide /Fill Test Template 
 * ---------------------------------
 * answer ::: lets say about login functionaliy you are checking 
 * a-USER STORY :: PAOS :13456 (this is nothing but user story number )
 * b) FEATURE/EPIC::: LOGIN FUNCTIONALTY
 * c)Automated by ::: mohammed 
 * d)Reviewed By :: Manas ::(code REVIEWER)
 * e)date:: 5th august 2024
 * ------------------------------------------------
 * 2-Utilize reusable Method Properly ::
 * 3-)We need to create meaning full variable & method name 
 * 4-)we need to specify commenting // while doing any action/validation/operation 
 * ---------------------------------
 * what we will do in hybrid framework::
 * --------------------------------------------
 * 1-we will use resuable method for validation point of view
 * 2-we are mainitaing test data in excel sheet
 * 3-we will maintain all the locatpors in Page object Class
 * 4-writing test scenario we use @test annotation testNg annotations 
 * 5-we are using regression xml suite and smoke xml suite based on the requirment for reporting purpose
 * we have emailable report which we will use for reporting purpose 
 * 
 * How you will explain about your f/w ??
 * ---------------------------------------------------------------
 * Answer :: yes,in our project we are using Hybrid framework ,basically hybrid framework is combination 
 * of different deifferent framework in Selenium , in this framework we are writing test scripts 
 *  with the help of testNg @Annotations  in the format
 * of individual methods ..by preparaing the business operation by using PAGE OBJECT MODEL by storing all the
 * locators in page object class and we are perfomring the operationsand validations using re-usable/base  method
 * and we are passing the data from excel sheet and also we are storing the output in excel sheet 
 * and also in the format of screenshot as well, after writing sucefull sceript in the form of individual
 * methods we will call  all those classes with the help of Xml suite in the project we are having two
 * TestNg xml suite 
 * resgression suite and smoke testing suite ,depending on the situation  we execute the suite 
 * after succefuly execting the suite ,we will analyse the result in TESTnG REPORT ,
 * for the reporting point of view we are using html report and Emailablen report
 * AND WE WILL check if any test scenarios 
 * is failing we will debug that analyse it and also we will check manually as well
 * and than we will connect with our  respective developement team 
 * this is how we are wokring with hybrid framework
 * ----------------------------------------------------------------------------------
   
 * what are the methods we are using for web driver (Interview Question)
 * 1-.get()-Open the url
 * 2-manage()-will maxmaize the we page 
 * 3-
 * 
 * 6-navigate()
 * 7-getUrl()
 * 8-getCurrentUrl()
 * 9-getTitle)(
 * 10-getWindowHandles()
 * 
 * 11-switch()
 * 12-quit()
 * 13-close()
 * 14-getWindowHandle
 * -----------------------------------------------------------------------
 * METHODS FOR WEBELEMENT 
 * 1-isDisplayed()
 * 2-isEnabled()
 * 3-isSelected()
 * 4-getText()
 * 5-getAttribute()
 * 6-click()
 * 7-getTagName()
 * 8-getSize()
 * 9-getLocation()
 * 10sendKeys()
 * 11-clear()
 * 12-getCSSvalue()
 * ------------------------------------------------------------------------
 * MEETHODS OF SEARCHCONTEXT:::
 * 1-findElement()
 * 2-findElements()
 * 3-------------------------------------------------
 * METHOD ForScreenshhot::
 * 1-getScreENsHOT
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */
	


