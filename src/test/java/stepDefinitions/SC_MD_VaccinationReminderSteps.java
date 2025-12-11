package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_MD_VaccinationReminderPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MD_VaccinationReminderSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_MD_VaccinationReminderPage vaccinationReminderPage;

	public SC_MD_VaccinationReminderSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_Add Vaccination Reminder
	@Given("User clicks on vaccination reminder under submenu medical data")
	public void user_clicks_on_vaccination_reminder_under_submenu_medical_data() {
		vaccinationReminderPage = new SC_MD_VaccinationReminderPage(driver);
		vaccinationReminderPage.clickMenuVaccinationReminder();
	}
	@Given("user navigated to vaccination reminder Master page")
	public void user_navigated_to_vaccination_reminder_master_page() {
		vaccinationReminderPage.pageTitleName();
	}
	@Given("user click on add button for vaccination reminder")
	public void user_click_on_add_button_for_vaccination_reminder() {
		vaccinationReminderPage.clickAddBtn();
	}
	@Given("user select reminder type from dropdown field as {string}")
	public void user_select_reminder_type_from_dropdown_field_as(String string) {
		vaccinationReminderPage.enterReminderType(string);
	}
	@Given("user enter email frequency in text field as {string}")
	public void user_enter_email_frequency_in_text_field_as(String string) {
		vaccinationReminderPage.enterEmailFrequency(string);
	}
	@When("user click on submit button for add vaccination reminder")
	public void user_click_on_submit_button_for_add_vaccination_reminder() {
		vaccinationReminderPage.clickSubmitBtn();
	}
	@Then("user should see success message for vaccination reminder")
	public void user_should_see_success_message_for_vaccination_reminder() {
		vaccinationReminderPage.successMsg();
	}
	
	//Search
	@Given("user select reminder type from dropdown field as {string} for search")
	public void user_select_reminder_type_from_dropdown_field_as_for_search(String string) {
		vaccinationReminderPage.reminderTypeSrch(string);
	}
	@When("user click on search button for vaccination reminder")
	public void user_click_on_search_button_for_vaccination_reminder() {
		vaccinationReminderPage.clickSearchBtn();
	}
	@Then("user can see vaccination reminder record in search result table with edit button")
	public void user_can_see_vaccination_reminder_record_in_search_result_table_with_edit_button() {
		vaccinationReminderPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for edit vaccination reminder")
	public void user_click_on_edit_button_for_edit_vaccination_reminder() {
		vaccinationReminderPage.clickEditBtn();
	}
	@Given("user modify email frequency in text field as {string}")
	public void user_modify_email_frequency_in_text_field_as(String string) {
		vaccinationReminderPage.modifyEmailFrequency(string);
	}
	@When("user click on submit button for modify vaccination reminder")
	public void user_click_on_submit_button_for_modify_vaccination_reminder() {
		vaccinationReminderPage.clickUpdateBtn();
	}
	@Then("user should see modify success message for vaccination reminder")
	public void user_should_see_modify_success_message_for_vaccination_reminder() {
		vaccinationReminderPage.modSuccessMsg();
	}

}
