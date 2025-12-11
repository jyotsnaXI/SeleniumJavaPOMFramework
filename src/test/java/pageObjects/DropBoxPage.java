package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.JavaScriptUtils;
import utils.TestBase;

public class DropBoxPage extends TestBase {

	WebDriver driver;

	public DropBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// DropBox Download

	@FindBy(xpath = "//a[text()= 'Drop Box']")
	WebElement DropBoxMenu;

	@FindBy(xpath = "//strong[contains(text(),'Search Result')]")
	WebElement searchTable;

	@FindBy(xpath = "//a[@href='DropBoxDownload.aspx']")
	WebElement DropBoxDownload;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlEmployeeCategory")
	WebElement ddlEmployeeCategory;

	@FindBy(xpath = "//div[contains(text(),'The e-mail to TestTwo Abu Dhabi has been added to ')]")
	WebElement SendMailSuccMsg;

	@FindBy(xpath = "//div[contains(text(),'The attachment was deleted successfully.')]")
	WebElement succMsgDelRecord;

	// DropBox Upload

	@FindBy(xpath = "//a[@href='DropBoxUploadWithMenu.aspx']")
	WebElement DropBoxUpload;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DropBox_ddlCompanyName")
	WebElement ddlCompanyName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DropBox_txtEmpGIN")
	WebElement txtEmpGIN;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DropBox_btnGetDetails")
	WebElement btnGetDetails;

	@FindBy(xpath = "//*[@id=\"ctl00_MedtrackContentPlaceHolder_DropBox_btnBrowse\"]")
	WebElement chooseFileBtn;

	@FindBy(xpath = "//input[@value='Attach']")
	WebElement btnAttachDocument;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DropBox_btnCancel")
	WebElement btnCancel;

	@FindBy(xpath = "//div[@id='ctl00_MedtrackContentPlaceHolder_DropBox_divPager']")
	WebElement searchResult;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_DropBox_UploadDropBoxMessage_SuccessM")
	WebElement alertMessage;

	// DropBox Download
	public void clickSubMenuDownload() {
		Actions action = new Actions(driver);
		action.moveToElement(DropBoxMenu).perform();
		// WaitUtils.waitForElementToClickable(driver, DropBoxDownload);
		action.moveToElement(DropBoxDownload).click().perform();
	}

	public void selectEmployeeCategory(String empCategory) {
		Select dropCategory = new Select(ddlEmployeeCategory);
		dropCategory.selectByVisibleText(empCategory);
	}

	public void searchTableResults() {
		System.out.println("***********" + searchTable.getText());
	}

	// DropBox Upload
	public void clickSubMenuUpload() {
		Actions action = new Actions(driver);
		action.moveToElement(DropBoxMenu).perform();
		action.moveToElement(DropBoxUpload).click().perform();
	}

	public void selectCompanyName(String companyName) {
		Select dropCompany = new Select(ddlCompanyName);
		dropCompany.selectByVisibleText(companyName);
	}

	public void employeeGIN(String GIN) {
		txtEmpGIN.sendKeys(GIN);
	}

	public void btnGetDetails() {
		btnGetDetails.click();
	}

	public void clickChooseFile() throws InterruptedException {
		JavaScriptUtils.moveToElement(driver, chooseFileBtn);
		chooseFileBtn.sendKeys("C:\\Users\\Jyotsna.Gupta\\Downloads\\Logo-Smiley.png");
		System.out.println("Entered filename ***");
	}

	public void attachUploadedDoc() {
		btnAttachDocument.click();
	}

	public void uploadFileMsg() throws InterruptedException {
		String SuccessMsg = "has been successfully uploaded into the Intl. SOS Drop Box. You can continue uploading if you have multiple files.";
		String FailureMsg = "A file with the same name already exists. Please try again with a different file name or delete the existing file";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	public void btnAttachDocument(String mailID) {

		List<WebElement> dr = driver.findElements(By.xpath("//table[@class='CreateText']/tbody/tr"));
		int size = dr.size();

		for (int i = 2; i <= size; i++) {
			String results = driver.findElement(By.xpath("//table[@class='CreateText']/tbody/tr["+i+"]/td[2]")).getText();
			
			if(results.contains("siva.palaparthi@internationalsos.com")) {
				driver.findElement(By.xpath("//table[@class='CreateText']/tbody/tr["+i+"]/td[3]")).click();
				break;
			}
			
		}

	}

	public void sendEmailBtn(String mailID) {
		List<WebElement> dr = driver.findElements(By.xpath("//table[@class='CreateText']/tbody/tr"));
		int size = dr.size();

		for (int i = 2; i <= size; i++) {
			String results = driver.findElement(By.xpath("//table[@class='CreateText']/tbody/tr["+i+"]/td[2]")).getText();
			
			if(results.contains("siva.palaparthi@internationalsos.com")) {
				driver.findElement(By.xpath("//table[@class='CreateText']/tbody/tr["+i+"]/td[10]")).click();
				break;
			}		
		}
	}

	public void suceeMsgSendEmail() {
		System.out.println("*****Email Sent Succesfully*********" + SendMailSuccMsg.getText());
	}

	public void deleteRecord(String mailID) {
		List<WebElement> dr = driver.findElements(By.xpath("//table[@class='CreateText']/tbody/tr"));
		int size = dr.size();

		for (int i = 2; i <= size; i++) {
			String results = driver.findElement(By.xpath("//table[@class='CreateText']/tbody/tr["+i+"]/td[2]")).getText();
			
			if(results.contains("siva.palaparthi@internationalsos.com")) {
				driver.findElement(By.xpath("//table[@class='CreateText']/tbody/tr["+i+"]/td[11]")).click();
				break;
			}		
		}
	}

	public void successMsgRecordDel() {
		System.out.println("** " + succMsgDelRecord.getText());
	}

	public void btnCancel() {
		btnCancel.click();
	}

	public void delDocument(String mailID) throws InterruptedException {
		JavaScriptUtils.scrollDown(driver);
		List<WebElement> dr = driver.findElements(By.xpath("//table[@class='FormText']/tbody/tr"));
		int size = dr.size();

		for (int i = 2; i <= size; i++) {
			String results = driver.findElement(By.xpath("//table[@class='FormText']/tbody/tr["+i+"]/td[6]")).getText();
			
			if(results.contains(mailID)) {
				System.out.println("****************" + results );
				System.out.println("******$$**********" + mailID );
				driver.findElement(By.xpath("//table[@class='FormText']/tbody/tr["+i+"]/td[7]")).click();
				break;
			}
			
		}
	}

	public void deleteFileMsg() {
		String SuccessMsg = "The attachment was deleted successfully.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) 
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
