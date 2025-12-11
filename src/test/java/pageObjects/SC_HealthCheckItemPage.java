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

public class SC_HealthCheckItemPage extends TestBase {

	public WebDriver driver;

	public SC_HealthCheckItemPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[contains(text(),'Medical Data')]")
	WebElement medicalDataSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Health Check Item')]")
	WebElement healthCheckItemMenu;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_tbxHealthCheckItemName")
	WebElement txtHealthCheckItemName;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlGroup")
	WebElement drpHealthCheckItemGroup;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlSubgroup")
	WebElement drpHealthCheckItemSubGroup;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlItemtype")
	WebElement drpHealthCheckItemType;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_tbxInternationalUnit")
	WebElement txtInternationalUnit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUOM_ctl03_tbxUOMNew")
	WebElement txtUnitMeasurementNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUOM_ctl03_tbxConvNew")
	WebElement txtConversionFactorNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUOM_ctl03_tbxSUOMNew")
	WebElement txtSecondaryNameNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUOM_ctl03_tbxSConvNew")
	WebElement txtSecConversionFactorNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvUOM_ctl03_lbnAdd")
	WebElement btnAddInternationalUnit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvLD_ctl03_ddlLanguageNameNew")
	WebElement drpLanguageNameNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvLD_ctl03_txtLanguageDescriptionNew")
	WebElement txtLanguageDescriptionNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gvLD_ctl03_lbnAdd")
	WebElement btnAddOtherLanguage;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_tbxSearch")
	WebElement txtHealthCheckItemNameSrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement btnEdit;

	public void clickMenuhealthCheckItem() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(medicalDataSubMenu).perform();
		action.moveToElement(healthCheckItemMenu).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void enterHealthChkItemName(String itemName) {
		txtHealthCheckItemName.sendKeys(itemName);
	}
	
	public void selectHealthChkItemGrp(String itemGrp) {
		Select itemGroup = new Select(drpHealthCheckItemGroup);
		itemGroup.selectByVisibleText(itemGrp);
	}
	
	public void selectHealthChkItemSubGrp(String itemSubGrp) {
		Select itemSubGroup = new Select(drpHealthCheckItemSubGroup);
		itemSubGroup.selectByVisibleText(itemSubGrp);
	}
	
	public void selectHealthChkItemType(String itemType) {
		Select ItemType = new Select(drpHealthCheckItemType);
		ItemType.selectByVisibleText(itemType);
	}
	
	public void enterISOSUnit(String ISOSUnit) {
		txtInternationalUnit.sendKeys(ISOSUnit);
	}
	
	public void enterUnitMeasurement(String measurment) {
		txtUnitMeasurementNew.sendKeys(measurment);
	}
	
	public void enterConversationFact(String Factor) {
		txtConversionFactorNew.sendKeys(Factor);
	}
	
	public void enterSecondaryName(String secondName) {
		txtSecondaryNameNew.sendKeys(secondName);
	}
	
	public void enterSecConversationFact(String secFactor) {
		txtSecConversionFactorNew.sendKeys(secFactor);
	}
	
	public void clickISOSAddBtn() {
		btnAddInternationalUnit.click();
	}
	
	public void selectLanguage(String lang) {
		Select language = new Select(drpLanguageNameNew);
		language.selectByVisibleText(lang);
	}
	
	public void enterDescription(String description) {
		txtLanguageDescriptionNew.sendKeys(description);
	}
	
	public void clickLanguageAddBtn() {
		btnAddOtherLanguage.click();
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

	public void successMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		/*
		 * String SuccessMsg = "has been successfully created in the system."; String
		 * FailureMsg = "The BP/BMI/Cholesterol item already exists in the system.";
		 * String AlertsMsg =
		 * driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']"))
		 * .getText();
		 * 
		 * if (AlertsMsg.contains(SuccessMsg)) {
		 * System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).
		 * getText()); } else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
		 * System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).
		 * getText()); }
		 */

	}

	// Search
	public void enterHlthChkItemNmeSrch(String itemname) {
		txtHealthCheckItemNameSrch.sendKeys(itemname);
	}
	
	public void clickSearchBtn() {
		btnSearch.click();
	}

	public void searchResultTable() {

		boolean tableExists = JavaScriptUtils.isTablePresent(driver, By.id("ctl00_MedtrackContentPlaceHolder_gvHealthCheckItem")); 
		
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
	
	public void modifyHealthChkItemSubGrp(String subgrp) {
		Select itemSubGroup = new Select(drpHealthCheckItemSubGroup);
		itemSubGroup.selectByVisibleText(subgrp);
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
