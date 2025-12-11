package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestBase;

public class LoginPageSteps extends TestBase {

	LoginPage loginPage;

	public LoginPageSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}
	// Logger log = Logger.getLogger(LoginPageSteps.class);

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.out.println("** Launched chrome browser **");
	}

	@Given("user enter url from config")
	public void user_enter_url_from_config() {
		System.out.println("** Entered URL **");
	}

	@Given("user enters email and password from config")
	public void user_enters_email_and_password_from_config() {
		loginPage = new LoginPage(driver);
		//String username = ConfigPropertyReader.getConfig("USERNAME");
		//TestBase.username();
		//String password = ConfigPropertyReader.getConfig("PASSWORD");
		//TestBase.password();
		//WaitUtils.sleep(2);
		loginPage.setUserName(TestBase.username());
		loginPage.setPassword(TestBase.password());
	}

	@Given("user enter code for verification")
	public void user_enter_code_for_verification() {
		loginPage = new LoginPage(driver);
		loginPage.setCodeForVerification();
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickSubmit();
	}

	@Given("user navigate to Search Employee page")
	public void user_navigate_to_search_employee_page() throws IOException {
		//loginPage.titlePage();

		/*
		 * log.warn("This is just warning message");
		 * log.fatal("This is just fatal message");
		 * log.error("This is just error message");
		 */
	}

}
