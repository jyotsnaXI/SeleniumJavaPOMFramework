package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_BPCholestrolBMIPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_BPCholestrolBMISteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_BPCholestrolBMIPage bpCholestrolBMIPage;

	public SC_BPCholestrolBMISteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	//Add BP/Cholestrol/BMI
	@Given("User clicks on BPCholestrolBMI under submenu medical data")
	public void user_clicks_on_bp_cholestrol_bmi_under_submenu_medical_data() {
		bpCholestrolBMIPage = new SC_BPCholestrolBMIPage(driver);
		bpCholestrolBMIPage.clickMenuBPCholestrolBMIMenu();
	}
	@Given("user navigated to BPCholestrolBMI Master page")
	public void user_navigated_to_bp_cholestrol_bmi_master_page() {
		bpCholestrolBMIPage.pageTitleName();
	}
	@Given("user click on add button for BPCholestrolBMI")
	public void user_click_on_add_button_for_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.clickAddBtn();
	}
	@Given("user select Master Type from dropdown as {string}")
	public void user_select_master_type_from_dropdown_as(String string) {
		bpCholestrolBMIPage.selectMasterType(string);
	}
	@Given("user enter Category Name in text field as {string}")
	public void user_enter_category_name_in_text_field_as(String string) {
		bpCholestrolBMIPage.enterCategoryName(string);
	}
	@Given("user enter Minimum Value in text field as {string}")
	public void user_enter_minimum_value_in_text_field_as(String string) {
		bpCholestrolBMIPage.enterMinValue(string);
	}
	@Given("user enter Maximum Value in text field as {string}")
	public void user_enter_maximum_value_in_text_field_as(String string) {
		bpCholestrolBMIPage.enterMaxValue(string);
	}
	@When("user click on submit button for add BPCholestrolBMI")
	public void user_click_on_submit_button_for_add_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.clickSubmitBtn();
	}
	@Then("user should see success message for add BPCholestrolBMI")
	public void user_should_see_success_message_for_add_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.successMsg();
	}
	
	//Search
	@Given("user select Master Type from dropdown as {string} for search")
	public void user_select_master_type_from_dropdown_as_for_search(String string) {
		bpCholestrolBMIPage.selectMasterTypeSrch(string);
	}
	@Given("user enter Category Name in text field as {string} for search")
	public void user_enter_category_name_in_text_field_as_for_search(String string) {
		bpCholestrolBMIPage.enterCategorySrch(string);
	}
	@When("user click on search button for BPCholestrolBMI")
	public void user_click_on_search_button_for_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.clickSearchBtn();
	}
	@Then("user can see BPCholestrolBMI record in search result table with edit button")
	public void user_can_see_bp_cholestrol_bmi_record_in_search_result_table_with_edit_button() {
		bpCholestrolBMIPage.searchResultTable();
	}
	
	//Modify
	@Given("user click on edit button for edit BPCholestrolBMI")
	public void user_click_on_edit_button_for_edit_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.clickEditBtn();
	}
	@Given("user modify Category Name in text field as {string}")
	public void user_modify_category_name_in_text_field_as(String string) {
		bpCholestrolBMIPage.modifyCategory(string);
	}
	@Given("user modify Minimum Value in text field as {string}")
	public void user_modify_minimum_value_in_text_field_as(String string) {
		bpCholestrolBMIPage.modifyMinValue(string);
	}
	@Given("user modify Maximum Value in text field as {string}")
	public void user_modify_maximum_value_in_text_field_as(String string) {
		bpCholestrolBMIPage.modifyMaxValue(string);
	}
	@When("user click on submit button for modify BPCholestrolBMI")
	public void user_click_on_submit_button_for_modify_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.clickUpdateBtn();
	}
	@Then("user should see modify success business BPCholestrolBMI")
	public void user_should_see_modify_success_business_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.modSuccessMsg();
	}
	
	//Delete
	@Given("user can see BPCholestrolBMI record in search result table with delete button")
	public void user_can_see_bp_cholestrol_bmi_record_in_search_result_table_with_delete_button() {
		bpCholestrolBMIPage.searchResultTable();
	}
	@When("user click on delete button for BPCholestrolBMI")
	public void user_click_on_delete_button_for_bp_cholestrol_bmi() {
		bpCholestrolBMIPage.clickDeleteBtn();
	}
	@Then("user should see a success message for delete BPCholestrolBMI record")
	public void user_should_see_a_success_message_for_delete_bp_cholestrol_bmi_record() {
		bpCholestrolBMIPage.deleteSuccessMsg();
	}

}
