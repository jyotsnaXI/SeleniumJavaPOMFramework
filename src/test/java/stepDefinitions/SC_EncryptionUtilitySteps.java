package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SC_EncryptionUtilityPage;
import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_EncryptionUtilitySteps extends TestBase {
	
	JavaScriptUtils javaScriptUtils;
	SC_EncryptionUtilityPage encryptionUtilityPage;

	public SC_EncryptionUtilitySteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	
//SC_Add Code master
	@Given("User clicks on encryption utility under system configuration")
	public void user_clicks_on_encryption_utility_under_system_configuration() {
		encryptionUtilityPage = new SC_EncryptionUtilityPage(driver);
		encryptionUtilityPage.clickMenuEncryptionUtility();
	}
	@Given("user navigated to EncryptionDecryption Utility page")
	public void user_navigated_to_encryption_decryption_utility_page() {
		encryptionUtilityPage.pageTitleName();
	}
	@Given("user enter Encrypted String in text field as {string} for code")
	public void user_enter_encrypted_string_in_text_field_as_for_code(String string) {
		encryptionUtilityPage.enterDecryptedStr(string);
	}
	@When("user click on Decryption button")
	public void user_click_on_decryption_button() {
		encryptionUtilityPage.clickDecryptBtn();
	}
	@Then("user should see String to be encrypted")
	public void user_should_see_string_to_be_encrypted() {
		encryptionUtilityPage.encryptedStringResult();
	}
	
	//ToDecriptString
	@Given("user enter normal string to be encrypted in text field as {string} for code")
	public void user_enter_normal_string_to_be_encrypted_in_text_field_as_for_code(String string) {
		encryptionUtilityPage.enterNormalStr(string);
	}
	@When("user click on encryption button")
	public void user_click_on_encryption_button() {
		encryptionUtilityPage.clickEncryptBtn();
	}
	@Then("user should see Encrypted String")
	public void user_should_see_encrypted_string() {
		encryptionUtilityPage.encryptedStringResult();
	}

}
