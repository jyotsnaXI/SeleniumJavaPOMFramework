package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_MD_MedicalHistoryPage extends TestBase {

	public WebDriver driver;

	public SC_MD_MedicalHistoryPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[contains(text(),'Medical Data')]")
	WebElement medicalDataMenu;

	@FindBy(xpath = "//*[@id=\"ctl00_mnuMedtrackn100\"]/td/table/tbody/tr/td/a")
	WebElement medicalHistory;

	// Add Medical History
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtName")
	WebElement txtMedHistoryItemName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlType")
	WebElement drpMedHistoryItemType;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlGroup")
	WebElement drpMedHistoryItemGrp;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvLD_ctl03_ddlLanguageNameNew")
	WebElement drpLanguage;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvLD_ctl03_txtLanguageDescriptionNew")
	WebElement txtDescription;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvLD_ctl03_lbnAdd")
	WebElement btnAddLanguageSec;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;

	@FindBy(xpath = "//div[@class='SuccessBg']")
	WebElement successMsg;

	// Search
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtSearchName")
	WebElement txtMedicalHistorySrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	// Edit
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvMedicalHistoryItem_ctl02_lnkEdit")
	WebElement btnEdit;

	public void clickSubMenuMedicalHistory() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(medicalDataMenu).perform();
		action.moveToElement(medicalHistory).click().perform();
	}

	public void pageTitleMedicalHistory() {
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterMedicalHistoryItemName(String itemName) {
		txtMedHistoryItemName.clear();
		txtMedHistoryItemName.sendKeys(itemName);
	}

	public void selectMedicalHistoryItmTyp(String itemTyp) {
		Select itemType = new Select(drpMedHistoryItemType);
		itemType.selectByVisibleText(itemTyp);
	}

	public void selecttMedicalHistoryItmGrp(String group) {
		/*
		 * drpMedHistoryItemGrp.click(); List<WebElement> list = driver
		 * .findElements(By.xpath(
		 * "//select[@id='ctl00_MedtrackContentPlaceHolder_ddlGroup']")); for
		 * (WebElement ele : list) { System.out.println("Values " +
		 * ele.getAttribute("innerHTML")); if
		 * (ele.getAttribute("innerHTML").contains("Allergies")) {
		 * 
		 * ele.click(); // if yes then click on iteam break; } }
		 */

		 Select itemGroup = new Select(drpMedHistoryItemGrp);
		 itemGroup.selectByVisibleText(group);
	}

	public void selectLanguage(String lang) {
		Select language = new Select(drpLanguage);
		language.selectByVisibleText(lang);
	}

	public void enterDescription(String description) {
		txtDescription.sendKeys(description);
	}

	public void clickLanguageAddBtn() {
		btnAddLanguageSec.click();
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

	public void successMsg() {		
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The medical history item already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}
	}

	// Search
	public void enterrMedicalHistoryItemNameSrch(String itemname) {
		txtMedicalHistorySrch.sendKeys(itemname);
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

	public void modifyMedicalHistoryItemName(String itemName) {
		txtMedHistoryItemName.sendKeys(itemName);
	}

	public void clickUpdateBtn() {
		btnSubmit.click();
	}

	public void modSuccessMsg() {
		String SuccessMsg = "has been successfully updated in the system.";
		String FailureMsg = "The Health Check item already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}
}
