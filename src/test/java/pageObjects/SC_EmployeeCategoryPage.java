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

public class SC_EmployeeCategoryPage extends TestBase {

	public WebDriver driver;

	public SC_EmployeeCategoryPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[contains(text(),'Employee Category')]")
	WebElement empCategoryMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtCompEmpCatName")
	WebElement txtCompEmpCatName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnADD;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl03_ddlCompanyNew")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl03_txtCompEmpCatNameNew")
	WebElement txtEmpCategoryNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl03_lnksave")
	WebElement btnSubmitNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl03_chkActiveNew")
	WebElement chkEditActive;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl03_chkActiveNew")
	WebElement chkActiveNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl03_chkIsosRecommendedNew")
	WebElement chkIsosRecommendedNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl02_txtCompEmpCatNameEdit")
	WebElement txtCompEmpCatNameEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyEmpCategory_ctl02_lnkUpdate")
	WebElement btnSubmitUpdate;
	
	
	public void clickSubMenuEmpCategory() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(empCategoryMenu).click().perform();
	}
	
	public void empCategoryPageTitle() {
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
	
	public void enterEmpCategoryNew(String job) {
		txtEmpCategoryNew.sendKeys(job);
	}
	
	public void clickSubmitNew() {
		btnSubmitNew.click();
	}
	
	public void createdSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

	//SearchAndModifyJob
	public void selectDrpCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterEmpCategorySrch(String job) {
			txtCompEmpCatName.sendKeys(job);
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
	
	public void txtModifyEmpCategory(String job) {
		txtCompEmpCatNameEdit.clear();
		txtCompEmpCatNameEdit.sendKeys(job);
	}
	
	public void modifySubmitBtn() {
		btnSubmitUpdate.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
