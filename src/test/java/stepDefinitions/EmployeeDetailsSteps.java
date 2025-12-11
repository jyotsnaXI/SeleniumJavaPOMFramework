package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmployeeDetailsPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class EmployeeDetailsSteps extends TestBase {
	
	EmployeeDetailsPage empDetailsPage;
	JavaScriptUtils javaScriptUtils;

	public EmployeeDetailsSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user is on employee detail page")
	public void user_is_on_employee_detail_page() {
		empDetailsPage = new EmployeeDetailsPage(driver);
		empDetailsPage.empDetaiTitle();
	}

	@Given("user click on Resend Notification button")
	public void user_click_on_resend_notification_button() {
		empDetailsPage = new EmployeeDetailsPage(driver);
		empDetailsPage.ResendNotification();
	}

	@Given("user can see notification message")
	public void user_can_see_notification_message() {
		empDetailsPage.resendNotiSuccMsg();
	}

	@Given("user click on Send LTA button")
	public void user_click_on_send_lta_button() {
		empDetailsPage = new EmployeeDetailsPage(driver);
		empDetailsPage.sendLTA();
	}

	@Given("user can see LTA message")
	public void user_can_see_lta_message() {
		empDetailsPage = new EmployeeDetailsPage(driver);
		empDetailsPage.sendLTASuccMsg();
	}

	@Given("user click on Edit Information link")
	public void user_click_on_edit_information_link() {
		empDetailsPage = new EmployeeDetailsPage(driver);
		empDetailsPage.editInformationLink();
	}

	@Given("user navigated to Modify Pre-Employee Record page")
	public void user_navigated_to_modify_pre_employee_record_page() {
		empDetailsPage.modifyPageTitle();
	}
	
	@When("user click on submit button for modify record")
	public void user_click_on_submit_button_for_modify_record(){
		empDetailsPage.submitForModifyRecord();
	}

	@Then("user should see message for edit employee record")
	public void user_should_see_message_for_edit_employee_record() {
		empDetailsPage.modifyRecoSuccMsg();
	}

	@When("user can see record status as")
	public void user_can_see_record_status_as() {
		empDetailsPage = new EmployeeDetailsPage(driver);
		empDetailsPage.statusRecord();
	}

}
