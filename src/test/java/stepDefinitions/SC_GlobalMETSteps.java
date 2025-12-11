package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_GlobalMETPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_GlobalMETSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_GlobalMETPage globalMETPage;

	public SC_GlobalMETSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Global MET
	@Given("User clicks on Global MET under exam under submenu system configuration")
	public void user_clicks_on_global_met_under_exam_under_submenu_system_configuration() {
		globalMETPage = new SC_GlobalMETPage(driver);
		globalMETPage.clickMenuGlobalMET();
	}
	@Given("user navigated to Global MET Master page")
	public void user_navigated_to_global_met_master_page() {
		globalMETPage.pageTitleName();
	}
	@Given("user click on Add button for Global MET")
	public void user_click_on_add_button_for_global_met() {
		globalMETPage.clickAddBtn();
	}
	@Given("user enter Global MET Name in text field as {string}")
	public void user_enter_global_met_name_in_text_field_as(String string) {
		globalMETPage.enterGlobalMETName(string);
	}
	@Given("user select checkbox for {string} for Global MET")
	public void user_select_checkbox_for_for_global_met(String string) {
		globalMETPage.selectCheckBox(string);
	}
	@When("user click on submit button for Global MET")
	public void user_click_on_submit_button_for_global_met() {
		globalMETPage.clickSubmitBtn();
	}
	@Then("user should see success message for Global MET")
	public void user_should_see_success_message_for_global_met() {
		globalMETPage.successMsg();
	}
	
	//Search
	@Given("user enter Global MET name in text field as {string} for search Global MET")
	public void user_enter_global_met_name_in_text_field_as_for_search_global_met(String string) {
		globalMETPage.enterGlobalMETSrch(string);
	}
	@When("user click on search button for Global MET")
	public void user_click_on_search_button_for_global_met() {
		globalMETPage.clickSearchBtn();
	}
	@Then("user can see search result with edit button for Global MET")
	public void user_can_see_search_result_with_edit_button_for_global_met() {
		globalMETPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for Global MET")
	public void user_click_on_edit_button_for_global_met() {
		globalMETPage.clickEditBtn();
	}
	@When("user click on submit button for update Global MET")
	public void user_click_on_submit_button_for_update_global_met() {
		globalMETPage.clickSubmitBtn();
	}
	@Then("user should see modify success message for Global MET")
	public void user_should_see_modify_success_message_for_global_met() {
		globalMETPage.modSuccessMsg();
	}

}
