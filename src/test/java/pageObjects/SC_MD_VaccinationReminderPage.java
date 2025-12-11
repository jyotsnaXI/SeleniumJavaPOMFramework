package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MD_VaccinationReminderPage extends TestBase {

	public WebDriver driver;

	public SC_MD_VaccinationReminderPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[contains(text(),'Medical Data')]")
	WebElement medicalDataSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Vaccination Reminder')]")
	WebElement vaccinationReminder;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvVaccinationReminder_ctl03_ddlFooterReminderType")
	WebElement txtReminderTypeNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvVaccinationReminder_ctl03_txtFooterFrequency")
	WebElement txtEmailFrequencyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvVaccinationReminder_ctl03_btnSave")
	WebElement btnSubmit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlReminderType")
	WebElement txtReminderTypSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvVaccinationReminder_ctl02_btnEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvVaccinationReminder_ctl02_txtEditFrequency")
	WebElement txtEmailFrequencyEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvVaccinationReminder_ctl02_btnUpdate")
	WebElement btnUpdate;
	
	public void clickMenuVaccinationReminder() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(medicalDataSubMenu).perform();
		action.moveToElement(vaccinationReminder).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterReminderType(String reminder) {
		txtReminderTypeNew.sendKeys(reminder);
	}
	
	public void enterEmailFrequency(String frequency) {
		txtEmailFrequencyNew.sendKeys(frequency);
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

	public void successMsg() {
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The vaccination reminder already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	// Search
	public void reminderTypeSrch(String vaccine) {
		txtReminderTypSrch.sendKeys(vaccine);
	}
	
	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void searchResultTable() {
		
		boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_SearchHeader"));
		
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
	
	public void modifyEmailFrequency(String Freq) {
		txtEmailFrequencyEdit.clear();
		txtEmailFrequencyEdit.sendKeys(Freq);
	}
	
	public void clickUpdateBtn() {
		btnUpdate.click();
	}

	public void modSuccessMsg() {
		String SuccessMsg = "has been successfully updated in the system.";
		String FailureMsg = "The vaccination name already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

}

