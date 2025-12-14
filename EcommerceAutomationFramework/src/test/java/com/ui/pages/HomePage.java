package com.ui.pages;

import java.util.Properties;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.constants.Env;
import com.utility.BrowserUtility;
import com.utility.JSONUTILITY;
import com.utility.PropertiesUtil;

public final class HomePage extends BrowserUtility{
	



// this page also return login based on the return type

public HomePage(Browser browserName) {
		super(browserName);
		goToWebSite(JSONUTILITY.readJson( "QA"));
	}






// this will take my page object design pattern 
	/* 1-if i am creating variables inside the page classess we will create By classess 
	 * 2-if something is not going to change we will introduce final 
	 * 3- we will also introduce final variable whole value cannot be changed
	 * 4-if the variable is final it is going to be static  
	 * 5- i have to use uppercase of final variable name
	 * 6-since the method are private i need to bring the methods (Business logic
	 */
	
	




	private static  final By SIGN_IN_LINK_LOCATOR = By.xpath("//div//a[@class='login']");

	
	
	public LoginPage goToLoginInPage() { //page function should return then i can chain
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage =new LoginPage(getDriver());
		return loginPage;		
		 
	}
	
	
	
	
	
}
