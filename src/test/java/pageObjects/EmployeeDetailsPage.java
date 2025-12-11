package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class EmployeeDetailsPage extends TestBase {

	WebDriver driver;

	public EmployeeDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong[contains(text(),'Employee Details')]")
	WebElement empDetailTitle;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnResendNotification")
	WebElement btnResendNotification;
	
	@FindBy(xpath = "//div[contains(text(),'The e-mail request has been added to the queue. It')]")
	WebElement resendNotifiSuccMsg;
	
	
	@FindBy(xpath = "//a[@class='EditContact']")
	WebElement editInfoLink;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnViewExam")
	WebElement btnViewExam;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnLTASend")
	WebElement btnLTASend;
	
	@FindBy(xpath = "//div[contains(text(),'The e-mail request has been added to the queue. It')]")
	WebElement sendLTASuccMsg;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnCancel")
	WebElement btnQuit;
	
	@FindBy(xpath = "//div[@id='divMainHeading']")
	WebElement modifyPageTitle;
	
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnModify']")
	WebElement modifySubmitBtn;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/span[1]/div[1]")
	WebElement modifyRecordSuccMsg;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/span[1]/div[1]")
	WebElement editInfoEmpSuccessMsg;
	
	@FindBy(xpath = "//span[@id='ctl00_MedtrackContentPlaceHolder_litExamStatus']")
	WebElement recordStatus;
	
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnPrintCertificate']")
	WebElement btnPrintCertificate;
	
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnPrintQuestionnaire']")
	WebElement btnPrintQuestionnaire;
	
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnPrintHPP']")
	WebElement btnPrintHPPassport;
	
	@FindBy(xpath = "//input[@id='ctl00_MedtrackContentPlaceHolder_btnPrintCertificate']")
	WebElement btnPrintCertificateMedCompl;
	
	public void modifyPageTitle() {
		System.out.println("User is on" + modifyPageTitle.getText());
	}
	
	public void submitForModifyRecord() {
		modifySubmitBtn.click();
	}
	
	public void modifyRecoSuccMsg() {
		System.out.println("*****" + modifyRecordSuccMsg.getText());
	}
	
	public void empDetaiTitle() {
		System.out.println("User is on" + empDetailTitle.getText());
	}
	
	public void ResendNotification() {
		btnResendNotification.click();
	}
	
	public void resendNotiSuccMsg() {		
		String SuccessMsg = "The e-mail request has been added to the queue. It will be sent in few minutes";
		String FailureMsg = "There is no previous notification e-mail sent for this employee";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='dbErrorBg']")).getText();

		if (AlertsMsg.equalsIgnoreCase(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='dbErrorBg']")).getText());
		}
	}
	
	public void editInformationLink() {
		editInfoLink.click();
	}
	
	public void editInfoSuccMsg() {
		editInfoEmpSuccessMsg.click();
	}
	
	public void viewExam() {
		btnViewExam.click();
	}
	
	public void sendLTA() {
		btnLTASend.click();
	}
	
	public void sendLTASuccMsg() {
		System.out.println("Send LTA success message is: " + sendLTASuccMsg.getText());
	}
	
	public void quitBtn() {
		btnQuit.click();
	}
	
	public void statusRecord() {
		System.out.println("Status of the record is: " + recordStatus.getText());
		String rtp = "Ready to Print", pending = "Pending", refused = "Refused", incomplete = "Incomplete";
		if(recordStatus.getText().equalsIgnoreCase(rtp)) {
			printCertificate();
			printQuestionnaire();
			healthPPassport();
		}
		else if(recordStatus.getText().equalsIgnoreCase(pending)) {
			printQuestionnaire();
		}
		else if(recordStatus.getText().equalsIgnoreCase(refused)) {
			medicalCompliance();
		}
		else if(recordStatus.getText().equalsIgnoreCase(incomplete)) {
			printQuestionnaire();
		}

	}
	
	public void printCertificate() {
		System.out.println("Printed printCertificate");
		btnPrintCertificate.click();
	}
	
	public void printQuestionnaire() {
		System.out.println("Printed printQuestionnaire");
		btnPrintQuestionnaire.click();
	}
	
	public void healthPPassport() {
		System.out.println("Printed healthPPassport");
		btnPrintHPPassport.click();
	}
	
	public void medicalCompliance() {
		System.out.println("Printed medicalCompliance");
		btnPrintCertificateMedCompl.click();
	}
	
}
