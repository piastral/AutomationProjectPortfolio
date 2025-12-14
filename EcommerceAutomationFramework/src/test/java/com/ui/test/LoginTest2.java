package com.ui.test;


import com.constants.Browser;
import com.ui.pages.HomePage;



public class LoginTest2  {


	public static void main(String[] args) {
		
		HomePage homePage = new HomePage(Browser.FIREFOX);
		homePage.goToLoginInPage().doLoginWith("kicedok298@okcdeals.com", "password").logOut();
		


	}

}
