package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_AreaMasterPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_AreaMasterSteps extends TestBase {

	SC_AreaMasterPage areaMasterPage;
	JavaScriptUtils javaScriptUtils;

	public SC_AreaMasterSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("User clicks on area master under submenu company")
	public void user_clicks_on_area_master_under_submenu_company() {
		areaMasterPage = new SC_AreaMasterPage(driver);
		areaMasterPage.clickSubMenuAreaMaster();
	}

	@Given("user navigated to area master page")
	public void user_navigated_to_area_master_page() {
		areaMasterPage.areaMasterPageTitleName();
	}
	
//Add AREA MASTER
	@Given("user click on add button for area")
	public void user_click_on_add_button_for_area() {
		areaMasterPage.clickAddBtn();
	}
	@Given("user select company name from dropdown as {string}")
	public void user_select_company_name_from_dropdown_as(String string) {
		areaMasterPage.selectDrpCompanyNew(string);
	}
	@Given("user enter area in text field as {string}")
	public void user_enter_area_in_text_field_as(String string) {
		areaMasterPage.enterAreaNew(string);
	}
	@When("user click on submit button for add area")
	public void user_click_on_submit_button_for_add_area() {
		areaMasterPage.submitNew();
	}
	@Then("user should see success message for add area")
	public void user_should_see_success_message_for_add_area() {
		areaMasterPage.areaCreatedSuccessMsg();
	}
	
//SEARCH AREA MASTER 
	@Given("user select company name from dropdown as {string} for search")
	public void user_select_company_name_from_dropdown_as_for_search(String string) {
		areaMasterPage.selectOwnerCompanySrch(string);
	}
	@Given("user enter area as {string} for search")
	public void user_enter_area_as_for_search(String string) {
		areaMasterPage.enterAreaSrch(string);
	}
	@When("user click on search button for area")
	public void user_click_on_search_button_for_area() {
		areaMasterPage.clickSearchBtn();
	}
	
//MODIFY AREA MASTER 
	@Given("user can see record in search result table with edit button")
	public void user_can_see_record_in_search_result_table_with_edit_button() {
	    areaMasterPage.searchResultTable();
	}
	@Given("user click on edit button")
	public void user_click_on_edit_button() {
		areaMasterPage.clickEditBtn();
	}
	@Given("user modify area in text field as {string}")
	public void user_modify_area_in_text_field_as(String string) {
		areaMasterPage.txtModifyArea(string);
	}
	@When("user click on submit button for modify area")
	public void user_click_on_submit_button_for_modify_area() {
		areaMasterPage.modifySubmitBtn();
	}
	@Then("user should see modify success message")
	public void user_should_see_modify_success_message() {
		areaMasterPage.modifySuccessMsg();
	}
}
