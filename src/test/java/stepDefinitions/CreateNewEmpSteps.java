package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateNewEmployeePage;
import utils.JavaScriptUtils;
import utils.TestBase;
import utils.WaitUtils;

public class CreateNewEmpSteps extends TestBase {

	CreateNewEmployeePage createNewEmpPage;
	JavaScriptUtils javaScriptUtils;

	public CreateNewEmpSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("User clicks on dashboard menu Create New Employee")
	public void user_clicks_on_dashboard_menu_create_new_employee() {
		createNewEmpPage = new CreateNewEmployeePage(driver);
		//javaScriptUtils = new JavaScriptUtils(driver);
		//javaScriptUtils.click_dashboard_menu_link(link_name);
		 createNewEmpPage.clickNewEmployeeLink();	
	}

	@Given("user navigate to Create New Employee Record page")
	public void user_navigate_to_create_new_employee_record_page() {
		System.out.println("** User navigated to Create New Employee Record page **");
		WaitUtils.sleep(5);
	}

	@Given("user select Employee Status as {string}")
	public void user_select_employee_status_as(String status) throws InterruptedException {
		createNewEmpPage = new CreateNewEmployeePage(driver);
		createNewEmpPage.setEmpStatus(status);
	}

	@Given("user select Title as {string}")
	public void user_select_title_as(String title) {
		createNewEmpPage = new CreateNewEmployeePage(driver);
		createNewEmpPage.setTitle(title);
	}
	
	@Given("user enter Last Name as {string}")
	public void user_select_last_name_as(String lastname) {
		createNewEmpPage = new CreateNewEmployeePage(driver);
		createNewEmpPage.setLastName(lastname);
	}
	@Given("user enter First Name as {string}")
	public void user_select_first_name_as(String firstname) {
		createNewEmpPage = new CreateNewEmployeePage(driver);
		createNewEmpPage.setFirstName(firstname);
	}

	@Given("user select Gender as {string}")
	public void user_select_gender_as(String gender) {
		createNewEmpPage.setGender(gender);
	}

	@Given("user select Marital Status as {string}")
	public void user_select_marital_status_as(String mStatus) {
		createNewEmpPage.setMaritalStatus(mStatus);
	}

	@Given("user enter Date of Birth as {string}")
	public void user_enter_date_of_birth_as(String DOB) {
		createNewEmpPage.setDOB(DOB);
	}

	@Given("user select Company as {string}")
	public void user_select_company_as(String company) throws InterruptedException {
		createNewEmpPage.setCompany(company);
	}

	@Given("user enter Primary E-Mail Address as {string}")
	public void user_enter_primary_e_mail_address_as(String pEmail) {
		createNewEmpPage.setPriEMail(pEmail);
	}

	@Given("user enter Secondary E-Mail Address as {string}")
	public void user_enter_secondary_e_mail_address_as(String secondMail) {
		createNewEmpPage.setSeconEMail(secondMail);
	}
	
	@Given("user select Employee Category as {string}")
	public void user_select_Employee_Category_as(String empCatgory) throws InterruptedException {
		createNewEmpPage.setEmpCategory(empCatgory);
	}

	@Given("user enter Recruiter Last Name as {string}")
	public void user_enter_recruiter_last_name_as(String recLastName) throws InterruptedException {
		createNewEmpPage.setRecLastName(recLastName);
	}

	@Given("user enter Recruiter E-mail Address as {string}")
	public void user_enter_recruiter_e_mail_address_as(String recMail) {
		createNewEmpPage.setRecMail(recMail);
	}

	@Given("user click on add button to add recruiter details")
	public void user_click_on_add_button_to_add_recruiter_details() {
		createNewEmpPage.clickRecAddButton();
	}

	@When("user click on Submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		createNewEmpPage = new CreateNewEmployeePage(driver);
		createNewEmpPage.clickSubmit();
	}

	@Then("user should see success message")
	public void user_should_see_success_message() throws InterruptedException {
		createNewEmpPage.employeeCreatedSuccessMsg();
	}
}
