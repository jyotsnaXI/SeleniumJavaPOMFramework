package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MN_UnlockUserPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class MN_UnlockUserSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	MN_UnlockUserPage unlockUserPage;

	public MN_UnlockUserSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on unlock user link under menu Maintenance")
	public void user_clicks_on_unlock_user_link_under_menu_maintenance() {
		unlockUserPage = new MN_UnlockUserPage(driver);
		unlockUserPage.clickSubMenuUnlockUser();
	}
	@Given("user navigate to Application Maintenance page")
	public void user_navigate_to_application_maintenance_page() {
		unlockUserPage.pageTitleName();
	}
	@Given("user enter user in text field as {string}")
	public void user_enter_user_in_text_field_as(String string) {
		unlockUserPage.enterUserName(string);
	}
	@When("user click on unlock button for unlock user")
	public void user_click_on_unlock_button_for_unlock_user() {
		unlockUserPage.clickUnlockButton();
	}
	@Then("user should see success message for unlock user")
	public void user_should_see_success_message_for_unlock_user() {
		unlockUserPage.successMessage();
	}

}
