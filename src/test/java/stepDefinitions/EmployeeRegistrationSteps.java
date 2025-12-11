package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmployeeRegistrationPage;
import utils.TestBase;

public class EmployeeRegistrationSteps extends TestBase {
	
	EmployeeRegistrationPage employeeRegistrationPage;
	
	public EmployeeRegistrationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user click on Employee or Pre employee link")
	public void user_click_on_employee_or_pre_employee_link() {
		employeeRegistrationPage = new EmployeeRegistrationPage(driver);
		employeeRegistrationPage.clickEmpOrPreEmpLink();
	}
	@Given("user navigated to Employee Registration page")
	public void user_navigated_to_employee_registration_page() {
	   System.out.println("User navigated to Employee Registration page");
	}
	@Given("user enter Application id or GIN in text field as {string}")
	public void user_enter_application_id_or_gin_in_text_field_as(String string) {
		employeeRegistrationPage.enterAppIDOrGIN(string);
	}
	@Given("user enter date of birth in textfield as {string}")
	public void user_enter_date_of_birth_in_textfield_as(String string) {
		employeeRegistrationPage.enterDOB(string);
	}
	@Given("user enter ISOS id in textfield as {string}")
	public void user_enter_isos_id_in_textfield_as(String string) {
		employeeRegistrationPage.enterISOSID(string);
	}
	@Given("user click on get details button for register employee")
	public void user_click_on_get_details_button_for_register_employee() {
		employeeRegistrationPage.clickGetDetailsBtn();
	}
	@Given("user navigated to user registration page")
	public void user_navigated_to_user_registration_page() {
		System.out.println("User navigated to user registration page");
	}
	@Given("user enter username in textfield as {string}")
	public void user_enter_username_in_textfield_as(String string) {
		employeeRegistrationPage.enterUsername(string);
	}
	@Given("user enter password in textfield as {string}")
	public void user_enter_password_in_textfield_as(String string) {
		employeeRegistrationPage.enterPassword(string);
	}
	@Given("user enter confirm password in textfield as {string}")
	public void user_enter_confirm_password_in_textfield_as(String string) {
		employeeRegistrationPage.enterCnfPassword(string);
	}
	@Given("user select security question one from drop down field as {string}")
	public void user_select_security_question_one_from_drop_down_field_as(String string) {
		employeeRegistrationPage.selectSecQueOne(string);
	}
	@Given("user enter securiy answer one in textfield as {string}")
	public void user_enter_securiy_answer_one_in_textfield_as(String string) {
		employeeRegistrationPage.enterSecAnsOne(string);
	}
	@Given("user select security question two from drop down field as {string}")
	public void user_select_security_question_two_from_drop_down_field_as(String string) {
		employeeRegistrationPage.selectSecQueTwo(string);
	}
	@Given("user enter securiy answer two in textfield as {string}")
	public void user_enter_securiy_answer_two_in_textfield_as(String string) {
		employeeRegistrationPage.enterSecAnsTwo(string);
	}
	@When("user click on register button for register employee")
	public void user_click_on_register_button_for_register_employee() {
		employeeRegistrationPage.clickRegisterBtn();
	}
	@Then("user should see a success message for register employee")
	public void user_should_see_a_success_message_for_register_employee() {
		System.out.println("user can see a success message for register employee");
	}

}
