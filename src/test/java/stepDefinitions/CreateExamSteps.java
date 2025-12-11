package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateExamPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class CreateExamSteps extends TestBase {

	CreateExamPage createExamPage;
	JavaScriptUtils javaScriptUtils;

	public CreateExamSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user click on Create Exam button")
	public void user_click_on_create_exam_button() {
		createExamPage = new CreateExamPage(driver);
		createExamPage.clickCreateExam();
	}

	@Given("user click on link You can create a medical exam")
	public void user_click_on_link_you_can_create_a_medical_exam() throws InterruptedException {
		createExamPage = new CreateExamPage(driver);
		createExamPage.clickYouCanCreateMedicalExam();
	}

	@Given("user navigate to Create New Exam page")
	public void user_navigate_to_create_new_exam_page() {
		System.out.println("User navigated to Create New Exam page *");
	}

	@Given("user click on radio button for I do authorize")
	public void user_click_on_radio_button_for_i_do_authorize() {
		createExamPage.clickRadioButtonIAuth();
	}

	@Given("user select Reason For Medical as {string}")
	public void user_select_reason_for_medical_as(String string) throws InterruptedException {
		createExamPage = new CreateExamPage(driver);
		createExamPage.selectReasonForMedical(string);
	}

	@Given("user enter Date of Exam as {string}")
	public void user_enter_date_of_exam_as(String string) {
		createExamPage.enterdateofExam(string);
	}

	@Given("user select Medical Center as {string}")
	public void user_select_medical_center_as(String string) {
		createExamPage.selectMedicalCenter(string);
	}

	@Given("user click on Submit button for create exam")
	public void user_click_on_submit_button_for_create_exam() throws InterruptedException {
		createExamPage.submitCreateExam();
	}

	@Given("user navigated to Medical Exam Information	page")
	public void user_navigated_to_medical_exam_information_page() {
		System.out.println("** User navigated to Medical Exam Information page **");
	}

	@Given("user click on Physician Report tab")
	public void user_click_on_physician_report_tab() throws InterruptedException {
		createExamPage = new CreateExamPage(driver);
		createExamPage.clickPhysicianReportTab();
	}

	@Given("user select all dropdown and checkboxes fields in Physician Report tab")
	public void user_select_all_dropdown_and_checkboxes_fields_in_Physician_Report_tab() throws InterruptedException {
		createExamPage = new CreateExamPage(driver);
		createExamPage.selectAllDropdownAndChkBoxesPhysicianReportTab();
	}

	/*
	 * @Given("user check all checkbox in Physician Report tab") public void
	 * user_check_all_checkbox_in_Physician_Report_tab() throws InterruptedException
	 * { createExamPage = new CreateExamPage(driver);
	 * createExamPage.selectAllCheckboxPhysicianReportTab(); }
	 */

	@Given("user click on save physician report button")
	public void user_click_on_save_physician_report_button() throws InterruptedException {
		createExamPage.savePhysicianReportTab();
	}

	// Lab Analysis Tab
	@Given("user click on Lab Analysis tab")
	public void user_click_on_lab_analysis_tab() {
		createExamPage.clickLabAnalysisTab();
	}
	
	@Given("user select all dropdown and checkbox in Lab Analysis tab")
	public void user_select_all_dropdown_and_checkbox_in_Lab_Analysis_tab() throws InterruptedException {
		createExamPage = new CreateExamPage(driver);
		createExamPage.selectAllDrpdwnChkboxesLabAnalysisTab();
	}

	/*
	 * @Given("user check all checkbox in Lab Analysis tab") public void
	 * user_check_all_checkbox_in_Lab_Analysis_tab() throws InterruptedException {
	 * createExamPage = new CreateExamPage(driver);
	 * createExamPage.selectAllCheckboxLabAnalysisTab(); }
	 */


	
	@Given("user click on save Lab Analysis button")
	public void user_click_on_save_lab_analysis_button() throws InterruptedException {
		createExamPage.savelabReport();
	}

	@Given("user click on Fitness Conclusion tab")
	public void user_click_on_fitness_conclusion_tab() {
		createExamPage.SelectFitnessConclusionTab();
		System.out.println("** User is on Fitness Conclusion tab **");
	}

	@Given("user select Fitness Status as {string}")
	public void user_select_fitness_status_as(String string) {
		createExamPage.SelectFitnesStatus(string);
	}

	@Given("user enter Physicians Comments for Employee as {string}")
	public void user_enter_physicians_comments_for_employee_as(String string) {
		createExamPage.enterPhysicianCommentsForEmployee(string);
	}

	@Given("user saving physician comments")
	public void user_saving_physician_comments() throws InterruptedException {
		createExamPage.saveButtonForforSavingPhysicianComments();
	}

	@Given("user select case as {string}")
	public void user_select_case_as(String string) {
		createExamPage.SelectCase(string);
	}

	/*
	 * @Given("user select Fitness Status as Fit") public void
	 * user_select_fitness_status_as_fit() { createExamPage.SelectFitnesStatus(); }
	 * 
	 * @Given("user enter comments {string}") public void user_enter_comments(String
	 * string) { createExamPage.selectComments(string); }
	 */

	@When("user click on submit for exam creation")
	public void user_click_on_submit_for_exam_creation() {
		createExamPage.SubmitButtonForCreateExam();
	}

	@Then("user should see exam creation success message")
	public void user_should_see_exam_creation_success_message() throws InterruptedException {
		createExamPage.employeeCreatedSuccessMsg();
	}

}
