package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchEmployeePage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SearchEmployeeSteps extends TestBase {

	SearchEmployeePage srchEmpPage;
	JavaScriptUtils javaScriptUtils;

	public SearchEmployeeSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	  @Given("user is on Search Employee page") 
	  public void user_is_on_search_employee_page() {
		  System.out.println("** User is on search employee page ** ");
	  }
	 
	@Given("user enter first name as {string}")
	public void user_enter_first_name_as(String firstName) {
		srchEmpPage = new SearchEmployeePage(driver);
		srchEmpPage.setFirstName(firstName);
	}

	@Given("user enter last name as {string}")
	public void user_enter_last_name_as(String lastName) {
		srchEmpPage = new SearchEmployeePage(driver);
		srchEmpPage.setLastName(lastName);
	}
	@Given("user enter gin as {string}")
	public void user_enter_gin_as(String gin) {
		srchEmpPage = new SearchEmployeePage(driver);
		srchEmpPage.setLastName(gin);
	}
	@Given("user enter Applicant ID as {string}")
	public void user_enter_applicant_id_as(String string) {
		srchEmpPage = new SearchEmployeePage(driver);
		srchEmpPage.setGIN(string);
	}

	@Given("user click on search button")
	public void user_click_on_search_button() {
		srchEmpPage = new SearchEmployeePage(driver);
		srchEmpPage.clickSearch();
	}

	@Given("search result gets displayed")
	public void search_result_gets_displayed() throws InterruptedException {
		srchEmpPage.showSearchResults();
	}

	@Given("^user select radio button from search result$")
	public void user_select_radio_button_from_search_result() throws InterruptedException {
		srchEmpPage.clickRadioButton();
	}

	@When("user click on view exam button")
	public void user_click_on_view_exam_button() {
		srchEmpPage.clickViewExam();
	}

	@Then("user should navigate to Medical Exam Information page")
	public void user_should_navigate_to_medical_exam_information_page() {
		System.out.println("** User is on Medical Exam Information Page **");
	}

}
