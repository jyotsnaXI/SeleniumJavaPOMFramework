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

public class SC_JobTitlePage extends TestBase {

	public WebDriver driver;

	public SC_JobTitlePage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[contains(text(),'Job Title')]")
	WebElement jobTitleMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtTitle")
	WebElement txtJobTitleSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnADD;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl03_ddlCompanyNew")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl03_txtJobTitleNew")
	WebElement txtJobTitleNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl03_lnksave")
	WebElement btnSaveTitlePage;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl02_chkActiveEdit")
	WebElement chkEditActive;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl02_txtJobTitleEdit")
	WebElement txtJobTitleEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyJobTitle_ctl02_lnkUpdate")
	WebElement btnSubmitUpdate;
	
	
	public void clickSubMenuJobTitle() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(jobTitleMenu).click().perform();
	}
	
	public void jobTitlePageTitleName() {
		//WaitUtils.waitForPageLoad(driver);
		System.out.println(driver.getTitle());
	}
	
	public void clickAddBtn() {
		btnADD.click();
	}
	
	public void selectDrpCompanyNew(String company) {
		Select selectOwnCompany = new Select(drpAddCompanyNew);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterJobTitleNew(String job) {
		txtJobTitleNew.sendKeys(job);
	}
	
	public void submitNew() {
		btnSaveTitlePage.click();
	}
	
	public void titleCreatedSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

	//SearchAndModifyJob
	public void selectOwnerCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterJobTitleSrch(String job) {
			txtJobTitleSrch.sendKeys(job);
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
	
	public void txtModifyJobTitle(String job) {
		txtJobTitleEdit.clear();
		txtJobTitleEdit.sendKeys(job);
	}
	
	public void modifySubmitBtn() {
		btnSubmitUpdate.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
