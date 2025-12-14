package com.ui.test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pojo.User;
/* Test method 
 * 1- test script should be small !!!
 * 2- we cannot have conditonal statements ,loops ,try catch in your test method --> test script
 * 3- Reduce the use of Local variables  !!
 * 4-Atleast we should have assertion
 * 
 * 
 * 
 */


public class LoginTest5  {
	HomePage homePage;
	
	
	@BeforeMethod(description = "Load the homePage of the Website ")
	public void setUp() {  // this method will be responsible for launching the application 
		homePage = new HomePage(Browser.FIREFOX);
	}


	
	
	    @Test(description = "Verifies  with the Valid user is able to login into the application" , groups = {"e2e" , "sanity"} 
	    )
		public void loginTest(User user) {
	 	homePage.goToLoginInPage().doLoginWith(user.getEmailAddress(),user.getPassword()).logOut();
	  
		
                  

		}

}
