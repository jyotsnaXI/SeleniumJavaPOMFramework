package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_MedicalHistoryPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MedicalHistorySteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_MedicalHistoryPage medicalHistoryPage;

	public SC_MedicalHistorySteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_AddMedicalHistory

	@Given("User clicks on Medical History under submenu company")
	public void user_clicks_on_medical_history_under_submenu_company() {
		medicalHistoryPage = new SC_MedicalHistoryPage(driver);
		medicalHistoryPage.clickSubMenuMedicalHistory();
	}
	@Given("user navigated to Medical History Master page")
	public void user_navigated_to_medical_history_master_page() {
		medicalHistoryPage.pageTitleMedicalHistory();
	}
	@Given("user select owner company from dropdown as {string} for Medical History")
	public void user_select_owner_company_from_dropdown_as_for_medical_history(String string) {
		medicalHistoryPage.selectOwnCompany(string);
	}
	@Given("user click on get details button for Medical History")
	public void user_click_on_get_details_button_for_medical_history() {
		medicalHistoryPage.clickGetDetails();
	}
	@Given("user can see Medical History Health Check Item section")
	public void user_can_see_medical_history_health_check_item_section() {
		medicalHistoryPage.medHistorySection();
	}
	@Given("user enter medical history in text area as {string}")
	public void user_enter_medical_history_in_text_area_as(String string) {
		medicalHistoryPage.enterMedicalHistory(string);
	}
	@Given("user select checkbox for {string}")
	public void user_select_checkbox_for(String string) {
		medicalHistoryPage.selectCheckbox(string);
	}
	@Given("user enter sequence in text area for {string} as {string}")
	public void user_enter_sequence_in_text_area_for_as(String string, String string2) {
		medicalHistoryPage.enterSequence(string, string2);
	}
	@When("user click on submit button for Medical History")
	public void user_click_on_submit_button_for_medical_history() throws InterruptedException {
		medicalHistoryPage.clickSubmitBtn();
	}
	@Then("user can see success message for Medical History")
	public void user_can_see_success_message_for_medical_history() throws InterruptedException {
		medicalHistoryPage.successMsg();
	}
}
