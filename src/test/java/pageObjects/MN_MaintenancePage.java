package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utils.ConfigPropertyReader;
import utils.TestBase;

public class MN_MaintenancePage extends TestBase {

	public WebDriver driver;

	public MN_MaintenancePage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_3' and contains(text(),'Maintenance')]")
	WebElement MaintenanceMenu;
	
	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5' and contains(text(),'Maintenance')]")
	WebElement MaintenanceSubMenu;
	
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnBrowse']")
	WebElement ChooseFile;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlMaintenenceOperation")
	WebElement drpOperation;
//Message	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtMessageDetails_txtMessage")
	WebElement txtMessageArea;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtMessageDetails_btnSubmitMtPage")
	WebElement btnSubmitMsg;
//Page
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtPageDetails_chkAddMaintenancePg")
	WebElement chkboxPage;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtPageDetails_btnSubmitMtPage")
	WebElement btnSubmitPage;
//StartStopEmailServices
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ucEmailService_rbtnEmailService_1")
	WebElement radioStopService;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ucEmailService_btnSubmit")
	WebElement btnSubmitForStopService;
// Delete Email Queue
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_rbDeleteErrorMails")
	WebElement radioBtnDeleteErroredEmails;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_gdvDeleteEmailQueue_ctl02_chkDeleteEmailQueue")
	WebElement firstCheckBox;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_btnSubmit")
	WebElement btnSubmitForDelEmailQueue;

// Delete Email To Be Sent
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_rbDeleteEmails")
	WebElement radioBtnDeleteMailToBeSent;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_ddlEmailType")
	WebElement drpMailType;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_ddlCompany")
	WebElement drpCompany;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_MtDeleteEmailQueue_btnSearch")
	WebElement btnSearch;
	@FindBy(xpath = "//div[contains(text(),'There are no email queues to delete')]")
	WebElement searchResult;

	public void clickSubMenuMaintenance() {
		Actions action = new Actions(driver);
		action.moveToElement(MaintenanceMenu).perform();
		action.moveToElement(MaintenanceSubMenu).click().perform();
	}

	public void pageTitleName() {
		System.out.println(driver.getTitle());
	}

	public void selectOperation(String operationName) {
		Select operation = new Select(drpOperation);
		operation.selectByVisibleText(operationName);
	}

	// Message
	public void enterMessage() {
		System.out.println("Mssage configuration postponed");
	}

	public void clickSubmitForMessage() {
		btnSubmitMsg.click();
	}

	public void validateCredentialNewWindow() {

		String parentWin = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String childWin = it.next();
			if (!parentWin.equals(childWin)) {
				driver.switchTo().window(childWin);
				System.out.println("User navigated to " + driver.getTitle());
				String expectedTitle = "Validate User";
				Assert.assertEquals(driver.getTitle(), expectedTitle);
				String username = ConfigPropertyReader.getConfig("USERNAME");
				String password = ConfigPropertyReader.getConfig("PASSWORD");
				driver.findElement(By.id("tbxUserName")).sendKeys(username);
				driver.findElement(By.id("tbxPassword")).sendKeys(password);
				driver.findElement(By.id("btnSubmit")).click();
			}
			driver.switchTo().window(parentWin);
		}

	}

	public void successMessageForMsg() {

	}

	// Page
	public void selectCheckboxCnf() {
		chkboxPage.click();
	}

	public void clickSubmitForPage() {
		btnSubmitPage.click();
	}

	public void successMessageForPage() {

	}

	// Start - Stop Email Services
	public void clickRadioBtnToStopService() {
		radioStopService.click();
	}

	public void clickSubmitForStopEmailServices() {
		btnSubmitForStopService.click();
	}

	public void successMessageForStopEmailService() {

	}

	// Delete Email Queue
	public void clickRadioForDeleteErroredEmails() {
		radioBtnDeleteErroredEmails.click();
	}

	public void selectChkErrorDescription() {
		firstCheckBox.click();
	}

	public void clickSubmitForDeleteErroredEmails() {
		btnSubmitForDelEmailQueue.click();
	}

	public void successMessageForDelMail() {

	}

	// Delete Email To Be Sent
	public void clickRadioForDeleteEmailsToBeSent() {
		radioBtnDeleteMailToBeSent.click();
	}

	public void selectEmailType(String mailType) {
		Select emailtype = new Select(drpMailType);
		emailtype.selectByVisibleText(mailType);
	}

	public void selectCompany(String company) {
		Select cmpny = new Select(drpCompany);
		cmpny.selectByVisibleText(company);
	}

	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void searchResult() {
		System.out.println("Result is :" + searchResult.getText());
	}

}
