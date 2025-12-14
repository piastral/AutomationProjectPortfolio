package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.BrowserUtility;


public final class MyAccountPage extends BrowserUtility  {

	
	

	

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}



	private static final By LOGOUT = By.xpath("//a[@title=\"Log me out\"]");
	
	

	public LoginPage  logOut() {
		clickOn(LOGOUT);
	LoginPage loginPage = new LoginPage(getDriver());
	quitSession();
	return loginPage;
		
	}
	
	
}
