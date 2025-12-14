package pageObjectConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	/*
	 * Two ways we can create page object class using page factory method and
	 * withoud using page factory method without page factory method(check
	 * loginpage.java) with page factory(check loginPage1.java)
	 * 
	 * In second approach with page factory we can avoid findelement
	 * ==================================================================
	 * Why we should use pagefactory??
	 * =========================================
	 * ans==> we are not using driver in pagefactory method approach,without having any driver FindbY ANNOTATION IS trying to find 
	 * the elemennt internally with the help of Pagefactory.initelement(driver,this) where it will take two parameter 
	 * page factory is class with the help of init element which takes driver as paramter which will be applicable for all kinds of 
	 * element,so initielement is the method which will initate all the element using driver as parameter 
	 * ==============================================================================================================
	 * 
	 * 
	 * 
	 */
	//2nd Approach using Page Fcatory method here we dont use find element 
	 //1-> in thed constrcutor we have to add one line which is pagefactory.initelements(opagefactory is class) 
	WebDriver driver;

	// constructor
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * // locators for username By txt_userName_loc =
	 * By.xpath("//input[@placeholder='Username']"); // locators for password By
	 * txt_password_loc = By.xpath("//input[@Placeholder='Password']"); //locators
	 * for login By loginLoc = By.xpath("//button[normalize-space()='Login']");
	 */
	// here the change happen using findby annptaion followed by any locator and then return webelemnt whech we store in one variable
	
	// locators for username 
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	
	//locators for password
	@FindBy(xpath="//input[@Placeholder='Password']") WebElement txt_password;
	
	//locators for login 
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login;
	
	
	
	
	
	
	   // Action methods changes when using page factory method we just need to refer the webelement 
    
    public void setUserName(String userName)
    {
    	 txt_username.sendKeys(userName);
    }
    
    public void setPassword(String password)
    {
    	txt_password.sendKeys(password);
    }
    public void clickLogin()
    {
    	login.click();
    }
    


}
