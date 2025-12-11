package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigPropertyReader;
import utils.TestBase;
import utils.WaitUtils;

public class EmpAdministrationPage extends TestBase {

	public WebDriver driver;

	public EmpAdministrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_gdvSearchResult\"]/tbody/tr[2]/td[2]/a")
	WebElement empNameLink;
	@FindBy(xpath = "//div[@class='MedicalNormalText']/table/tbody/tr[4]/td[2]")
	WebElement capturedCompany;

	// Change status of exam
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_dvAdministration")
	WebElement administrationTab;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlAdminOperation")
	WebElement operationDropdown;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ChangeExamStatus_MedicalExam_ddlMedicalExam")
	WebElement examDropdown;
	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_ChangeExamStatus_dvCurrentExamStatus\"]/table[1]/tbody/tr[1]/td[2]")
	WebElement currentExamStatus;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ChangeExamStatus_ddlChangeToExamStatus")
	WebElement changeExamStatus;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ChangeExamStatus_btnSubmit")
	WebElement submitBtnChangeStatusExam;

	// Create dummy exam
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_CreateDummyExam_ddlMET")
	WebElement selectMET;
	@FindBy(xpath = "//div[@class='dbInformationBg']")
	WebElement dummyExamFailure;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_CreateDummyExam_calDateOfExam_txtDate")
	WebElement dateOfExam;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_CreateDummyExam_txtDummyExamComments")
	WebElement comments;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_CreateDummyExam_btnSubmit")
	WebElement submitBtnCreateDummyExam;
	@FindBy(id = "tbxUserName")
	WebElement newWindowUsername;
	@FindBy(id = "tbxPassword")
	WebElement newWindowPassword;
	@FindBy(id = "btnSubmit")
	WebElement newWindowSubmit;

	// Delete Exam
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelMedicalExam_ucMedicalExam_ddlMedicalExam")
	WebElement selectExamDropdown;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelMedicalExam_chkDelExam")
	WebElement cnfExamDelCheckbox;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelMedicalExam_btnSubmit")
	WebElement submitBtnDelExamDelete;

	// Delete Employee
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelEmpDetails_chkDelEmployee")
	WebElement cnfEmpDelCheckBox;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelEmpDetails_btnSubmitDelEmpl")
	WebElement submitBtnDelEmpDetails;

	@FindBy(id = "btnSubmit")
	WebElement submitPopup;

	// Delete Recommendation letter
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelRecommLetter_ucMedicalExam_ddlMedicalExam")
	WebElement ExamDropdown;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelRecommLetter_chkDelRecommLetterComments")
	WebElement cnfRecommendationLetterCheckBox;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelRecommLetter_btnSubmit")
	WebElement submitBtnDelRecommLetter;

	// Delete Reminders
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelReminderDetails_ExamList_0")
	WebElement radioExistingExam;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelReminderDetails_MedicalExam_ddlMedicalExam")
	WebElement examDropdownReminder;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelReminderDetails_ddlExamReminder")
	WebElement reminderType;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelReminderDetails_gdvReminderDetails_ctl02_chkDeleteReminderDetails")
	WebElement reminderCheckbox;
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DelReminderDetails_btnSubmit")
	WebElement submitBtnDelReminderDetails;

	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	String date1 = formatter.format(date);

	public void clickLastNameLink() {
		WaitUtils.sleep(2);
		empNameLink.click();
	}

	public void companyName() {
		System.out.println("Captured company name is: " + capturedCompany.getText());
	}
	/*
	 * public String companyName() { System.out.println("Captured company name is: "
	 * + capturedCompany.getText()); return companyName(); }
	 */

	public void clickAdministrationTab() {
		administrationTab.click();
	}

	public void selectOperation(String operationName) {
		Select dropOperationName = new Select(operationDropdown);
		dropOperationName.selectByVisibleText(operationName);
		WaitUtils.sleep(3);

	}

	public void selectExamDateChangeStatus() {
		Select dropExamDate = new Select(examDropdown);
		dropExamDate.selectByIndex(1);
	}

	public void currentExamStatus() {
		String examStatus = currentExamStatus.getText();
		System.out.println("Current exam status is: " + examStatus);
	}

	public void selectChangeToExamStatus(String examStatus) {
		Select dropExamDateChange = new Select(changeExamStatus);
		dropExamDateChange.selectByVisibleText(examStatus);
	}

	public void clickSubmitForChangeStatusExam() {
		submitBtnChangeStatusExam.click();
		System.out.println("User navigated to *** " + driver.getTitle());
	}

	public void validateCredentialNewWindow() throws InterruptedException {
		String MainWindow1 = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			// System.out.println("User is on MAIN WINDOW " + driver.getTitle());

			if (!MainWindow1.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				// System.out.println("User navigated to CHILD WINDOW " + driver.getTitle());
				// String expectedTitle = "Validate User";
				// Assert.assertEquals(driver.getTitle(), expectedTitle);
				String username = ConfigPropertyReader.getConfig("USERNAME");
				String password = ConfigPropertyReader.getConfig("PASSWORD");
				driver.findElement(By.id("tbxUserName")).sendKeys(username);
				driver.findElement(By.id("tbxPassword")).sendKeys(password);
				WaitUtils.sleep(5);
				// WebElement validateSubmitBtn = driver.findElement(By.id("btnSubmit"));
				try {
					driver.findElement(By.id("btnSubmit")).click();
				} catch (WebDriverException e) {
					System.out.println("Unknown exception occured while finding: " + e);
				}
			}
			System.out.println("User is on which WINDOW?? " + driver.getTitle());
			WaitUtils.sleep(3);
			if (!driver.getTitle().equalsIgnoreCase("Administration")) {
				driver.switchTo().window(MainWindow1);
				WaitUtils.sleep(3);
				Alert alert = driver.switchTo().alert();
				System.out.println(",,,,,,," + (driver.switchTo().alert().getText()));
				alert.accept();
			}

		}
	}

	public void successMsgForDeleteEmp() throws InterruptedException {

		System.out.println("********* Employee deleted succesfully");
		// driver.close();
	}

	public void successMsgForExamStatus() {
		System.out.println(driver
				.findElement(By.xpath("//div[contains(text(),'Medical exam status updated successfully')]")).getText());
	}

	public void selectMET() {
		Select dropMET = new Select(selectMET);
		dropMET.selectByIndex(1);
	}

	public void selectExamDateMET() {
		dateOfExam.sendKeys(date1);
	}

	public void enterComment() {
		comments.sendKeys("Dummy exam creation");
	}

	public void clickSubmitForDummyExam() {
		submitBtnCreateDummyExam.click();
	}

	public void selectExamDateToDelete() {
		if (driver.getPageSource().contains("No exams found for the selected employee")) {
			System.out.println(driver.findElement(By.xpath("//div[@class='dbInformationBg']")).getText());
		} else {
			Select dropExamDateDelete = new Select(selectExamDropdown);
			dropExamDateDelete.selectByIndex(1);
		}
	}

	public void cnfExamDeletion() {
		cnfExamDelCheckbox.click();
	}

	public void clickSubmitForExamDelete() {
		submitBtnDelExamDelete.click();
	}

	public void cnfDeleteEmp() {
		cnfEmpDelCheckBox.click();
	}

	public void clickSubmitForDeleteEmp() throws InterruptedException {
		submitBtnDelEmpDetails.click();
		// Thread.sleep(3000);

	}

	public void selectExamForRecommLetter() {
		Select dropExamRecommLetter = new Select(ExamDropdown);
		dropExamRecommLetter.selectByIndex(2);
	}

	public void cnfDeleteRecommLetter() {
		cnfRecommendationLetterCheckBox.click();
	}

	public void clickSubmitForDeleteRecommLetter() {
		submitBtnDelRecommLetter.click();
	}

	public void radioBtnDelExistingReminder() {
		radioExistingExam.click();
	}

	public void selectExamForReminder() {
		Select dropExamReminder = new Select(examDropdownReminder);
		dropExamReminder.selectByIndex(1);
	}

	public void selectExamReminderType() {
		Select dropExamReminderType = new Select(reminderType);
		dropExamReminderType.selectByIndex(1);
	}

	public void chkBoxDeleteReminder() {
		reminderCheckbox.click();
	}

	public void clickSubmitForDeleteReminder() {
		submitBtnDelReminderDetails.click();
	}

	public void successMsgForDeleteExam() {
		System.out.println("Exam deleted successfully");
		// System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
