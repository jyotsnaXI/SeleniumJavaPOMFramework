package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropBoxPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class DropBoxSteps extends TestBase {
	
	DropBoxPage dropBoxPage;
	JavaScriptUtils javaScriptUtils;

	public DropBoxSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	@Given("User clicks on submenu download link under menu Drop Box")
	public void user_clicks_on_submenu_download_link_under_menu_drop_box() {
		dropBoxPage = new DropBoxPage(driver);
		dropBoxPage.clickSubMenuDownload();
	}

	@Given("user navigated to Drop Box - Download Medical Reports page")
	public void user_navigated_to_drop_box_download_medical_reports_page() {
	    System.out.println("");
	}

	@Given("user select category from dropdown as {string}")
	public void user_select_category_from_dropdown_as(String string) {
		dropBoxPage.selectEmployeeCategory(string);
	}

	@Given("user can see search result table")
	public void user_can_see_search_result_table() {
	    System.out.println();
	}

	@Given("user click on document attached link for {string}")
	public void user_click_on_document_attached_link_for(String string) {
		dropBoxPage.btnAttachDocument(string);
	}

	@Given("document get downloaded successfully")
	public void document_get_downloaded_successfully() {
	    System.out.println();
	}

	@When("user click on send email button for {string}")
	public void user_click_on_send_email_button_for(String string) {
		dropBoxPage.sendEmailBtn(string);
	}

	@Then("user should see success message for send mail")
	public void user_should_see_success_message_for_send_mail () {
	    dropBoxPage.suceeMsgSendEmail();
	}

	@Then("user should click on delete button for {string}")
	public void user_should_click_on_delete_button_for(String string) {
		dropBoxPage.deleteRecord(string);
	}
	
	@Then("user should see success message for delete record")
	public void user_should_see_success_message_for_delete_record() {
		dropBoxPage.successMsgRecordDel();
	}
	
	@Given("User clicks on submenu upload link under menu Drop Box")
	public void user_clicks_on_submenu_upload_link_under_menu_drop_box() {
		dropBoxPage = new DropBoxPage(driver);
		dropBoxPage.clickSubMenuUpload();
	}

	@Given("user navigated to Drop Box – Upload a Medical Report page")
	public void user_navigated_to_drop_box_upload_a_medical_report_page() {
	    System.out.println("");
	}

	@Given("user select Owner company Name from dropdown as {string}")
	public void user_select_owner_company_name_from_dropdown_as(String string) {
		dropBoxPage.selectCompanyName(string);
	}

	@Given("user enter GIN Number as {string}")
	public void user_enter_gin_number_as(String string) {
		dropBoxPage.employeeGIN(string);
	}

	@Given("user click on get details button")
	public void user_click_on_get_details_button() {
		dropBoxPage.btnGetDetails();
	}

	@Given("user click on choose file button to upload file")
	public void user_click_on_choose_file_button_to_upload_file() throws InterruptedException {
		dropBoxPage.clickChooseFile();
	}

	@When("user click on attach button to attach uploaded file")
	public void user_click_on_attach_button_to_attach_uploaded_file() {
		dropBoxPage.attachUploadedDoc();
	}
	
	@Then("user should see message for upload file")
	public void user_should_see_message_for_upload_file() throws InterruptedException {
		dropBoxPage.uploadFileMsg();
	}
	
	@Given("user can see attached document table")
	public void user_can_see_attached_document_table() {
	    
	}
	@When("user click on delete button to delete file {string}")
	public void user_click_on_delete_button_to_delete_file(String string) throws InterruptedException {
		dropBoxPage.delDocument(string);
	}
	@Then("user should see message for delete file")
	public void user_should_see_message_for_delete_file() {
		dropBoxPage.deleteFileMsg();
	}


}
