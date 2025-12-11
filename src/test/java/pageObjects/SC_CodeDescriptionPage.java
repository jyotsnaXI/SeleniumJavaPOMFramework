package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.JavaScriptUtils;
import utils.TestBase;

public class SC_CodeDescriptionPage extends TestBase {

	public WebDriver driver;

	public SC_CodeDescriptionPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[contains(text(),'Code Description')]")
	WebElement CodeDescription;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl03_ddlFooterCodeType")
	WebElement drpCodeType;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl03_txtFooterDescription")
	WebElement txtDescriptionNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl03_txtFooterAbbr")
	WebElement txtAbbreviationNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl03_lnksave")
	WebElement btnSubmit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCodeType")
	WebElement drpCodeTypeSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtDescription")
	WebElement txtDescriptionSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl02_txtEditDescription")
	WebElement txtDescriptionEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl02_txtEditAbbr")
	WebElement txtAbbreviationEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCodeMaster_ctl02_lnkUpdate")
	WebElement btnUpdate;
	
	public void clickMenuCodeMaster() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(CodeDescription).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterCodeTypeNew(String codetype) {
		drpCodeType.sendKeys(codetype);
	}
	
	public void enterDescriptionNew(String description) {
		txtDescriptionNew.sendKeys(description);
	}
	
	public void enterAbbreviationNew(String abbreviation) {
		txtAbbreviationNew.sendKeys(abbreviation);
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

	public void successMsg() {
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.contains(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	// Search
	public void codeTypeSrch(String codetype) {
		drpCodeTypeSrch.sendKeys(codetype);
	}
	
	public void enterDescriptionSrch(String description) {
		txtDescriptionSrch.sendKeys(description);
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
	
	public void modifyDescription(String VaccineName) {
		txtDescriptionEdit.clear();
		txtDescriptionEdit.sendKeys(VaccineName);
	}
	
	public void modifyAbbreviation(String Freq) {
		txtAbbreviationEdit.clear();
		txtAbbreviationEdit.sendKeys(Freq);
	}
	
	public void clickUpdateBtn() {
		btnUpdate.click();
	}

	public void modSuccessMsg() {
		String SuccessMsg = "has been successfully modified in the system.";
		String FailureMsg = "already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.contains(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

}
