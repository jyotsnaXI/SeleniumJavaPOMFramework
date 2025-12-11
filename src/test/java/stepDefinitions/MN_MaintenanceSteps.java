package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MN_MaintenancePage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class MN_MaintenanceSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	MN_MaintenancePage maintenancePage;

	public MN_MaintenanceSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Message
	@Given("User clicks on submenu maintenance link under menu Maintenance")
	public void user_clicks_on_submenu_maintenance_link_under_menu_maintenance() {
		maintenancePage = new MN_MaintenancePage(driver);
		maintenancePage.clickSubMenuMaintenance();
	}
	@Given("user navigate to maintenance page")
	public void user_navigate_to_maintenance_page() {
		maintenancePage.pageTitleName();
	}
	@Given("user select an operation dropdown as {string}")
	public void user_select_an_operation_dropdown_as(String string) {
		maintenancePage.selectOperation(string);
	}
	@Given("user enter message in text area")
	public void user_enter_message_in_text_area() {
		maintenancePage.enterMessage();
	}
	@Given("user select start date from calender date")
	public void user_select_start_date_from_calender_date() {
	    
	}
	@Given("user select end date from calender date")
	public void user_select_end_date_from_calender_date() {
	    
	}
	@When("user click on submit button for message")
	public void user_click_on_submit_button_for_message() {
		maintenancePage.clickSubmitForMessage();
	}
	@Then("user should validate credential")
	public void user_should_validate_credential() {
		maintenancePage.validateCredentialNewWindow();
	}
	@Then("user can see success message for message")
	public void user_can_see_success_message_for_message() {
		maintenancePage.successMessageForMsg();
	}
	
	//Page
	@Given("user select checkbox for Confirm Apply of Maintenance Page")
	public void user_select_checkbox_for_confirm_apply_of_maintenance_page() {
		maintenancePage.selectCheckboxCnf();
	}
	@When("user click on submit button for page")
	public void user_click_on_submit_button_for_page() {
		maintenancePage.clickSubmitForPage();
	}
	@Then("user can see success message for page")
	public void user_can_see_success_message_for_page() {
		maintenancePage.successMessageForPage();
	}
	
	//SrartStopEmailService
	@Given("user select radio button for Stop Email Service")
	public void user_select_radio_button_for_stop_email_service() {
		maintenancePage.clickRadioBtnToStopService();
	}
	@When("user click on submit button for stop service")
	public void user_click_on_submit_button_for_stop_service() {
		maintenancePage.clickSubmitForStopEmailServices();
	}
	@Then("user can see success message for stop service")
	public void user_can_see_success_message_for_stop_service() {
		maintenancePage.successMessageForStopEmailService();
	}
	
	//Delete Email Queue
	@Given("user select radio button for Delete errored emails")
	public void user_select_radio_button_for_delete_errored_emails() {
		maintenancePage.clickRadioForDeleteErroredEmails();
	}
	@Given("user select checkbox for error description")
	public void user_select_checkbox_for_error_description() {
		maintenancePage.selectChkErrorDescription();
	}
	@When("user click on submit button for delete errored mail")
	public void user_click_on_submit_button_for_delete_errored_mail() {
		maintenancePage.clickSubmitForDeleteErroredEmails();
	}
	@Then("user can see success message for delete errored mail")
	public void user_can_see_success_message_for_delete_errored_mail() {
		maintenancePage.successMessageForDelMail();
	}
	
	//DeleteEmailToBeSent
	@Given("user select radio button for Delete emails to be sent")
	public void user_select_radio_button_for_delete_emails_to_be_sent() {
		maintenancePage.clickRadioForDeleteEmailsToBeSent();
	}
	@Given("user select email type from dropdown as {string}")
	public void user_select_email_type_from_dropdown_as(String string) {
		maintenancePage.selectEmailType(string);
	}
	@Given("user select company from dropdown as {string} for delete mail to be sent")
	public void user_select_company_from_dropdown_as_for_delete_mail_to_be_sent(String string) {
		maintenancePage.selectCompany(string);
	}
	@When("user click on search button for delete mail to be sent")
	public void user_click_on_search_button_for_delete_mail_to_be_sent() {
		maintenancePage.clickSearchBtn();
	}
	@Then("user can see search result for delete mail to be sent")
	public void user_can_see_search_result_for_delete_mail_to_be_sent() {
		maintenancePage.searchResult();
	}
	
}
