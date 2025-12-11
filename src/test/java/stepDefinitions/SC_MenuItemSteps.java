package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_MenuItemPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MenuItemSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_MenuItemPage menuItemPage;

	public SC_MenuItemSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Menu Item Master
	@Given("User clicks on Menu Item under mobile under submenu company")
	public void user_clicks_on_menu_item_under_mobile_under_submenu_company() {
		menuItemPage = new SC_MenuItemPage(driver);
		menuItemPage.clickSubMenuItem();
	}
	@Given("user navigated to Menu Item Master")
	public void user_navigated_to_menu_item_master() {
		menuItemPage.pageTitleName();
	}
	@Given("user click on add button for Menu Item")
	public void user_click_on_add_button_for_menu_item() {
		menuItemPage.clickAddBtn();
	}
	@Given("user select company name for Menu Item from dropdown as {string}")
	public void user_select_company_name_for_menu_item_from_dropdown_as(String string) {
		menuItemPage.selectDrpCompanyNew(string);
	}
	@Given("user select default menu name from dropdown as {string}")
	public void user_select_default_menu_name_from_dropdown_as(String string) {
		menuItemPage.selectDefaultMenuNew(string);
	}
	@When("user click on submit button for Menu Item")
	public void user_click_on_submit_button_for_menu_item() {
		menuItemPage.clickSubmitBtn();
	}
	@Then("user should see success message for Menu Item")
	public void user_should_see_success_message_for_menu_item() {
		menuItemPage.successMsg();
	}
	
	//Search
	@Given("user select company name for Menu Item from dropdown as {string} for search")
	public void user_select_company_name_for_menu_item_from_dropdown_as_for_search(String string) {
		menuItemPage.selectDrpCompanySrch(string);
	}
	@Given("user select default menu name from dropdown as {string} for search")
	public void user_select_default_menu_name_from_dropdown_as_for_search(String string) {
		menuItemPage.selectDefaultMenuSrch(string);
	}
	@When("user click on search button for Menu Item")
	public void user_click_on_search_button_for_menu_item() {
		menuItemPage.clickSearchBtn();
	}
	@Then("user can see search result table with edit button for menu item")
	public void user_can_see_search_result_table_with_edit_button_for_menu_item() {
		menuItemPage.searchResultTable();
	}
	
	@Given("user click on edit button for edit Menu Item")
	public void user_click_on_edit_button_for_edit_menu_item() {
		menuItemPage.clickEditBtn();
	}
	@Given("user modify alternate menu name as {string} for Menu Item")
	public void user_modify_alternate_menu_name_as_for_menu_item(String string) {
		menuItemPage.enterAltMenuNameEdit(string);
	}
	@When("user click on submit button for modify Menu Item")
	public void user_click_on_submit_button_for_modify_menu_item() {
		menuItemPage.clickUpdateBtn();
	}
	@Then("user should see modify success Menu Item message")
	public void user_should_see_modify_success_menu_item_message() {
		menuItemPage.modSuccessMsg();
	}
	
	//Delete
	@Given("user can see search result table with delete button for menu item")
	public void user_can_see_search_result_table_with_delete_button_for_menu_item() {
		menuItemPage.searchResultTable();
	}
	@When("user click on delete button for delete Menu Item")
	public void user_click_on_delete_button_for_delete_menu_item() {
		menuItemPage.clickDeleteBtn();
	}
	@Then("user should see delete success Menu Item message")
	public void user_should_see_delete_success_menu_item_message() {
		menuItemPage.deleteMsg();
	}

}
