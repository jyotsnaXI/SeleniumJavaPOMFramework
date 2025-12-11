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
import utils.WaitUtils;

public class SC_BusinessAreaPage  extends TestBase {

	public WebDriver driver;

	public SC_BusinessAreaPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5' and contains(text(),'Company')]")
	WebElement companySubMenu;

	@FindBy(xpath = "//table[@class='LeftMenuBlueBg ctl00_mnuMedtrack_6']/tbody/tr/td//a[contains(text(),'Business Area')]")
	WebElement businessArea;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtArea")
	WebElement txtBusinessAreaSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyBusinessArea_ctl03_ddlCompanyNew")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyBusinessArea_ctl03_txtAreaNew")
	WebElement txtBusinessAreaNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyBusinessArea_ctl03_lnkSave")
	WebElement btnSubmitAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyBusinessArea_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyBusinessArea_ctl02_txtAreaEdit")
	WebElement txtBusinessAreaEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyBusinessArea_ctl02_lnkUpdate")
	WebElement btnSubmitModifySave;
	
	public void clickBusinessAreaMaster() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(businessArea).click().perform();
	}
	
	public void businessAreaPageTitleName() {
		WaitUtils.waitForElementVisible(driver, btnAdd);
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Area Master')]")).getText());
	}
	
	public void clickAddBtn() {
		btnAdd.click();
	}
	
	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpAddCompanyNew);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterBusinessAreaNew(String barea) {
		txtBusinessAreaNew.sendKeys(barea);
	}
	
	public void submitNew() {
		btnSubmitAdd.click();
	}
	
	public void areaCreatedSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

	//SearchAndModifyBusinessArea
	public void selectOwnerCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterBusinessAreaSrch(String barea) {
			txtBusinessAreaSrch.sendKeys(barea);
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
	
	public void clickEditBtn() {
		btnEdit.click();
	}
	
	public void txtModifyArea(String barea) {
		txtBusinessAreaEdit.clear();
		txtBusinessAreaEdit.sendKeys(barea);
	}
	
	public void modifySubmitBtn() {
		btnSubmitModifySave.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}
	

}
