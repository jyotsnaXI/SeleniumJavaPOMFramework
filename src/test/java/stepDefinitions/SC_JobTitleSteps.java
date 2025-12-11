package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_JobTitlePage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_JobTitleSteps extends TestBase {
	
	SC_JobTitlePage jobTitlePage;
	JavaScriptUtils javaScriptUtils;

	public SC_JobTitleSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add JobTitle
	@Given("User clicks on Job Title under submenu company")
	public void user_clicks_on_job_title_under_submenu_company() {
		jobTitlePage = new SC_JobTitlePage(driver);
		jobTitlePage.clickSubMenuJobTitle();
	}
	@Given("user navigated to Job Title Master page")
	public void user_navigated_to_job_title_master_page() {
		jobTitlePage.jobTitlePageTitleName();
	}
	@Given("user click on add button for job title")
	public void user_click_on_add_button_forjob_title() {
		jobTitlePage.clickAddBtn();
	}
	@Given("user select company name for job title from dropdown as {string}")
	public void user_select_company_name_for_job_title_from_dropdown_as(String string) {
		jobTitlePage.selectDrpCompanyNew(string);
	}
	@Given("user enter Job Title in text field as {string}")
	public void user_enter_job_title_in_text_field_as(String string) {
		jobTitlePage.enterJobTitleNew(string);
	}
	@When("user click on submit button for add job title")
	public void user_click_on_submit_button_for_add_job_title() {
		jobTitlePage.submitNew();
	}
	@Then("user should see success message for add job title")
	public void user_should_see_success_message_for_add_job_title() {
		jobTitlePage.titleCreatedSuccessMsg();
	}
	
//Search JobTitle
	@Given("user select company name for job title from dropdown as {string} for search")
	public void user_select_company_name_for_job_title_from_dropdown_as_for_search(String string) {
		jobTitlePage.selectOwnerCompanySrch(string);
	}
	@Given("user enter Job Title as {string} for search")
	public void user_enter_job_title_as_for_search(String string) {
		jobTitlePage.enterJobTitleSrch(string);
	}
	@When("user click on search button for job title")
	public void user_click_on_search_button_for_job_title() {
		jobTitlePage.clickSearchBtn();
	}
	@Then("user can see job title record in search result table with edit button")
	public void user_can_see_job_title_record_in_search_result_table_with_edit_button() {
		jobTitlePage.searchResultTable();
	}
	
//Modify JobTitle
	@Given("user click on edit button for edit job title")
	public void user_click_on_edit_button_for_edit_job_title() {
		jobTitlePage.clickEditBtn();
	}
	@Given("user modify Job Title in text field as {string}")
	public void user_modify_job_title_in_text_field_as(String string) {
		jobTitlePage.txtModifyJobTitle(string);
	}
	@When("user click on submit button for modify job title")
	public void user_click_on_submit_button_for_modify_job_title() {
		jobTitlePage.modifySubmitBtn();
	}
	@Then("user should see modify success business job title")
	public void user_should_see_modify_success_business_job_title() {
		jobTitlePage.modifySuccessMsg();
	}

}
