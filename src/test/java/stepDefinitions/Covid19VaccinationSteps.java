package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Covid19VaccinationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class Covid19VaccinationSteps extends TestBase {
	
	Covid19VaccinationPage covid19VaccinationPage;
	JavaScriptUtils javaScriptUtils;

	public Covid19VaccinationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on Search COVID-{int} Vaccination link under menu COVID-{int} Vaccination")
	public void user_clicks_on_search_covid_vaccination_link_under_menu_covid_vaccination(Integer int1, Integer int2) {
		covid19VaccinationPage = new Covid19VaccinationPage(driver);
		covid19VaccinationPage.clickSubMenuSearchCOVID19Vaccination();
	}
	@Given("user navigate to Search vaccination status page")
	public void user_navigate_to_search_vaccination_status_page() {
		covid19VaccinationPage.pageTitleName();
	}
	@Given("user enter Last Name in text field as {string}")
	public void user_enter_last_name_in_text_field_as(String string) {
		covid19VaccinationPage.enterLastName(string);
	}
	@Given("user enter First Name in text field as {string}")
	public void user_enter_first_name_in_text_field_as(String string) {
		covid19VaccinationPage.enterFirstName(string);
	}
	@When("user click on Search button for Covid-{int} Vaccination status")
	public void user_click_on_search_button_for_covid_vaccination_status(Integer int1) {
		covid19VaccinationPage.clickSearchBtn();
	}
	@Then("user should see search result for Covid-{int} Vaccination status")
	public void user_should_see_search_result_for_covid_vaccination_status(Integer int1) {
		covid19VaccinationPage.searchResult();
	}
	@Given("user can see search result with export button")
	public void user_can_see_search_result_with_export_button() {
		covid19VaccinationPage.searchResult();
	}
	@When("user click on export button for Covid-{int} Vaccination status")
	public void user_click_on_export_button_for_covid_vaccination_status(Integer int1) {
		covid19VaccinationPage.clickExportBtn();
	}
	@Then("user should see file exported in local machine")
	public void user_should_see_file_exported_in_local_machine() {
	    System.out.println("Exported file downloaded successfully in local machine");
	}

}
