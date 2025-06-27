package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonMethods.CommonMeths;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddLeaveRepo;
import objectRepo.LoginRepo;

public class AddLeaveSteps {
	
	WebDriver driver;
	CommonMeths cm;
	LoginRepo lr;
	AddLeaveRepo alr;
	
	@Given("User is opening browser and launching app for leaves")
	public void user_is_opening_browser_and_launching_app_for_leaves() throws Exception {
		cm = new CommonMeths();
		driver = cm.launchBrowser();
		cm.launchApplication();
		
		lr = new LoginRepo(driver);
		alr = new AddLeaveRepo(driver);
		
		cm.exchangeObjects(lr);
	}

	@Given("User gets logged in into application")
	public void user_gets_logged_in_into_application() throws Exception {
	    cm.login();
	}

	@Given("User redirects to add leaves page")
	public void user_redirects_to_add_leaves_page() {
		cm.redirecttoAddLeave();   
	}

	@When("User enters valid Leave type name")
	public void user_enters_valid_leave_type_name() {
	    alr.leaveType.sendKeys("Ind-EarnedLeaves ");
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
	   alr.SaveButton.click();
	}

	@Then("User validate the new created leave")
	public void user_validate_the_new_created_leave() {
	    
	}

}
