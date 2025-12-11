package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_CompanyPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_CompanySteps extends TestBase {
	
	SC_CompanyPage sc_CompanyPage;
	JavaScriptUtils javaScriptUtils;

	public SC_CompanySteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on company under submenu company")
	public void user_clicks_on_company_under_submenu_company() {
		sc_CompanyPage = new SC_CompanyPage(driver);
		sc_CompanyPage.clickSubMenuCompy();
	}

	@Given("user navigated to search company page")
	public void user_navigated_to_search_company_page() {

	}
	
	@Given("user click on add button")
	public void user_click_on_add_button() {
		sc_CompanyPage.addCompanyBtn();
	}

	@Given("user navigated to company master page")
	public void user_navigated_to_company_master_page() {
		System.out.println("User navigated to company master page");
		sc_CompanyPage.companyTitlePage();
	}

	@Given("user enter company name as {string}")
	public void user_enter_company_name_as(String string) {
		sc_CompanyPage.enterCompany(string);
	}

	@Given("user select company from owner company dropdown as {string}")
	public void user_select_company_from_owner_company_dropdown_as(String string) {
		sc_CompanyPage.selectOwnCompany(string);
	}

	@Given("user enter complete postal address {int} as {string}")
	public void user_enter_complete_postal_address_as(Integer int1, String string) {
		sc_CompanyPage.enterPostalAddress(string);
	}

	@Given("user enter city as {string}")
	public void user_enter_city_as(String string) throws InterruptedException {
		sc_CompanyPage.enterCity(string);
	}
	
	@Given("user select country as {string}")
	public void user_enter_country_as(String string) throws InterruptedException {
		sc_CompanyPage.selectCountry(string);
	}

	@Given("user enter postal code as {string}")
	public void user_enter_postal_code_as(String string) {
		sc_CompanyPage.enterPostalCode(string);
	}

	@Given("user enter phone as {string}")
	public void user_enter_phone_as(String string) {
		sc_CompanyPage.enterPhone(string);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		sc_CompanyPage.clickSubmit();
	}

	@Then("user can see success message")
	public void user_can_see_success_message() {
		
	}
	
	// Search SC_Company
	
	@Given("user click on search button for company")
	public void user_click_on_search_button_for_company() {
		sc_CompanyPage.clickSearchBtn();
	}

	@Given("user can see search result for company")
	public void user_can_see_search_result_for_company() {
		sc_CompanyPage.searchResult();
	}
	
	//Edit SC_Company
	
	@Given("user see search result table with record {string}")
	public void user_see_search_result_table_with_record(String string) {
		sc_CompanyPage.searchTable(string);
	}

	@Given("user click on edit button for company as {string}")
	public void user_click_on_edit_button_for_company_as(String string) {
		sc_CompanyPage.clickEditComp(string);
	}

	@Given("user edit company name as {string}")
	public void user_edit_company_name_as(String string) {
		sc_CompanyPage.enterCompany(string);
	}

	@Given("user select access rights as {string}")
	public void user_select_access_rights_as(String string) {
	    
	}

	@Given("user edit complete postal address {int} as {string}")
	public void user_edit_complete_postal_address_as(Integer int1, String string) {
		sc_CompanyPage.enterPostalAddress(string);
	}

	@Given("user edit city as {string}")
	public void user_edit_city_as(String string) throws InterruptedException {
		sc_CompanyPage.enterCity(string);
	}

	@Given("user modify country as {string}")
	public void user_modify_country_as(String string) {
		sc_CompanyPage.selectCountry(string);
	}

	@Given("user edit postal code as {string}")
	public void user_edit_postal_code_as(String string) {
		sc_CompanyPage.enterPostalCode(string);
	}

	@Given("user edit phone as {string}")
	public void user_edit_phone_as(String string) {
		sc_CompanyPage.enterPhone(string);
	}

	@Then("user can see modification success message")
	public void user_can_see_modification_success_message() {
	    System.out.println("Successfully modified record");
	}

}
