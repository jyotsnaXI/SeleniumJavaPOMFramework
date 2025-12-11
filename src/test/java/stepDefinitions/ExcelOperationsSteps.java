package stepDefinitions;

import java.io.IOException;
import java.util.List;
import io.cucumber.java.en.Given;
import pageObjects.ExcelOperationsPage;
import utils.ExcelUtil;
import utils.JavaScriptUtils;
import utils.TestBase;

public class ExcelOperationsSteps extends TestBase {
	
	ExcelOperationsPage excelOperationsPage;
	JavaScriptUtils javaScriptUtils;
	ExcelUtil excel;

	public ExcelOperationsSteps(Hooks hook) {
		this.driver = hook.getDriver();
	}

	@Given("user enters url, username and password from excel file")
	public void user_enters_url_username_and_password_from_excel_file() throws IOException {
		excelOperationsPage = new ExcelOperationsPage(driver);
        ExcelUtil.loadExcelFile("/Users/jyotsna.gupta/eclipse-workspace/MedTrackAutomation/testdata/data.xlsx", "Sheet1");
	    
        // Get data from Excel
        List<String[]> testData = ExcelUtil.getTestData();
       
        // Loop through the test data
        for (String[] rowData : testData) {
        	String url = rowData[0];		// Assuming username is in the first column
            String username = rowData[1]; // Assuming username is in the second column
            String password = rowData[2]; // Assuming password is in the third column
            System.out.println(url);
            driver.get(url);
            // Perform login using data from Excel
            excelOperationsPage.setUserName(username);
            excelOperationsPage.setPassword(password);
            excelOperationsPage.setCodeForVerification();
            excelOperationsPage.clickSubmit();
        }        	
	}
	
}
