package seleniumSynchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitSync {
/* WHAT IS THE SYNCHRONIZATION ISSUE WITH ELENIUM ??
 * ANS==> WHEN WE RU OUR AUTOMATION SCRIPT ,PARALLEY THE APPLICATION SHOULD ALSO INTERACT OR INVOKE THE
 * ELEMENTS AVAILABLE IN THE APPLICATION,THEN ONLY WE CAN PERFROM THE ACTION THE ELEMENT 

 * 
 * MAIN PROBLEM OF THE SYNCHRONIZATION :: SOMETIMES SCRIPT IS PERFORM FASTER THAN MY APLLICATION RESPONSE
 * THAT MEANS EITHER SPEED OF THE APPLICATION IS VERY SLOW OR TAKING TIME TO LOAD ,BUT MY SCRIPT IS FASTER 
 * 
 * SEE, APPLICATION RESPONSE IN NOT IN OUR HAND WHY BECAUSE MIGHT BE ISSUE WITH NETWORK ,OR N NUMBER OF USER IS ACCESING THE APPLICATION
 * AT THE SAME TIME WHICH CAN CAUSE LAG AT THE RESPONSE TIME ...BUT EXECUTION 
 * THE SCRIPT IS IN OUR HAND SO WE CAN UTILISE THE WAITING MECHANISM
 * IN OUR SCRIPT THAT OUR SCRIPT GETS SYNCHRONIZED ALONG WITH THE APPLICATION 
 * ================================================================================================
 * 1) BY DEFAULT WE CAN USE THREAD.SLEEP IT IS NOT SELENIUM WAITING MECHANISM IT IS JAVA BASED 
 * =============
 * Thread.sleep DISADVANTAGE ===>> 
 * =============================================================
 * if the time is not sufficient will get the exception
 * 
 * 1) lets say we have given time 3 seconds ,but somehow my element is not appearing or it will appear
 * after 3 seconds so that no such element exception will be thrown 
 * 
 * 2) lets say element is appearing in only 1second but time we are giving 10 seconds ..still it will
 * wait for 10 seconds and then it will execute the next statment ,so the rest of the time will 
 * be wasted ,so performance of script will be poor ( will reduce the performance of the script )
 *  BOTH WAYS WE WILL GET DISADVANTAGE 
 *  
 *  3) multiple times we have to write thread.sleep to execute our script ,so multiple times
 *  means our performance are reducing 
 * NOT AT ALL RECOMMENDED
 * ====================================================================
 *  Thread.sleep ADVANTAGE  ===>
 * 
 * easy to use ..simple to use
 * [NOT THREAD .SLEEP]==> THIS IS COMING FROM JAVA 
 *====================================================================================================== 
 * * TWO EXCEPTION OCCUR IN SYNCRONIZATION **
 * ======================================================
 * 1) NO Such Element Exception ==>  we will get at the time of synchronization issue.
 * it means by the time  the statement got execucted , the element is not available on the page 

 * 2) ElementNotFoundException ==> whenever our locator is incorrect /not matching with the element
 * =================================================================================================
 * 
 *
 * ==========================*******************************************=============================================
 * ===========================DOWN IMPLICIT WAIT ========================================================
 * 
 * 
 * 
 *  WEBDRIVER WAIT COMMANDS WILL BE  USED IN REAL TIME . 
 * =================================================================================
 * *
 * *** SELENIUM WEBDRIVER PROVIDES THIS TWO WAITING MECHANISM :====>
 * 1) IMPLICITWAIT() syntax 
  * this is also  called method chaining 
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 * this is also a golbal wait //that means only one time we can write and use it will be used 
 * for all 100 lines of code ..till we close the driver my implicit wait wil be active 
 * 
 * 20 econds will be maximum , if the element is available within two seconds it will execute 
 * it will not wait for 20 seconds 
 * 1) single time/one statement 
 * 2) it will not wait till maximum time if the element is available  
 * 3) applicable for all elements
 * ===========================================================================================
 * 2) EXPLICIT WAIT /FLUENT WAIT 
 * on different class explict wait
 * 
 * 
 * ===============================================================================================	
 */
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	By desktopLocator =	By.xpath("//ul[contains(@class,' navbar')]//a[text()='Desktops']");
           WebElement desktopButton =	driver.findElement(desktopLocator);
           desktopButton.click();
           System.out.println(desktopButton.getText());
           driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
