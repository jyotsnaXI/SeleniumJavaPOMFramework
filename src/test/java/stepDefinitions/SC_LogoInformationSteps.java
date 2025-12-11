package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_LogoInformationPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_LogoInformationSteps extends TestBase {
	
	SC_LogoInformationPage logoInformationPage;
	JavaScriptUtils javaScriptUtils;

	public SC_LogoInformationSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
	@Given("User clicks on logo information under submenu company")
	public void user_clicks_on_logo_information_under_submenu_company() {
		logoInformationPage = new SC_LogoInformationPage(driver);
		logoInformationPage.clickSubMenuLogoInfo();
	}

	@Given("user navigated to logo information page")
	public void user_navigated_to_logo_information_page() {
		logoInformationPage.logoInfoTitlePage();
	}

	@Given("user select owner company from drop-down as {string}")
	public void user_select_owner_company_from_drop_down_as(String string) {
		logoInformationPage.selectOwnerComp(string);
	}

	@Given("click on get details button")
	public void click_on_get_details_button() {
		logoInformationPage.getDetailsBtn();
	}

	@Given("user click on choose file button for Web Company Logo image Location")
	public void user_click_on_choose_file_button_for_web_company_logo_image_location() {
		logoInformationPage.chooseFileBtn();
	}

	@When("user click on submit button for logo")
	public void user_click_on_submit_button_for_logo() {
		logoInformationPage.clickSubmit();
	}

	@Then("user can see logo upload success message")
	public void user_can_see_logo_upload_success_message() {
	   
	}

}
