package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_FitnessConclusionPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_EditFitnessConclusionSteps extends TestBase {

	SC_FitnessConclusionPage fitnessConclusionPage;
	JavaScriptUtils javaScriptUtils;

	public SC_EditFitnessConclusionSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Fitness conclusion
	@Given("User clicks on Fitness Conclusion under submenu company")
	public void user_clicks_on_fitness_conclusion_under_submenu_company() {
		fitnessConclusionPage = new SC_FitnessConclusionPage(driver);
		fitnessConclusionPage.clickSubMenuFitnessConclusion();
	}
	@Given("user navigated to Company Fitness Conclusion Master page")
	public void user_navigated_to_company_fitness_conclusion_master_page() {
		fitnessConclusionPage.fitnessConclusionTitleName();
	}
	@Given("user click on add button for add fitness conclusion")
	public void user_click_on_add_button_for_add_fitness_conclusion() {
		fitnessConclusionPage.clickAddBtn();
	}
	@Given("user select owner company from dropdown as {string} for fitness conclusion")
	public void user_select_owner_company_from_dropdown_as_for_fitness_conclusion(String string) {
		fitnessConclusionPage.selectOwnerCompany(string);
	}
	@Given("user select user role from dropdown as {string} for fitness conclusion")
	public void user_select_user_role_from_dropdown_as_for_fitness_conclusion(String string) {
		fitnessConclusionPage.selectUserRole(string);
	}
	@Given("user select Fitness Conclusion Name from dropdown as {string} for fitness conclusion")
	public void user_select_fitness_conclusion_name_from_dropdown_as_for_fitness_conclusion(String string) {
		fitnessConclusionPage.selectFitnessConclusion(string);
	}
	@When("user click on submit button for fitness conclusion")
	public void user_click_on_submit_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickSubmit();
	}
	@Then("user can see fitness conclusion success message")
	public void user_can_see_fitness_conclusion_success_message() {
		fitnessConclusionPage.fitnessConclusionSuccessMsg();
	}
	
	//Search Fitness Conclusion
	@Given("user select owner company from dropdown as {string} for fitness conclusion search")
	public void user_select_owner_company_from_dropdown_as_for_fitness_conclusion_search(String string) {
		fitnessConclusionPage.selectOwnerCompanySrch(string);
	}
	@Given("user select user role from dropdown as {string} for fitness conclusion search")
	public void user_select_user_role_from_dropdown_as_for_fitness_conclusion_search(String string) {
		fitnessConclusionPage.selectUserRoleSrch(string);
	}
	@When("user click on search button for fitness conclusion")
	public void user_click_on_search_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickSearchBtn();
	}
	@Then("user can see search records for fitness conclusion")
	public void user_can_see_search_records_for_fitness_conclusion() {
		fitnessConclusionPage.searchResultTable();
	}
	
	//Modify Fitness Conclusion
	@Given("user can see search result with edit button")
	public void user_can_see_search_result_with_edit_button() {
		fitnessConclusionPage.searchResultTable();
	}
	@Given("user click on edit button for fitness conclusion")
	public void user_click_on_edit_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickEditBtn();
	}
	@Given("user modify user role from dropdown as {string}")
	public void user_modify_user_role_from_dropdown_as(String string) {
		fitnessConclusionPage.modifyUserRole(string);
	}
	@Given("user modify Fitness Conclusion Name from dropdown as {string}")
	public void user_modify_fitness_conclusion_name_from_dropdown_as(String string) {
		fitnessConclusionPage.modifyFitnessConclusion(string);
	}
	@When("user click on submit button for modify fitness conclusion")
	public void user_click_on_submit_button_for_modify_fitness_conclusion() {
		fitnessConclusionPage.modifySubmitBtn();
	}
	@Then("user can see modify success message fitness conclusion")
	public void user_can_see_modify_success_message_fitness_conclusion() {
		fitnessConclusionPage.modifySuccessMsg();
	}
}
