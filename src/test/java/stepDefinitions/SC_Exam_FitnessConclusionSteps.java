package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_Exam_FitnessConclusionPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_Exam_FitnessConclusionSteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_Exam_FitnessConclusionPage fitnessConclusionPage;

	public SC_Exam_FitnessConclusionSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add Fitness Conclusion
	@Given("User clicks on Fitness Conclusion under exam under submenu system configuration")
	public void user_clicks_on_fitness_conclusion_under_exam_under_submenu_system_configuration() {
		fitnessConclusionPage = new SC_Exam_FitnessConclusionPage(driver);
		fitnessConclusionPage.clickMenuFitnessConclusion();
	}
	@Given("user navigated to Fitness Conclusion Master page")
	public void user_navigated_to_fitness_conclusion_master_page() {
		fitnessConclusionPage.pageTitleName();
	}
	@Given("user click on Add button for Fitness Conclusion")
	public void user_click_on_add_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickAddBtn();
	}
	@Given("user enter Fitness Conclusion Name in text field as {string}")
	public void user_enter_fitness_conclusion_name_in_text_field_as(String string) {
		fitnessConclusionPage.enterFitnessConclusionName(string);
	}
	@Given("user select checkbox for {string} for Fitness Conclusion")
	public void user_select_checkbox_for_for_fitness_conclusion(String string) {
		fitnessConclusionPage.selectCheckBox(string);
	}
	@When("user click on submit button for Fitness Conclusion")
	public void user_click_on_submit_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickSubmitBtn();
	}
	@Then("user should see success message for Fitness Conclusion")
	public void user_should_see_success_message_for_fitness_conclusion() {
		fitnessConclusionPage.successMsg();
	}
	
	//Search
	@Given("user enter Fitness Conclusion name in text field as {string} for search Fitness Conclusion")
	public void user_enter_fitness_conclusion_name_in_text_field_as_for_search_fitness_conclusion(String string) {
		fitnessConclusionPage.enterFitnessConclusionSrch(string);
	}
	@When("user click on search button for Fitness Conclusion")
	public void user_click_on_search_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickSearchBtn();
	}
	@Then("user can see search result with edit button for Fitness Conclusion")
	public void user_can_see_search_result_with_edit_button_for_fitness_conclusion() {
		fitnessConclusionPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for Fitness Conclusion")
	public void user_click_on_edit_button_for_fitness_conclusion() {
		fitnessConclusionPage.clickEditBtn();
	}
	@When("user click on submit button for update Fitness Conclusion")
	public void user_click_on_submit_button_for_update_fitness_conclusion() {
		fitnessConclusionPage.clickSubmitBtn();
	}
	@Then("user should see modify success message for Fitness Conclusion")
	public void user_should_see_modify_success_message_for_fitness_conclusion() {
		fitnessConclusionPage.modSuccessMsg();
	}

}
