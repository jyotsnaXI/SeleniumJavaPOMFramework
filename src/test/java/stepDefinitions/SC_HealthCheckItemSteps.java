package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_HealthCheckItemPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_HealthCheckItemSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_HealthCheckItemPage healthCheckItemPage;

	public SC_HealthCheckItemSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Health Check Item
	@Given("User clicks on HealthCheckItem under submenu medical data")
	public void user_clicks_on_health_check_item_under_submenu_medical_data() {
		healthCheckItemPage = new SC_HealthCheckItemPage(driver);
		healthCheckItemPage.clickMenuhealthCheckItem();
	}
	@Given("user navigated to HealthCheckItem Master page")
	public void user_navigated_to_health_check_item_master_page() {
		healthCheckItemPage.pageTitleName();
	}
	@Given("user click on add button for HealthCheckItem")
	public void user_click_on_add_button_for_health_check_item() {
		healthCheckItemPage.clickAddBtn();
	}
	@Given("user enter Health Check Item Name in text field as {string}")
	public void user_enter_health_check_item_name_in_text_field_as(String string) {
		healthCheckItemPage.enterHealthChkItemName(string);
	}
	@Given("user select Health Check Item Group from dropdown field as {string}")
	public void user_select_health_check_item_group_from_dropdown_field_as(String string) {
		healthCheckItemPage.selectHealthChkItemGrp(string);
	}
	@Given("user select Health Check Item Sub group from dropdown field as {string}")
	public void user_select_health_check_item_sub_group_from_dropdown_field_as(String string) {
		healthCheckItemPage.selectHealthChkItemSubGrp(string);
	}
	@Given("user select Health Check Item Type from dropdown field as {string}")
	public void user_select_health_check_item_type_from_dropdown_field_as(String string) {
		healthCheckItemPage.selectHealthChkItemType(string);
	}
	@Given("user enter International Unit in text field as {string}")
	public void user_enter_international_unit_in_text_field_as(String string) {
		healthCheckItemPage.enterISOSUnit(string);
	}
	@Given("user enter Unit of Measurement in text field as {string}")
	public void user_enter_unit_of_measurement_in_text_field_as(String string) {
		healthCheckItemPage.enterUnitMeasurement(string);
	}
	@Given("user enter Conversion Factor in text field as {string}")
	public void user_enter_conversion_factor_in_text_field_as(String string) {
		healthCheckItemPage.enterConversationFact(string);
	}
	@Given("user enter Secondary Name in text field as {string}")
	public void user_enter_secondary_name_in_text_field_as(String string) {
		healthCheckItemPage.enterSecondaryName(string);
	}
	@Given("user click on add button to add international unit")
	public void user_click_on_add_button_to_add_international_unit() {
		healthCheckItemPage.clickISOSAddBtn();
	}
	@Given("user select Language from dropdown field as {string}")
	public void user_select_language_from_dropdown_field_as(String string) {
		healthCheckItemPage.selectLanguage(string);
	}
	@Given("user enter Description in text field as {string}")
	public void user_enter_description_in_text_field_as(String string) {
		healthCheckItemPage.enterDescription(string);
	}
	@Given("user click on add button to add Other Language Description")
	public void user_click_on_add_button_to_add_other_language_description() {
		healthCheckItemPage.clickLanguageAddBtn();
	}
	@When("user click on submit button for add HealthCheckItem")
	public void user_click_on_submit_button_for_add_health_check_item() {
		healthCheckItemPage.clickSubmitBtn();
	}
	@Then("user should see success message for add HealthCheckItem")
	public void user_should_see_success_message_for_add_health_check_item() {
		healthCheckItemPage.successMsg();
	}
	
	//Search Health Check Item
	@Given("user enter Health Check Item Name in text field as {string} for search")
	public void user_enter_health_check_item_name_in_text_field_as_for_search(String string) {
		healthCheckItemPage.enterHlthChkItemNmeSrch(string);
	}
	@When("user click on search button for HealthCheckItem")
	public void user_click_on_search_button_for_health_check_item() {
		healthCheckItemPage.clickSearchBtn();
	}
	@Then("user can see HealthCheckItem record in search result table with edit button")
	public void user_can_see_health_check_item_record_in_search_result_table_with_edit_button() {
		healthCheckItemPage.searchResultTable();
	}
	
	//Modify Health Check Item
	@Given("user click on edit button for HealthCheckItem")
	public void user_click_on_edit_button_for_health_check_item() {
		healthCheckItemPage.clickEditBtn();
	}
	@Then("user modify Health Check Item Sub group from dropdown field as {string}")
	public void user_modify_health_check_item_sub_group_from_dropdown_field_as(String string) {
		healthCheckItemPage.modifyHealthChkItemSubGrp(string);
	}
	@When("user click on submit button for modify HealthCheckItem")
	public void user_click_on_submit_button_for_modify_health_check_item() {
		healthCheckItemPage.clickUpdateBtn();
	}
	@Then("user should see modify success business HealthCheckItem")
	public void user_should_see_modify_success_business_health_check_item() {
		healthCheckItemPage.modSuccessMsg();
	}

}
