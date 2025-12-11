package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_AdditionalInformationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_AdditionalInformationSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_AdditionalInformationPage additionalInfoPage;

	public SC_AdditionalInformationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add Additional Information
	@Given("User clicks on additional information under submenu company")
	public void user_clicks_on_additional_information_under_submenu_company() {
		additionalInfoPage = new SC_AdditionalInformationPage(driver);
		additionalInfoPage.clickSubMenuAddInformation();
	}
	@Given("user navigated to additional information master page")
	public void user_navigated_to_additional_information_master_page() {
		additionalInfoPage.additionalInfoPageTitle();
	}
	@Given("user click on add button for additional information")
	public void user_click_on_add_button_for_additional_information() {
		additionalInfoPage.clickAddBtn();
	}
	@Given("user select company name from dropdown as {string} for Additional Fields")
	public void user_select_company_name_from_dropdown_as_for_additional_fields(String string) {
		additionalInfoPage.selectDrpCompanyNew(string);
	}
	@Given("user enter Additional Field Name in text field as {string}")
	public void user_enter_additional_field_name_in_text_field_as(String string) {
		additionalInfoPage.enterAdditFieldNameNew(string);
	}
	@Given("user enter Column Name In HR Import in text field as {string}")
	public void user_enter_column_name_in_hr_import_in_text_field_as(String string) {
		additionalInfoPage.enterColHRImportNew(string);
	}
	@Given("user select Additional Field Type from dropdown as {string}")
	public void user_select_additional_field_type_from_dropdown_as(String string) {
		additionalInfoPage.selectAdditFieldTypeNew(string);
	}
	@When("user click on submit button for add additional information")
	public void user_click_on_submit_button_for_add_additional_information() {
		additionalInfoPage.clickSubmitNew();
	}
	@Then("user should see success message for add additional information")
	public void user_should_see_success_message_for_add_additional_information() {
		additionalInfoPage.createdSuccessMsg();
	}
	
//Search Additional Information
	@Given("user enter field name as {string} for search")
	public void user_enter_field_name_as_for_search(String string) {
		additionalInfoPage.enterFieldNameSrch(string);
	}
	@When("user click on search button for additional information")
	public void user_click_on_search_button_for_additional_information() {
		additionalInfoPage.clickSearchBtn();
	}
	@Then("user can see additional information record in search result table with edit button")
	public void user_can_see_additional_information_record_in_search_result_table_with_edit_button() {
		additionalInfoPage.searchResultTable();
	}
	
//Modify Additional Information
	@Given("user enter additional information name as {string} for search")
	public void user_enter_additional_information_name_as_for_search(String string) {
		additionalInfoPage.enterAdditFieldNameNew(string);
	}
	@Given("user can see additional information search result table with edit button")
	public void user_can_see_additional_information_search_result_table_with_edit_button() {
		additionalInfoPage.searchResultTable();
	}
	@Given("user click on edit button for edit additional information")
	public void user_click_on_edit_button_for_edit_additional_information() {
		additionalInfoPage.clickEditBtn();
	}
	@Given("user modify Additional Field Name in text field as {string}")
	public void user_modify_additional_field_name_in_text_field_as(String string) {
		additionalInfoPage.txtModifyAdditionalFieldName(string);
	}
	@Given("user modify Column Name In HR Import in text field as {string}")
	public void user_modify_column_name_in_hr_import_in_text_field_as(String string) {
		additionalInfoPage.txtModifyColHRImport(string);
	}
	@When("user click on submit button for modify additional information")
	public void user_click_on_submit_button_for_modify_additional_information() {
		additionalInfoPage.modifySubmitBtn();
	}
	@Then("user should see success message for modify additional information")
	public void user_should_see_success_message_for_modify_additional_information() {
		additionalInfoPage.modifySuccessMsg();
	}
}
