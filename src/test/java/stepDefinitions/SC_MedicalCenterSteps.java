package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_MedicalCenterPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MedicalCenterSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_MedicalCenterPage medicalCenterPage;

	public SC_MedicalCenterSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Medical Center
	@Given("User clicks on Medical Center under exam under submenu system configuration")
	public void user_clicks_on_medical_center_under_exam_under_submenu_system_configuration() {
		medicalCenterPage = new SC_MedicalCenterPage(driver);
		medicalCenterPage.clickMenuMedicalCenter();
	}
	@Given("user navigated to Medical Center Master page")
	public void user_navigated_to_medical_center_master_page() {
		medicalCenterPage.pageTitleName();
	}
	@Given("user click on Add button for Medical Center")
	public void user_click_on_add_button_for_medical_center() {
		medicalCenterPage.clickAddBtn();
	}
	@Given("user enter Medical Center Name in text field as {string}")
	public void user_enter_medical_center_name_in_text_field_as(String string) {
		medicalCenterPage.enterMedicalCenterName(string);
	}
	@Given("user enter Contact Last Name in text field as {string}")
	public void user_enter_contact_last_name_in_text_field_as(String string) {
		medicalCenterPage.enterContactLastName(string);
	}
	@Given("user enter Contact First Name in text field as {string}")
	public void user_enter_contact_first_name_in_text_field_as(String string) {
		medicalCenterPage.enterContactFirstName(string);
	}
	@Given("user enter Complete Postal Address in text field as {string}")
	public void user_enter_complete_postal_address_in_text_field_as(String string) {
		medicalCenterPage.enterCompletePostalAddress(string);
	}
	@Given("user enter City in text field as {string}")
	public void user_enter_city_in_text_field_as(String string) {
		medicalCenterPage.enterCity(string);
	}
	@Given("user enter Country in text field as {string}")
	public void user_enter_country_in_text_field_as(String string) {
		medicalCenterPage.selectCountry(string);
	}
	@Given("user enter Postal Code in text field as {string}")
	public void user_enter_postal_code_in_text_field_as(String string) {
		medicalCenterPage.enterPostalCode(string);
	}
	@Given("user enter Phone in text field as {string}")
	public void user_enter_phone_in_text_field_as(String string) {
		medicalCenterPage.enterPhone(string);
	}
	@Given("user enter E-mail Address in text field as {string}")
	public void user_enter_e_mail_address_in_text_field_as(String string) {
		medicalCenterPage.enterEmail(string);
	}
	@When("user click on submit button for Medical Center")
	public void user_click_on_submit_button_for_medical_center() {
		medicalCenterPage.clickSubmitBtn();
	}
	@Then("user should see success message for Medical Center")
	public void user_should_see_success_message_for_medical_center() {
		medicalCenterPage.successMsg();
	}
	
	//Search Medical Center
	@Given("user enter Medical Center name in text field as {string} for search Medical Center")
	public void user_enter_medical_center_name_in_text_field_as_for_search_medical_center(String string) {
		medicalCenterPage.enterMedicalCenterSrch(string);
	}
	@When("user click on search button for Medical Center")
	public void user_click_on_search_button_for_medical_center() {
		medicalCenterPage.clickSearchBtn();
	}
	@Then("user can see search result with edit button for Medical Center")
	public void user_can_see_search_result_with_edit_button_for_medical_center() {
		medicalCenterPage.searchResultTable();
	}
	
	//Modify Medical Center
	@Given("user click on edit button for Medical Center")
	public void user_click_on_edit_button_for_medical_center() {
		medicalCenterPage.clickEditBtn();
	}
	@Given("user modify Medical Center Name in text field as {string}")
	public void user_modify_medical_center_name_in_text_field_as(String string) {
		medicalCenterPage.enterMedicalCenterName(string);
	}
	@Given("user modify Contact Last Name in text field as {string}")
	public void user_modify_contact_last_name_in_text_field_as(String string) {
		medicalCenterPage.enterContactLastName(string);
	}
	@Given("user modify Contact First Name in text field as {string}")
	public void user_modify_contact_first_name_in_text_field_as(String string) {
		medicalCenterPage.enterContactFirstName(string);
	}
	@Given("user modify Complete Postal Address in text field as {string}")
	public void user_modify_complete_postal_address_in_text_field_as(String string) {
		medicalCenterPage.enterCompletePostalAddress(string);
	}
	@Given("user modify City in text field as {string}")
	public void user_modify_city_in_text_field_as(String string) {
		medicalCenterPage.enterCity(string);
	}
	@Given("user modify Country in text field as {string}")
	public void user_modify_country_in_text_field_as(String string) {
		medicalCenterPage.selectCountry(string);
	}
	@Given("user modify Postal Code in text field as {string}")
	public void user_modify_postal_code_in_text_field_as(String string) {
		medicalCenterPage.enterPostalCode(string);
	}
	@Given("user modify Phone in text field as {string}")
	public void user_modify_phone_in_text_field_as(String string) {
		medicalCenterPage.enterPhone(string);
	}
	@Given("user modify E-mail Address in text field as {string}")
	public void user_modify_e_mail_address_in_text_field_as(String string) {
		medicalCenterPage.enterEmail(string);
	}
	@When("user click on submit button for update Medical Center")
	public void user_click_on_submit_button_for_update_medical_center() {
		medicalCenterPage.clickUpdateBtn();
	}
	@Then("user should see modify success message for Medical Center")
	public void user_should_see_modify_success_message_for_medical_center() {
		medicalCenterPage.modSuccessMsg();
	}

}
