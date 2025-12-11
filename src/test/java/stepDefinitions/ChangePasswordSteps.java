package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ChangePasswordPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ChangePasswordSteps extends TestBase {
	
	ChangePasswordPage changePasswordPage;
	JavaScriptUtils javaScriptUtils;

	public ChangePasswordSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("user click on change password link")
	public void user_click_on_change_password_link() {
		changePasswordPage = new ChangePasswordPage(driver);
		changePasswordPage.clickChangePwdLink();
	}

	@Given("user navigated to change password page")
	public void user_navigated_to_change_password_page() {
		System.out.println("User is on Change Password Page");
	}

	@Given("user enter existing password as {string}")
	public void user_enter_existing_password_as(String string) {
		changePasswordPage.enterExistingPassword(string);
	}

	@Given("user enter new password as {string}")
	public void user_enter_new_password_as(String string) {
		changePasswordPage.enterNewPassword(string);
	}

	@Given("user enter confirm password as {string}")
	public void user_enter_confirm_password_as(String string) {
		changePasswordPage.enterConfirmPassword(string);
	}

	@Given("user select security question one for change password from drop down field as {string}")
	public void user_select_security_question_one_for_change_password_from_drop_down_field_as(String string) {
		changePasswordPage.selectSecQueOne(string);
	}

	@Given("user enter securiy answer one for change password in textfield as {string}")
	public void user_enter_securiy_answer_one_for_change_password_in_textfield_as(String string) {
		changePasswordPage.enterSecAnswerOne(string);
	}

	@Given("user select security question two for change password from drop down field as {string}")
	public void user_select_security_question_two_for_change_password_from_drop_down_field_as(String string) {
		changePasswordPage.selectSecQueTwo(string);
	}

	@Given("user enter securiy answer two for change password in textfield as {string}")
	public void user_enter_securiy_answer_two_for_change_password_in_textfield_as(String string) {
		changePasswordPage.enterSecAnswerTwo(string);
	}

	@When("user click on submit button for change password")
	public void user_click_on_submit_button_for_change_password() {
		changePasswordPage.clickSubmitBtn();
	}

	@Then("user should see a success message for change password")
	public void user_should_see_a_success_message_for_change_password() {
		changePasswordPage.successMessage();
	}

}
