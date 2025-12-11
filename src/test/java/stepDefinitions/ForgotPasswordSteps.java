package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ForgotPasswordPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ForgotPasswordSteps extends TestBase {
	
	ForgotPasswordPage forgotPasswordPage;
	JavaScriptUtils javaScriptUtils;

	public ForgotPasswordSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
	    System.out.println("User is on login page");
	}

	@Given("user click on Forgot Password_Unlock Account link")
	public void user_click_on_forgot_password_unlock_account_link() {
		forgotPasswordPage = new ForgotPasswordPage(driver);
		forgotPasswordPage.clickForgotPwdUnlockActLink();
	}

	@Given("user navigated to Forgot Password_Unlock Account page")
	public void user_navigated_to_forgot_password_unlock_account_page() {
	    System.out.println("User navigated to Forgot Password_Unlock Account page");
	}

	@Given("user enter user name in text field as {string}")
	public void user_enter_user_name_in_text_field_as(String string) {
		forgotPasswordPage.enterUsername(string);
	}

	@Given("user click on go button")
	public void user_click_on_go_button() {
		forgotPasswordPage.clickBtnGo();
	}

	@Given("user enter first securiy answer in textfield as {string}")
	public void user_enter_first_securiy_answer_in_textfield_as(String string) {
		forgotPasswordPage.enterSecurityAnswer1(string);
	}

	@Given("user enter second securiy answer in textfield as {string}")
	public void user_enter_second_securiy_answer_in_textfield_as(String string) {
		forgotPasswordPage.entesecurityAnswer2(string);
	}

	@When("user click on submit button for unlock account")
	public void user_click_on_submit_button_for_unlock_account() {
		forgotPasswordPage.clickBtnSubmit();
	}

	@Then("user should see a message for reset_unlock account")
	public void user_should_see_a_message_for_reset_unlock_account() {
		forgotPasswordPage.unlockAccSuccessMessage();
	}
	
	@Given("user click on I do not remember my user id link")
	public void user_click_on_i_do_not_remember_my_user_id_link() {
		forgotPasswordPage.clickDonotRemUserID();
	}
	@Given("user enter email id in textfield {string}")
	public void user_enter_email_id_in_textfield(String string) {
		forgotPasswordPage.enterMailAddress(string);
	}
	@Then("user should see a message for do not remember userID")
	public void user_should_see_a_message_for_do_not_remember_user_id() {
		forgotPasswordPage.donotRemUserIDMessage();
	}

}
