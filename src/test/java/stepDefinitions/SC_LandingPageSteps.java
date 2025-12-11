package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_LandingPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_LandingPageSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_LandingPage landingPage;

	public SC_LandingPageSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Landing Page
	@Given("User clicks on Landing Page under dashboard under submenu company")
	public void user_clicks_on_landing_page_under_dashboard_under_submenu_company() {
		landingPage = new SC_LandingPage(driver);
		landingPage.clickLandingPageMenu();
	}
	@Given("user navigated to Landing Page Master")
	public void user_navigated_to_landing_page_master() {
		landingPage.pageTitle();
	}
	@Given("user click on add button for Landing Page")
	public void user_click_on_add_button_for_landing_page() {
		landingPage.clickAddBtn();
	}
	@Given("user select company name for Landing Page from dropdown as {string}")
	public void user_select_company_name_for_landing_page_from_dropdown_as(String string) {
		landingPage.selectDrpCompanyNew(string);
	}
	@Given("user select profile from dropdown as {string}")
	public void user_select_profile_from_dropdown_as(String string) {
		landingPage.selectProfile(string);
	}
	@When("user click on submit button for Landing Page")
	public void user_click_on_submit_button_for_landing_page() {
		landingPage.submitNew();
	}
	@Then("user should see success message for Landing Page")
	public void user_should_see_success_message_for_landing_page() {
		landingPage.landingSuccessMsg();
	}
	
	//Search
	@Given("user select company name for Landing Page from dropdown as {string} for search")
	public void user_select_company_name_for_landing_page_from_dropdown_as_for_search(String string) {
		landingPage.selectOwnerCompanySrch(string);
	}
	@Given("user select profile from dropdown as {string} for search")
	public void user_select_profile_from_dropdown_as_for_search(String string) {
		landingPage.selectProfileSrch(string);
	}
	@When("user click on search button for Landing Page")
	public void user_click_on_search_button_for_landing_page() {
		landingPage.clickSearchBtn();
	}
	@Then("user can see search result table with edit button")
	public void user_can_see_search_result_table_with_edit_button() {
		landingPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for edit Landing Page")
	public void user_click_on_edit_button_for_edit_landing_page() {
		landingPage.clickEditBtn();
	}
	@When("user click on submit button for modify Landing Page")
	public void user_click_on_submit_button_for_modify_landing_page() {
		landingPage.modifySubmitBtn();
	}
	@Then("user should see modify success Landing Page message")
	public void user_should_see_modify_success_landing_page_message() {
		landingPage.modifySuccessMsg();
	}

}
