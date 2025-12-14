package pageObjectConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*/* page object model is design pattern we sperate the test cases with the locators all the locators have their
 * respective classes for an example lets say we are trying to locate the element of a webpage 
 * and we have 4 webpage each webpage consist of 5 or more elements so each webpage is given its respective
 * place in in respective class
 * 
 * inside the test methods we validations we sperate locators with test methods 
 * and when we execute the test methods we call the locators and there action class performd the operation 
 * it helps us to achieve the code reusabulty  
 * 
 * 
 * page object model we can create with two approaches 
 * 1-> without using page factory 
 * 2--> using pagefactory(it is cLASS provided by selenium)
 * ====================================
 * 1->first step create page object class
 * 2--> then we have to create test cases 
 * 3--> thru xml file we can run the test cases 
 * lets take example from orange hrm login page 
 * here we will create page objet class which will contain 3 web element from login page 
 * 
 *1-constructor(to iniltizate webelement) web drivers
 * 2-locators 
 * 3-action methods
 */

public class LoginPage {

	 WebDriver driver;
	   //constructor
	 public LoginPage(WebDriver driver) 
	  {
		this.driver=driver;
	}
	 
	  //locators  for username
                      By txt_userName_loc =  By.xpath("//input[@placeholder='Username']");
	  //locators for password
                     By txt_password_loc= By.xpath("//input[@Placeholder='Password']");
	 //locators for login
             By loginLoc=By.xpath("//button[normalize-space()='Login']");
             

         // Action methods
             
             public void setUserName(String userName)
             {
            	 driver.findElement(txt_userName_loc).sendKeys(userName);
             }
             
             public void setPassword(String password)
             {
            	 driver.findElement(txt_password_loc).sendKeys(password);
             }
             public void clickLogin()
             {
            	 driver.findElement(loginLoc).click();
             }
             
	
	 
	 
}
