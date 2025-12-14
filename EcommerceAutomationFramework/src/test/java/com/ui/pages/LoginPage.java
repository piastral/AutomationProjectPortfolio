package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.utility.BrowserUtility;

public class LoginPage  extends BrowserUtility{

		
	
	




	public LoginPage(WebDriver driver) {
		super(driver);
		
	}




	private static final By ENTER_EMAIL_ADDRESS= By.xpath("//input[@id=\"email\"]");
	private static final By ENTER_PASSWORD= By.xpath("//input[@id=\"passwd\"]");
	private static final By LOGIN= By.xpath("//button[@type=\"submit\" and @name=\"SubmitLogin\"]");
	

	 
	 
	 public MyAccountPage doLoginWith(String emailAddress,String password) {
		enterText(ENTER_EMAIL_ADDRESS, emailAddress);
		 enterText(ENTER_PASSWORD, password);
		 clickOn(LOGIN);
		MyAccountPage account = new MyAccountPage(getDriver());
		return account;
		 
	 }
	 
	 

}


