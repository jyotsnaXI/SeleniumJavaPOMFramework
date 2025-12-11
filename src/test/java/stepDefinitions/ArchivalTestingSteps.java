package stepDefinitions;

import java.io.IOException;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ArchivalTestingPage;
import utils.ExcelUtil;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ArchivalTestingSteps extends TestBase {

	ArchivalTestingPage archivalTestingPage;
	JavaScriptUtils javaScriptUtils;
	ExcelUtil excel;

	public ArchivalTestingSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("user click on advance button")
	public void user_click_on_advance_button() {
		archivalTestingPage = new ArchivalTestingPage(driver);
		archivalTestingPage.clickAdvanceBtn();

	}

	@Given("user click on procees to link")
	public void user_click_on_proceed_to_link() {
		archivalTestingPage = new ArchivalTestingPage(driver);
		archivalTestingPage.clickProceedLink();
	}

	@Given("user navigate to Search Team Members page")
	public void user_navigate_to_search_team_members_page() {
		System.out.println("User is on Search Team Members page");
	}

	@Given("user enter firstname, lastname and gin from excel")
	public void user_enter_firstname_lastname_and_gin_from_excel() throws IOException, InterruptedException {
		archivalTestingPage = new ArchivalTestingPage(driver);
		ExcelUtil.loadExcelFile(
				"C:\\Users\\JyotsnaGupta\\OneDrive - Xebia\\Backup_old_Mac\\MedTrackAutomation\\testdata\\ArchivedProdData.xlsx",
				"LiveEmp");

		// Get data from Excel
		List<String[]> testData = ExcelUtil.getTestData();

		// Loop through the test data
		for (String[] rowData : testData) {
			String gin = rowData[0];
			String company = rowData[1];
			String lastname = rowData[2];
			String firstname = rowData[3];
			String empStatus = rowData[4];
			// String DBname = rowData[6];

			String GIN = String.valueOf(gin);
			if (GIN.endsWith(".0")) {
				GIN = gin.substring(0, GIN.indexOf("."));
			}

			// Perform login using data from Excel
			archivalTestingPage.setGIN(GIN);
			archivalTestingPage.setCompany(company);
			archivalTestingPage.setLastName(lastname);
			archivalTestingPage.setFirstName(firstname);
			archivalTestingPage.setEmpStatus(empStatus);

			// archivalTestingPage.setDBName(DBname);
			archivalTestingPage.clickSearch();
			archivalTestingPage.clickGinColumnHeader(gin, company, empStatus, firstname);
		}
	}

	@Given("user enter firstname, lastname and username from excel")
	public void user_enter_firstname_lastname_and_username_from_excel() throws IOException {
		archivalTestingPage = new ArchivalTestingPage(driver);
		ExcelUtil.loadExcelFile(
				"/Users/jyotsna.gupta/eclipse-workspace/MedTrackAutomation/testdata/ArchivedEmployeeData.xlsx",
				"RepeatGINTeamMember");

		// Get data from Excel
		List<String[]> testData = ExcelUtil.getTestData();

		// Loop through the test data
		for (String[] rowData : testData) {
			String gin = rowData[0]; // Assuming password is in the third column
			// String company = rowData[1];// Assuming username is in the second column
			// String lastname = rowData[2];
			// String firstname = rowData[3]; // Assuming username is in the first column
			String username = rowData[4];

			String GIN = String.valueOf(gin);
			if (GIN.endsWith(".0")) {
				GIN = gin.substring(0, GIN.indexOf("."));
			}
			// System.out.println(GIN);

			// Perform login using data from Excel
			// archivalTestingPage.setGIN(GIN);
			// archivalTestingPage.setFirstName(firstname);
			// archivalTestingPage.setLastName(lastname);
			// archivalTestingPage.setCompany(company);
			archivalTestingPage.setUsername(username);
			archivalTestingPage.clickSearch();
			archivalTestingPage.clickUsernameColumnHeader(username);
		}

	}

	@Given("user click on search button for archival testing")
	public void user_click_on_search_button_for_archival_testing() {
		archivalTestingPage = new ArchivalTestingPage(driver);
		// archivalTestingPage.clickSearch();
	}

	@Then("user can see search record for archival testing")
	public void user_can_see_search_record_for_archival_testing() throws InterruptedException {
		archivalTestingPage = new ArchivalTestingPage(driver);
		// archivalTestingPage.showSearchCount();
	}

	@Then("user click on Gin number column header for sorting")
	public void user_click_on_gin_number_column_header_for_sorting() {
		archivalTestingPage = new ArchivalTestingPage(driver);
		// archivalTestingPage.clickGinColumnHeader();
	}

}