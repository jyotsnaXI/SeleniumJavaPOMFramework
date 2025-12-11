package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_CodeDescriptionPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_CodeDescriptionSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_CodeDescriptionPage codeDescriptionPage;

	public SC_CodeDescriptionSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_Add Code master
	@Given("User clicks on code description under system configuration")
	public void user_clicks_on_code_description_under_system_configuration() {
		codeDescriptionPage = new SC_CodeDescriptionPage(driver);
		codeDescriptionPage.clickMenuCodeMaster();
	}
	@Given("user navigated to code master page")
	public void user_navigated_to_code_master_page() {
		codeDescriptionPage.pageTitleName();
	}
	@Given("user click on add button for code")
	public void user_click_on_add_button_for_code() {
		codeDescriptionPage.clickAddBtn();
	}
	@Given("user select code type from dropdown field as {string}")
	public void user_select_code_type_from_dropdown_field_as(String string) {
		codeDescriptionPage.enterCodeTypeNew(string);
	}
	@Given("user enter description in text field as {string} for code")
	public void user_enter_description_in_text_field_as_for_code(String string) {
		codeDescriptionPage.enterDescriptionNew(string);
	}
	@Given("user enter abbreviation in text field as {string}")
	public void user_enter_abbreviation_in_text_field_as(String string) {
		codeDescriptionPage.enterAbbreviationNew(string);
	}
	@When("user click on submit button for add code")
	public void user_click_on_submit_button_for_add_code() {
		codeDescriptionPage.clickSubmitBtn();
	}
	@Then("user should see success message for add code")
	public void user_should_see_success_message_for_add_code() {
		codeDescriptionPage.successMsg();
	}
	
	//Search
	@Given("user select code type from dropdown field as {string} for search")
	public void user_select_code_type_from_dropdown_field_as_for_search(String string) {
		codeDescriptionPage.codeTypeSrch(string);
	}
	@Given("user enter description in text field as {string} for search")
	public void user_enter_description_in_text_field_as_for_search(String string) {
		codeDescriptionPage.enterDescriptionSrch(string);
	}
	@When("user click on search button for code")
	public void user_click_on_search_button_for_code() {
		codeDescriptionPage.clickSearchBtn();
	}
	@Then("user can see code record in search result table with edit button")
	public void user_can_see_code_record_in_search_result_table_with_edit_button() {
		codeDescriptionPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for edit code")
	public void user_click_on_edit_button_for_edit_code() {
		codeDescriptionPage.clickEditBtn();
	}
	@Given("user modify description in text field as {string} for code")
	public void user_modify_description_in_text_field_as_for_code(String string) {
		codeDescriptionPage.modifyDescription(string);
	}
	@Given("user modify abbreviation in text field as {string}")
	public void user_modify_abbreviation_in_text_field_as(String string) {
		codeDescriptionPage.modifyAbbreviation(string);
	}
	@When("user click on submit button for modify code")
	public void user_click_on_submit_button_for_modify_code() {
		codeDescriptionPage.clickUpdateBtn();
	}
	@Then("user should see modify success message for code")
	public void user_should_see_modify_success_message_for_code() {
		codeDescriptionPage.modSuccessMsg();
	}

}
