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

public class SC_AdditionalInformationPage extends TestBase {

	public WebDriver driver;

	public SC_AdditionalInformationPage(WebDriver driver) {
		this.driver = driver;
		// WaitUtils.waitForPageLoad(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'System Configuration')]")
	WebElement sysConfiguratio;

	@FindBy(xpath = "//tr[@id='ctl00_mnuMedtrackn69']/td/table/tbody/tr/td/a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5']")
	WebElement companySubMenu;

	@FindBy(xpath = "//a[@class='ctl00_mnuMedtrack_1 LeftMenuBlueBg ctl00_mnuMedtrack_5' and contains(text(),'Additional Information')]")
	WebElement additionalInfoMenu;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpOwnerCompanySrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFieldName")
	WebElement txtFieldNameSrch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnAdd")
	WebElement btnADD;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlCompany")
	WebElement drpAddCompanyNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFieldName")
	WebElement txtAdditionalFieldName;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_chkActive")
	WebElement chkActiveNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtColumnNameInImportFile")
	WebElement txtColumnNameInImportFile;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_ddlFieldType")
	WebElement drpAdditionalFieldType;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmitNew;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_gdvCompanyAddnInfo_ctl02_lnkEdit")
	WebElement btnEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtFieldLabel")
	WebElement txtAdditionalFieldNameEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_txtColumnNameInImportFile")
	WebElement txtColumnNameImportFileEdit;
	
	@FindBy(id = "ctl00_MedtrackContentPlaceHolder_btnSubmit")
	WebElement btnSubmitUpdate;
	
	
	public void clickSubMenuAddInformation() {
		Actions action = new Actions(driver);
		action.moveToElement(sysConfiguratio).perform();
		action.moveToElement(companySubMenu).perform();
		action.moveToElement(additionalInfoMenu).click().perform();
	}
	
	public void additionalInfoPageTitle() {
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
	
	public void enterAdditFieldNameNew(String field) {
		txtAdditionalFieldName.sendKeys(field);
	}
	
	public void enterColHRImportNew(String field) {
		txtColumnNameInImportFile.sendKeys(field);
	}
	
	public void selectAdditFieldTypeNew(String fieldType) {
		Select selectFieldType = new Select(drpAdditionalFieldType);
		selectFieldType.selectByVisibleText(fieldType);
	}
	
	public void clickSubmitNew() {
		btnSubmitNew.click();
	}
	
	public void createdSuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

	//SearchAndModifyInfo
	public void selectDrpCompanySrch(String company) {
		Select selectOwnCompany = new Select(drpOwnerCompanySrch);
		selectOwnCompany.selectByVisibleText(company);
	}
	
	public void enterFieldNameSrch(String field) {
			txtFieldNameSrch.sendKeys(field);
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
	
	public void txtModifyAdditionalFieldName(String field) {
		txtAdditionalFieldNameEdit.clear();
		txtAdditionalFieldNameEdit.sendKeys(field);
	}
	
	public void txtModifyColHRImport(String field) {
		txtColumnNameImportFileEdit.clear();
		txtColumnNameImportFileEdit.sendKeys(field);
	}
	
	public void modifySubmitBtn() {
		btnSubmitUpdate.click();
	}
	
	public void modifySuccessMsg() {
		System.out.println(driver.findElement(By.xpath("//div[@class='SuccessBg']")).getText());
	}

}
