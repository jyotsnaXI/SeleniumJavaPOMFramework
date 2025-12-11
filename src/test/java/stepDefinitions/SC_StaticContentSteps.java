package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_StaticContentPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_StaticContentSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_StaticContentPage staticContentPage;

	public SC_StaticContentSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add Static Content

	@Given("User clicks on Static Content under submenu company")
	public void user_clicks_on_static_content_under_submenu_company() {
		staticContentPage = new SC_StaticContentPage(driver);
		staticContentPage.clickSubMenuStaticContent();
	}

	@Given("user navigated to Static Content Master page")
	public void user_navigated_to_static_content_master_page() {
		staticContentPage.staticContentTitleName();
	}

	@Given("user select owner company from dropdown as {string} for Static Content")
	public void user_select_owner_company_from_dropdown_as_for_static_content(String string) {
		staticContentPage.selectOwnerCompany(string);
	}

	@Given("user click on search button for Static Content")
	public void user_click_on_search_button_for_static_content() {
		staticContentPage.clickSearchBtn();
	}

	@Given("user can see search result with edit button for Static Content")
	public void user_can_see_search_result_with_edit_button_for_Static_Content() {
		staticContentPage.searchResultTable();
	}

	@Given("user enter Menu Name in text area as {string}")
	public void user_enter_menu_name_in_text_area_as(String string) {
		staticContentPage.enterMenuName(string);
	}

	@Given("user enter URL location or path in text area as {string}")
	public void user_enter_url_location_or_path_in_text_area_as(String string) {
		staticContentPage.enterPathLocation(string);
	}

	@When("user click on submit button for Static Content")
	public void user_click_on_submit_button_for_static_content() {
		staticContentPage.clickSubmit();
	}

	@Then("user can see success message for Static Content")
	public void user_can_see_success_message_for_static_content() {
		staticContentPage.staticContentSuccessMsg();
	}
	
	@Then("user can see search records for Static Content")
	public void user_can_see_search_records_for_static_content() {
		staticContentPage.searchResultTable();
	}
	
	//Edit Static Content
	@Given("user click on edit button for Static Content")
	public void user_click_on_edit_button_for_static_content() {
		staticContentPage.clickEditBtn();
	}
	@Given("user modify Menu Name in text area as {string}")
	public void user_modify_menu_name_in_text_area_as(String string) {
		staticContentPage.modiMenuName(string);
	}
	@Given("user modify URL location or path in text area as {string}")
	public void user_modify_url_location_or_path_in_text_area_as(String string) {
		staticContentPage.modifyPathLocation(string);
	}
	@When("user click on submit button for modify Static Content")
	public void user_click_on_submit_button_for_modify_static_content() {
		staticContentPage.updateBtn();
	}
	@Then("user can see modify success message Static Content")
	public void user_can_see_modify_success_message_static_content() {
		staticContentPage.modifySuccessMsg(); 
	}

}
