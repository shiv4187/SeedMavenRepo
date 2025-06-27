package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonAssertions.CommonAsserts;
import commonMethods.CommonMeths;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddEmployeeRepo;

public class AddEmpoloyeeSteps {
	
	WebDriver driver;
	CommonMeths cm;
	AddEmployeeRepo ar;
	CommonAsserts cs;
	
	@Given("User is opening browser and launching app")
	public void user_is_opening_browser_and_launching_app() throws Exception {
		
		cm = new CommonMeths();
		driver = cm.launchBrowser();
		cm.launchApplication();
		ar = new AddEmployeeRepo(driver);
		cs = new CommonAsserts(driver);
	    
	}

	@Given("User gets logged in")
	public void user_gets_logged_in() throws Exception {
	   cm.login();
	   ar.submit.click();
	}

	@Given("User redirects to Add employee page")
	public void user_redirects_to_add_employee_page() {
	  cm.redirecttoAddEmployee();
	}

	@When("User enters valid employee details")
	public void user_enters_valid_employee_details() {
		ar.firstName.sendKeys("Shivanand");
		ar.lastName.sendKeys("Satose");
		
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		//ar.submit.click();
	}

	@Then("User validate the new created employee")
	public void user_validate_the_new_created_employee() {
	    cs.assertTitle("OrangeHRM", driver.getTitle());
	    String name = ar.empName.getText();
	    cs.assertText("Shivanand Satose", name);
	    
	    cm.closeBrowser();
	}

	@When("User enters invalid employee details")
	public void user_enters_invalid_employee_details() {
	   
	}

	@Then("User validate the error on adding employee process")
	public void user_validate_the_error_on_adding_employee_process() {
	 
	}

}
