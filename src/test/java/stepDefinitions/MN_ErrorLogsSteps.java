package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MN_ErrorLogsPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class MN_ErrorLogsSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	MN_ErrorLogsPage errorLogsPage;

	public MN_ErrorLogsSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on submenu error logs link under menu Maintenance")
	public void user_clicks_on_submenu_error_logs_link_under_menu_maintenance() {
		errorLogsPage = new MN_ErrorLogsPage(driver);
		errorLogsPage.clickSubMenuErrorLogs();
	}
	@Given("user navigate to error log page")
	public void user_navigate_to_error_log_page() {
		errorLogsPage.pageTitleName();
	}
	@Given("user select log dropdown as {string}")
	public void user_select_log_dropdown_as(String string) {
		errorLogsPage.selectLog(string);
	}
	@Given("user select log file from textarea as {string}")
	public void user_select_log_file_from_textarea_as(String string) {
		errorLogsPage.selectLogFromTextArea(string);
	}
	@When("user click on download button for log")
	public void user_click_on_download_button_for_log() {
		errorLogsPage.downloadLog();
	}
	@Then("user should see downloaded log in local machine")
	public void user_should_see_downloaded_log_in_local_machine() {
		errorLogsPage.successMsgDownloadLog();
	}
	
	//Reload
	@When("user click on reload button for log")
	public void user_click_on_reload_button_for_log() {
		errorLogsPage.reloadLog();
	}
	@Then("user should see reloaded log")
	public void user_should_see_reloaded_log() {
		System.out.println("Log reloaded successfully!");
	}
	
	//Configuration
	@When("user click on configuation button for log")
	public void user_click_on_configuation_button_for_log() {
		errorLogsPage.configureLog();
	}
	@Then("user should navigated configuration page")
	public void user_should_navigated_configuration_page() {
		System.out.println("User navigated to configuration page!");
	}

}
