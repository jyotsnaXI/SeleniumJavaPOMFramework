package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_WidgetConfigurationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_WidgetConfigurationSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_WidgetConfigurationPage WidgetConfigurationPage;

	public SC_WidgetConfigurationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//Add Widget Configuration
	
	@Given("User clicks on Widget Configuration under dashboard under submenu company")
	public void user_clicks_on_widget_configuration_under_dashboard_under_submenu_company() {
		WidgetConfigurationPage = new SC_WidgetConfigurationPage(driver);
		WidgetConfigurationPage.clickWidgetConfigurationMenu();
	}
	@Given("user navigated to Widget Configuration page")
	public void user_navigated_to_widget_configuration_page() {
		WidgetConfigurationPage.pageTitleWidgetConfiguration();
	}
	@Given("user click on add button for Widget Configuration")
	public void user_click_on_add_button_for_widget_configuration() {
		WidgetConfigurationPage.clickAddBtn();
	}
	@Given("user select Owner Company from dropdown as {string} for Widget Configuration")
	public void user_select_owner_company_from_dropdown_as_for_widget_configuration(String string) {
		WidgetConfigurationPage.selectOwnCompany(string);
	}
	@Given("user select Widget Type from dropdown as {string} for Widget Configuration")
	public void user_select_widget_type_from_dropdown_as_for_widget_configuration(String string) {
		WidgetConfigurationPage.selectWidgetType(string);
	}
	@Given("user select Widget Category from dropdown as {string} for Widget Configuration")
	public void user_select_widget_category_from_dropdown_as_for_widget_configuration(String string) {
		WidgetConfigurationPage.selectWidgetCategory(string);
	}
	@Given("user select Health Check Item Name from dropdown as {string} for Widget Configuration")
	public void user_select_health_check_item_name_from_dropdown_as_for_widget_configuration(String string) {
		WidgetConfigurationPage.selectHealthCheckItemName(string);
	}
	@Given("user enter Sequence Number in text area as {string}")
	public void user_enter_sequence_number_in_text_area_as(String string) {
		WidgetConfigurationPage.enterSequence(string);
	}
	@Given("user select Gender from dropdown as {string} for Widget Configuration")
	public void user_select_gender_from_dropdown_as_for_widget_configuration(String string) {
		WidgetConfigurationPage.selectGender(string);
	}
	@Given("user select User Preference from dropdown as {string} for Widget Configuration")
	public void user_select_user_preference_from_dropdown_as_for_widget_configuration(String string) {
		WidgetConfigurationPage.selectUserPreference(string);
	}
	@Given("user enter Min Value in text area as {string}")
	public void user_enter_min_value_in_text_area_as(String string) {
		WidgetConfigurationPage.enterMinVal(string);
	}
	@Given("user enter Max Value in text area as {string}")
	public void user_enter_max_value_in_text_area_as(String string) {
		WidgetConfigurationPage.enterMaxVal(string);
	}
	@Given("user enter Points in text area as {string}")
	public void user_enter_points_in_text_area_as(String string) {
		WidgetConfigurationPage.enterPoints(string);
	}
	@Given("user select Smiley from dropdown for Widget Configuration")
	public void user_select_smiley_from_dropdown_for_widget_configuration() {
		WidgetConfigurationPage.selectSmiley();
	}
	@Given("user click on add button for smiley")
	public void user_click_on_add_button_for_smiley() {
		WidgetConfigurationPage.clickAddSmileyBtn();
	}
	@When("user click on submit button for Widget Configuration")
	public void user_click_on_submit_button_for_widget_configuration() {
		WidgetConfigurationPage.clickSubmitBtn();
	}
	@Then("user can see success message for Widget Configuration")
	public void user_can_see_success_message_for_widget_configuration() {
		WidgetConfigurationPage.successMsg();
	}

}
