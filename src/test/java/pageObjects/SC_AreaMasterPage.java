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

public class SC_AreaMasterPage extends TestBase {

	public WebDriver driver;

	public SC_AreaMasterPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//*[@id=\"ctl00_mnuMedtrackn77\"]/td/table/tbody/tr/td/a")
	WebElement area;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtArea")
	WebElement txtAreaSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyArea_ctl03_ddlFooterCompanyName")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyArea_ctl03_txtAreaNew")
	WebElement txtAreaNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyArea_ctl03_lnksave")
	WebElement btnSubmitAdd;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyArea_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyArea_ctl02_txtAreaEdit")
	WebElement txtAreaEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyArea_ctl02_lnkUpdate")
	WebElement btnSubmitModifySave;
	
	
	public void clickSubMenuAreaMaster() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(area).click().perform();
	}
	
	public void areaMasterPageTitleName() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Area Master')]")).getText());
	}
	
	public void clickAddBtn() {
		btnAdd.click();
	}
	
	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpAddCompanyNew);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterAreaNew(String area) {
		txtAreaNew.sendKeys(area);
	}
	
	public void submitNew() {
		btnSubmitAdd.click();
	}
	
	public void areaCreatedSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

	//SearchAndModify Area
	public void selectOwnerCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterAreaSrch(String area) {
			txtAreaSrch.sendKeys(area);
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
	
	public void txtModifyArea(String area) {
		txtAreaEdit.clear();
		txtAreaEdit.sendKeys(area);
	}
	
	public void modifySubmitBtn() {
		btnSubmitModifySave.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}
	

}
