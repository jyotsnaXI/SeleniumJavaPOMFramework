package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmployeeRolePage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class EmployeeRoleSteps extends TestBase {
	
	EmployeeRolePage empRolePage;
	JavaScriptUtils javaScriptUtils;

	public EmployeeRoleSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("user is on Employee Dashboard page")
	public void user_is_on_employee_dashboard_page() {
		empRolePage = new EmployeeRolePage(driver);
		empRolePage.dashboardTitle();
	}
	
	@Given("User clicks on dashboard menu Create New Exam for employee")
	public void User_clicks_on_dashboard_menu_create_new_exam_for_employee() {
		empRolePage = new EmployeeRolePage(driver);
		empRolePage.createExamForEmp();
	}
	
	@Given("User clicks on dashboard menu Medical Exam Info link")
	public void User_clicks_on_dashboard_menu_medical_exam_info_link() {
		empRolePage = new EmployeeRolePage(driver);
		empRolePage.clickMedicalExamInfoLink();
	}
	
	@Given("user navigated to Medical Exam Information page")
	public void user_navigated_to_medical_exam_information_page() {
		empRolePage.pageTitle();
	}
	
	@Given("user enter exam date for employee as {string}")
	public void user_enter_exam_date_for_employee_as(String string) {
		empRolePage.dateOfExam(string);
	}
	
	@Given("user select Reason For Medical Exam Info as {string}")
	public void user_select_reason_for_medical_exam_info_as(String string) {
		empRolePage.medicalExamReason(string);
	}
	
	@When("user click on Save Medical Exam Details button")
	public void user_click_on_save_medical_exam_details_button() {
		empRolePage.saveMedicalExam();
	}
	
	@Then("user should see a success message for saving medical exam")
	public void user_should_see_a_success_message_for_saving_medical_exam() {
		empRolePage.successMsgForSavingMedicalExam();
	}
	
	@When("user click on Print Questionnaire button")
	public void user_click_on_print_questionnaire_button() {
		empRolePage.printQuestionnaire();
	}
	
	@Then("documents gets downloaded in the system")
	public void documents_gets_downloaded_in_the_system() {
		System.out.println("Document downloaded successfully!!");
	}
	
	@Given("user click on Medical History tab")
	public void user_click_on_medical_history_tab() {
		empRolePage.medicalHistoryTab();
	}
	
	@Given("user can see medical history details")
	public void user_can_see_medical_history_details() {
	    System.out.println("User is on Medical History Page");
	}
	
	@Given("user select Blood Type as {string}")
	public void user_select_blood_type_as(String string) {
		empRolePage.bloodType(string);
	}
	
	@When("user click on Submit button for medical history")
	public void user_click_on_submit_button_for_medical_history() {
		empRolePage.submitForMedicalHistory();
	}
	
	@Then("user should see a success message for medical history")
	public void user_should_see_a_success_message_for_medical_history() {
		empRolePage.successMsgForMedicalHistory();
	}
	
	@Given("user click on Vaccinations tab")
	public void user_click_on_vaccinations_tab() {
		empRolePage.vaccinationsTab();
	}
	
	@Given("user can see vaccination history details")
	public void user_can_see_vaccination_history_details() {
		empRolePage.vaccinationHistoryTitle();
	}
	
	@Given("user select Vaccination Name as {string}")
	public void user_select_vaccination_name_as(String string) {
		empRolePage.vaccinationName(string);
	}
	
	@Given("user select Vaccination Brand Name as {string}")
	public void user_select_vaccination_brand_name_as(String string) {
		empRolePage.vaccinationBrandName(string);
	}
	
	@Given("user click on Choose File button to upload vaccine certificate")
	public void user_click_on_choose_file_button_to_upload_vaccine_certificate() throws InterruptedException {
		empRolePage.chooseFileBtn();
	}
	
	@Given("user select radio button for COVID19 illness")
	public void user_select_radio_button_for_covid19_illness() {
		empRolePage.radioForCovidIllness();
	}
	
	@Given("user select Date Administered radio button as Unknown")
	public void user_select_date_administered_radio_button_as_unknown() {
		empRolePage.selectAdministeredUnknown();
	}
	
	@When("user click on Add Vaccination button")
	public void user_click_on_add_vaccination_button() {
		empRolePage.addVaccinationBtn();
	}
	
	@Then("user should see a success message for vaccinations")
	public void user_should_see_a_success_message_for_vaccinations() {
		empRolePage.vaccinationAddSuccessMsg();
	}
	
	@Given("user navigated to Create New Exam page for employee")
	public void user_navigated_to_create_new_exam_page_for_employee() {
		empRolePage.examPageTitle();
	}
	
	@Given("user select Reason For Medical for employee as {string}")
	public void user_select_reason_for_medical_for_employee_as(String string) {
		empRolePage.reasonForMedicalExam(string);
	}
	@Given("user select Medical Center for employee as {string}")
	public void user_select_medical_center_for_employee_as(String string) {
		empRolePage.medicalCenter(string);
	}
	
	@Given("user enter Date of Exam for employee as {string}")
	public void user_enter_date_of_exam_for_employee_as(String string) {
		empRolePage.examDate(string);
	}
	
	@Given("user select radio button for Disclosure Option")
	public void user_select_radio_button_for_disclosure_option() {
		empRolePage.disclosureOption();
	}
	
	@When("user click on submit button for exam creation")
	public void user_click_on_submit_button_for_exam_creation() {
		empRolePage.clickSubmit();
	}
	
	@Then("user should see success message for exam creation")
	public void user_should_see_success_message_for_exam_creation() {
		empRolePage.examCreationSuccessMsg();
	}
	
	@Given("user navigated to Certificate of Fitness page")
	public void user_navigated_to_certificate_of_fitness_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("User clicks on submenu About MedFit link under General Information")
	public void user_clicks_on_submenu_about_med_fit_link_under_general_information() {
		empRolePage.clickAboutMedFitSubMenu();
	}
	
	@Then("user should navigated to All About MedFit page")
	public void user_should_navigated_to_all_about_med_fit_page() {
		empRolePage.aboutMedFitTitlePage();
	}
	
	@When("User clicks on submenu Accredited Medical Centers link under General Information")
	public void user_clicks_on_submenu_accredited_medical_centers_link_under_general_information() {
		empRolePage.clickAccreditedMedicalCenterSubMenu();
	}
	
	@Then("user should navigated to INTERNATIONAL SOS ACCREDITED MEDICAL CENTRES page")
	public void user_should_navigated_to_international_sos_accredited_medical_centres_page() {
		empRolePage.accreditedMedicalCenterTitlePage();
	}
	@Then("user click on link list to see medical centres")
	public void user_click_on_link_list_to_see_medical_centres() {
		empRolePage.clickList();
	}
	
	@When("User clicks on submenu Confidentiality link under General Information")
	public void user_clicks_on_submenu_confidentiality_link_under_general_information() {
		empRolePage.clickConfidentialitySubMenu();
	}
	
	@Then("user should navigated to Confidentiality page")
	public void user_should_navigated_to_confidentiality_page() {
		empRolePage.confidentialityTitlePage();
	}
	
	@When("User clicks on submenu FAQs link under General Information")
	public void user_clicks_on_submenu_fa_qs_link_under_general_information() {
		empRolePage.clickFAQsSubMenu();
	}
	
	@Then("user should navigated to MedFit FAQs page")
	public void user_should_navigated_to_med_fit_fa_qs_page() {
		empRolePage.fAQsTitlePage();
	}
	
	@When("User clicks on submenu Contact Us link under General Information")
	public void user_clicks_on_submenu_contact_us_link_under_general_information() {
		empRolePage.clickContactUsSubMenu();
	}
	
	@Then("user should navigated to Contact Us page")
	public void user_should_navigated_to_contact_us_page() {
		empRolePage.contactUsTitlePage();
	}
	
	@When("User clicks on submenu Site Map link under General Information")
	public void user_clicks_on_submenu_site_map_link_under_general_information() {
		empRolePage.clickSiteMapSubMenu();
	}
	
	@Then("user should navigated to Site Map page")
	public void user_should_navigated_to_site_map_page() {
		empRolePage.siteMapTitlePage();
	}

}
