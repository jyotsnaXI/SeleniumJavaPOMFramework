package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_CriteriaPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_CriteriaSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_CriteriaPage companyCriteriaPage;

	public SC_CriteriaSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add Company Criteria
	@Given("User clicks on Criteria under submenu company")
	public void user_clicks_on_criteria_under_submenu_company() {
		companyCriteriaPage = new SC_CriteriaPage(driver);
		companyCriteriaPage.clickSubMenuCriteria();
	}
	@Given("user navigated to company criteria master page")
	public void user_navigated_to_company_criteria_master_page() {
		companyCriteriaPage.criteriaPageTitleName();
	}
	@Given("user select owner company from dropdown as {string} for company criteria")
	public void user_select_owner_company_from_dropdown_as_for_company_criteria(String string) {
		companyCriteriaPage.selectDrpCompanyNew(string);
	}
	@Given("user click on get deatils button")
	public void user_click_on_get_deatils_button() {
		companyCriteriaPage.clickGetDetails();
	}
	@Given("user select checkbox for {string} in criteria field")
	public void user_select_checkbox_for_in_criteria_field(String string) {
		companyCriteriaPage.selectCheckbox(string);
	}
	@Given("user select checkbox for optional criteria")
	public void user_select_checkbox_for_optional_criteria() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user click on submit button for company criteria")
	public void user_click_on_submit_button_for_company_criteria() {
		companyCriteriaPage.clickSubmitBtn();
	}
	@Then("user can see company criteria success message")
	public void user_can_see_company_criteria_success_message() throws IOException {
		companyCriteriaPage.successMsg();
	}

}
