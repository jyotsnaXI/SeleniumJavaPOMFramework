package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "stepDefinitions", // EmployeeAdministration.feature
		// tags="@SearchEmployeeTest, @ViewExamTest, @CreateNewEmployee,
		// @CreateExamTest",
		// tags="@CreateNewEmployee or @CreateExamTest or
		// @CreateNewEmployeeAndExamCreation",
		tags = "@RegressionTest", 
		dryRun = false, monochrome = true, 
		plugin = { "html:target/cucumber.html",
				"json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt" })

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}