package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TMAccountOperationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class TMAccountOperationSteps extends TestBase {
	
	TMAccountOperationPage TMActOperationPage;
	JavaScriptUtils javaScriptUtils;

	public TMAccountOperationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("user click on first name link")
	public void user_click_on_first_name_link() {
		TMActOperationPage = new TMAccountOperationPage(driver);
		TMActOperationPage.clickNameLink();   
	}

	@Given("user navigate to Team Member Details page")
	public void user_navigate_to_team_member_details_page() {
	    System.out.println("User is on Team Member Details page***");
	}

	@Given("user click on edit information link")
	public void user_click_on_edit_information_link() {
		TMActOperationPage.clickEditInfoLink();	   
	}
	@Given("user click on Submit button for modify details")
	public void user_click_on_Submit_button_for_modify_details() {
		TMActOperationPage.clickSubmitbtnModify();	   
	}

	@Then("user should see a message")
	public void user_should_see_a_message() {
		System.out.println("Details changed successfully***");
	   
	}

	@When("user click on disable account button")
	public void user_click_on_disable_account_button() {
		TMActOperationPage.clickDissableBtn();
	}

	@When("user click on unlock user button")
	public void user_click_on_unlock_user_button() {
		TMActOperationPage.clickUnlockBtn();
	}

	@When("user click on UnlockResetPassword button")
	public void user_click_on_unlock_reset_password_button() {
		TMActOperationPage.clickResetPwdBtn();
	}
}
