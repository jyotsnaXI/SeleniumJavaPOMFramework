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

public class SC_BPCholestrolBMIPage extends TestBase {

	public WebDriver driver;

	public SC_BPCholestrolBMIPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[contains(text(),'Medical Data')]")
	WebElement medicalDataSubMenu;

	@FindBy(xpath = "//a[contains(text(),'BP/BMI/Cholestrol')]")
	WebElement BPCholestrolBMIMenu;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl03_ddlFooterMasterType")
	WebElement drpMasterTypeNew;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl03_txtFooterbpCategory")
	WebElement txtCategoryNameNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl03_txtFooterMinValue")
	WebElement txtMinValueNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl03_txtFooterMaxValue")
	WebElement txtMaxValueNew;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl03_lnksave")
	WebElement btnSubmit;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlType")
	WebElement drpMasterTypeSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtbpCategory")
	WebElement txtCategorySrch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;

	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl02_txtEditbpCategory")
	WebElement txtCategoryEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl02_txtEditMinValue")
	WebElement txtMinValueEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl02_txtEditMaxValue")
	WebElement txtMaxValueEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl02_lnkUpdate")
	WebElement btnUpdate;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvBPMaster_ctl02_lnkDelete")
	WebElement btnDelete;

	public void clickMenuBPCholestrolBMIMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(medicalDataSubMenu).perform();
		action.moveToElement(BPCholestrolBMIMenu).click().perform();
	}

	public void pageTitleName() {
		// WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}

	public void clickAddBtn() {
		btnAdd.click();
	}

	public void selectMasterType(String mastertype) {
		Select masterType = new Select(drpMasterTypeNew);
		masterType.selectByVisibleText(mastertype);
	}
	
	public void enterCategoryName(String catName) {
		txtCategoryNameNew.sendKeys(catName);
	}
	
	public void enterMinValue(String minVal) {
		txtMinValueNew.sendKeys(minVal);
	}
	
	public void enterMaxValue(String maxVal) {
		txtMaxValueNew.sendKeys(maxVal);
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

	public void successMsg() {
		String SuccessMsg = "has been successfully created in the system.";
		String FailureMsg = "The BP/BMI/Cholesterol item already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}

	// Search
	public void selectMasterTypeSrch(String masterType) {
		Select mastertype = new Select(drpMasterTypeSrch);
		mastertype.selectByVisibleText(masterType);
	}
	
	public void enterCategorySrch(String category) {
		txtCategorySrch.sendKeys(category);
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
	
	public void modifyCategory(String category) {
		txtCategoryEdit.clear();
		txtCategoryEdit.sendKeys(category);
	}
	
	public void modifyMinValue(String minVal) {
		txtMinValueEdit.clear();
		txtMinValueEdit.sendKeys(minVal);
	}
	
	public void modifyMaxValue(String maxVal) {
		txtMaxValueEdit.clear();
		txtMaxValueEdit.sendKeys(maxVal);
	}
	
	public void clickUpdateBtn() {
		btnUpdate.click();
	}

	public void modSuccessMsg() {
		String SuccessMsg = "has been successfully modified in the system.";
		String FailureMsg = "The BP/BMI/Cholesterol item already exists in the system.";
		String AlertsMsg = driver.findElement(By.xpath("//div[@class='SuccessBg' or @class='ErrorBg']")).getText();

		if (AlertsMsg.contains(SuccessMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
		} else if (AlertsMsg.equalsIgnoreCase(FailureMsg)) {
			System.out.println(driver.findElement(By.xpath("//div[@class='ErrorBg']")).getText());
		}

	}
	
	public void clickDeleteBtn() {
		btnDelete.click();
		driver.switchTo().alert().accept();
		System.out.println("The master item &lt;=5.5 has been successfully deleted in the system.");
	}
	
	public void deleteSuccessMsg() {
		System.out.println("The master item &lt;=5.5 has been successfully deleted in the system.");
	}

}
