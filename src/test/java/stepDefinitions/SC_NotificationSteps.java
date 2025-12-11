package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_NotificationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_NotificationSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_NotificationPage notificationPage;

	public SC_NotificationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_Notification
	
	@Given("User clicks on Notification under dashboard under submenu company")
	public void user_clicks_on_notification_under_dashboard_under_submenu_company() {
		notificationPage = new SC_NotificationPage(driver);
		notificationPage.clickSubMenuNotification();
	}
	@Given("user navigated to Company Notification Master page")
	public void user_navigated_to_company_notification_master_page() {
		notificationPage.pageTitleName();
	}
	@Given("user select Owner Company from dropdown as {string} for Notification")
	public void user_select_owner_company_from_dropdown_as_for_notification(String string) {
		notificationPage.selectDrpCompany(string);
	}
	@Given("user click on Get Details button")
	public void user_click_on_get_details_button() {
		notificationPage.clickGetDetailsBtn();
	}
	@Given("user select checkbox")
	public void user_select_checkbox() {
		notificationPage.selectCheckBox();
	}
	@When("user click on submit button for Notification")
	public void user_click_on_submit_button_for_notification() {
		notificationPage.clickSubmitBtn();
	}
	@Then("user can see success message for Notification")
	public void user_can_see_success_message_for_notification() {
		notificationPage.successMsg();
	}

}
