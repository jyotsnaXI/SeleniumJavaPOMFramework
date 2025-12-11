package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SearchTeamMemberPage;
import utils.TestBase;

public class SearchTeamMemberSteps extends TestBase {
	
	SearchTeamMemberPage searchTeamMemberPage;
	
	public SearchTeamMemberSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on dashboard menu Search Team Member")
	public void user_clicks_on_dashboard_menu_search_team_member() {
		searchTeamMemberPage = new SearchTeamMemberPage(driver);
		//javaScriptUtils = new JavaScriptUtils(driver);
		//javaScriptUtils.click_dashboard_menu_link(link_name);
		searchTeamMemberPage.clickSearchTeamMembersLink();	
	}
	@Given("user navigate to Search Team Member page")
	public void user_navigate_to_search_team_member_page() {
	  System.out.println("User is on Search Team Member page");
	}

	@Given("user select user role as {string}")
	public void user_select_user_role_as(String userrole) {
		searchTeamMemberPage = new SearchTeamMemberPage(driver);
		searchTeamMemberPage.setUserRole(userrole);
	}

	@Given("user enter Employee GIN as {string}")
	public void user_enter_employee_gin_as(String empGIN) {
		searchTeamMemberPage = new SearchTeamMemberPage(driver);
		searchTeamMemberPage.setEmpGIN(empGIN);
	}

	@Then("user can see search result in a table")
	public void user_can_see_search_result_in_a_table() {
		searchTeamMemberPage = new SearchTeamMemberPage(driver);
		searchTeamMemberPage.setSearchResult();
	}
}
