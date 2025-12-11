package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestBase;
import utils.WaitUtils;

public class MN_ErrorLogsPage extends TestBase {

	public WebDriver driver;

	public MN_ErrorLogsPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_3' and contains(text(),'Maintenance')]")
	WebElement MaintenanceMenu;
	
	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5' and contains(text(),'Error Logs')]")
	WebElement errorLogsSubMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_log_select")
	WebElement drpLog;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ltLogs")
	WebElement selectLogTextArea;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_download")
	WebElement btnDownload;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_downloadAll")
	WebElement btnDownloadAll;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_delete")
	WebElement btnDelete;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_deleteAll")
	WebElement btnDeleteAll;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnReload")
	WebElement btnReload;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnFilter")
	WebElement btnFilter;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnConfiguration")
	WebElement btnConfiguration;

	public void clickSubMenuErrorLogs() {
		Actions action = new Actions(driver);
		action.moveToElement(MaintenanceMenu).perform();
		action.moveToElement(errorLogsSubMenu).click().perform();
	}

	public void pageTitleName() {
		System.out.println(driver.getTitle());
	}

	public void selectLog(String log) {
		Select logName = new Select(drpLog);
		logName.selectByVisibleText(log);
	}
	
	public void selectLogFromTextArea(String logname) {
		WaitUtils.sleep(2);
		Select selectLogName = new Select(selectLogTextArea);
		selectLogName.selectByVisibleText(logname);
	}

	public void downloadLog() {
		WaitUtils.sleep(2);
		btnDownload.click();
	}
	
	public void successMsgDownloadLog() {
		System.out.println("Log downloaded successfully in local machine!");
	}
	
	public void downloadAllLog() {
		btnDownloadAll.click();
	}
	
	public void deleteLog() {
		btnDelete.click();
	}
	
	public void deleteAllLog() {
		btnDeleteAll.click();
	}
	
	public void reloadLog() {
		btnReload.click();
	}
	
	public void filterLog() {
		btnFilter.click();
	}
	
	public void configureLog() {
		btnConfiguration.click();
	}

	
}

