package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_METPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_METSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_METPage METPage;

	public SC_METSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_AddMET	
	@Given("User clicks on MET under submenu company")
	public void user_clicks_on_met_under_submenu_company() {
		METPage = new SC_METPage(driver);
		METPage.clickSubMenuMET();
	}
	@Given("user navigated to Search MET page")
	public void user_navigated_to_search_met_page() {
		METPage.pageTitleMET();
	}
	@Given("user click on ADD button")
	public void user_click_on_add_button() {
		METPage.addMETbtn();
	}
	@Given("user navigated to MET Master page")
	public void user_navigated_to_met_master_page() {
		METPage.pageTitleMET();
	}
	@Given("user select company dropdown as {string}")
	public void user_select_company_dropdown_as(String string) {
		METPage.selectCompany(string);
	}
	@Given("user select Global MET dropdown as {string}")
	public void user_select_global_met_dropdown_as(String string) {
		METPage.selectGlobalMET(string);
	}
	@Given("user enter MET in text area as {string}")
	public void user_enter_met_in_text_area_as(String string) {
		METPage.enterMET(string);
	}
	@Given("user click on add button for adding MET")
	public void user_click_on_add_button_for_adding_met() {
		METPage.addMETbtn();
	}
	@Given("user can see Add\\/Modify MET Criteria section")
	public void user_can_see_add_modify_met_criteria_section() {
		
	}
	@Given("user enter Criteria Name in text area as {string}")
	public void user_enter_criteria_name_in_text_area_as(String string) {
		METPage.enterCriteriaName(string);
	}
	@Given("user enter Frequency in Years in text area as {string}")
	public void user_enter_frequency_in_years_in_text_area_as(String string) {
		METPage.modifyFrequencyInYear(string);
	}
	@Given("user enter age in text area as {string}")
	public void user_enter_age_in_text_area_as(String string) {
		METPage.enterAge(string);
	}
	@Given("user select gender from dropdown as {string}")
	public void user_select_gender_from_dropdown_as(String string) {
		METPage.selectGender(string);
	}
	@Given("user select Geo Market from dropdown")
	public void user_select_geo_market_from_dropdown() {
		METPage.selectGeoMarket();
	}
	@When("user click on submit button for MET")
	public void user_click_on_submit_button_for_met() throws InterruptedException {
		METPage.clickSubmitBtn();
	}
	@Then("user can see success message for add MET")
	public void user_can_see_success_message_for_add_met() throws InterruptedException {
		METPage.successMsg();
	}
	
	//SC_SearchMET
	@When("user click on search button for MET")
	public void user_click_on_search_button_for_met() {
		METPage.searchBtn();
	}
	@Then("user can see search result for MET")
	public void user_can_see_search_result_for_met() {
		METPage.searchResult();
	}
	
	//SC_ModifyMET
	@Given("user can see search result for MET with edit button")
	public void user_can_see_search_result_for_met_with_edit_button() {
		METPage.searchResult();
	}
	@Given("user click on edit button for MET")
	public void user_click_on_edit_button_for_met() {
		METPage.clickEditBtn();
	}
	@Given("user click on edit button for modify MET")
	public void user_click_on_edit_button_for_modify_met() {
		METPage.clickSubEditBtn();
	}
	@Given("user modify Criteria Name in text area as {string}")
	public void user_modify_criteria_name_in_text_area_as(String string) {
		METPage.modifyCriteriaName(string);
	}
	@Given("user modify Frequency in Years in text area as {string}")
	public void user_modify_frequency_in_years_in_text_area_as(String string) {
		METPage.modifyFrequencyInYear(string);
	}
	@Given("user modify age in text area as {string}")
	public void user_modify_age_in_text_area_as(String string) {
		METPage.modifyAge(string);
	}
	@Given("user modify gender from dropdown as {string}")
	public void user_modify_gender_from_dropdown_as(String string) {
		METPage.modifyGender(string);
	}
	@Given("user modify Geo Market from dropdown")
	public void user_modify_geo_market_from_dropdown() {
		METPage.modifyGeoMarket();
	}
	@Then("user can see success message for modify MET")
	public void user_can_see_success_message_for_modify_met() throws InterruptedException {
		METPage.successMsg();
	}

}
