package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateTeamMemberPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class CreateTeamMemberSteps extends TestBase {

	CreateTeamMemberPage createTeamMemberPage;
	JavaScriptUtils javaScriptUtils;

	public CreateTeamMemberSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("User clicks on dashboard menu Create Team Member")
	public void user_clicks_on_dashboard_menu_create_team_member() {
		createTeamMemberPage = new CreateTeamMemberPage(driver);
		//javaScriptUtils = new JavaScriptUtils(driver);
		//javaScriptUtils.click_dashboard_menu_link(link_name);
		createTeamMemberPage.clickNewTeamMemberLink();	
	}
	
	@Given("user navigate to Create Team Member page")
	public void user_navigate_to_create_team_member_page() {
		System.out.println("User is on Create Team Member page");
	}

	@Given("user select User Role as {string}")
	public void user_select_user_role_as(String string) {
		createTeamMemberPage = new CreateTeamMemberPage(driver);
		createTeamMemberPage.setUserRole(string);
	}

	@Given("user select User Name as {string}")
	public void user_select_user_name_as(String string) {
		createTeamMemberPage.setUserName(string);
	}
	
	@Given("user select AD Account as {string}")
	public void user_select_ad_account_as(String string) {
		createTeamMemberPage = new CreateTeamMemberPage(driver);
		createTeamMemberPage.setADaccount(string);
	}
	
	@Given("user select Subsidiary Company checkbox")
	public void user_select_subsidiary_company_checkbox() {
		createTeamMemberPage.chkboxSubsidiaryCompany();
	}

	@When("user select Owner Company as {string}")
	public void user_select_owner_company_as(String string) {
		createTeamMemberPage.setOwnerCompany(string);
	}

	@Then("user should see Assignment Country box")
	public void user_should_see_assignment_country_box() {
		System.out.println("Assignment Country box is visible");
	}

	@Then("user should select checkbox to select country for {string}")
	public void user_should_select_checkbox_to_select_country_for_role(String string) {
		createTeamMemberPage.selectCheckBoxForAssignCountry(string);
	}

	@Then("user should click on Submit button")
	public void user_should_click_on_submit_button() {
		createTeamMemberPage.clickSubmit();
	}
	
	@Then("user should see success message for team member")
	public void user_should_see_success_message_for_team_member() throws InterruptedException {
		createTeamMemberPage.TMCreatedSuccessMsg();
	}

}
