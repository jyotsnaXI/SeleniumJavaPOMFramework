package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_MD_MedicalHistoryPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MD_MedicalHistorySteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_MD_MedicalHistoryPage mdMedicalHistoryPage;

	public SC_MD_MedicalHistorySteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_AddMedicalHistory
	@Given("User clicks on Medical History under submenu Medical data")
	public void user_clicks_on_medical_history_under_submenu_medical_data() {
		mdMedicalHistoryPage = new SC_MD_MedicalHistoryPage(driver);
		mdMedicalHistoryPage.clickSubMenuMedicalHistory();
	}
	@Given("user click on add button for Medical History")
	public void user_click_on_add_button_for_medical_history() {
		mdMedicalHistoryPage.clickAddBtn();
	}
	@Given("user enter Medical History Item Name in text field as {string}")
	public void user_enter_medical_history_item_name_in_text_field_as(String string) {
		mdMedicalHistoryPage.enterMedicalHistoryItemName(string);
	}
	@Given("user select Medical History Item Type from dropdown field as {string}")
	public void user_select_medical_history_item_type_from_dropdown_field_as(String string) {
		mdMedicalHistoryPage.selectMedicalHistoryItmTyp(string);
	}
	@Given("user select Medical History Item Group from dropdown field as {string}")
	public void user_select_medical_history_item_group_from_dropdown_field_as(String string) {
		mdMedicalHistoryPage.selecttMedicalHistoryItmGrp(string);
	}
	@Given("user select language from dropdown field as {string}")
	public void user_select_language_from_dropdown_field_as(String string) {
		mdMedicalHistoryPage.selectLanguage(string);
	}
	@Given("user enter description in text field as {string}")
	public void user_enter_description_in_text_field_as(String string) {
		mdMedicalHistoryPage.enterDescription(string);
	}
	@Given("user click on add button to add language")
	public void user_click_on_add_button_to_add_language() {
		mdMedicalHistoryPage.clickLanguageAddBtn();
	}
	@When("user click on submit button for add Medical History")
	public void user_click_on_submit_button_for_add_medical_history() {
		mdMedicalHistoryPage.clickSubmitBtn();
	}
	@Then("user should see success message for add Medical History")
	public void user_should_see_success_message_for_add_medical_history() {
		mdMedicalHistoryPage.successMsg();
	}
	
	//Search
	@Given("user enter Medical History Item Name in text field as {string} for search")
	public void user_enter_medical_history_item_name_in_text_field_as_for_search(String string) {
		mdMedicalHistoryPage.enterrMedicalHistoryItemNameSrch(string);
	}
	@When("user click on search button for Medical History")
	public void user_click_on_search_button_for_medical_history() {
		mdMedicalHistoryPage.clickSearchBtn();
	}
	@Then("user can see Medical History record in search result table with edit button")
	public void user_can_see_medical_history_record_in_search_result_table_with_edit_button() {
		mdMedicalHistoryPage.searchResultTable();
	}
	
	//Modify
	@Given("user navigated to medical history master page")
	public void user_navigated_to_medical_history_master_page() {
		mdMedicalHistoryPage.pageTitleMedicalHistory();
	}
	@Given("user click on edit button for Medical History")
	public void user_click_on_edit_button_for_medical_history() {
		mdMedicalHistoryPage.clickEditBtn();
	}
	@Given("user modify Medical History Item Name in text field as {string}")
	public void user_modify_medical_history_item_name_in_text_field_as(String string) {
		mdMedicalHistoryPage.enterMedicalHistoryItemName(string);
	}
	@When("user click on submit button for modify Medical History")
	public void user_click_on_submit_button_for_modify_medical_history() {
		mdMedicalHistoryPage.clickSubmitBtn();
	}
	@Then("user should see modify success business Medical History")
	public void user_should_see_modify_success_business_medical_history() {
		mdMedicalHistoryPage.modSuccessMsg();
	}

}
