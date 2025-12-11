package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_JobSitePage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_JobSiteSteps extends TestBase {
	
	SC_JobSitePage jobSitePage;
	JavaScriptUtils javaScriptUtils;

	public SC_JobSiteSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

//Add JobSite
	@Given("User clicks on Job Site under submenu company")
	public void user_clicks_on_job_site_under_submenu_company() {
		jobSitePage = new SC_JobSitePage(driver);
		jobSitePage.clickSubMenuJobSite();
	}
	@Given("user navigated to Job Site Master page")
	public void user_navigated_to_job_site_master_page() {
		jobSitePage.jobSitePageTitleName();
	}
	@Given("user click on add button for Job Site")
	public void user_click_on_add_button_for_job_site() {
		jobSitePage.clickAddBtn();
	}
	@Given("user select company name for Job Site from dropdown as {string}")
	public void user_select_company_name_for_job_site_from_dropdown_as(String string) {
		jobSitePage.selectDrpCompanyNew(string);
	}
	@Given("user enter Job Site Name in text field as {string}")
	public void user_enter_job_site_name_in_text_field_as(String string) {
		jobSitePage.enterJobSiteNew(string);
	}
	@When("user click on submit button for add Job Site")
	public void user_click_on_submit_button_for_add_job_site() {
		jobSitePage.submitNew();
	}
	@Then("user should see success message for add Job Site")
	public void user_should_see_success_message_for_add_job_site() {
		jobSitePage.jobCreatedSuccessMsg();
	}
	
//Search JobSite
	@Given("user select company name for Job Site from dropdown as {string} for search")
	public void user_select_company_name_for_job_site_from_dropdown_as_for_search(String string) {
		jobSitePage.selectOwnerCompanySrch(string);
	}
	@Given("user enter Job Site Name as {string} for search")
	public void user_enter_job_site_name_as_for_search(String string) {
		jobSitePage.enterJobSiteSrch(string);
	}
	@When("user click on search button for Job Site")
	public void user_click_on_search_button_for_job_site() {
		jobSitePage.clickSearchBtn();
	}
	@Then("user can see Job Site record in search result table with edit button")
	public void user_can_see_job_site_record_in_search_result_table_with_edit_button() {
		jobSitePage.searchResultTable();
	}
	
//Modify JobSite
	@Given("user click on edit button for edit Job Site")
	public void user_click_on_edit_button_for_edit_job_site() {
		jobSitePage.clickEditBtn();
	}
	@Given("user modify Job Site name in text field as {string}")
	public void user_modify_job_site_name_in_text_field_as(String string) {
		jobSitePage.txtModifyJobSite(string);
	}
	@When("user click on submit button for modify Job Site")
	public void user_click_on_submit_button_for_modify_job_site() {
		jobSitePage.modifySubmitBtn();
	}
	@Then("user should see modify success business Job Site")
	public void user_should_see_modify_success_business_job_site() {
		jobSitePage.modifySuccessMsg();
	}

}
