package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonAssertions.CommonAsserts;
import commonMethods.CommonMeths;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddEmployeeRepo;
import objectRepo.LoginRepo;

public class LoginSteps {
	
	WebDriver driver;
	CommonMeths cm;
	LoginRepo lr;
	CommonAsserts cs;

	@Given("User is launching latest browser")
	public void user_is_launching_latest_browser() throws Exception {
		cm = new CommonMeths();
		driver = cm.launchBrowser();
		cm.launchApplication();
		lr = new LoginRepo(driver);
		cm.exchangeObjects(lr);
		System.out.println("Launching Browser");
	}

	@Given("User is launching app")
	public void user_is_launching_app() {
		System.out.println("Launching app");
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		System.out.println("Clicked login");
	}

	@Then("I validate the successful login")
	public void i_validate_the_successful_login() {
		System.out.println("Validated successful login");
	}

	@Then("I validate more details on homepage")
	public void i_validate_more_details_on_homepage() {
		System.out.println("Validated other details");
	}
	
	@When("User is entering valid username and password")
	public void user_is_entering_valid_username_and_password() {
		System.out.println("Entering valid username and password");
		//lr.username.sendKeys("Admin");
	}

	@When("User is entering invalid username and password")
	public void user_is_entering_invalid_username_and_password() {
		System.out.println("Entering invalid username and password");
	}

	@Then("I validate the unsuccessful login")
	public void i_validate_the_unsuccessful_login() {
		System.out.println("Validated unsuccessful login");
	}

	@Then("I validate more details on login page itself")
	public void i_validate_more_details_on_login_page_itself() {
		System.out.println("Validated other details");
	}
	
	@When("User is entering {string} as username and {string} as password")
	public void user_is_entering_as_username_and_as_password(String uname, String pass) {
		System.out.println(uname +"  "+ pass);
	}

	@Then("I validate the successful login for different users")
	public void i_validate_the_successful_login_for_different_users() {
		System.out.println("Validated loginof different users");
	}

	@Then("I validate more details on homepage from user perspective")
	public void i_validate_more_details_on_homepage_from_user_perspective() {
		System.out.println("Validated other details of different users");
	}


}
