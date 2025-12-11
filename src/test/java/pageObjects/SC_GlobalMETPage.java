package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_GlobalMETPage extends TestBase {

	public WebDriver driver;

	public SC_GlobalMETPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn70']/td/table[@class='LeftMenuBlueBg ctl00_mnuMedtrack_6']/tbody/tr/td//a[contains(text(),'Exam')]")
	WebElement examSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Global MET')]")
	WebElement globalMETMenu;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_tbxGlobalMETName")
	WebElement txtGlobalMETName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_chkHCItems_0")
	WebElement checkBox;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSave")
	WebElement btnSubmit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtGlobalMETName")
	WebElement txtGlobalMETNameSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement btnEdit;

	public void clickMenuGlobalMET() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(examSubMenu).perform();
		action.moveToElement(globalMETMenu).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterGlobalMETName(String globalMET) {
		txtGlobalMETName.clear();
		txtGlobalMETName.sendKeys(globalMET);
	}

	public void selectCheckBox(String conLastName) {
		checkBox.click();
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

	public void successMsg() {
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The MET already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	// Search
	public void enterGlobalMETSrch(String medicalCenter) {
		txtGlobalMETNameSrch.clear();
		txtGlobalMETNameSrch.sendKeys(medicalCenter);
	}

	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void searchResultTable() {

		boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_ddlRecordPerPage"));
		
		if (tableExists)
		{
			System.out.println("Search result is true");
        } 
		else
		{
            System.out.println("Search result is false");
            try
            {
                WebElement notification = driver.findElement(By.xpath("//div[@class='ErrorBg']"));
                System.out.println("Notification message: " + notification.getText());
            }
            catch (Exception e)
            {
            	WebElement notification = driver.findElement(By.xpath("//div[@class='InformationBg']"));
                System.out.println("Notification message: " + notification.getText());
            }
        }
	}
	// Modify
	public void clickEditBtn() {
		btnEdit.click();
	}
	
	public void clickUpdateBtn() {
		btnSubmit.click();
	}

	public void modSuccessMsg() {
		String SuccessMsg = " has been successfully updated in the system.";
		String FailureMsg = "The MET already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

}
