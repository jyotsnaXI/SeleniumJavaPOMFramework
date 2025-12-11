package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SendWelcomeMailPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SendWelcomeMailSteps extends TestBase {
	
	SendWelcomeMailPage sendWelMailPage;
	JavaScriptUtils javaScriptUtils;

	public SendWelcomeMailSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("user navigated to Send Welcome E-mail Address page")
	public void user_navigated_to_send_welcome_e_mail_address_page() {
	    System.out.println("User is on Send Welcome E-mail Address page");
	}

	@Given("user select company from drop-down as {string} for Welcome Email")
	public void user_select_company_from_drop_down_as_for_welcome_email(String string) {
		sendWelMailPage = new SendWelcomeMailPage(driver);
		sendWelMailPage.selectCompany(string);
	}

	@Given("user check the checkbox for Include all employees for Welcome Email")
	public void user_check_the_checkbox_for_include_all_employees_for_welcome_email() {
		sendWelMailPage.clickWelcomeCheckbox();
	}

	@When("user click on send email button for Welcome Email")
	public void user_click_on_send_email_button_for_welcome_email() {
		sendWelMailPage.clickWelcomeSendMailBtn();
	}

	@Then("user should see email success message for Welcome Email")
	public void user_should_see_email_success_message_for_welcome_email() {
		sendWelMailPage.successMarketingMail();
	}

	@Given("user navigated to Send Welcome Email Address page")
	public void user_navigated_to_send_welcome_email_address_page() {
		System.out.println("User is on Send Welcome E-mail Address page");
	}

	@Given("user click on get details button for Welcome Email")
	public void user_click_on_get_details_button_for_welcome_email() {
		sendWelMailPage.clickWelcomeGetDetailsBtn();
	}

	@Given("user can see Total number of employees label with view details link for Welcome Email")
	public void user_can_see_total_number_of_employees_label_with_view_details_link_for_welcome_email() {
		sendWelMailPage.totalWelcomeEmployee();
	}

	@When("user click on view details link for Welcome Email")
	public void user_click_on_view_details_link_for_welcome_email() {
		sendWelMailPage.clickWelcomeViewDetailsLink();
	}

	@Then("user navigated to new window")
	public void user_navigated_to_new_window() {
	    
	}

	@Then("user should see employee details table with records for Welcome Email for Welcome Email")
	public void user_should_see_employee_details_table_with_records_for_welcome_email_for_welcome_email() {
	    
	}

	@Then("user click on close button for Welcome Email")
	public void user_click_on_close_button_for_welcome_email() {
	    
	}

	@Given("user select company from drop-down as {string} for Marketing Email")
	public void user_select_company_from_drop_down_as_for_marketing_email(String string) {
		sendWelMailPage = new SendWelcomeMailPage(driver);
		sendWelMailPage.selectMarketingCompany(string);
	}

	@Given("user check the checkbox for Include all companies for Marketing Email")
	public void user_check_the_checkbox_for_include_all_companies_for_marketing_email() {
		sendWelMailPage.clickMarketingCheckbox();
	}

	@When("user click on send email button for Marketing Email")
	public void user_click_on_send_email_button_for_marketing_email() {
		sendWelMailPage.clickMarketingSendMailBtn();
	}

	@Then("user should see email success message for Marketing Email")
	public void user_should_see_email_success_message_for_marketing_email() {
		sendWelMailPage.successMarketingMail();
	}

	@Given("user click on get details button for Marketing Email")
	public void user_click_on_get_details_button_for_marketing_email() throws InterruptedException {
		sendWelMailPage.clickMarketingGetDetailsBtn();
	}

	@Given("user can see Total number of employees label with view details link for Marketing Email")
	public void user_can_see_total_number_of_employees_label_with_view_details_link_for_marketing_email() {
		sendWelMailPage.totalMarketingEmployee();
	}

	@When("user click on view details link for Marketing Email")
	public void user_click_on_view_details_link_for_marketing_email() throws InterruptedException {
		sendWelMailPage.clickMarketingViewDetailsLink();
	}

	@Then("user should see employee details table with records for Marketing Email")
	public void user_should_see_employee_details_table_with_records_for_marketing_email() {
	    
	}

	@Then("user click on close button for Marketing Email")
	public void user_click_on_close_button_for_marketing_email() {
	    
	}


}
