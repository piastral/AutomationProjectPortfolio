package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	/*
	 * @When("User enter valid username and password") public void
	 * user_enter_valid_username_and_password() throws Exception {
	 * 
	 * driver.findElement(By.name("username")).sendKeys("Admin");
	 * driver.findElement(By.name("password")).sendKeys("admin123");
	 * 
	 * }
	 */
	@When("User enter valid username as  {string} and password as {string}")
	public void user_enter_valid_username_as_and_password_as(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("click on login button")
	public void click_on_login_button() throws Exception {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("User should land on homepage")
	public void user_should_land_on_homepage() throws Exception {

		System.out.println("Users should land on Home Page ");
	}

	/*
	 * @When("User should click on Image") public void user_should_click_on_image()
	 * throws Exception 
	 * { WebElement logOutClick =
	 * driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']"));
	 * logOutClick.click(); 
	 * Thread.sleep(2000); }
	 * 
	 * @And("user clicks on Logout link") public void user_clicks_on_logout_link()
	 * throws Exception { driver.findElement(By.linkText("Logout")).click();
	 * 
	 * 
	 * Select obj = new Select(loginClick); obj.selectByVisibleText("Logout");
	 * 
	 * 
	 * }
	 */

	/*
	 * @Then("user should logout successfully") public void
	 * user_should_logout_successfully() {
	 * System.out.println("Logout has been succesfull"); }
	 */

}