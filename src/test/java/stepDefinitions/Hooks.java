package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.TestBase;

public class Hooks extends TestBase {

	@Before
	public void setupApplication() {
		TestBase b = new TestBase();
		this.driver = b.createDriver();
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "name");
			scenario.log("Feature File Path = " + scenario.getUri().toString());
			scenario.log("Feature File Line No = " + scenario.getLine().toString());
			scenario.log("Scenario Name = " + scenario.getName().toString());
		} else {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "name");
		}

		driver.quit();
	}
}
