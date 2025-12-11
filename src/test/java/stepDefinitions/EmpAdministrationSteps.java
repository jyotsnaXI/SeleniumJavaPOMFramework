package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmpAdministrationPage;
import pageObjects.ModifyEmployeePage;
import utils.TestBase;

public class EmpAdministrationSteps extends TestBase {

	EmpAdministrationPage empAdministrationPage;
	ModifyEmployeePage modifyEmployeePage;

	public EmpAdministrationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("user click on Last Name link")
	public void user_click_on_last_name_link() {
		empAdministrationPage = new EmpAdministrationPage(driver);
		empAdministrationPage.clickLastNameLink();
	}

	@Given("user navigate to employee detail page")
	public void user_navigate_to_employee_detail_page() {
		System.out.println("User is on Employee Detail Page");
		empAdministrationPage.companyName();
	}
	
	@Given("user modify Employee Status as {string}")
	public void user_modify_employee_status_as(String string) throws InterruptedException {
		modifyEmployeePage = new ModifyEmployeePage(driver);
		modifyEmployeePage.modifyEmpStatus(string);
	}
	
	@Given("user modify Title as {string}")
	public void user_modify_title_as(String title) {
		modifyEmployeePage.modifyTitle(title);
	}
	
	@Given("user modify First Name as {string}")
	public void user_modify_first_name_as(String firstName) {
		modifyEmployeePage.modifyFirstname(firstName);
	}
	
	@Given("user modify Last Name as {string}")
	public void user_modify_last_name_as(String lastName) {
		modifyEmployeePage.modifyLastName(lastName);
	}
	
	@Given("user modify Gender as {string}")
	public void user_modify_gender_as(String gender) {
		modifyEmployeePage.modifyGender(gender);
	}
	
	@Given("user modify Date of Birth as {string}")
	public void user_modify_date_of_birth_as(String dob) {
		modifyEmployeePage.modifyDOB(dob);
	}
	@Given("user modify Primary E-Mail Address as {string}")
	public void user_modify_primary_e_mail_address_as(String pMail) {
		modifyEmployeePage.modifyPrimaryMail(pMail);
	}
	
	@Given("user modify Secondary E-Mail Address as {string}")
	public void user_modify_secondary_e_mail_address_as(String sMail) {
		modifyEmployeePage.modifySecondaryMail(sMail);
	}
	
	@Given("user modify Employee Category as {string}")
	public void user_modify_employee_category_as(String eCategory) throws InterruptedException {
		modifyEmployeePage.modifyEmpCategory(eCategory);
	}

	@Given("user click on Administration tab")
	public void user_click_on_administration_tab() {
		empAdministrationPage.clickAdministrationTab();
	}

	@Given("user navigate to Administration page")
	public void user_navigate_to_administration_page() {
		System.out.println("User is on Administration page");
	}

	@When("user select operation as {string}")
	public void user_select_operation_as(String string) {
		empAdministrationPage.selectOperation(string);
	}

	// Change status of exam
	@Then("user should select exam date")
	public void user_should_select_exam_date() {
		empAdministrationPage.selectExamDateChangeStatus();
	}

	@Then("user should see see current exam status")
	public void user_should_see_see_current_exam_status() {
		empAdministrationPage.currentExamStatus();
	}

	@Then("user should select Change to exam status as {string}")
	public void user_should_select_change_to_exam_status_as(String string) {
		empAdministrationPage.selectChangeToExamStatus(string);
	}

	@Then("user should click on submit button for change status of exam")
	public void user_should_click_on_submit_button_for_change_status_of_exam() {
		empAdministrationPage.clickSubmitForChangeStatusExam();
	}
	
	@Then("user should navigate to new window and enter username, password and click on submit button for validate credential")
	public void user_should_navigate_to_new_window_and_enter_username_password_and_click_on_submit_button_for_validate_credential() throws InterruptedException {
		empAdministrationPage.validateCredentialNewWindow();
	}

	@Then("user should see success message for exam change status")
	public void user_should_see_success_message_for_exam_change_status() {
		empAdministrationPage.successMsgForExamStatus();
	}

	@Then("user should select MET from dropdown")
	public void user_should_select_met_from_dropdown() {
		empAdministrationPage.selectMET();
	}

	@Then("user should select date of exam")
	public void user_should_select_date_of_exam() {
		empAdministrationPage.selectExamDateMET();
	}

	@Then("user should enter comments")
	public void user_should_enter_comments() {
		empAdministrationPage.enterComment();
	}

	// Create dummy exam
	@Then("user should click on submit button for create dummy exam")
	public void user_should_click_on_submit_button_for_create_dummy_exam() {
		empAdministrationPage.clickSubmitForDummyExam();
	}
	
	@Then("user should see success message for dummy exam")
	public void user_should_see_success_message_for_dummy_exam() {
		System.out.println("Exam status changed successfully");
	}

//Delete Exam
	@Then("user should select exam date from dropdown to delete exam")
	public void user_should_select_exam_date_from_dropdown_to_delete_exam() {
		empAdministrationPage.selectExamDateToDelete();
	}

	@Then("user should tick checkbox for confirmation for delete exam")
	public void user_should_tick_checkbox_for_confirmation_for_delete_exam() {
		empAdministrationPage.cnfExamDeletion();
	}

	@Then("user should click on submit button for delete exam")
	public void user_should_click_on_submit_button_for_delete_exam() {
		empAdministrationPage.clickSubmitForExamDelete();
	}

	@Then("user should see success message for delete exam")
	public void user_should_see_success_message_for_delete_exam() {
		empAdministrationPage.successMsgForDeleteExam();
	}

	// Delete Employee
	@Then("user should tick checkbox for Confirm employee deletion")
	public void user_should_tick_checkbox_for_confirm_employee_deletion() {
		empAdministrationPage.cnfDeleteEmp();
	}

	@Then("user should click on submit button for delete employee")
	public void user_should_click_on_submit_button_for_delete_employee() throws InterruptedException {
		empAdministrationPage.clickSubmitForDeleteEmp();
	}

	@Then("user should see success message for delete employee")
	public void user_should_see_success_message_for_delete_employee() throws InterruptedException {
		empAdministrationPage.successMsgForDeleteEmp();
	}

	// Delete Recommendation letter
	@Then("user should select exam date from dropdown to delete recommendation letter")
	public void user_should_select_exam_date_from_dropdown_to_delete_recommendation_letter() {
		empAdministrationPage.selectExamForRecommLetter();
	}
	
	@Then("user should tick checkbox for Confirm recommendation letter deletion")
	public void user_should_tick_checkbox_for_confirm_recommendation_letter_deletion() {
		empAdministrationPage.cnfDeleteRecommLetter();
	}

	@Then("user should click on submit button for delete recomm letter")
	public void user_should_click_on_submit_button_for_delete_recomm_letter() {
		empAdministrationPage.clickSubmitForDeleteRecommLetter();
	}

	@Then("user should see success message for delete recommendation letter")
	public void user_should_see_success_message_for_delete_recommendation_letter() {
		System.out.println("Exam status changed successfully");
	}
	// Delete Reminders
	@Then("user should select radio button for existing exams")
	public void user_should_select_radio_button_for_existing_exams() {
		empAdministrationPage.radioBtnDelExistingReminder();
	}
	
	@Then("user should select exam date from dropdown to delete reminders")
	public void user_should_select_exam_date_from_dropdown_to_delete_reminders() {
		empAdministrationPage.selectExamForReminder();
	}

	@Then("user should select reminder type from dropdown")
	public void user_should_select_reminder_type_from_dropdown() {
		empAdministrationPage.selectExamReminderType();
	}

	@Then("user should click on checkbox to delete reminder")
	public void user_should_click_on_checkbox_to_delete_reminder() {
		empAdministrationPage.chkBoxDeleteReminder();
	}

	@Then("user should click on submit button for delete reminders")
	public void user_should_click_on_submit_button_for_delete_reminders() {
		empAdministrationPage.clickSubmitForDeleteReminder();
	}

	@Then("user should see success message for delete reminder")
	public void user_should_see_success_message_for_delete_reminder() {
		System.out.println("Exam status changed successfully");
	}

}
