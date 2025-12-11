package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.ReminderAndDocumentPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ReminderAndDocumentSteps extends TestBase {
	
	ReminderAndDocumentPage reminderAndDocumentPage;
	JavaScriptUtils javaScriptUtils;

	public ReminderAndDocumentSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("User clicks on submenu Generate link under menu Reminders and Documents")
	public void user_clicks_on_submenu_generate_link_under_menu_reminders_and_documents() {
		reminderAndDocumentPage = new ReminderAndDocumentPage(driver);
		reminderAndDocumentPage.clickSubMenuGenerate();
	}

	@Given("user navigated to Generate Reminders and Documents page")
	public void user_navigated_to_generate_reminders_and_documents_page() {
		System.out.println("User is on Generate Reminders and Documents page");
	}

	@Given("user select company from dropdown as {string}")
	public void user_select_company_from_dropdown_as(String company) {
		reminderAndDocumentPage.selectCompany(company);
	}

	@Given("User clicks on submenu Download link under menu Reminders and Documents")
	public void user_clicks_on_submenu_download_link_under_menu_reminders_and_documents() {
		reminderAndDocumentPage = new ReminderAndDocumentPage(driver);
		reminderAndDocumentPage.clickSubMenuDownload();
	}

	@Given("user navigated to Document Generation Queue page")
	public void user_navigated_to_document_generation_queue_page() {
		System.out.println("User is on Document Generation Queue page");
	}
	
	@Given("user click on download button for Document Generation Queue")
	public void user_click_on_download_button_for_Document_Generation_Queue() {
		reminderAndDocumentPage.clickDownloadBtn();
	}

	@Given("user click on error log button")
	public void user_click_on_error_log_button() {
		reminderAndDocumentPage.clickErrorBtn();
	}

}
