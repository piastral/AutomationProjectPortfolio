package testNgPackage1.MavenTestNgProject1;

import org.openqa.selenium.Cookie;

public class VariousSeleniumPart5 {
/*VARIOUS INTERVIEW QUESTION AND ANSWER 
 * Q::-WHY WE NEED TO TYPECAST WEBDRIVER INTERFACE USING JAVASCRIPT EXECUTER AND TAKE SCREENSHOT
 * 1-SO first we cannot create any object of an interface and js and ts is interface ...now since 
 * neither js or ts has any extension with webdriver interface but remote webdriver which is class
 * implements wd,js,ts...but here when we are initiation webdriver driver reference with chrome driver 
 * so technically we are upcasting meaning object of chrome driver is reffering to webdriver meaning we are
 * going up to implement the methods of webdriver ...now here without creating any object of remotewebdriver
 * or chromium driver along with js interface .. we are trying to downcast the webdriver refrence since we are
 * alredy have one refrence and object create its better not intiate another object 
 * ------------------------------------------------------------------------------------------------
 * WHAT ARE THE COOKIES ,HOW TO MANAGE THEM USING SELENIUM WEBDRIVER?
 * ANS::-cookies are small text files which get dropped by websites into browser chache.while 
 * browsing specific web application .its being done to keep track of user information and action during
 * the webvisit 
 * 
 * PURPOSE OF COOKIES 
 * 1-WHILE TESTING SOMTIMES WE HAVE TO REPLACE THE COOKIES TO PERFORM SOME OPERATIO ON THE APP
 * 2-AND ALSO WE HAVE TO VERIFY THE COOKIES ARE ADDED OR NOT 
 * 
 * HOW TO MANAGE THE COOKIES?
 * 1-DRIVER.MANAGE.Get COOKIES--->return types::set of string --->will retreived the cookie from website
 * 2-driver.manage.deleteAllCooki---> return type void ---> will delete all
 * 3-we have certain cookie class:: we have predefined cookie class api in selenium which we will use now 
 * where we can have the all the cookie method like -->>getDomain..getExpiry(find the expiry dat of cookie)
 * --->getName --->get
 *Cookie cokie = new Cookie("MOHAMMED", "hAJAR"); // we are passing two object and perform the action
 *  can add the cookie to the website and delete also from the wbesite
 *  we can iterate the use while loop and check with getName--->will give name of the cookies..
			    
			
				driver.manage().addCookie(cokie);
				driver.manage().deleteCookie(cokie); 
 * 
 * 
 * ------------------------------------------*********************-------------------------------
 * q-> How does fluent wait work?
 * ANS::fluesnt wait is an advanced explicit wait in selenum webdriver 
 * like under the EXPLICIT WAIT  we have child WAIT and  than we have extension of WAIT
 * WHICH IS WEBDRIVER WAIT AND FLUENT WAIT
 * 
 * IMPLICIT WAIT:: IS GLOBAL WAIT WHEN WE DECLARE ONCE IT WILL WAIT FOR ALL WEBELEMENT IN OUR SCRIPTS
 * syntax driver.manager()timeouts.implicitlyWait() 
 * 
 * EXPLITI WAIT :: IS NOT GLOBAL WAIT IT WILL ONLY WAIT WHEN IT IS SPECIFIED FOR PARTICULAR WEB ELEMENT
 * as part of  implementing explicit wait we can use WEBDRIVER WAIT OR FLUENTWAIT
 * webdriver wait ...is normal version of explicit wait ..buy fluent wait is advanced version
 *       
 *  
 * 
 * 
 * 
 * 
 * EXPLAIN FRAMEWORK IN SELENIUM??
 * ------------------------------------------------------->><<<   
 * ANS::THE COMPONENET WE ARE USING ....
 * 1-->>> TEST DATA  WE ARE HAVING 2 COMPONENET 1-POI 2-PROPERTIES FILE-->> WE ARE 
 * HAVING PROPERTIES FILE OF BROWSER,URL.. 
 * 
 * (WE SHOULD NEVER HARCODE ) ---> TO MAINTAIN THE DATA WE AR HAVING ALL THE TEST DATA 
 * IN EXCEL --ABD IN ORDER TO DEAL WITH EXCEL WE ARE USING APACHE POI TO MAINTAIN THE DATA 
 * AND THAN WE ARE TESTnG DATA PROVIDER WHCIH PASS THE DATA IN ALL OUR SCRIPT
 * --------------------------------------------------------------------------------------
 * 
 * 2--->> REPORT/LOG--->> WE ARE USING EXTENT REPORT --->> FOR REPORTING PURPOSE 
 * and extent report we have configured in base class..and its generating automatically having the screenshot
 * the moment the script is getting failed 
 * ----------------------------------------------------------------------------------------------
 * 3-->> UTILITY -->>LIKE COMMON UTILITY REUSABLE CODES...project independent which will include common 
 * methods ..waitTill the webelement is not visible..capture screenshot..waitTitle not present 
 * action methods ..we are keeping standard liabraries ..in utility class  all the common utility
 * is consumed in our script
 * -----------------------------------------------------------------------------------------------------
 * 
 * 4--->> so we are using one OF THE UNIT TEST FRAMEWORK -->> WHICH IS TESTNG ---> ON TOP OF SELENIUM
 * AND GENERATING TEST SCRIPT -->> SO TO GENERATE THE TEST SCRIPTS WE ARE USING ONE OF THE DESIGN 
 * PATTERN WHICH IS PAGE OBJECT MODEL--->> 
 * 
 * 
 * as per the page object model concern we have maintained one 
 * class for every web page.. each web page has dedicated class that holds the 
 * functionality and membebers of that web page .. 
 * 
 * so  we are having dedicated locators in one class for that specific webpage 
 * whenever we need to interact with that webpage we can create object of the class and interact with 
 * that webpage this gives benefit that we can use page object class even on the future ,the avoid ths
 * duplicacy of writing the script with same locators again and again
 * 
 * 
 * ------------------------------------------------**************--------------------------------
 * 
 * 5-->> AND THAN WE ARE HAVING MAVEN AS BUILD TOOL--->>> WE ARE TAKING CARE OF PROJECT DEPENDECIES
 * ALSO WE ARE RUNNIG  OUR TEST USING MAVEN ..and using maven pom.xml file we are triggering our scripts
 * 
 * we are haviing all soucre code in github 
 * 6--->>(	RUNNER)  and to run the test cases we are using jenkins
 * ---------------------------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 	
 */

}
