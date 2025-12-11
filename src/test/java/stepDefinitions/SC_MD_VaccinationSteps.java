package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_MD_VaccinationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MD_VaccinationSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_MD_VaccinationPage vaccinationPage;

	public SC_MD_VaccinationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_Add Vaccination
	@Given("User clicks on vaccination under submenu medical data")
	public void user_clicks_on_vaccination_under_submenu_medical_data() {
		vaccinationPage = new SC_MD_VaccinationPage(driver);
		vaccinationPage.clickMenuVaccination();
	}
	@Given("user navigated to vaccination Master page")
	public void user_navigated_to_vaccination_master_page() {
		vaccinationPage.pageTitleName();
	}
	@Given("user click on add button for vaccination")
	public void user_click_on_add_button_for_vaccination() {
		vaccinationPage.clickAddBtn();
	}
	@Given("user enter Vaccination Name in text field as {string}")
	public void user_enter_vaccination_name_in_text_field_as(String string) {
		vaccinationPage.enterVaccinationName(string);
	}
	@Given("user enter Frequency in text field as {string}")
	public void user_enter_frequency_in_text_field_as(String string) {
		vaccinationPage.enterFrequency(string);
	}
	@When("user click on submit button for add vaccination")
	public void user_click_on_submit_button_for_add_vaccination() {
		vaccinationPage.clickSubmitBtn();
	}
	@Then("user should see success message for add vaccination")
	public void user_should_see_success_message_for_add_vaccination() {
		vaccinationPage.successMsg();
	}
	
	//Search
	@Given("user enter Vaccination Name in text field as {string} for search")
	public void user_enter_vaccination_name_in_text_field_as_for_search(String string) {
		vaccinationPage.vaccinationSrch(string);
	}
	@When("user click on search button for vaccination")
	public void user_click_on_search_button_for_vaccination() {
		vaccinationPage.clickSearchBtn();
	}
	@Then("user can see vaccination record in search result table with edit button")
	public void user_can_see_vaccination_record_in_search_result_table_with_edit_button() {
		vaccinationPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for edit vaccination")
	public void user_click_on_edit_button_for_edit_vaccination() {
		vaccinationPage.clickEditBtn();
	}
	@Given("user modify Vaccination Name in text field as {string}")
	public void user_modify_vaccination_name_in_text_field_as(String string) {
		vaccinationPage.modifyVaccination(string);
	}
	@Given("user modify Frequency in text field as {string}")
	public void user_modify_frequency_in_text_field_as(String string) {
		vaccinationPage.modifyFrequency(string);
	}
	@When("user click on submit button for modify vaccination")
	public void user_click_on_submit_button_for_modify_vaccination() {
		vaccinationPage.clickUpdateBtn();
	}
	@Then("user should see modify success message for vaccination")
	public void user_should_see_modify_success_message_for_vaccination() {
		vaccinationPage.modSuccessMsg();
	}

}
