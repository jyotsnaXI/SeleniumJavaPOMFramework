package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DatabaseUtil;
import utils.JavaScriptUtils;
import utils.TestBase;
import utils.WaitUtils;

public class ArchivalTestingPage extends TestBase {

	WebDriver driver;
	DatabaseUtil dbUtil;

	public ArchivalTestingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFirstName")
	WebElement FirstName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtLastName")
	WebElement LastName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGinNumber")
	WebElement ginNumber;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlStatus")
	WebElement drpEmpStatus;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement SearchButton;

	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchResult_ctl01_litEmployeeGIN']")
	WebElement ginColumnHeader;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtUserName")
	WebElement userName;

	@FindBy(xpath = "//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchUser_ctl01_lnkUserRole']")
	WebElement userRoleHeader;

	@FindBy(id = "searchHeading")
	WebElement SearchResults;

	@FindBy(id = "details-button")
	WebElement advancedButton;

	@FindBy(xpath = "//a[@id=\"proceed-link\"]")
	WebElement proceedLink;

	public void setGIN(String GinNumber) {
		ginNumber.clear();
		ginNumber.sendKeys(GinNumber);
	}

	public void setCompany(String company) {
		Select dropCompany = new Select(drpCompany);
		dropCompany.selectByVisibleText(company);
	}

	public void setLastName(String fname) {
		LastName.clear();
		LastName.sendKeys(fname);
	}

	public void setFirstName(String fname) {
		FirstName.clear();
		FirstName.sendKeys(fname);
	}

	public void setEmpStatus(String empStatus) {
		Select empstatus = new Select(drpEmpStatus);
		if ("deleted".equalsIgnoreCase(empStatus)) {
			System.out.println("Employee status is 'deleted'. default value selected");
			empstatus.selectByIndex(0);
		} else {
			empstatus.selectByVisibleText(empStatus);
		}
	}

	public void setUsername(String username) {
		userName.clear();
		userName.sendKeys(username);
	}

	public void clickSearch() {
		SearchButton.click();
	}

	public void clickAdvanceBtn() {
		advancedButton.click();
	}

	public void clickProceedLink() {
		proceedLink.click();
	}

	public void showSearchCount() throws InterruptedException {
		WebElement table;
		try {
			table = driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult"));
		} catch (Exception e) {
			WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
			System.out.println("Notification message: " + notification.getText() + ginNumber.getText());
			takeScreenshot(driver, "Table not found", true);
			return;
		}

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		if (rows.size() <= 1) {
			System.out.println("There are no employees available for the search performed - " + ginNumber.getText());
			takeScreenshot(driver, "No employee found", true);
		} else {
			System.out.println("Employees found: " + (rows.size() - 1)); // Exclude the header row
			takeScreenshot(driver, "Employee found", false);
		}
	}

	public void clickGinColumnHeader(String GIN, String Company, String empStatus, String FirstName) throws IOException {
		String actualGIN = GIN.replace(".0", "");
		boolean ginFound = false;
		int maxRowsToCheck = 3;

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			boolean tableExists = JavaScriptUtils.isTablePresent(driver,
					By.id("ctl00_MedtrackContentPlaceHolder_SearchHeading"));

			if (!tableExists) {
				handleNoResultsFound(actualGIN);
			} else {
				WebElement table = wait.until(ExpectedConditions
						.presenceOfElementLocated(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult")));

				List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
				System.out.println("Number of rows found: " + rows.size());

				if (rows.size() >= 3) {
				    System.out.println("More than one employee found for GIN: " + actualGIN);			
				
				WebElement ginColumnHeader = driver.findElement(
						By.xpath("//a[@id='ctl00_MedtrackContentPlaceHolder_gdvSearchResult_ctl01_litEmployeeGIN']"));
				ginColumnHeader.click();
				System.out.println("GIN Header clicked!!!");
				WaitUtils.sleep(2);
				}

				table = driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchResult"));
				rows = table.findElements(By.xpath(".//tbody/tr"));

				ginFound = searchForGinInRows(rows, actualGIN, empStatus, Company, maxRowsToCheck, FirstName);

				if (ginFound) {
				    System.out.println("Success: Exact GIN number found: " + actualGIN);
				    // Capture the screenshot after success
				   // takeScreenshot(driver, "Success_" + actualGIN, false);
				} else {
				    System.out.println("Failed: Exact GIN could not be found: " + actualGIN);
				    // Capture the screenshot after failure
				    takeScreenshot(driver, "Failed", false);
				}

				// System.out.println("Total employees found: " + (rows.size() - 1));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// handleNoResultsFound(actualGIN);
		}

	}

	// Method to search for the exact GIN in the table rows
	public boolean searchForGinInRows(List<WebElement> rows, String gin, String status, String companyName,
			int maxRowsToCheck, String firstName) {
		if (rows == null || rows.size() <= 1) {
			System.out.println("Error: No rows found to search or only header row present.");
			return false;
		}

		int rowsToCheck = Math.min(rows.size(), maxRowsToCheck + 1);

		for (int i = 1; i < rowsToCheck; i++) {
			WebElement row = rows.get(i);
			if (row == null) {
				System.out.println("Skipping null row at index: " + i);
				continue;
			}

			List<WebElement> columns;
			try {
				columns = row.findElements(By.tagName("td"));
			} catch (Exception e) {
				System.out.println("Error finding columns in row at index " + i);
				System.out.println("Row content: " + (row != null ? row.getText() : "N/A"));
				continue;
			}

			if (columns.isEmpty()) {
				System.out.println("Skipping row with no 'td' elements at index " + i + ": " + row.getText());
				continue;
			}

			if (columns.size() < 3) {
				System.out.println("Skipping row with insufficient columns at index " + i + ": " + row.getText());
				continue;
			}

			String cellFirstName = columns.get(2).getText().trim();
			String cellGin = columns.get(3).getText().trim();
			String cellStatus = columns.get(8).getText().trim();
			String cellCompanyName = columns.get(9).getText().trim();

			// System.out.println("++++++++++" + cellGin+"_" + cellStatus+"_"+
			// cellCompanyName+"_Excel value_"+ gin+"_" + status+"_"+ companyName );

			String normalizedCellFirstName = cellFirstName.replaceAll("\\s+", "").toLowerCase();
			String normalizedFirstName = firstName.replaceAll("\\s+", "").toLowerCase();
			
			String normalizedCellGin = cellGin.replaceAll("\\s+", "").toLowerCase();
			String normalizedGin = gin.replaceAll("\\s+", "").toLowerCase();
			String normalizedCellStatus = cellStatus.replaceAll("\\s+", "").toLowerCase();
			String normalizedStatus = status.replaceAll("\\s+", "").toLowerCase();
			String normalizedCellCompanyName = cellCompanyName.replaceAll("\\s+", "").toLowerCase();
			String normalizedCompanyName = companyName.replaceAll("\\s+", "").toLowerCase();
			System.out.println(normalizedCellGin+"-"+normalizedGin+":"+normalizedCellStatus+"-"+normalizedStatus
					+":"+normalizedCellFirstName+"-"+normalizedFirstName);

			/* 
			  if (normalizedCellGin.equals(normalizedGin) && normalizedCellCompanyName.equals(normalizedCompanyName)
					&& (normalizedCellStatus.equals("inactive") || normalizedCellStatus.equals("timed out"))) */
			
			if (normalizedCellGin.equals(normalizedGin) && normalizedCellFirstName.equals(normalizedFirstName)
					&& (normalizedCellStatus.equals(normalizedStatus) || normalizedCellStatus.equals(normalizedStatus))) {
				System.out.println(
						"Found matching GIN, Status, FirstName and Company Name: " + gin + ", " + status + ", "+ firstName+ ", " + companyName);
				//takeScreenshot(driver, gin + "_Success", false);
				return true;
			}
		}
		return false;
	}

	/**
	 * Method to handle the case when no results are found in the table
	 */
	private void handleNoResultsFound(String gin) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for up to 10 seconds
		WebElement notification = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='InformationBg']")));
		System.out.println("Notification message: " + notification.getText() + " - " + gin);
	}

	public void clickUsernameColumnHeader(String username) throws IOException {
		boolean userFound = false;
		WebElement table;

		try {
			table = driver.findElement(By.id("ctl00_MedtrackContentPlaceHolder_gdvSearchUser"));
		} catch (Exception e) {
			WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
			System.out.println("Notification message: " + notification.getText());
			WaitUtils.sleep(2);
			takeScreenshot(driver, "Table not found", true);
			return;
		}

		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		if (rows.size() <= 1) {
			System.out.println("No Employees found.");
			takeScreenshot(driver, "Table not found", true);
		} else {
			userRoleHeader.click();
			if (userFound) {
				System.out.println("Success: Exact username found: " + username);
				takeScreenshot(driver, "Exact username found", false);
			}
		}
	}

}
