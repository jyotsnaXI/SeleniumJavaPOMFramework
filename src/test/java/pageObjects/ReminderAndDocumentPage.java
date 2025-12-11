package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class ReminderAndDocumentPage extends TestBase {

	public WebDriver driver;

	public ReminderAndDocumentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// Generate
	@FindBy(xpath = "//a[text()= 'Reminders and Documents']")
	WebElement RemindersAndDocumentsMenu;

	@FindBy(xpath = "//a[text()= 'Generate']")
	WebElement GenerateSubMenu;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpCompany;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCategory")
	WebElement drpCategory;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnGetDetails")
	WebElement btnSearch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnCancel")
	WebElement btnReset;

	public void clickSubMenuGenerate() {
		Actions action = new Actions(driver);
		action.moveToElement(RemindersAndDocumentsMenu).perform();
		action.moveToElement(GenerateSubMenu).click().perform();
	}

	public void selectCompany(String company) {
		Select dropCompany = new Select(drpCompany);
		dropCompany.selectByVisibleText(company);
		drpCompany.click();
	}

	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void clickResetBtn() {
		btnReset.click();
	}

// Download	
	@FindBy(xpath = "//a[text()= 'Download']")
	WebElement DownloadSubMenu;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvDocGenQueue_ctl03_btnDownload")
	WebElement btnDownload;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvDocGenQueue_ctl03_btnError")
	WebElement btnErrorLog;

	public void clickSubMenuDownload() {
		Actions action = new Actions(driver);
		action.moveToElement(RemindersAndDocumentsMenu).perform();
		action.moveToElement(DownloadSubMenu).click().perform();
	}

	public void clickDownloadBtn() {
		btnDownload.click();
	}

	public void clickErrorBtn() {
		btnErrorLog.click();
	}

}
