package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_EmployeeCategoryPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_EmployeeCategorySteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_EmployeeCategoryPage empCategoryPage;

	public SC_EmployeeCategorySteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add Employee Category
	@Given("User clicks on employee category under submenu company")
	public void user_clicks_on_employee_category_under_submenu_company() {
	    empCategoryPage = new SC_EmployeeCategoryPage(driver);
	    empCategoryPage.clickSubMenuEmpCategory();
	}
	@Given("user navigated to employee category master page")
	public void user_navigated_to_employee_category_master_page() {
		empCategoryPage.empCategoryPageTitle();
	}
	@Given("user click on add button for employee category")
	public void user_click_on_add_button_for_employee_category() {
		empCategoryPage.clickAddBtn();
	}
	@Given("user select owner company from dropdown as {string}")
	public void user_select_owner_company_from_dropdown_as(String string) {
		empCategoryPage.selectDrpCompanyNew(string);
	}
	@Given("user enter employee category name in text field as {string}")
	public void user_enter_employee_category_name_in_text_field_as(String string) {
		empCategoryPage.enterEmpCategoryNew(string);
	}
	@When("user click on submit button for add employee category")
	public void user_click_on_submit_button_for_add_employee_category() {
		empCategoryPage.clickSubmitNew();
	}
	@Then("user should see success message for add employee category")
	public void user_should_see_success_message_for_add_employee_category() {
		empCategoryPage.createdSuccessMsg();
	}
	
//Search Employee Category
	@Given("user select owner company from dropdown as {string} for search")
	public void user_select_owner_company_from_dropdown_as_for_search(String string) {
		empCategoryPage.selectDrpCompanySrch(string);
	}
	@Given("user enter employee category name as {string} for search")
	public void user_enter_employee_category_name_as_for_search(String string) {
		empCategoryPage.enterEmpCategorySrch(string);
	}
	@When("user click on search button for employee category")
	public void user_click_on_search_button_for_employee_category() {
		empCategoryPage.clickSearchBtn();
	}
	@Then("user can see employee category record in search result table with edit button")
	public void user_can_see_employee_category_record_in_search_result_table_with_edit_button() {
		empCategoryPage.searchResultTable();
	}	
	
//Modify Employee Category
	@Given("user select owner company name from dropdown as {string} for search")
	public void user_select_owner_company_name_from_dropdown_as_for_search(String string) {
		empCategoryPage.selectDrpCompanySrch(string);
	}
	@Given("user can see employee category search result table with edit button")
	public void user_can_see_employee_category_search_result_table_with_edit_button() {
		empCategoryPage.searchResultTable();
	}
	@Given("user click on edit button for edit employee category")
	public void user_click_on_edit_button_for_edit_employee_category() {
		empCategoryPage.clickEditBtn();
	}
	@Given("user modify employee category name in text field as {string}")
	public void user_modify_employee_category_name_in_text_field_as(String string) {
		empCategoryPage.txtModifyEmpCategory(string);
	}
	@When("user click on submit button for modify employee category")
	public void user_click_on_submit_button_for_modify_employee_category() {
		empCategoryPage.modifySubmitBtn();
	}
	@Then("user should see success message for modify employee category")
	public void user_should_see_success_message_for_modify_employee_category() {
		empCategoryPage.modifySuccessMsg();
	}
}
