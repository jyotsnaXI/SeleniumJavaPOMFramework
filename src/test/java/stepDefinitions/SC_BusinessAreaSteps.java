package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_BusinessAreaPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_BusinessAreaSteps extends TestBase {
	
	SC_BusinessAreaPage businessAreaPage;
	JavaScriptUtils javaScriptUtils;

	public SC_BusinessAreaSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add business area	
	@Given("User clicks on business area master under submenu company")
	public void user_clicks_on_business_area_master_under_submenu_company() {
		businessAreaPage = new SC_BusinessAreaPage(driver);
		businessAreaPage.clickBusinessAreaMaster();
	}
	@Given("user navigated to Business Area Master page")
	public void user_navigated_to_business_area_master_page() {
		businessAreaPage.businessAreaPageTitleName();
	}
	@Given("user click on add button for business area")
	public void user_click_on_add_button_for_business_area() {
		businessAreaPage.clickAddBtn();
	}
	@Given("user select company name for business area from dropdown as {string}")
	public void user_select_company_name_for_business_area_from_dropdown_as(String string) {
		businessAreaPage.selectDrpCompanyNew(string);
	}
	@Given("user enter business area in text field as {string}")
	public void user_enter_business_area_in_text_field_as(String string) {
		businessAreaPage.enterBusinessAreaNew(string);
	}
	@When("user click on submit button for add business area")
	public void user_click_on_submit_button_for_add_business_area() {
		businessAreaPage.submitNew();
	}
	@Then("user should see success message for add business area")
	public void user_should_see_success_message_for_add_business_area() {
		businessAreaPage.areaCreatedSuccessMsg();
	}
	
//Search business area
	@Given("user select company name for business area from dropdown as {string} for search")
	public void user_select_company_name_for_business_area_from_dropdown_as_for_search(String string) {
		businessAreaPage.selectOwnerCompanySrch(string);
	}
	@Given("user enter business area as {string} for search")
	public void user_enter_business_area_as_for_search(String string) {
		businessAreaPage.enterBusinessAreaSrch(string);
	}
	@When("user click on search button for business area")
	public void user_click_on_search_button_for_business_area() {
		businessAreaPage.clickSearchBtn();
	}
	@Then("user can see business record in search result table with edit button")
	public void user_can_see_business_record_in_search_result_table_with_edit_button() {
		businessAreaPage.searchResultTable();
	}
	
//Modify business area
	@Given("user click on edit button for edit business area")
	public void user_click_on_edit_button_for_edit_business_area() {
		businessAreaPage.clickEditBtn();
	}
	@Given("user modify business area in text field as {string}")
	public void user_modify_business_area_in_text_field_as(String string) {
		businessAreaPage.txtModifyArea(string);
	}
	@When("user click on submit button for modify business area")
	public void user_click_on_submit_button_for_modify_business_area() {
		businessAreaPage.modifySubmitBtn();
	}
	@Then("user should see modify success business area message")
	public void user_should_see_modify_success_business_area_message() {
		businessAreaPage.modifySuccessMsg();
	}


}
