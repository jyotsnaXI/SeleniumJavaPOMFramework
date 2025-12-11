package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ViewExamPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ViewExamSteps extends TestBase {

	ViewExamPage viewExamPage;
	JavaScriptUtils javaScriptUtils;

	public ViewExamSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user click on View Exam button")
	public void user_click_on_view_exam_button() {
		viewExamPage = new ViewExamPage(driver);
		viewExamPage.clickViewExam();
	}

	@Given("user navigate to Medical Exam Information page")
	public void user_navigate_to_medical_exam_information_page() {
		System.out.println("User navigated to Medical Exam Information page*");
		//viewExamPage.companyName();
	}

	@Given("user click again on Physicians Report tab")
	public void user_click_again_on_physicians_report_tab() throws InterruptedException {
		viewExamPage = new ViewExamPage(driver);
		viewExamPage.clickPhysicianReportTab();
	}
	
	@Given("user modify all dropdown and checkbox fields in Physician Report tab")
	public void user_modify_all_dropdown_and_checkbox_fields_in_Physician_Report_tab() throws InterruptedException {
		viewExamPage = new ViewExamPage(driver);
		viewExamPage.modifyAllDropdownAndCheckboxPhysicianReportTab();
	}

	/*
	 * @Given("user modify all checkbox in Physician Report tab") public void
	 * user_modify_all_checkbox_in_Physician_Report_tab() throws
	 * InterruptedException { viewExamPage = new ViewExamPage(driver);
	 * viewExamPage.modifyAllCheckboxPhysicianReportTab(); }
	 */

	@Given("^user click save physician report button$")
	public void user_click_save_physician_report_button() throws InterruptedException {
		viewExamPage = new ViewExamPage(driver);
		viewExamPage.clickPhysicianReportButton();
	}

	// Lab Analysis Tab
	@Given("user click again on Lab Analysis tab")
	public void user_click_again_on_lab_analysis_tab() {
		viewExamPage.clickLabAnalysisTab();
	}
	
	@Given("user modify all dropdown and checkbox in Lab Analysis tab")
	public void user_modify_all_dropdown_and_checkbox_in_Lab_Analysis_tab() throws InterruptedException {
		viewExamPage = new ViewExamPage(driver);
		viewExamPage.selectAllDrpdwnChkboxesLabAnalysisTab();
	}
	
	/*
	 * @Given("user modify all checkbox in Lab Analysis tab") public void
	 * user_modify_all_checkbox_in_Lab_Analysis_tab() throws InterruptedException {
	 * viewExamPage = new ViewExamPage(driver);
	 * viewExamPage.selectAllCheckboxLabAnalysisTab(); }
	 */

	@Given("^user click save Lab Analysis button$")
	public void user_click_save_lab_analysis_button() throws InterruptedException {
		viewExamPage.labReportSaveButton();
	}

	@Given("user click again on Fitness Conclusion tab")
	public void user_click_again_on_fitness_conclusion_tab() {
		viewExamPage.SelectFitnessConclusionTab();
		System.out.println("User is on Fitness Conclusion tab");
	}

	@Given("user edit Fitness Status as {string}")
	public void user_edit_fitness_status_as(String string) {
		viewExamPage.SelectFitnesStatus(string);
	}

	@Given("user edit Physician’s Comments for Employee as {string}")
	public void user_edit_physician_s_comments_for_employee_as(String string) {
		viewExamPage.editPhysicianCommentsForEmployee(string);
	}

	@Given("user click again on Submit button")
	public void user_click_again_on_submit_button() throws InterruptedException {
		viewExamPage.submitButtonForSOSREview();
	}

	@Given("user edit Type of Case as {string}")
	public void user_edit_type_of_case_as(String string) throws InterruptedException {
		viewExamPage.SelectTypeOfCase(string);
	}

	/*
	 * @Given("user edit Fitness Status checkbox as Fit") public void
	 * user_edit_fitness_status_checkbox_as_fit() {
	 * viewExamPage.SelectFitnesStatusCheckbox(); }
	 * 
	 * @Given("user edit Comments for Employee as {string}") public void
	 * user_edit_comments_for_employee_as(String string) {
	 * viewExamPage.selectCommentsForEmployee(string); }
	 */

	@When("^user click on Final Submit button$")
	public void user_click_on_final_submit_button() throws Throwable {
		viewExamPage.clickFinalSaveButton();
	}

	@Then("user should see again success message")
	public void user_should_see_again_success_message() throws InterruptedException {
		viewExamPage.employeeModifySuccessMsg();
	}

}
