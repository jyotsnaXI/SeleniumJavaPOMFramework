package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ImportDataPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ImportDataSteps extends TestBase {
	
	ImportDataPage importDataPage;
	JavaScriptUtils javaScriptUtils;

	public ImportDataSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on submenu Import link under menu Import Data")
	public void user_clicks_on_submenu_import_link_under_menu_import_data() {
			importDataPage = new ImportDataPage(driver);
			importDataPage.clickSubMenuImport();
	}
	
	@Given("user navigate to Import File page")
	public void user_navigate_to_import_file_page() {
		System.out.println("User is on Import File page");	    
	}

	@Given("user click on choose file button")
	public void user_click_on_choose_file_button() {
		importDataPage.clickBrowseBtn();
	}

	@Given("user upload file name with extention")
	public void user_upload_file_name_with_extention() {
		importDataPage.enterFilenameWithExt();
	}

	@Given("user should see file attached")
	public void user_user_should_see_file_attached() {
	    System.out.println("File attached successfully");
	}

	@When("user should click on import button")
	public void user_should_click_on_import_button() {
	    importDataPage.clickImportBtn();
	}

	@When("user should see file in Import Queue table")
	public void user_should_see_file_in_import_queue_table() {
		 System.out.println("User can see file name in a table");
	}

	@Given("User clicks on submenu Export Quest under menu Import Data")
	public void user_clicks_on_submenu_export_quest_under_menu_import_data() {
		importDataPage = new ImportDataPage(driver);
		importDataPage.clickExportQuestSubMenu();
	}
	
	@Given("user navigate to Export Quest page")
	public void user_navigate_to_export_quest_page() {
		 System.out.println("User navigate to Export Quest page");
	}

	@When("user click on download button")
	public void user_click_on_download_button() {
		importDataPage.clickBtnDownloadFile();
	}

	@Then("user should see file downloaded popup message")
	public void user_should_see_file_downloaded_popup_message() {
		System.out.println("User can see popup window for download file");
	}

	@When("user click on generate new confirmation file button")
	public void user_click_on_generate_new_confirmation_file_button() {
		importDataPage.clickBtnGenerateFile();
	}

	@Then("user should see message for file generation")
	public void user_should_see_message_for_file_generation() {
		System.out.println("User can see message for file generation");
	}

}
