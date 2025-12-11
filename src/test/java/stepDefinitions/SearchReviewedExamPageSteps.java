package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SearchReviewedExamPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SearchReviewedExamPageSteps extends TestBase {

	SearchReviewedExamPage srchRevExamPage;
	JavaScriptUtils javaScriptUtils;

	public SearchReviewedExamPageSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user navigated to Search Reviewed Exams page")
	public void user_navigated_to_search_reviewed_exams_page() {
	    System.out.println("** User navigated to Search Reviewed Exams page **");
	}
	@Given("user select user id as {string}")
	public void user_select_user_id_as(String string) {
		srchRevExamPage = new SearchReviewedExamPage(driver);
		srchRevExamPage.setuserID(string);
	    
	}
	@Given("user select from date as {string}")
	public void user_select_from_date_as(String string) {
		srchRevExamPage.setFromDate(string);
	}
	@Given("user select to date as {string}")
	public void user_select_to_date_as(String string) {
		srchRevExamPage.setToDate(string);
	}
	@Given("user can see search result for review exam")
	public void user_can_see_search_result_for_review_exam() throws InterruptedException {
		srchRevExamPage.searchResult();
	}
	@Then("user click on export button")
	public void user_click_on_export_button() {
		srchRevExamPage.clickExportBtn();
		System.out.println("** Export button clicked **");
	}

}
