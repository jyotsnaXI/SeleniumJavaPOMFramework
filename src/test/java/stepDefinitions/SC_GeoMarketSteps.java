package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_GeoMarketPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_GeoMarketSteps extends TestBase {
	
	SC_GeoMarketPage geoMarketPage;
	JavaScriptUtils javaScriptUtils;

	public SC_GeoMarketSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on Geo Market under submenu company")
	public void user_clicks_on_geo_market_under_submenu_company() {
		geoMarketPage = new SC_GeoMarketPage(driver);
		geoMarketPage.clickSubMenuGeoMarket();
	}
	@Given("user navigated to Geo Market Master page")
	public void user_navigated_to_geo_market_master_page() {
		geoMarketPage.geoMarketPageTitleName();
	}
	
//ADD GEO
	@Given("user click on add button for geo market")
	public void user_click_on_add_button_for_geo_market() {
		geoMarketPage.clickAddBtn();
	}
	@Given("user select company name for geo market from dropdown as {string}")
	public void user_select_company_name_for_geo_market_from_dropdown_as(String string) {
		geoMarketPage.selectDrpCompanyNew(string);
	}
	@Given("user enter geo market name in text field as {string}")
	public void user_enter_geo_market_name_in_text_field_as(String string) {
		geoMarketPage.enterGeoMarketNew(string);
	}
	@When("user click on submit button for add geo market")
	public void user_click_on_submit_button_for_add_geo_market() {
		geoMarketPage.submitNew();
	}
	@Then("user should see success message for add geo market")
	public void user_should_see_success_message_for_add_geo_market() {
		geoMarketPage.geoCreatedSuccessMsg();
	}
	
//SEARCH GEO
	@Given("user select company name for geo market from dropdown as {string} for search")
	public void user_select_company_name_for_geo_market_from_dropdown_as_for_search(String string) {
		geoMarketPage.selectOwnerCompanySrch(string);
	}
	@Given("user enter geo market name as {string} for search")
	public void user_enter_geo_market_name_as_for_search(String string) {
		geoMarketPage.enterGeoMarketSrch(string);
	}
	@Given("user click on search button for geo market")
	public void user_click_on_search_button_for_geo_market() {
		geoMarketPage.clickSearchBtn();
	}
	@Given("user can see geo market record in search result table with edit button")
	public void user_can_see_geo_market_record_in_search_result_table_with_edit_button() {
		geoMarketPage.searchResultTable();
	}
	@Given("user click on edit button for edit geo market")
	public void user_click_on_edit_button_for_edit_geo_market() {
		geoMarketPage.clickEditBtn();
	}
	@Given("user modify geo market name in text field as {string}")
	public void user_modify_geo_market_name_in_text_field_as(String string) {
		geoMarketPage.txtModifyGeo(string);
	}
	@When("user click on submit button for modify geo market")
	public void user_click_on_submit_button_for_modify_geo_market() {
		geoMarketPage.modifySubmitBtn();
	}
	@Then("user should see modify success business geo market")
	public void user_should_see_modify_success_business_geo_market() {
		geoMarketPage.modifySuccessMsg();
	}

}
